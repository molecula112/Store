package com.ybondarenko.store.service;

import com.ybondarenko.store.entity.Product;
import com.ybondarenko.store.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getProductList() {
        return repository.findAll();
    }

    public List<Product> getProductByTitle(String title) {
        return repository.findByTitle(title);
    }

    public Product getProductByID(long id) {
        return repository.findById(id).orElse(null);
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(long id) {
        repository.deleteById(id);
    }
}
