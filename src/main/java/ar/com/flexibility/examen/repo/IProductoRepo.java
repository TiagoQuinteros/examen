package ar.com.flexibility.examen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.flexibility.examen.domain.model.Producto;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
 	