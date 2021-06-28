package ar.com.fashiondog.presentation.screen.customer

import android.os.Bundle
import android.widget.FrameLayout
import ar.com.fashiondog.R
import ar.com.fashiondog.presentation.screen.BaseActivity

class CustomerActivity : BaseActivity() {
    private lateinit var fragmentContainer: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
    }

    override fun initializeComponents() {
        fragmentContainer = findViewById(R.id.customer_fragment_container)
    }

    override fun configureComponents() {
        
    }
}