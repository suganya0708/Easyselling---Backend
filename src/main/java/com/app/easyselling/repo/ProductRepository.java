package com.app.easyselling.repo;
import com.app.easyselling.Model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Integer> {

}
