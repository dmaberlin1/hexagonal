package com.dmadev.catalogue.api.spring.webmvc;

import com.dmadev.catalogue.api.FindProductCategoryApi;
import com.dmadev.catalogue.api.spring.webmvc.presentation.ProductCategoryPresentationV1;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindProductCategoryRestController {
    private final FindProductCategoryApi findProductCategoryApi;

    public FindProductCategoryRestController(FindProductCategoryApi findProductCategoryApi) {
        this.findProductCategoryApi = findProductCategoryApi;
    }

    @GetMapping(path = "/api/catalogue/product-categories/{id:\\d+}",
    produces = "application/vnd.dmadev.catalogue.product-category.v1+json")
    public ResponseEntity<ProductCategoryPresentationV1> findProductCategory(@PathVariable("id") long id){

    }
}
