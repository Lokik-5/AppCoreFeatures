package com.app.core.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Extends this [BaseFragment] in all fragments
 * and pass your binding class as parameter.
 *
 * @author Lokik Soni
 * Created on 03/01/2021
 */
abstract class BaseFragment<T : ViewDataBinding> : Fragment() {

    /**
     * Set the layout file for your fragment.
     *
     * @author Lokik Soni
     */
    protected abstract fun setLayout(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: T = DataBindingUtil.inflate(
            inflater,
            setLayout(),
            container,
            false
        )

        // Give callback to child class
        onCreateView(binding)

        return binding.root
    }

    /**
     * Use this function and ditch traditional [Fragment.onCreateView].
     *
     * @author Lokik Soni
     */
    protected abstract fun onCreateView(binding: T)

}