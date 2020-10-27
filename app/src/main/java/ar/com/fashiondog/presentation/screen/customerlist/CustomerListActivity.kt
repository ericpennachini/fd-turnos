package ar.com.fashiondog.presentation.screen.customerlist

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import ar.com.fashiondog.R
import ar.com.fashiondog.application.repository.FashionDogRepositoryImpl
import ar.com.fashiondog.application.service.FashionDogServiceImpl
import ar.com.fashiondog.presentation.screen.BaseActivity

class CustomerListActivity : BaseActivity() {

    private val repository = FashionDogRepositoryImpl(FashionDogServiceImpl())
    private val viewModelFactory = CustomerListViewModel.Factory(repository)
    private val viewModel: CustomerListViewModel by viewModels { viewModelFactory }

    private lateinit var recyclerView: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_list)
    }

    override fun initializeComponents() {
        swipeRefreshLayout = findViewById(R.id.customers_swipe_refresh_layout)
        recyclerView = findViewById(R.id.customers_list_recycler_view)
    }

    override fun configureComponents() {
        // TODO: execute action for swipe refresh

        // TODO: add items to recycler view
    }

    private fun loadCustomers() {
//        viewModel.getCustomers()
//        viewModel.customersList.observe()
    }
}