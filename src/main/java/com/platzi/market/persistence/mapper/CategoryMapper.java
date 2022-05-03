package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    // Categoria a Category
    @Mappings({
                    @Mapping(source = "idCategoria",target = "categoryId"),
                    @Mapping(source = "descripcion",target = "category"),
                    @Mapping(source = "estado",target = "active")
    })
    Category toCategory(Categoria categoria);

    // le indica a mapstrut que es la inversa a la que figura arriba
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true) // no incluyo arriba, asi que aca hay que ignorarlo
    Categoria toCategoria(Category category);



}
