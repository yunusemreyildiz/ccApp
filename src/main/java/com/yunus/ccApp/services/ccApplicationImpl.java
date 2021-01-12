package com.yunus.ccApp.services;

import com.yunus.ccApp.entities.*;
import com.yunus.ccApp.models.*;
import com.yunus.ccApp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ccApplicationImpl implements  ccApplication{

  /*   @Autowired
     private DepoRepository depoRepository;
*/
    @Autowired
    private GelirGiderRepository gelirGiderRepository;

    @Autowired
    private SaglikRepository saglikRepository;

    @Autowired
    private YemRepository yemRepository;

    @Autowired
    private UrunRepository urunRepository;

    @Autowired
     UserRepository userRepository;

     @Autowired
     RoleRepository roleRepository;



     @Autowired
     public ccApplicationImpl(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


    /***************** KULLANICI KAYDETME ***************/

    @Override
        public KullaniciEntity findByEmail(String email) {
        return userRepository.findByEmail(email);

        }

        @Override
        public KullaniciEntity findByUsername(String username) {
            return userRepository.findByUsername(username);
        }

    @Override
    public KullaniciEntity findByUsernameAndkullaniciSifre(String username, String kullaniciSifre) {
        return userRepository.findByUsernameAndKullaniciSifre(username, kullaniciSifre);
    }


    @Override
    public void saveUser(KullaniciEntity user) {
        KullaniciEntity kk= requestToHayvanlarEntityy(user);
        user.setRoles(Arrays.asList(roleRepository.findByRole("USER")));
        user.setEnabled(true);
        userRepository.save(kk);
    }





    @Override
    public List<UrunEntity> findSutAll(String userId) {
        return urunRepository.findSutAll(userId);
    }

    @Override
    public List<UrunEntity> findHayvanAll(String userId) {
        return urunRepository.findHayvanAll(userId);
    }

    @Override
    public void saveGelirGider(CreateGelirGiderRequest createGelirGiderRequest) {

    }


    @Override
    public List<GelirGiderEntity> listGelirGider() {
        return null;
    }


    @Override
    public List<YemEntity> listYem(String userId) {
        return yemRepository.findYem(userId);
    }

    @Override
    public List<SaglikEntity> listAllMuayene(Integer userId) {
        return saglikRepository.listAllMuayene(userId);
    }

    @Override
    public List<SaglikEntity> listAllAsi(Integer userId) {
        return saglikRepository.listAllAsi(userId);
    }

    @Override
    public List<SaglikEntity> listHayvanMuayene(Integer userId, Integer hayvanKupeNo) {
        return saglikRepository.listHayvanMuayene(userId,hayvanKupeNo);
    }

    @Override
    public List<SaglikEntity> listHayvanAsi(Integer userId, Integer hayvanKupeNo) {
        return saglikRepository.listHayvanAsi(userId,hayvanKupeNo);
    }




     /*   public KullaniciEntity findByEmail(String email) {
            return userRepository.findByEmail(email);
        }

        public KullaniciEntity findByUsername(String username) {
            return userRepository.findByUsername(username);
        }*/


/*

    @Override
    public void saveUser(KullaniciEntity user) {


           user.setRoles(Collections.singletonList(roleRepository.findByRole("USER")));
            //user.setRoles(Arrays.asList(roleRepository.findByRole("USER")));
            user.setEnabled(true);

            userRepository.save(user);

    }
*/





 /*   public List<KullaniciEntity> login(String username,String kullanicisifre) {

        return userRepository.login(username,kullanicisifre);
    }
*/


    /***************** HAYVAN KAYDETME ***************/
    @Override
    public void saveHayvan(CreateUrunRequest createHayvanRequest) {
        UrunEntity urunEntity =requestToHayvanEntity(createHayvanRequest);
        saveHayvanlarEntity(urunEntity);

    }

  public void saveHayvanlarEntity(UrunEntity urunEntity) {
        urunRepository.save(urunEntity);

    }

    private UrunEntity requestToHayvanEntity(CreateUrunRequest createHayvanRequest) {
        UrunEntity urunEntity = new UrunEntity();

        urunEntity.setHayvanAdi(createHayvanRequest.getHayvanAdi());
        urunEntity.setHayvanKupeNo(createHayvanRequest.getHayvanKupeNo());
        urunEntity.setHayvanAnneAdi(createHayvanRequest.getHayvanAnneAdi());
        urunEntity.setHayvanIrki(createHayvanRequest.getHayvanIrki());
        urunEntity.setHayvanResmi(createHayvanRequest.getHayvanResmi());
        urunEntity.setDogumTarihi(createHayvanRequest.getDogumTarihi());
        urunEntity.setDogumAgirligi(createHayvanRequest.getDogumAgirligi());
        urunEntity.setHayvanCinsiyet(createHayvanRequest.getHayvanCinsiyet());
        urunEntity.setDogumSekli(createHayvanRequest.getDogumSekli());
        urunEntity.setDogumAgirligi(createHayvanRequest.getDogumAgirligi());
        urunEntity.setUrunTutar((double) createHayvanRequest.getUrunTutar());


        urunEntity.setUserId(createHayvanRequest.getUserId());
        return urunEntity;
    }



    /***************** YEM KAYDETME ***************/

    @Override
    public void saveYem(CreateYemRequest createYemRequest) {
        YemEntity yemEntity =requestToYemEntity(createYemRequest);
        saveYem(yemEntity);

    }

    public void saveYem(YemEntity yemEntity) {
        yemRepository.save(yemEntity);

    }

    private YemEntity requestToYemEntity(CreateYemRequest createYemRequest){
        YemEntity yemEntity = new YemEntity();
        yemEntity.setYemIslemi(createYemRequest.getYemIslemi());
        yemEntity.setYemMiktari(createYemRequest.getYemMiktari());
        yemEntity.setYemTarihi(createYemRequest.getYemTarihi());
        yemEntity.setYeminTuru(createYemRequest.getYeminTuru());


        yemEntity.setUserId(createYemRequest.getUserId());

        return yemEntity;
    }







    /***************** SUT KAYDETME ***************/

    @Override
    public void saveSut(CreateUrunRequest createSutRequest) {
        UrunEntity urunEntity =requestToSutEntity(createSutRequest);
        saveSutEntity(urunEntity);

    }

    public void saveSutEntity(UrunEntity urunEntity) {
        urunRepository.save(urunEntity);

    }

    private UrunEntity requestToSutEntity(CreateUrunRequest createSutRequest){

        UrunEntity urunEntity = new UrunEntity();
        KullaniciEntity kullaniciEntity = new KullaniciEntity();
        urunEntity.setSutMiktari(createSutRequest.getSutMiktari());
        urunEntity.setSutTarihi(createSutRequest.getSutTarihi());
        urunEntity.setUrunTutar((double)createSutRequest.getUrunTutar());
        urunEntity.setUserId(createSutRequest.getUserId());

        return urunEntity;

    }




    /***************** KULLANICI KAYDETME ***************/

    private KullaniciEntity requestToHayvanlarEntityy(KullaniciEntity createKullaniciRequest) {
        KullaniciEntity kullaniciEntity = new KullaniciEntity();
        kullaniciEntity.setKullaniciSifre(createKullaniciRequest.getKullaniciSifre());
        kullaniciEntity.setTelefonNo(createKullaniciRequest.getTelefonNo());
        kullaniciEntity.setKullaniciSoyadi(createKullaniciRequest.getKullaniciSoyadi());
        kullaniciEntity.setKullaniciAdi(createKullaniciRequest.getKullaniciAdi());
        kullaniciEntity.setUsername(createKullaniciRequest.getUsername());
        kullaniciEntity.setEnabled(createKullaniciRequest.isEnabled());
        kullaniciEntity.setEmail(createKullaniciRequest.getEmail());


        return kullaniciEntity;
    }


    /***************** GELİR KAYDETME ***************/


    private GelirGiderEntity requestToGelirGiderEntity(CreateGelirGiderRequest createGelirGiderRequest){

        GelirGiderEntity gelirGiderEntity = new GelirGiderEntity();
        gelirGiderEntity.setTutar(createGelirGiderRequest.getTutar());
        gelirGiderEntity.setTutarAciklama(createGelirGiderRequest.getTutarAciklama());
        gelirGiderEntity.setTutarIslemi(createGelirGiderRequest.getTutarIslemi());
        gelirGiderEntity.setTutarTarihi(createGelirGiderRequest.getTutarTarihi());

        return gelirGiderEntity;

    }

    /*********** MUAYENE KAYDETME ************/

    @Override
    public void saveMuayene(CreateSaglikRequest createMuayeneRequest) {
        SaglikEntity saglikEntity =requestToSaglikEntity(createMuayeneRequest);
        saveMuayeneEntity(saglikEntity);

    }

        public void saveMuayeneEntity(SaglikEntity saglikEntity) {
        saglikRepository.save(saglikEntity);

    }

    private SaglikEntity requestToSaglikEntity(CreateSaglikRequest createMuayeneRequest){

        SaglikEntity saglikEntity = new SaglikEntity();
        saglikEntity.setMuayeneAciklama(createMuayeneRequest.getMuayeneAciklama());
        saglikEntity.setMuayeneTarihi(createMuayeneRequest.getMuayeneTarihi());
        saglikEntity.setUserId(createMuayeneRequest.getUsersId());
        saglikEntity.setHayvanKupeNo(createMuayeneRequest.getHayvanKupeNo());
        return saglikEntity;

    }

    /*********** ASI KAYDETME ************/

    @Override
    public void saveAsi(CreateSaglikRequest createAsiRequest) {
        SaglikEntity saglikEntity =requestToSaglikEntityy(createAsiRequest);
        saveAsiEntity(saglikEntity);

    }

    public void saveAsiEntity(SaglikEntity saglikEntity) {
        saglikRepository.save(saglikEntity);

    }

    private SaglikEntity requestToSaglikEntityy(CreateSaglikRequest createAsiRequest){

        SaglikEntity saglikEntity = new SaglikEntity();
        saglikEntity.setAsiTarihi(createAsiRequest.getMuayeneAciklama());
        saglikEntity.setAsiAciklama(createAsiRequest.getMuayeneTarihi());
        saglikEntity.setHayvanKupeNo(createAsiRequest.getHayvanKupeNo());
        saglikEntity.setUserId(createAsiRequest.getUsersId());
        return saglikEntity;

    }



}

