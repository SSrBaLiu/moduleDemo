package org.liuep.springcloud.services;

import org.apache.ibatis.annotations.Param;
import org.liuep.springcloud.entities.Payment;

public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
