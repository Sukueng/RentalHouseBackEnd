package com.RentalHome.BackEnd.PostManagement;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepostory repo;


    public void addPost(PostModel post) {
        repo.save(post);
    }

    public List<PostModel> getPost() {
        return repo.findAll();
    }

    public void deletePost(String id) {
        System.out.println("form post service"+id);
        repo.deleteById(id);

    }

    public List<PostModel> getPostByMail(String mail) {
        List<PostModel> allpost = repo.findAll();
        List<PostModel> matchesPost =new ArrayList<>();
        for(PostModel obj : allpost){
            if(obj.getEmail().equals(mail)){
                matchesPost.add(obj);
            }
        }
        return matchesPost;
    }
}
