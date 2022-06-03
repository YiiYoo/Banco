package com.banco.deudas.repository;

import com.banco.deudas.entity.Banco;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BancoRepository extends JpaRepository<Banco,String> {

}
