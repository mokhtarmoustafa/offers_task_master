package com.mokhtar.offerstask.ui.offer.manager.newoffer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mokhtar.offerstask.R
import com.mokhtar.offerstask.databinding.NewOfferFragmentBinding

class NewOfferFragment : Fragment() {
    //region variables
    private var _binding: NewOfferFragmentBinding? = null
    private val binding: NewOfferFragmentBinding get() = _binding!!
    private lateinit var viewModel: NewOfferViewModel
    //endregion

    companion object {
        fun newInstance() = NewOfferFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NewOfferFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivBack.setOnClickListener { findNavController().navigateUp() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}