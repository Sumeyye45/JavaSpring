package com.turkcell.productservice.Services.mappers;

import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


    Product productFromRequest (AddProductRequest request);

}
