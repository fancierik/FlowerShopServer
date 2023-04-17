package com.example.dao;

import com.example.entity.Pay;
import com.example.repository.PayRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import net.bytebuddy.asm.Advice;


import java.time.LocalDate;
import java.util.Date;

@Singleton
public class PayDTO {
    Pay pay = new Pay();
    @Inject
    PayRepository payRepository;
    public Pay CreatePay(Integer summ){

        LocalDate DateNow = LocalDate.now();
        pay.setDateOfPay(DateNow);
        pay.setSumm(summ.doubleValue());
        payRepository.save(pay);
        System.out.println(pay);
        return pay;
    }

}
