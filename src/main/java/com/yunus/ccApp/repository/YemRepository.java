package com.yunus.ccApp.repository;


import com.yunus.ccApp.entities.SaglikEntity;
import com.yunus.ccApp.entities.UrunEntity;
import com.yunus.ccApp.entities.YemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;

@Repository
public interface YemRepository extends JpaRepository<YemEntity, Long> {



    @Query(value="SELECT * FROM YEM d" +
            "INNER JOIN kullanicilar k on d.user_id = k.user_id " +
            "WHERE k.user_id=:userId AND YEM_MIKTARI IS NOT NULL",
            nativeQuery=true)
    List<YemEntity> findYem(@Param("userId") String userId);


    @Query(value = "INSERT INTO YEM(YEMIN_TURU, YEM_MIKTARI, YEM_ISLEMI, YEM_TARIHI, USER_ID) VALUES(:yeminTuru,:yemMiktari,:yemIslemi,:yemTarihi, :userId)",
            nativeQuery = true)
    YemEntity saveYem (@Param("yeminTuru") String yeminTuru,
                       @Param("yemMiktari") Integer yemMiktari,
                       @Param("yemIslemi") Boolean yemIslemi,
                       @Param("yemTarihi") String yemTarihi,
                       @Param("userId") Integer userId);






}
