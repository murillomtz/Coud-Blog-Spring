package br.com.mtz.coudblogspring.repository;

import br.com.mtz.coudblogspring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//Movel mais o tipo do ID
public interface CodeblogRepository extends JpaRepository<Post, Long> {
//Aqui temos metodos prontos, 
/*
findAll
findById
delete

*/

}
    
