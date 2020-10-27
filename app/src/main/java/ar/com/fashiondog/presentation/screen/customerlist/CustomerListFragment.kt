package ar.com.fashiondog.presentation.screen.customerlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import ar.com.fashiondog.R
import ar.com.fashiondog.application.repository.FashionDogRepositoryImpl
import ar.com.fashiondog.application.service.FashionDogServiceImpl
import ar.com.fashiondog.presentation.common.Resource
import ar.com.fashiondog.presentation.screen.customerlist.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class CustomerListFragment : Fragment() {

    private var columnCount = 1

    private val repository = FashionDogRepositoryImpl(FashionDogServiceImpl())
    private val viewModelFactory = CustomerListViewModel.Factory(repository)
    private val viewModel: CustomerListViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_customer_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = CustomerListAdapter(DummyContent.ITEMS)
            }
        }
        return view
    }

    private fun loadCustomers() {
        viewModel.getCustomers()
        viewModel.customersList.observe(viewLifecycleOwner, Observer { res ->
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
        fun newInstance(columnCount: Int) =
            CustomerListFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}