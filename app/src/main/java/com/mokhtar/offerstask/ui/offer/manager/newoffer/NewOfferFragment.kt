package com.mokhtar.offerstask.ui.offer.manager.newoffer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.mokhtar.offerstask.R
import com.mokhtar.offerstask.data.Offer
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


    //region events
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

        binding.btnCreate.setOnClickListener {
            if(validateALl())
                createNewOffer()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    //endregion


    //region helper functions
    private fun validateALl(): Boolean {
        if (binding.etOfferTitleData.text.toString().isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Title can't be nul or empty.", Toast.LENGTH_SHORT)
                .show()
            binding.etOfferTitleData.requestFocus()
            return false
        }
        else if (binding.etOfferOrganizationData.text.toString().isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Organizations Data can't be nul or empty.", Toast.LENGTH_SHORT)
                .show()
            binding.etOfferOrganizationData.requestFocus()
            return false
        }
        else if (binding.etOfferRuleData.text.toString().isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Offer Rule data can't be nul or empty.", Toast.LENGTH_SHORT)
                .show()
            binding.etOfferRuleData.requestFocus()
            return false
        }
        else if (binding.etOfferBonusData.text.toString().isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Offer Bonus can't be nul or empty.", Toast.LENGTH_SHORT)
                .show()
            binding.etOfferBonusData.requestFocus()
            return false
        }
         else if (binding.etOfferBenefitData.text.toString().isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Offer Benefits can't be nul or empty.", Toast.LENGTH_SHORT)
                .show()
            binding.etOfferBenefitData.requestFocus()
            return false
        }

        return true
    }


    private fun createNewOffer()
    {

    }
    //endregion

}