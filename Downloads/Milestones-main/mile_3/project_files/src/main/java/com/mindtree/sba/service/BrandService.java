package com.mindtree.sba.service;

import com.mindtree.sba.entity.Brand;
import com.mindtree.sba.entity.Mobile;
import com.mindtree.sba.exception.BrandNameNotPresentException;
import com.mindtree.sba.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getAllBrands() {
        return brandRepository.findByOrderByNameAsc();
    }

    public Brand addBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    public boolean addMobile(String brandName, Mobile mobile) {
        Brand brand = brandRepository.findByNameEqualsIgnoreCase(brandName);
        if(brand == null) {
            return false;
        }
        else {
            List<Mobile> mobiles = brand.getMobiles();
            mobiles.add(mobile);
            brand.setMobiles(mobiles);
            brandRepository.save(brand);
            return true;
        }
    }

    public Mobile updatePrice(String brandName, String mobileName, float price) {
        Brand brand = brandRepository.findByNameEqualsIgnoreCase(brandName);
        if(brand == null) throw new BrandNameNotPresentException("No such Brand there in database");
        List<Mobile> mobiles = brand.getMobiles();
        Mobile mobile = (Mobile) mobiles.stream().filter(m -> m.getName().equals(mobileName));
        if(mobile == null) {
            return null;
        }
        else {
            int index = mobiles.indexOf(mobile);
            mobiles.get(index).setPrice(price);
            brand.setMobiles(mobiles);
            brandRepository.save(brand);
            return mobiles.get(index);
        }
    }
}
