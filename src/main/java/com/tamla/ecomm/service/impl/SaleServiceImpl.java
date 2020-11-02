package com.tamla.ecomm.service.impl;

import com.tamla.ecomm.model.dto.Sale;
import com.tamla.ecomm.service.SaleService;
import org.springframework.stereotype.Service;
import zw.co.paynow.constants.MobileMoneyMethod;
import zw.co.paynow.core.Payment;
import zw.co.paynow.core.Paynow;
import zw.co.paynow.responses.MobileInitResponse;

@Service
public class SaleServiceImpl implements SaleService {


    @Override
    public Sale makeSale(Sale sale) {
        Paynow paynow = new Paynow("11090", "e30e68b4-b15f-4e28-b919-685688229a0b");

        Payment payment = paynow.createPayment("Invoice 35", "tmlangeni@gmail.com");

        payment.add("Bananas", 2.5);
        payment.add("Apples", 1.0);

        MobileInitResponse response = paynow.sendMobile(payment, "0777062166", MobileMoneyMethod.ECOCASH);

        return null;
    }
}
