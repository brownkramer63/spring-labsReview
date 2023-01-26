package com.cydeo.lab08rest.dto;

import com.cydeo.lab08rest.enums.CartState;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDTO {

    private long id;
    private CustomerDTO customer;
    private DiscountDTO discount;
    private CartState cartState;

}
