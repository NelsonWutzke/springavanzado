package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Query nativo
    // Si usamos el nativo el nombre del metodo se puede llamar de cualquier forma.
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria(int IdCategoria); // QueryMethod
    //Nombre de metodo debe ser camel_case.
    //Parametro se debe llamar igual que en la clase.

    //Ejemlos
    //List<Producto> findByIdCategoriaOrderByNombreAsc(int IdCategoria);
    // Imaginarlo como lo haria con sql y respetamos la nomenclatura de queryMethod


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
