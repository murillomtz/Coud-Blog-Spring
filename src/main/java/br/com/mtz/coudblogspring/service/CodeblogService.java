package br.com.mtz.coudblogspring.service;

import java.util.List;

import br.com.mtz.coudblogspring.model.Post;

public interface CodeblogService {
    

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}