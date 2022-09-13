package com.michael.productService.payload.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@EqualsAndHashCode
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
