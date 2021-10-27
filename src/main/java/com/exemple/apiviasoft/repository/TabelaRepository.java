package com.exemple.apiviasoft.repository;

import com.exemple.apiviasoft.entity.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TabelaRepository extends JpaRepository<Tabela, Long> {
    public List<Tabela> findAllByAutorizadorContainingIgnoreCase (String autorizador);


}
