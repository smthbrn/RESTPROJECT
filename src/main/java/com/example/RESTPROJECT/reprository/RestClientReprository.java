package com.example.RESTPROJECT.reprository;


import com.example.RESTPROJECT.entites.RestClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RestClientReprository extends JpaRepository<RestClient, Long> {
//    List <RestClient> findAllByName(String name);
//    List <RestClient> findAllByFoundation_date_gtGreaterThanOrderByFoundation_date_lteDesc(int foundation_date_gt);
}
