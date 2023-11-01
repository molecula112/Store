package com.ybondarenko.store.controller;

import com.ybondarenko.store.entity.Product;
import com.ybondarenko.store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/main")
    public String getProduct(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "products";
    }

    @GetMapping("/search")
    public String getProductByTitle(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("products", productService.getProductByTitle(title));
        return "searchResult";
    }

    @GetMapping("/product/{id}")
    public String getProductInfoByID(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductByID(id));
        return "productInfo";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        System.out.println(product.toString());
        productService.saveProduct(product);
        return "redirect:/products/main";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products/main"                                                           ;
    }

}
