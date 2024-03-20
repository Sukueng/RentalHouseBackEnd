package com.RentalHome.BackEnd.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepostory repo;
    public void adduser(UserModel user) {
        repo.save(user);
    }

    public UserModel finduser(UserModel model) {
//        System.out.println(model.getId());
//        UserModel m = repo.findById(model.getEmail()).orElse(null);
//        System.out.println(m);

        List<UserModel> alluser = repo.findAll();

         for (UserModel obj : alluser){
            if(obj.getEmail().equals(model.getEmail()) && obj.getPassword().equals(model.getPassword())){
               return obj;
            }
        }

         return null;
    }

    public String changepassword(Userpass pass) {
        List<UserModel> alluser = repo.findAll();

        for (UserModel obj : alluser){
            if(obj.getEmail().equals(pass.getRsemail())){
                obj.setPassword(pass.getRspassword1());
                repo.save(obj);
                return "ok";
            }
        }
        return "no";

    }

    public String checkuser(String pass) {
        List<UserModel> alluser = repo.findAll();

        for (UserModel obj : alluser){
            if(obj.getEmail().equals(pass)){
                return "ok";
            }
        }
        return "no";

    }
}
