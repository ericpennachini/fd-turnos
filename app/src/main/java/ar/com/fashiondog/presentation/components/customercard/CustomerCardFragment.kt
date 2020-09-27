package ar.com.fashiondog.presentation.components.customercard

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ar.com.fashiondog.R

class CustomerCardFragment : Fragment() {

    companion object {
        fun newInstance() = CustomerCardFragment()
    }

    private lateinit var viewModel: CustomerCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_customer_card, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CustomerCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}