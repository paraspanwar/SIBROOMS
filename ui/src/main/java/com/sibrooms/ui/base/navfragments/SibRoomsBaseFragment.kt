package com.sibrooms.ui.base.navfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class SibRoomsBaseFragment(private val mFragmentLayoutID: Int) : Fragment() {

    private var mFragmentRoot: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mFragmentRoot = inflater.inflate(mFragmentLayoutID, container, false)
        return mFragmentRoot
    }
}