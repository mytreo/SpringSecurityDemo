package ua.mytreo.java.springsecdem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.mytreo.java.springsecdem.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("select * from TABLE_1 b where b.num_1 = :num")
    Record findByNum(@Param("num") Integer num);
}
