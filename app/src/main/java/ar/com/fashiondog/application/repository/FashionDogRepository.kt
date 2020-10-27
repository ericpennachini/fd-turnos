package ar.com.fashiondog.application.repository

import ar.com.fashiondog.application.domain.model.Customer
import io.reactivex.rxjava3.core.Single

interface FashionDogRepository {

    fun getCustomers(
        onSuccess: (customers: Set<Customer>) -> Unit,
        onError: (exception: Exception) -> Unit
    )

    fun putCustomer(customer: Customer)

}