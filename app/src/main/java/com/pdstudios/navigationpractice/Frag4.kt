package com.pdstudios.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.pdstudios.navigationpractice.databinding.FragmentFrag4Binding

class Frag4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFrag4Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_frag4, container, false)

        //BODY
        binding.goToFrag1Button2.setOnClickListener(Navigation.createNavigateOnClickListener(Frag4Directions.actionFrag4ToFrag1()))
        val args: Frag4Args by navArgs()
        Toast.makeText(context, args.passArgs, Toast.LENGTH_SHORT).show()
        //BODY END

        return binding.root
    }

}