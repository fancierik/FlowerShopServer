package com.example.controller;

import com.example.model.BasicRequestModel;
import com.example.model.CartReciveModel;
import com.example.model.CartReciveModel2;
import com.example.model.GodModel;
import com.example.repository.GodRepository;
import com.example.service.GodService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class GodController {
    @Inject
    GodService godService;
    @Inject
    GodRepository godRepository;
    @Get("/get/allGod")// полный список товара
    @Secured(SecurityRule.IS_ANONYMOUS)//объявляем что запрос может быть анонимным
    public List<GodModel> getAllGod(){
        return godService.GetAllGood();
    }


    @Post(value = "/user/order",consumes = MediaType.APPLICATION_JSON )// вызовов заказ
    @Secured(SecurityRule.IS_ANONYMOUS)//объявляем что запрос может быть анонимным
    public BasicRequestModel CreateOrder(@Body CartReciveModel2 cartReciveModels){

        BasicRequestModel basicRequestModel = new BasicRequestModel();
        if (godService.PostOrder(cartReciveModels)){
            basicRequestModel.setCode(1);
            basicRequestModel.setMessage("Добавлено");
        }
        else{
            basicRequestModel.setCode(0);
            basicRequestModel.setMessage("Не дообавлено");
        }
        return basicRequestModel;
    }
}
