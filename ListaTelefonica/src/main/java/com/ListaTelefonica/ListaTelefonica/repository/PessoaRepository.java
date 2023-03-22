package com.ListaTelefonica.ListaTelefonica.repository;

/*import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ListaTelefonica.ListaTelefonica.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    /*@Query("SELECT p FROM Pessoa p WHERE p.nome LIKE '%:nome%'")
    Page<Pessoa> findAllByNome(@Param("nome") String nome, Pageable pageable);*/

}
