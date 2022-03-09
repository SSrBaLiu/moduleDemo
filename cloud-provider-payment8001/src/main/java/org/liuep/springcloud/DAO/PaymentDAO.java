package org.liuep.springcloud.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.liuep.springcloud.entities.Payment;

@Mapper
public interface PaymentDAO {

    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
