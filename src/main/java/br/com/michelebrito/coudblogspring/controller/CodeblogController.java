package br.com.michelebrito.coudblogspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.michelebrito.coudblogspring.model.Post;
import br.com.michelebrito.coudblogspring.service.CodeblogService;

@Controller
public class CodeblogController {

    @Autowired
    CodeblogService codeblogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {

        ModelAndView mv = new ModelAndView("posts"); //Mesmo nome da pagina HTML
        List<Post> posts = codeblogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }
}