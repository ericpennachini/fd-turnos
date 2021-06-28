package ar.com.fashiondog.presentation.screen.customer.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import ar.com.fashiondog.R
import ar.com.fashiondog.application.repository.FashionDogRepositoryImpl
import ar.com.fashiondog.application.service.FashionDogServiceImpl
import ar.com.fashiondog.presentation.common.Resource

class CustomerListFragment : Fragment() {
    private var columnCount = 1

    private val repository = FashionDogRepositoryImpl(FashionDogServiceImpl())
    private val viewModelFactory = CustomerListViewModel.Factory(repository)
    private val viewModel: CustomerListViewModel by viewModels { viewModelFactory }

    private lateinit var recyclerView: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_customer_list, container, false)

        swipeRefreshLayout = view.findViewById(R.id.customers_swipe_refresh_layout)
        recyclerView = view.findViewById(R.id.customers_list_recycler_view)

        // Set the adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = CustomerListAdapter(listOf())

        return view
    }

    private fun loadCustomers() {
        viewModel.getCustomers()
        viewModel.customersList.observe(viewLifecycleOwner, { res ->
            when (res) {
                is Resource.Loading -> {
                    // TODO: show loading
                }
                is Resource.Success -> {
                    // TODO: hide loading and show load content in recycler view
                }
                is Resource.Error -> {
                    // TODO: show some error view (or toast if content is previously loaded)
                }
            }
        })
    }

    companion object {
        const val ARG_COLUMN_COUNT = "column_count"

        @JvmStatic
        fun newInstance() = CustomerListFragment()
    }
}