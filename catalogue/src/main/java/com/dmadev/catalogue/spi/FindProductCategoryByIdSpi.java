package com.dmadev.catalogue.spi;

import com.dmadev.catalogue.data.ProductCategoryData;
import com.dmadev.catalogue.id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryByIdSpi {
    Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id);

}
