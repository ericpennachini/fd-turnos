package ar.com.fashiondog.presentation.screen.customer.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ar.com.fashiondog.application.domain.model.Customer
import ar.com.fashiondog.application.repository.FashionDogRepository
import ar.com.fashiondog.presentation.common.Resource

class CustomerListViewModel(private val repository: FashionDogRepository) : ViewModel() {

    private val _customersList = MutableLiveData<Resource<Set<Customer>>>()
    val customersList: LiveData<Resource<Set<Customer>>> = _customersList

    fun getCustomers() {
        repository.getCustomers(
            onSuccess = {
                _customersList.value = Resource.Success(it)
            },
            onError = {
                _customersList.value = Resource.Error(it)
            }
        )
    }

    class Factory(private val repository: FashionDogRepository) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            CustomerListViewModel(repository) as T
    }

}