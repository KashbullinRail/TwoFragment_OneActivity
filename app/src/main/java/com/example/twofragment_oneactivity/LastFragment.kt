package com.example.twofragment_oneactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner


class LastFragment : Fragment(R.layout.fragment_last) {

    private val dataModel: DataModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvFirstNameGet = requireActivity().findViewById<TextView>(R.id.tvFirstNameGet)
        val tvLastNameGet = requireActivity().findViewById<TextView>(R.id.tvLastNameGet)
        val tvEmailGet = requireActivity().findViewById<TextView>(R.id.tvEmailGet)
        val btnClearSwitch = requireActivity().findViewById<Button>(R.id.btnClear_Switch)

        dataModel.firstname.observe(activity as LifecycleOwner) {
            tvFirstNameGet.text = it
        }
        dataModel.lastName.observe(activity as LifecycleOwner) {
            tvLastNameGet.text = it
        }
        dataModel.email.observe(activity as LifecycleOwner) {
            tvEmailGet.text = it
        }

        btnClearSwitch.setOnClickListener {
            dataModel.firstname.value = ""
            dataModel.lastName.value = ""
            dataModel.email.value = ""

            parentFragmentManager
                .beginTransaction()
                .replace(android.R.id.content, FirstFragment())
                .addToBackStack(null)
                .commit()
        }

    }

}