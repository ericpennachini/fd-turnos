package ar.com.fashiondog.presentation.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeComponents()
        configureComponents()
    }

    /**
     * Get components from the parent view
     */
    abstract fun initializeComponents()

    /**
     * Initialize components from the parent view
     */
    abstract fun configureComponents()

}