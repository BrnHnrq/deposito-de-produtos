package com.brnhnrq.deposito.controller;

import com.brnhnrq.deposito.entity.Products;
import com.brnhnrq.deposito.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class DepositoController {

    @Autowired
    DepositoService depositoService;

    @GetMapping("/list")
    public String getProducts(){
        List<Products> allProducts = depositoService.getAllProducts();

        return "main-form";
    }

    @GetMapping("/getall")
    public String listAll(Model model){
        List<Products> allProducts = depositoService.getAllProducts();
        model.addAttribute("products", allProducts);
        return "see-products";
    }

    @GetMapping("/addproduct")
    public String addProductForm(Model model){
        Products products= new Products();
        model.addAttribute("products",products);
        return "add-products";
    }

    @GetMapping("/delete")
    public String removeProduct(@RequestParam("id") int id){

        depositoService.deleteProduct(id);

        return "redirect:/products/getall";
    }

    @PostMapping("/saveProduct")
    public String saveProductToDb(@ModelAttribute("products") Products products){

        depositoService.addProduct(products);

        return "redirect:/products/getall";
    }

    @GetMapping("/update")
    public String updateProduct(@RequestParam("id") int id, Model model){
        Products products = depositoService.getProductById(id);

        model.addAttribute("products", products);

        return "add-products";
    }
}
