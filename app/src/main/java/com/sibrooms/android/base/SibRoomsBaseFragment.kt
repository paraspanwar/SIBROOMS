package com.sibrooms.android.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class SibRoomsBaseFragment(private val mFragmentlayoutID: Int) : Fragment() {

    internal var mFragmentRoot: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mFragmentRoot = inflater.inflate(mFragmentlayoutID, container, false)
        return mFragmentRoot
    }
}