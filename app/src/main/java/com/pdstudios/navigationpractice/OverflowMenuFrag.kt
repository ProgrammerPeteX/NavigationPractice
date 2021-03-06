package com.pdstudios.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.pdstudios.navigationpractice.databinding.FragmentOverflowMenuBinding


class OverflowMenuFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentOverflowMenuBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_overflow_menu, container, false)
        return binding.root
    }

}