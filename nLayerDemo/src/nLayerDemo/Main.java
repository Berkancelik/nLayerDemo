package nLayerDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.concretes.ProductManager;
import nLayerDemo.core.JLoggerManagerAdapter;
import nLayerDemo.dataAccess.concretes.AbcProductDao;
import nLayerDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo : Spring Ioc ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), 
				new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
	}

}
