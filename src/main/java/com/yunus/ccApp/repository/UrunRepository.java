package com.yunus.ccApp.repository;


import com.yunus.ccApp.entities.UrunEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrunRepository extends JpaRepository<UrunEntity, Long> {


//insert into

  /*  @Query(value = "START TRANSACTION;\n" +
            "INSERT INTO URUN VALUES (':urunId');\n" +
            "INSERT INTO SUT VALUES ('1','2','3','4',':urunId');\n" +
            "COMMIT;", nativeQuery = true)
    SutEntity sutKayit(@Param(":urunId") String urunId);
*/


    @Query(value = "INSERT INTO URUNLER(SUT_MIKTARI, SUT_TARIHI, URUN_TUTAR, USER_ID) VALUES(:sutMiktari,:sutTarihi,:urunTutar,:userId)",
            nativeQuery = true)
    UrunEntity saveSut(@Param("sutMiktari") Double sutMiktari,
                      @Param("sutTarihi") String sutTarihi,
                      @Param("urunTutar") Double urunTutar,
                      @Param("userId") Integer userId);

    @Query(value = "INSERT INTO URUNLER (HAYVAN_KUPE_NO,DOGUM_AGIRLIGI,DOGUM_SEKLI,DOGUM_TARIHI ," +
            "HAYVAN_ADI ,HAYVAN_ANNE_ADI,HAYVAN_CINSIYET ," +
            "HAYVAN_IRKI ,HAYVAN_RESMI ,TOHUMA_HAZIR, URUN_FIYATI, USER_ID) " +
            "VALUES (:hayvanKupeNo, :dogumAgirligi, :dogumSekli, " +
            ":dogumTarihi, :hayvanAdi, :hayvanAnneAdi, :hayvanCinsiyet, :hayvanIrki, :hayvanResmi, :tohumaHazir, :urunTutar, :userId)", nativeQuery = true)
    UrunEntity saveHayvan(@Param("hayvanKupeNo") String hayvanKupeNo, @Param("dogumAgirligi") Double dogumAgirligi,
                          @Param("dogumSekli") String dogumSekli, @Param("dogumTarihi") String dogumTarihi, @Param("hayvanAdi") String hayvanAdi,
                          @Param("hayvanAnneAdi") String hayvanAnneAdi, @Param("hayvanCinsiyet") String hayvanCinsiyet,
                          @Param("hayvanIrki") String hayvanIrki, @Param("hayvanResmi") String hayvanResmi,
                          @Param("tohumaHazir") Boolean tohumaHazir, @Param("urunTutar") Double urunTutar, @Param("userId") Integer userId);


    @Query(value="SELECT DOGUM_AGIRLIGI, DOGUM_SOYADI, DOGUM_TARIHI, HAYVAN_ADI, HAYVAN_ANNE_ADI, HAYVAN_CINSIYET, HAYVAN_IRKI, URUN_FIYATI FROM URUNLER d" +
            "INNER JOIN kullanicilar k on d.user_id = k.user_id " +
            "WHERE k.user_id=:userId AND HAYVAN_ADI IS NOT NULL",
            nativeQuery=true)
    List<UrunEntity> findHayvanAll(@Param("userId") String userId);


    @Query(value="SELECT SUT_MIKTARI, SUT_TARIHI, URUN_FIYATI FROM URUNLER d" +
            "INNER JOIN kullanicilar k on d.user_id = k.user_id " +
            "WHERE k.user_id=:userId AND SUT_MIKTARI IS NOT NULL",
            nativeQuery=true)
    List<UrunEntity> findSutAll(@Param("userId") String userId);



}
