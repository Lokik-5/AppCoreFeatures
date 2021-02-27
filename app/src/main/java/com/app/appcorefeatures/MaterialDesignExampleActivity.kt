package com.app.appcorefeatures

import android.os.Bundle
import com.app.core.activity.BaseActivity
import com.google.android.material.card.MaterialCardView

/**
 * A sample activity of showing material design components.
 *
 * @author Lokik Soni
 * Created on 27/02/2021
 */
class MaterialDesignExampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_material_design)

        // Card long click checked example
        val card: MaterialCardView = findViewById(R.id.card_example_check)
        card.setOnLongClickListener { card.isChecked = !card.isChecked
            true
        }
    }
}