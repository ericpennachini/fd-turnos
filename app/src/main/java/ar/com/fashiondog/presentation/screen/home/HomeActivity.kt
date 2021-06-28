package ar.com.fashiondog.presentation.screen.home

import android.os.Bundle
import ar.com.fashiondog.R
import ar.com.fashiondog.presentation.screen.BaseActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    private lateinit var customersButton: MaterialButton
    private lateinit var servicesButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initializeComponents()
        configureComponents()
    }

    override fun initializeComponents() {
        customersButton = findViewById(R.id.home_customers_button)
        servicesButton = findViewById(R.id.home_services_button)
    }

    override fun configureComponents() {
        customersButton.setOnClickListener {
            // TODO: abrir activity de Customers
            Snackbar.make(home_main_container, "Not implemented", Snackbar.LENGTH_SHORT).show()
        }
        servicesButton.setOnClickListener {
            // TODO: abrir activity de Services
            Snackbar.make(home_main_container, "Not implemented", Snackbar.LENGTH_SHORT).show()
        }
    }
}