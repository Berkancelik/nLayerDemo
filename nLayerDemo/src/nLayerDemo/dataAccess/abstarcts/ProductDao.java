package nLayerDemo.dataAccess.abstarcts;



import java.util.List;

import nLayerDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	Product[] getAl();
	
	
	
	List getAll();
	

}
