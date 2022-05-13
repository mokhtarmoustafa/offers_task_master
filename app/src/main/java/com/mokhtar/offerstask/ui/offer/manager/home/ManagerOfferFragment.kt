package com.mokhtar.offerstask.ui.offer.manager.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mokhtar.offerstask.R
import com.mokhtar.offerstask.databinding.ManagerOfferFragmentBinding

class ManagerOfferFragment : Fragment() {
    //region variables
    private var _binding: ManagerOfferFragmentBinding? = null
    private val binding: ManagerOfferFragmentBinding get() = _binding!!
    private lateinit var viewModel: ManagerOfferViewModel

    //endregion
    companion object {
        fun newInstance() = ManagerOfferFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ManagerOfferFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNewOffer.setOnClickListener {
            findNavController().navigate(
                ManagerOfferFragmentDirections.actionManagerOfferFragmentToNewOfferFragment()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}