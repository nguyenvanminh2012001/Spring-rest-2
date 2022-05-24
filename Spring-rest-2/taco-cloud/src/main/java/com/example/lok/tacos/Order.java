//package com.example.lok.tacos;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Pattern;
//
//import org.hibernate.validator.constraints.CreditCardNumber;
//
//import javax.validation.constraints.NotBlank;
//
//import lombok.Data;
//
//@Data
//@Entity
//public class Order {
//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @NotBlank(message = "Name is required")
//    private String name;
//    @NotBlank(message = "Street is required")
//    private String street;
//    @NotBlank(message = "City is required")
//    private String city;
//    @NotBlank(message = "State is required")
//    private String state;
//    @NotBlank(message = "Zip code is required")
//    private String zip;
//    @CreditCardNumber(message = "Not a valid credit card number")
//    private String ccNumber;
//    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
//
//            message = "Must be formatted MM/YY")
//
//    private String ccExpiration;
//    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
//    private String ccCVV;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//}