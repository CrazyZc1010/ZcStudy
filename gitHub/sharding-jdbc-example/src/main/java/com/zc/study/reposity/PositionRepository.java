package com.zc.study.reposity;

import com.zc.study.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PositionRepository extends JpaRepository<Position,Long> {

    @Query(nativeQuery = true ,value = "select p.id ,p.name, p.city,pd.description  from position  p join position_detail pd on (p.id = pd.pid) where p.id = :id")
    public  Object findPositionById(@Param("id") long id);

}
