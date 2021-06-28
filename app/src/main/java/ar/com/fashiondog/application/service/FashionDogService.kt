package ar.com.fashiondog.application.service

import ar.com.fashiondog.application.domain.dto.Customer
import io.reactivex.rxjava3.core.Single

interface FashionDogService {

    fun getCustomers(
        onSuccess: (result: Set<Customer>) -> Unit,
        onError: (exception: Exception) -> Unit
    )

    fun putCustomer(
        customer: Customer,
        onSuccess: () -> Unit,
        onError: (exception: Exception) -> Unit
    )

    fun getCustomerByCriteria(criteria: String): Single<Customer>

}