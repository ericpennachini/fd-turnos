package ar.com.fashiondog.application.service

import ar.com.fashiondog.application.domain.dto.Customer
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Single

class FashionDogServiceImpl : FashionDogService {

    override fun getCustomers(
        onSuccess: (result: Set<Customer>) -> Unit,
        onError: (exception: Exception) -> Unit
    ) {
        FirebaseFirestore.getInstance().collection("customers").get()
            .addOnSuccessListener { task ->
                val customerList = mutableSetOf<Customer>()
                task.documents.forEach { document ->
                    document.toObject(Customer::class.java)?.let { customerList.add(it) }
                }
                onSuccess.invoke(customerList)
            }
            .addOnFailureListener {
                onError.invoke(it)
            }
    }

    override fun putCustomer(
        customer: Customer,
        onSuccess: () -> Unit,
        onError: (exception: Exception) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun getCustomerByCriteria(criteria: String): Single<Customer> {
        TODO("Not yet implemented")
    }

}
