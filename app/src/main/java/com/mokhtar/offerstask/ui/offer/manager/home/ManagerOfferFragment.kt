package com.mokhtar.offerstask.ui.offer.manager.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R

class ManagerOfferFragment : Fragment() {

    companion object {
        fun newInstance() = ManagerOfferFragment()
    }

    private lateinit var viewModel: ManagerOfferViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.manager_offer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ManagerOfferViewModel::class.java)
        // TODO: Use the ViewModel
    }

}