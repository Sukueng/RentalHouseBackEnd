package com.RentalHome.BackEnd.PostManagement;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

class GetMail{
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


@RestController
public class PostController {

    @Autowired
    PostService service;

    @PostMapping("/post/add")
    public String addPost(@RequestBody PostModel post){
        service.addPost(post);
        return "Added successfully";
    }


    @GetMapping("/post/getall")
    public List<PostModel> getPost(){
        List<PostModel> post=service.getPost();
        return post;
    }



    @PostMapping("/post/delete")
    public String deletePost(@RequestBody PostModel model){


        System.out.println(model.getId());
        service.deletePost(model.getId());
        return "deleted successfully";

    }

    @PostMapping("/post/getPostByMail")
    public List<PostModel> getPostByMail(@RequestBody GetMail mail){
//        System.out.println(mail);
        return service.getPostByMail(mail.getEmail());

    }




}
