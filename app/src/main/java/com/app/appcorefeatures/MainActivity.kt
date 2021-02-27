package com.app.appcorefeatures

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.app.core.activity.BaseActivity

/**
 * Simple activity that extends [BaseActivity] and use
 * to open different sample activity.
 *
 * @author Lokik Soni
 * Created on 26/02/2021
 * Modify on 27/02/2021
 */
class MainActivity : BaseActivity(), View.OnClickListener {

    private var _btnMaterialFesign: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _btnMaterialFesign = findViewById(R.id.btn_main_material_design)
        _btnMaterialFesign?.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when(v.id) {
            R.id.btn_main_material_design -> openActivity<MaterialDesignExampleActivity>()
        }
    }
}