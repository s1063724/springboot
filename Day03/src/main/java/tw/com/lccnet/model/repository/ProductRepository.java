package tw.com.lccnet.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.com.lccnet.model.entity.Product;

//CRUD有預設方法，只需要覆寫
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
}
