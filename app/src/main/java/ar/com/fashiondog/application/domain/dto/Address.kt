package ar.com.fashiondog.application.domain.dto

data class Address(
    var street: String,
    var description: String,
    var city: String,
    var province: String,
    var country: String,
    var extraDetails: String?
)