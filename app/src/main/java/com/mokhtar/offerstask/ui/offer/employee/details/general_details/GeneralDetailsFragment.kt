package com.mokhtar.offerstask.ui.offer.employee.details.general_details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R

class GeneralDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = GeneralDetailsFragment()
    }

    private lateinit var viewModel: GeneralDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.general_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GeneralDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}