package com.example.dao;

import com.example.entity.Good;
import com.example.entity.Order;
import com.example.entity.Pay;
import com.example.model.CartReciveModel;
import com.example.model.CartReciveModel2;
import com.example.repository.GodRepository;
import com.example.repository.OrderRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import com.example.dao.PayDTO;

import java.time.LocalDate;
import java.util.List;
// работа с бд
@Singleton
public class OrderDTO {
    @Inject
    OrderRepository orderRepository ;
    @Inject
    LoginDTO loginDTO;

    public Order CreatNewOrder(CartReciveModel2 cartReciveModel2, Pay pay){
        Order order = new Order();
        order.setTyoeOfSend(cartReciveModel2.getStatus()); //
        order.setAdress(cartReciveModel2.getAdressField());//
        order.setName(cartReciveModel2.getNamee());
        order.setCartList(cartReciveModel2.getCartList().toString());//
        order.setDateOfOrder(LocalDate.now());//
        order.setPayid(pay);//
        order.setStatus("Оплачено");//
        order.setUserid(loginDTO.getUser(cartReciveModel2.getLoginField(),cartReciveModel2.getPasswordField()));
        if(!cartReciveModel2.getDateOrder().isEmpty()){
            String subStr = cartReciveModel2.getDateOrder().substring(0,10);
            LocalDate dateOfOrder = LocalDate.parse(subStr);
            order.setDateofrecive(dateOfOrder);
        }
        orderRepository.save(order);
        return order;
    }

    public List<Order> GetAllOrder(){
        return orderRepository.findAll();
    }
    public boolean DeleteOrder(Integer id){
        Order order = new Order();
        List<Order> orders = GetAllOrder();
        for(Order order1:orders){
            if(order1.getId() == id){
                order = order1;
            }
        }
         orderRepository.delete(order);
        return true;
    }

    public boolean UpdateOrder(Integer id,String dateOfRecive,String status){
        if(status==null) {
            Order order = new Order();
            List<Order> orders = GetAllOrder();
            for(Order order1:orders){
                if(order1.getId() == id){
                    order = order1;
                }
            }
            LocalDate DateofRecive = LocalDate.parse(dateOfRecive.substring(0,10));
            order.setDateofrecive(DateofRecive);
            orderRepository.update(order);

        }
        if(dateOfRecive.isEmpty()) {
            Order order = new Order();
            List<Order> orders = GetAllOrder();
            for(Order order1:orders){
                if(order1.getId() == id){
                    order = order1;
                }
            }
            order.setStatus(status);
            orderRepository.update(order);
        }
        return true;
    }

}
