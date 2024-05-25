package com.turkcell.productservice.Services.mappers;

import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.entities.Product;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-20T18:59:50+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( request.getName() );
        product.setProdChar( request.getProdChar() );
        product.setServiceAdress( request.getServiceAdress() );
        product.setStartDate( request.getStartDate() );

        return product;
    }
}
