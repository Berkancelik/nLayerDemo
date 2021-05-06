package nLayerDemo.business.abstracts;

import java.util.List;

import nLayerDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
	

}
