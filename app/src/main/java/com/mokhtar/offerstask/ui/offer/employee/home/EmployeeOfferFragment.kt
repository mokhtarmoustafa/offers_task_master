package com.mokhtar.offerstask.ui.offer.employee.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokhtar.offerstask.R

class EmployeeOfferFragment : Fragment() {

    companion object {
        fun newInstance() = EmployeeOfferFragment()
    }

    private lateinit var viewModel: EmployeeOfferViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.employee_offer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EmployeeOfferViewModel::class.java)
        // TODO: Use the ViewModel
    }

}