package com.yunus.ccApp.repository;

import com.yunus.ccApp.entities.KullaniciEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<KullaniciEntity, Long> {

    KullaniciEntity findByUsername(String username);

    KullaniciEntity findByUsernameAndKullaniciSifre(String username, String kullaniciSifre);

    KullaniciEntity findByEmail(String email);

   /* @Query(value="SELECT USERNAME, KULLANICI_SIFRE FROM KULLANICILAR " +

            "WHERE USERNAME=:userName and KULLANICI_SIFRE =:kullaniciSifre",
            nativeQuery=true)
    List<KullaniciEntity> login(@Param("userName") String username, @Param("kullaniciSifre") String kullaniciSifre);*/



    List<KullaniciEntity> findAll();




}