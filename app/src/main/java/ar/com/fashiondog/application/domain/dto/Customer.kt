package ar.com.fashiondog.application.domain.dto

data class Customer(
    var firstName: String,
    var lastName: String,
    var address: Address,
    var emails: Set<String>,
    var description: String?,
    var isFromNeighbourhood: Boolean,
    var phones: Set<Phone>,
    var pets: Set<Pet>
)