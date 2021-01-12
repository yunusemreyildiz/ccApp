package com.yunus.ccApp.repository;


import com.yunus.ccApp.entities.SaglikEntity;
import com.yunus.ccApp.entities.UrunEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;

@Repository
public interface SaglikRepository extends JpaRepository<SaglikEntity, Long> {



    @Query(value = "SELECT (HAYVAN_KUPE ,MUAYENE_ACIKLAMA ,MUAYENE_TARIHI, USER_ID) FROM SAGLIK d INNER JOIN URUNLER k on d.hayvan_kupe=k.HAYVAN_KUPE_NO WHERE USER_ID=:userId AND MUAYENE_ACIKLAMA IS NOT NULL)", nativeQuery = true)
    List<SaglikEntity> listAllMuayene(@Param("userId") Integer userId);

    @Query(value = "SELECT (HAYVAN_KUPE ,ASI_ACIKLAMA ,ASI_TARIHI , USER_ID) FROM SAGLIK d INNER JOIN URUNLER k on d.hayvan_kupe=k.HAYVAN_KUPE_NO WHERE USER_ID=:userId AND ASI_ACIKLAMA IS NOT NULL)", nativeQuery = true)
    List<SaglikEntity> listAllAsi(@Param("userId") Integer userId);

    @Query(value = "SELECT (HAYVAN_KUPE ,MUAYENE_ACIKLAMA ,MUAYENE_TARIHI, USER_ID) FROM SAGLIK d INNER JOIN URUNLER k on d.hayvan_kupe=k.HAYVAN_KUPE_NO WHERE USER_ID=:userId AND HAYVAN_KUPE_NO=:hayvanKupeNo AND MUAYENE_ACIKLAMA IS NOT NULL)", nativeQuery = true)
    List<SaglikEntity> listHayvanMuayene(@Param("userId") Integer userId, @Param("hayvanKupeNo") Integer hayvanKupeNo);

    @Query(value = "SELECT (ASI_ACIKLAMA ,ASI_TARIHI ,HAYVAN_KUPE ,USER_ID) FROM SAGLIK d INNER JOIN URUNLER k on d.hayvan_kupe=k.HAYVAN_KUPE_NO WHERE HAYVAN_KUPE_NO=:hayvanKupeNo AND USER_ID=:userId AND ASI_ACIKLAMA IS NOT NULL)", nativeQuery = true)
    List<SaglikEntity> listHayvanAsi(@Param("userId") Integer userId, @Param("hayvanKupeNo") Integer hayvanKupeNo);



    @Query(value = "INSERT INTO SAGLIK(asi_aciklama, asi_tarihi, hayvan_kupe, user_id) VALUES(:asiAciklama,:asiTarihi,:hayvanKupe,:userId)",
            nativeQuery = true)
    SaglikEntity saveAsi(@Param("asiAciklama") String sutMiktari,
                       @Param("asiTarihi") String sutTarihi,
                       @Param("hayvanKupe") Integer hayvanKupe,
                       @Param("userId") Integer userId);


    @Query(value = "INSERT INTO SAGLIK(MUAYENE_ACIKLAMA ,MUAYENE_TARIHI, HAYVAN_KUPE, USER_ID) VALUES(:muayeneAciklama,:muayeneTarihi,:hayvanKupe,:userId)",
            nativeQuery = true)
    SaglikEntity saveMuayene(@Param("muayeneAciklama") String muayeneAciklama,
                         @Param("muayeneTarihi") String muayeneTarihi,
                         @Param("hayvanKupe") Integer hayvanKupe,
                         @Param("userId") Integer userId);





}
