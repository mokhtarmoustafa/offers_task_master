package com.mokhtar.offerstask.ui.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R
import com.mokhtar.offerstask.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    //region variables
    private  var _binding:FragmentIntroBinding? = null
    private val binding get() = _binding!!
    //endregion


    //region events
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentIntroBinding.inflate(layoutInflater,container,false)
        return binding.root
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    //endregion

    //region helper functions

    //endregion
    companion object {
        private const val TAG = "IntroFragment"
    }
}