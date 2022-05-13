package com.mokhtar.offerstask.ui.offer.manager.newoffer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R

class NewOfferFragment : Fragment() {

    companion object {
        fun newInstance() = NewOfferFragment()
    }

    private lateinit var viewModel: NewOfferViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.new_offer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NewOfferViewModel::class.java)
        // TODO: Use the ViewModel
    }

}