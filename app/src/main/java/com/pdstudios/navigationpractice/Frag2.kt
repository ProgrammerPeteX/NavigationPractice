package com.pdstudios.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.pdstudios.navigationpractice.databinding.FragmentFrag2Binding

class Frag2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFrag2Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_frag2, container, false)

        //BODY
        val args: Frag2Args by navArgs()
        binding.goToFrag3Button.setOnClickListener(Navigation.createNavigateOnClickListener(Frag2Directions.actionFrag2ToFrag3()))
        binding.goToFrag4Button.setOnClickListener(Navigation.createNavigateOnClickListener(Frag2Directions.actionFrag2ToFrag4(args.passArgs)))
        //BODY END
        return binding.root
    }

}