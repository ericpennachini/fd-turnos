package ar.com.fashiondog.application.repository

import ar.com.fashiondog.application.domain.mapper.CustomerMapper
import ar.com.fashiondog.application.domain.model.Customer
import ar.com.fashiondog.application.service.FashionDogService

class FashionDogRepositoryImpl(private val service: FashionDogService): FashionDogRepository {
    override fun getCustomers(
        onSuccess: (customers: Set<Customer>) -> Unit,
        onError: (exception: Exception) -> Unit
    ) {
        service.getCustomers(
            { customersDTO ->
                onSuccess.invoke(CustomerMapper.mapList(customersDTO))
            },
            { ex ->
                onError.invoke(ex)
            }
        )
    }

    override fun putCustomer(customer: Customer) {
        TODO("Not yet implemented")
    }
}