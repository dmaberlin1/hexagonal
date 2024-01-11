package com.dmadev.catalogue.api;

import com.dmadev.catalogue.data.ProductCategoryData;
import com.dmadev.catalogue.id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryApi {
    Optional<ProductCategoryData> findProductCategory(ProductCategoryId id);
}
