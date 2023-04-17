package com.example.dao;

import com.example.entity.Good;
import com.example.model.CartReciveModel;
import com.example.model.GodModel;
import com.example.repository.GodRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
//
@Singleton
public class GodDTO {
    @Inject
    GodRepository godRepository;

    public List<Good> GetAllGodd(){
        return godRepository.findAll();
    }
    public List<GodModel> GetAllGod(){
       List<Good> GodList =  godRepository.findAll();
       List<GodModel> GodModelList = new ArrayList<>();
       for( Good god: GodList){
           GodModelList.add(new GodModel(god.getId(),
                   god.getDescription(),
                   god.getPrice(),
                   god.getName()
           ));
       }
        return GodModelList;
    }

    public Good CreatNewGood(GodModel godModel){
        Good good=new Good();
        good.setDescription(godModel.getDescription());
                good.setPrice(godModel.getPrice());
                good.setName(godModel.getName());
        godRepository.save(good);
        return good;
    }
    public List<Good> GetAllGodToCart(List<CartReciveModel> cartReciveModels){
        List<Good> goods = new ArrayList<>();
        for (CartReciveModel cartReciveModel:cartReciveModels){
            Good good = new Good();
            good = godRepository.findByDescription(cartReciveModel.getName());
        }
        return goods;
    }
}
