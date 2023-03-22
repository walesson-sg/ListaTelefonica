package com.ListaTelefonica.ListaTelefonica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import com.ListaTelefonica.ListaTelefonica.models.Pessoa;
import com.ListaTelefonica.ListaTelefonica.repository.PessoaRepository;

@RestController
@CrossOrigin("http://localhost:8081")
public class PessoaController {
    @Autowired
    PessoaRepository repository;

    @GetMapping("/pessoa")
    public List<Pessoa> getAllPessoa() {
        return repository.findAll();
    }
    /*@GetMapping("/pessoa")
    public List<Pessoa> getAllPessoa(@RequestParam(required = false, defaultValue = "") String nome) {
        return repository.findAllByNome(nome, PageRequest.of(0, 10)).getContent();
    } */

    @GetMapping("/pessoa/{id}")
    public Pessoa getByIdPessoa(@PathVariable("id") Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
    }

    @PostMapping("/pessoa")
    public void newPessoa(@RequestBody Pessoa pessoa) {
        repository.save(pessoa);
    }

    @DeleteMapping("/pessoa/{id}")
    public void deletePessoa(@PathVariable("id") Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(404));
        }

        repository.deleteById(id);
    }
    @DeleteMapping("/pessoa")
    public void delete(@RequestBody Pessoa pessoa){
        repository.delete(pessoa);
    }

    @PutMapping("/pessoa")
    public void alterPessoa(@RequestBody Pessoa pessoa) {
        repository.save(pessoa);
    }
}