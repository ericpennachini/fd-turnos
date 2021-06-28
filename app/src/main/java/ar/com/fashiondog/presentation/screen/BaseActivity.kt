package ar.com.fashiondog.presentation.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    /**
     * Get components from the parent view
     */
    abstract fun initializeComponents()

    /**
     * Initialize components from the parent view
     */
    abstract fun configureComponents()

}