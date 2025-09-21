package com.Abi.SpringBootEcomProject.Services;

import com.Abi.SpringBootEcomProject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
