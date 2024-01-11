package com.dmadev.catalogue.data;

import com.dmadev.catalogue.id.ProductCategoryId;

//dto именуем с окончанием data, не dto
public record ProductCategoryData(ProductCategoryId id,String title,String details,ProductCategoryId parentId, int version) {

}
