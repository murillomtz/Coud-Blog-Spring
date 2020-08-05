package br.com.michelebrito.coudblogspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelebrito.coudblogspring.model.Post;

//Movel mais o tipo do ID
public interface CodeblogRepository extends JpaRepository<Post, Long> {
//Aqui temos metodos prontos, 
/*
findAll
findById
delete

*/

}
    
