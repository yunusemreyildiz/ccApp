package com.yunus.ccApp.resources;


import com.yunus.ccApp.entities.*;
import com.yunus.ccApp.models.*;
import com.yunus.ccApp.repository.UserRepository;
import com.yunus.ccApp.services.ccApplicationImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@Data
public class ccApplication  {
    @Autowired
    private ccApplicationImpl ccAppService;



    private UserRepository userRepository;

    public ccApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //kayıt sayfamızı gösterir
    @RequestMapping(value="register" ,method= RequestMethod.GET)
    public Object registerPage( Model model){
        model.addAttribute("user", new KullaniciEntity());
        Object ss=model.getAttribute("user");
        return ss;
    }



    @RequestMapping(value="register" ,method= RequestMethod.POST)
    public Object saveRegisterPage(@Valid @RequestBody KullaniciEntity user, BindingResult result, Model model){
        model.addAttribute("kullanicilar", user);
        System.out.println(user.getUsername());
        System.out.println(result.hasErrors());
        KullaniciEntity userExists = ccAppService.findByUsername(user.getUsername());
        if (userExists != null) {
            /*result
                    .rejectValue("userName", "error.user",
                            "Bu kullanıcı zaten var daaa.");*/
            return "Böyle bilr kullanıcı mevcut";
        }
        if (result.hasErrors()){

        return "error";
        }

        ccAppService.saveUser(user);

        return "user";
    }


    @RequestMapping(value="login" ,method= RequestMethod.POST)
    public Object loginPage(@Valid @RequestBody KullaniciEntity user, BindingResult result, Model model){
        model.addAttribute("kullanicilar", user);
        System.out.println(user.getUsername());
        System.out.println(result.hasErrors());

        KullaniciEntity userExists = ccAppService.findByUsernameAndkullaniciSifre(user.getUsername(), user.getKullaniciSifre());
        if (userExists != null) {

            return userExists.getId();
        }
        if (result.hasErrors()){

            return 0;
        }

        return -1;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String index2(){
        return "index";
    }




    @PostMapping(path = "/saveHayvan")
    public ResponseEntity<String> saveHayvan(@RequestBody CreateUrunRequest request) {
        ccAppService.saveHayvan(request);
        return new ResponseEntity("Succes", HttpStatus.OK);
    }


    @PostMapping(path = "/saveSut")
    public ResponseEntity<String> saveSut(@RequestBody CreateUrunRequest request){
        ccAppService.saveSut(request);
        return new ResponseEntity("Succes", HttpStatus.OK);
    }

    @PostMapping(path = "/saveMuayene")
    public ResponseEntity<String> saveMuayene(@RequestBody CreateUrunRequest request) {
        ccAppService.saveHayvan(request);
        return new ResponseEntity("Succes", HttpStatus.OK);
    }

    @PostMapping(path = "/saveYem")
    public ResponseEntity<String> saveYem(@RequestBody CreateYemRequest request){
        ccAppService.saveYem(request);
        return new ResponseEntity("Succes", HttpStatus.OK);
    }


    @GetMapping(path = "/getSut")
    public ResponseEntity<List<UrunEntity>> getSut(@RequestParam("userId") String userId) {
        List<UrunEntity> urunEntities = ccAppService.findSutAll(userId);
        return new ResponseEntity(urunEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getHayvan")
    public ResponseEntity<List<UrunEntity>> getHayvan(@RequestParam("userId") String userId) {
        List<UrunEntity> depoEntities = ccAppService.findHayvanAll(userId);
        return new ResponseEntity(depoEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getYem")
    public ResponseEntity<List<YemEntity>> getYem(@RequestParam("userId") String userId) {
        List<YemEntity> yemEntities = ccAppService.listYem(userId);
        return new ResponseEntity(yemEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllMuayene")
    public ResponseEntity<List<SaglikEntity>> getAllMuayene(@RequestParam("userId") Integer userId) {
        List<SaglikEntity> saglikEntities = ccAppService.listAllMuayene(userId);
        return new ResponseEntity(saglikEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getHayvanMuayene")
    public ResponseEntity<List<YemEntity>> getHayvanMuayene(@RequestParam("userId") Integer userId,@RequestParam("hayvanKupeNo") Integer hayvanKupeNo ) {
        List<SaglikEntity> saglikEntities = ccAppService.listHayvanMuayene(userId, hayvanKupeNo);
        return new ResponseEntity(saglikEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllAsi")
    public ResponseEntity<List<YemEntity>> getAllAsi(@RequestParam("userId") Integer userId) {
        List<SaglikEntity> saglikEntities = ccAppService.listAllAsi(userId);
        return new ResponseEntity(saglikEntities, HttpStatus.OK);
    }

    @GetMapping(path = "/getHayvanAsi")
    public ResponseEntity<List<YemEntity>> getHayvanAsi(@RequestParam("userId") Integer userId,@RequestParam("hayvanKupeNo") Integer hayvanKupeNo ) {
        List<SaglikEntity> saglikEntities = ccAppService.listHayvanAsi(userId,hayvanKupeNo);
        return new ResponseEntity(saglikEntities, HttpStatus.OK);
    }




    /* PUT, DELETE */

    }



