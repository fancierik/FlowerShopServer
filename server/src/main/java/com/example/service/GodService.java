package com.example.service;

import com.example.dao.CartDTO;
import com.example.dao.GodDTO;
import com.example.dao.OrderDTO;
import com.example.dao.PayDTO;
import com.example.entity.Good;
import com.example.entity.Order;
import com.example.entity.Pay;
import com.example.model.CartReciveModel2;
import com.example.model.GodModel;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

//
@Singleton
public class GodService {
    @Inject
    GodDTO godDTO;
    @Inject
    PayDTO payDTO;
    @Inject
    OrderDTO orderDTO;
    @Inject
    CartDTO cartDTO;
    @Inject
    SendFileService sendFileService;
    @Inject
    SendFileServiceAdd sendFileServiceadd;

    public List<GodModel> GetAllGood() {
        return godDTO.GetAllGod();
    }

    public boolean PostOrder(CartReciveModel2 cartReciveModels) {
        boolean result = false;
        List<Good> goods = godDTO.GetAllGodToCart(cartReciveModels.getCartList());

        Pay pay = payDTO.CreatePay(cartReciveModels.getSumm());
        Order order = orderDTO.CreatNewOrder(cartReciveModels, pay);
        if (cartDTO.CrateCart(goods, order)) {
            result = true;
        }
        sendFileService.SendEmail(
                cartReciveModels.getEmail(),
                cartReciveModels.getSumm(),
                order.getUserid().getName() + " " + order.getUserid().getSecondname(),
                order.getId());
        return result;
    }

    public boolean PostGood(GodModel godModel) {
        boolean result = false;
//       List<Good> goods = godDTO.GetAllGodToCart(godModel.getCartList());
//       Pay pay = payDTO.CreatePay(godModel.getSumm());
        Good good = godDTO.CreatNewGood(godModel);
        result = true;
        sendFileServiceadd.SendEmailAdd(
                godModel.getName(),
                godModel.getPrice(),
                godModel.getDescription());
        return result;
    }

}
