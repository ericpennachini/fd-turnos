package ar.com.fashiondog.application.domain.mapper

import ar.com.fashiondog.application.domain.model.Customer
import ar.com.fashiondog.application.domain.dto.Customer as CustomerDTO

class CustomerMapper {
    companion object {
        fun mapList(customerListDTO: Set<CustomerDTO>): Set<Customer> {
            return customerListDTO.map { map(it) }.toSet()
        }

        fun map(customerDTO: CustomerDTO): Customer {
            return Customer(
                firstName = customerDTO.firstName,
                lastName = customerDTO.lastName,
                address = AddressMapper.map(customerDTO.address),
                emails = customerDTO.emails,
                description = customerDTO.description,
                isFromNeighbourhood = customerDTO.isFromNeighbourhood,
                phones = PhoneMapper.mapList(customerDTO.phones),
                pets = PetMapper.mapList(customerDTO.pets)
            )
        }
    }
}