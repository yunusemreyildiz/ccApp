package com.yunus.ccApp.services;


import com.yunus.ccApp.entities.*;
import com.yunus.ccApp.models.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ccApplication {

    KullaniciEntity findByUsername(String username);

    KullaniciEntity findByUsernameAndkullaniciSifre(String username, String kullaniciSifre);

    KullaniciEntity findByEmail(String email);

    void saveMuayene(CreateSaglikRequest createMuayeneRequest);

    void saveAsi (CreateSaglikRequest createAsiRequest);

    void saveUser(KullaniciEntity user);

    void saveSut(CreateUrunRequest createSutRequest);

    void saveHayvan(CreateUrunRequest createHayvanRequest);

    List<UrunEntity> findSutAll(String userId);

    List<UrunEntity> findHayvanAll(String userId);

    /*   void saveUrun(CreateUrunRequest sutRequest);*/

    void saveGelirGider(CreateGelirGiderRequest createGelirGiderRequest);



    void saveYem(CreateYemRequest createYemRequest);


    List<GelirGiderEntity> listGelirGider();


    List<YemEntity> listYem(String userId);


    List<SaglikEntity> listAllMuayene(Integer userId);

    List<SaglikEntity> listAllAsi(Integer userId);

    List<SaglikEntity> listHayvanMuayene(Integer userId, Integer hayvanKupeNo);

    List<SaglikEntity> listHayvanAsi(Integer userId, Integer hayvanKupeNo);


   /* List<KullaniciEntity> login(String username, String password);*/

}