package org.liuep.springcloud.impl;


import org.apache.ibatis.annotations.Param;
import org.liuep.springcloud.DAO.PaymentDAO;
import org.liuep.springcloud.entities.Payment;
import org.liuep.springcloud.services.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDAO paymentDAO;

    @Override
    public int save(Payment payment){
        return paymentDAO.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }

}
