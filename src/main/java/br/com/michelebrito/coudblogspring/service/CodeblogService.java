package br.com.michelebrito.coudblogspring.service;

import java.util.List;

import br.com.michelebrito.coudblogspring.model.Post;

public interface CodeblogService {
    

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}