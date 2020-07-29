package com.osystem.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.osystem.mall.product.entity.BrandEntity;
import com.osystem.mall.product.entity.CategoryBrandRelationEntity;
import com.osystem.mall.product.entity.ProductAttrValueEntity;
import com.osystem.mall.product.service.BrandService;
import com.osystem.mall.product.service.CategoryBrandRelationService;
import com.osystem.mall.product.service.ProductAttrValueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@SpringBootTest
class OsystemProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("Test");
//        brandService.save(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

//        be.setName("Test");
    }

}
