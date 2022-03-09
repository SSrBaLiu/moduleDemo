package org.liuep.springcloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.liuep.springcloud.entities.CommonResult;
import org.liuep.springcloud.entities.Payment;
import org.liuep.springcloud.services.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/save")
    public CommonResult save(Payment payment){
        int result = paymentService.save(payment);
        log.info("插入结果:"+result);

        if (result>0){
            return new CommonResult(200,"插入数据成功",result);
        } else {
          return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果:"+payment);

        if (payment != null){
            return new CommonResult(200,"查询成功",payment);
        } else {
            return new CommonResult(444,"查询失败id = "+id+"没有对应结果",null);
        }
    }
}
