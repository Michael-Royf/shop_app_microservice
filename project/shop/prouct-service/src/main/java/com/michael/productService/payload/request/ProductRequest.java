package com.michael.productService.payload.request;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@EqualsAndHashCode
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
