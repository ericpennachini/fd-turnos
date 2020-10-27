package ar.com.fashiondog.application.domain.mapper

import ar.com.fashiondog.application.domain.model.Address
import ar.com.fashiondog.application.domain.dto.Address as AddressDTO

class AddressMapper {
    companion object {
        fun map(addressDTO: AddressDTO): Address {
            return Address(
                street = addressDTO.street,
                description = addressDTO.description,
                city = addressDTO.city,
                province = addressDTO.province,
                country = addressDTO.country,
                extraDetails = addressDTO.extraDetails
            )
        }
    }
}