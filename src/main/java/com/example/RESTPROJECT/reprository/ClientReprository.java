package com.example.RESTPROJECT.reprository;

import com.example.RESTPROJECT.entites.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ClientReprository extends JpaRepository<Clients, Long> {


}
