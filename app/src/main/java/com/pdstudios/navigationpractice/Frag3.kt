package com.pdstudios.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.pdstudios.navigationpractice.databinding.FragmentFrag3Binding

class Frag3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFrag3Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_frag3, container, false)

        //BODY
        binding.goToFrag1Button.setOnClickListener(Navigation.createNavigateOnClickListener(Frag3Directions.actionFrag3ToFrag1()))
        //BODY END

        return binding.root
    }

}