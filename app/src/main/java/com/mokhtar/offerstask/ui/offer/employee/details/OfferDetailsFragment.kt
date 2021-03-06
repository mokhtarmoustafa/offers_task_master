package com.mokhtar.offerstask.ui.offer.employee.details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R

class OfferDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = OfferDetailsFragment()
    }

    private lateinit var viewModel: OfferDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.offer_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OfferDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}