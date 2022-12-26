package com.product.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductServiceRepository extends CrudRepository<ProductEntity , String> {

}
