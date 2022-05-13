package com.mokhtar.offerstask.ui.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mokhtar.offerstask.R
import com.mokhtar.offerstask.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    //region variables
    private var _binding: FragmentIntroBinding? = null
    private val binding get() = _binding!!
    //endregion


    //region events
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIntroBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    //endregion

    //region helper functions
    private fun init() {
        binding.ivEmployee.setOnClickListener { navigateToEmployeeMode() }
        binding.ivManager.setOnClickListener { navigateToManagerMode() }
    }

    private fun navigateToEmployeeMode() {
        findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToEmployeeOfferFragment())
    }

    private fun navigateToManagerMode() {
        findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToManagerOfferFragment())
    }

    //endregion
    companion object {
        private const val TAG = "IntroFragment"
    }
}