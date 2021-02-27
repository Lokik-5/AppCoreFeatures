package com.app.core.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *  Extends this [BaseActivity] in all activity.
 *
 * @author Lokik Soni
 * Created on 26/02/2021
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    /**
     * Helper function to launch an activity, specify an optional [bundle]
     * for information to be sent via the intent.
     *
     * @author Lokik Soni
     */
    protected inline fun <reified T> openActivity(bundle: Bundle? = null) {

        startActivity(Intent(this, T::class.java).apply {
            bundle?.let { putExtras(it) }
        })
    }
}