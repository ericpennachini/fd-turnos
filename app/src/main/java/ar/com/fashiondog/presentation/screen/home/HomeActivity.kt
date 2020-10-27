package ar.com.fashiondog.presentation.screen.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ar.com.fashiondog.R
import ar.com.fashiondog.presentation.screen.BaseActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : BaseActivity() {

    private lateinit var customersButton: MaterialButton
    private lateinit var servicesButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun initializeComponents() {
        customersButton = findViewById(R.id.home_customers_button)
        servicesButton = findViewById(R.id.home_services_button)
    }

    override fun configureComponents() {
        customersButton.setOnClickListener {

        }
        servicesButton.setOnClickListener {

        }
    }
}