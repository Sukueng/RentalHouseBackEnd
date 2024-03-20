package com.RentalHome.BackEnd.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class Userpass{

    String rspassword1;
    String rsemail;
    String rspassword2;

    public String getRspassword1() {
        return rspassword1;
    }

    public void setRspassword1(String rspassword1) {
        this.rspassword1 = rspassword1;
    }

    public String getRsemail() {
        return rsemail;
    }

    public void setRsemail(String rsemail) {
        this.rsemail = rsemail;
    }

    public String getRspassword2() {
        return rspassword2;
    }

    public void setRspassword2(String rspassword2) {
        this.rspassword2 = rspassword2;
    }

    @Override
    public String toString() {
        return "Userpass{" +
                "rspassword1='" + rspassword1 + '\'' +
                ", rsemail='" + rsemail + '\'' +
                ", rspassword2='" + rspassword2 + '\'' +
                '}';
    }
}


@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/user/add")
    public String adduser(@RequestBody UserModel user){
        service.adduser(user);
        return "ok";
    }

    @PostMapping("/user/finduser")
    public UserModel finduser(@RequestBody UserModel model){
        UserModel res =service.finduser(model);
        return res;
    }

    @PostMapping("/user/changepassword")
    public String changepassword(@RequestBody Userpass pass){
        return service.changepassword(pass);
//        System.out.println(pass);
//        return "ssss";
    }

    @PostMapping("/user/checkuserForPass")
    public String checkuser(@RequestBody Userpass pass){
        String res = service.checkuser(pass.getRsemail());
//        System.out.println(pass);
        return res;
    }


}
