package com.pdstudios.navigationpractice

import android.content.Context
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.pdstudios.navigationpractice.databinding.FragmentFrag1Binding


class Frag1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFrag1Binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_frag1,
            container,
            false
        )

        //BODY
        binding.goToFrag2Button.setOnClickListener { view: View ->
            val string = binding.editTextInputString.text.toString()
            if (string.isNotEmpty()) {
                view.findNavController()
                    .navigate(Frag1Directions.actionFrag1ToFrag2(string))
                binding.editTextInputString.setText("")

            }
            view.hideKeyboard()
        }
        setHasOptionsMenu(true)

        //BODY END

        return binding.root
    }

    private fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}