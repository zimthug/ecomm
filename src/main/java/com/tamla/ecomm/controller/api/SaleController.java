package com.tamla.ecomm.controller.api;

import com.tamla.ecomm.model.dto.Sale;
import com.tamla.ecomm.service.SaleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaleController {

    private SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    /**
     * Post data to request and start a trip.
     *
     * @param tripRequest this is a JSON object. The following 3 objects are necessary
     *                    riderId:
     *                    startLongitude:
     *                    startLatitude:
     * @return
     */
    @PostMapping(value = { "/sale/confirm"}, consumes = "application/json")
    public Sale sale(@RequestBody Sale sale){
        return this.saleService.makeSale(sale);
    }
}
