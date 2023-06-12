package com.halfacode.mapper;

import com.halfacode.dto.CreateProductRequest;
import com.halfacode.dto.UpdateProductRequest;
import com.halfacode.model.Product;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T15:34:55+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProduct(CreateProductRequest createProductRequest) {
        if ( createProductRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( createProductRequest.getName() );
        product.setDescription( createProductRequest.getDescription() );
        product.setPrice( createProductRequest.getPrice() );
        Set<String> set = createProductRequest.getCategories();
        if ( set != null ) {
            product.setCategories( new LinkedHashSet<String>( set ) );
        }

        return product;
    }

    @Override
    public void updateProductFromRequest(UpdateProductRequest updateProductRequest, Product product) {
        if ( updateProductRequest == null ) {
            return;
        }

        if ( updateProductRequest.getName() != null ) {
            product.setName( updateProductRequest.getName() );
        }
        if ( updateProductRequest.getDescription() != null ) {
            product.setDescription( updateProductRequest.getDescription() );
        }
        if ( updateProductRequest.getPrice() != null ) {
            product.setPrice( updateProductRequest.getPrice() );
        }
        if ( product.getCategories() != null ) {
            Set<String> set = updateProductRequest.getCategories();
            if ( set != null ) {
                product.getCategories().clear();
                product.getCategories().addAll( set );
            }
        }
        else {
            Set<String> set = updateProductRequest.getCategories();
            if ( set != null ) {
                product.setCategories( new LinkedHashSet<String>( set ) );
            }
        }
    }
}
