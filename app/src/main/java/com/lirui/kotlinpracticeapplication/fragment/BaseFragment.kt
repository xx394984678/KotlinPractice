package com.lirui.kotlinpracticeapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

open abstract class BaseFragment : Fragment(),View.OnClickListener {
    protected val TAG = javaClass.simpleName
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResourceId(), container, false)
    }

    abstract override fun onViewCreated(view: View, savedInstanceState: Bundle?)

    @LayoutRes
    abstract fun getLayoutResourceId(): Int

    override fun onClick(v: View) {

    }

    fun finishParentActivity() {
        activity?.finish()
    }
}