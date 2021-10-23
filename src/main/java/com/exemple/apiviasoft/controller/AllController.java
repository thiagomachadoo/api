package com.exemple.apiviasoft.controller;

import com.exemple.apiviasoft.entity.Tabela;
import com.exemple.apiviasoft.entity.TabelaDTO;
import com.exemple.apiviasoft.repository.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/viasoft")
@CrossOrigin("*")
public class AllController {

    @Autowired
    TabelaRepository repository;

    //Requisição que tem um objeto com dados dentro
    @PostMapping
    public void saveQb(@RequestBody TabelaDTO dto){
        Tabela tabela = new Tabela();

        tabela.setAutorizador(dto.getAutorizador());
        tabela.setAutorizacao(dto.getAutorizacao());
        tabela.setRetornoAutorizacao(dto.getRetornoAutorizacao());
        tabela.setInutilizacao(dto.getInutilizacao());

        repository.save(tabela);
    }
    @GetMapping
    public ResponseEntity<List<Tabela>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tabela> GetById(@PathVariable  long id){
        return repository.findById(id).map
                (resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/autorizador/{autorizador}")
    public ResponseEntity<List<Tabela>> GetByEstado(@PathVariable String autorizador){
        return ResponseEntity.ok(repository.findAllByAutorizadorContainingIgnoreCase(autorizador));
    }
}