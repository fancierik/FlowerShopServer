package com.example.controller;

import com.example.dao.GodDTO;
import com.example.dao.OrderDTO;
import com.example.dao.UserDTO;
import com.example.entity.Good;
import com.example.entity.Order;
import com.example.entity.User;
import com.example.model.*;
import com.example.repository.UserRepository;
import com.example.service.GodService;
import com.example.service.ManagerService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ManagerController {
    @Inject
    ManagerService managerService;
    @Inject
    UserDTO userDTO;
    @Inject
    OrderDTO orderDTO;
    @Inject
    GodDTO godDTO;
    @Inject
    GodService godService;
    @Inject
    UserRepository userRepository;
    @Get(value = "/getOrder")
    @Secured(SecurityRule.IS_ANONYMOUS)
    public List<SendAllOrderModel> GetAllOrder(){
        List<SendAllOrderModel> returnList = new ArrayList<>();
        List<Order> orderList = orderDTO.GetAllOrder();

        for (Order order:orderList){
            User user = userRepository.getById(order.getUserid().getId());
            String fio = user.getName() +" "+ user.getSecondname();
            SendAllOrderModel orderModel = new SendAllOrderModel(
                    order.getId(),
                    order.getPayid().getId(),
                    order.getDateOfOrder(),
                    order.getDateofrecive(),
                    fio,
                    order.getTyoeOfSend(),
                    order.getStatus(),
                    order.getCartList(),
                    order.getAdress(),
                    order.getName()
            );
            returnList.add(orderModel);
        }
        return returnList;
    }

    @Get(value = "/getUser")
    @Secured(SecurityRule.IS_ANONYMOUS)
    public List<SendAllUserModel> GetAllUser(){
        List<SendAllUserModel> returnList = new ArrayList<>();
        List<User> userList = userDTO.GetAllUser();

        for (User user:userList){

            SendAllUserModel userModel = new SendAllUserModel(
                    user.getId(),
                    user.getName(),
                    user.getSecondname(),
                    user.getLogin(),
                    user.getEmail()
            );
            returnList.add(userModel);
        }
        return returnList;
    }
    @Post(value = "/postUpdateOrderDate",consumes = MediaType.APPLICATION_JSON)
    @Secured(SecurityRule.IS_ANONYMOUS)
    public BasicRequestModel UpdateOrder(@Body UpdateOrderModel updateOrderModel){
        orderDTO.UpdateOrder(updateOrderModel.getId(),updateOrderModel.getDateofRecive(),updateOrderModel.getStatus());
        return new BasicRequestModel(1,"успешно");
    }
    @Post(value = "/postdeleteOrderDate",consumes = MediaType.APPLICATION_JSON)
    @Secured(SecurityRule.IS_ANONYMOUS)
    public BasicRequestModel DeleteOrder(@Body UpdateOrderModel updateOrderModel){
        orderDTO.DeleteOrder(updateOrderModel.getId());
        return new BasicRequestModel(1,"успешно удалено");
    }

    @Get(value = "/getGood")
    @Secured(SecurityRule.IS_ANONYMOUS)
    public List<SendAllGoodModel> GetAllGoot(){
        List<SendAllGoodModel> returnList = new ArrayList<>();
        List<Good> goodList = godDTO.GetAllGodd();

        for (Good good:goodList){

            SendAllGoodModel goodModel = new SendAllGoodModel(
                   good.getName(),
                    good.getDescription(),
                    good.getPrice()
            );
            returnList.add(goodModel);
        }
        return returnList;
    }

    @Post(value = "/addgood",consumes = MediaType.APPLICATION_JSON )//строчка с путем запроса
    @Secured(SecurityRule.IS_ANONYMOUS)//объявляем что запрос может быть анонимным
    public BasicRequestModel CreateGood(@Body GodModel godModel){

        BasicRequestModel basicRequestModel = new BasicRequestModel();
        if (godService.PostGood(godModel)){
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
