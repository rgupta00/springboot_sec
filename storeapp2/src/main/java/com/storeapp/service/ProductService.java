package com.storeapp.service;
import java.util.*;

import com.storeapp.entities.Product;
public interface ProductService {
	public Product getProductById(int productId);
	public Product getProductByProductName(String productName);
	public List<Product> getAllProduct();
	public Product addProduct(Product product);
	public Product updateProduct(int productId, Product product);
	public Product deleteProduct(int productId);
	public void evictCache();
}
