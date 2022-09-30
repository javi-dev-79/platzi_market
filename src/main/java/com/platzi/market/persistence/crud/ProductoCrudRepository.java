package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

//    Podemos hacer el mismo método de la siguiente forma.
//    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
//    List<Producto> getIdCategoria(int idCategoria);
//    Como vemos, con este modo, podemos llamar el método como queramos.

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
