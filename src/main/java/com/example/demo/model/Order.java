package com.example.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order {

    private Long id;

    private Date placedAt;

    @NotBlank(message="Name is required")
    private String deliveryName;

    @NotBlank(message="street is required")
    private String deliveryStreet;

    @NotBlank(message="city is required")
    private String deliveryCity;

    @NotBlank(message="state is required")
    private String deliveryState;

    @NotBlank(message="zip is required")
    private String deliveryZip;

    @CreditCardNumber(message="ccNumber is not valid")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message="ccCVV is required")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addDesign(Taco design) {
        tacos.add(design);
    }
}
