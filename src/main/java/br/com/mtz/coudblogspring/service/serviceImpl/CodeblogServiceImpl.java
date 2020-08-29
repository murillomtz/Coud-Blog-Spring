package br.com.mtz.coudblogspring.service.serviceImpl;

import java.util.List;

import br.com.mtz.coudblogspring.model.Post;
import br.com.mtz.coudblogspring.repository.CodeblogRepository;
import br.com.mtz.coudblogspring.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;



    @Override
    public List<Post> findAll() {
        
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        
        return codeblogRepository.save(post);
    }

}