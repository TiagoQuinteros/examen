package ar.com.flexibility.examen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ar.com.flexibility.examen.domain.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
 	