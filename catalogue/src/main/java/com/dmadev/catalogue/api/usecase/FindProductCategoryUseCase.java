package com.dmadev.catalogue.api.usecase;

import com.dmadev.catalogue.api.FindProductCategoryApi;
import com.dmadev.catalogue.data.ProductCategoryData;
import com.dmadev.catalogue.id.ProductCategoryId;
import com.dmadev.catalogue.spi.FindProductCategoryByIdSpi;

import java.util.Optional;

public class FindProductCategoryUseCase implements FindProductCategoryApi {
    private final FindProductCategoryByIdSpi findProductCategoryByIdSpi;

    public FindProductCategoryUseCase(FindProductCategoryByIdSpi findProductCategoryByIdSpi) {
        this.findProductCategoryByIdSpi = findProductCategoryByIdSpi;
    }

    @Override
    public Optional<ProductCategoryData> findProductCategory(ProductCategoryId id) {
        return this.findProductCategoryByIdSpi.findProductCategoryById(id);
    }
}
