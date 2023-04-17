package com.example.service;

import com.example.dao.CartDTO;
import com.example.dao.GodDTO;
import com.example.dao.OrderDTO;
import com.example.dao.PayDTO;
import com.example.model.GodModel;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ManagerService {
    @Inject
    GodDTO godDTO; //импорт но не совсем
    @Inject
    PayDTO payDTO;
    @Inject
    OrderDTO orderDTO;
    @Inject
    CartDTO cartDTO;
    @Inject
    SendFileService sendFileService;
    public List<GodModel> GetAllGood(){
        return godDTO.GetAllGod();
    }


}
