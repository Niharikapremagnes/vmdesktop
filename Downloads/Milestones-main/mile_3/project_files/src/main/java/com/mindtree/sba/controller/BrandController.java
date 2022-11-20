package com.mindtree.sba.controller;

import com.mindtree.sba.entity.Brand;
import com.mindtree.sba.entity.Mobile;
import com.mindtree.sba.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brands")
    public ResponseEntity<?> fetchBrands() {
        List<Brand> brands = brandService.getAllBrands();
        return ResponseEntity.ok().body(brands);
    }

    @PostMapping("/brand")
    public ResponseEntity<?> addBrand(@RequestBody Brand brand) {
        Brand savedBrand = brandService.addBrand(brand);
        return ResponseEntity.ok().body(savedBrand);
    }

    @PostMapping("/mobile/{brand}")
    public ResponseEntity<?> addMobileToBrand(@PathVariable("brand") String brandName, @RequestBody Mobile mobile) {
        boolean result = brandService.addMobile(brandName, mobile);
        if(result == false) {
            return ResponseEntity.badRequest().body("No brand exists for the name: '" + brandName + "'");
        }
        return ResponseEntity.ok().body("Mobile has been added successfully");
    }

    @PutMapping("/mobile/{brand}/{mobile}/{price}")
    public ResponseEntity<?> updateMobilePrice(@PathVariable("brand") String brandName, @PathVariable("mobile") String mobileName, @PathVariable float price) {
        Mobile mobile = brandService.updatePrice(brandName, mobileName, price);
        if(mobile == null) {
            return ResponseEntity.badRequest().body("Error while updating the mobile price for brand: '" + brandName + "', mobile: '" + mobileName + "'");
        }
        else {
            return ResponseEntity.ok().body(mobile);
        }
    }
}
