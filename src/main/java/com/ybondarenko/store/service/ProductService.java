package com.ybondarenko.store.service;

import com.ybondarenko.store.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = new ArrayList<>();
    private long ID = 0;

    {
        productList.add(new Product(ID++, "PS4", "desc", 100000, "MSK", "Lol"));
        productList.add(new Product(ID++, "Lenovo", "desc", 3000, "MSK", "Lol2"));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductByID(long id) {
        for(Product product : productList) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void saveProduct(Product product) {
        product.setId(ID++);
        productList.add(product);
    }

    public void deleteProduct(long id) {
        productList.removeIf(p -> p.getId().equals(id));
    }


}
