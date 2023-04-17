package com.example.controller;

import com.example.dao.LoginDTO;
import com.example.model.BasicRequestModel;
import com.example.model.LoginResciveModel;
import com.example.model.UserReciveModel;
import com.example.service.LoginService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import jakarta.inject.Inject;

@Controller
public class LoginController {
    @Inject
    LoginService loginService;
    @Inject
    LoginDTO loginDTO;

    @Post(value = "/user/login",consumes = MediaType.APPLICATION_JSON)
    @Secured(SecurityRule.IS_ANONYMOUS)
    public BasicRequestModel checkLogin(@Body LoginResciveModel loginModel){
        BasicRequestModel basicRequestModel = new BasicRequestModel();
        if (loginService.checkLogin(loginModel.getLogin(),loginModel.getPassword(),loginModel.isManager())==1){
            basicRequestModel.setCode(1);
            basicRequestModel.setMessage("correct");
            return basicRequestModel;
        }
        if (loginService.checkLogin(loginModel.getLogin(),loginModel.getPassword(),loginModel.isManager())==2){
            basicRequestModel.setCode(2);
            basicRequestModel.setMessage("correct");
            return basicRequestModel;
        }
        else{
            basicRequestModel.setCode(3);
            basicRequestModel.setMessage("incorrect");
        }
        return basicRequestModel;
    }
    @Post(value = "/user/register",consumes = MediaType.APPLICATION_JSON)// mediatype - сообщаем контроллеру какой формат файла придет
    @Secured(SecurityRule.IS_ANONYMOUS)
    public BasicRequestModel Register(@Body UserReciveModel userModel){
        BasicRequestModel basicRequestModel = new BasicRequestModel();
        if ( loginDTO.newUser(userModel.getName(),userModel.getSecondName(),userModel.getLogin(),userModel.getPassword(),userModel.getEmail())){
            basicRequestModel.setCode(1);
            basicRequestModel.setMessage("correct");
        }
        else{
            basicRequestModel.setCode(2);
            basicRequestModel.setMessage("incorrect");
        }
        return basicRequestModel;
    }
}
