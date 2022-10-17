package com.example.twofragment_oneactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class LastFragment : Fragment(R.layout.fragment_last) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvFirstNameGet = requireActivity().findViewById<TextView>(R.id.tvFirstNameGet)
        val tvLastNameGet = requireActivity().findViewById<TextView>(R.id.tvLastNameGet)
        val tvEmailGet = requireActivity().findViewById<TextView>(R.id.tvEmailGet)
        val btnClearSwitch = requireActivity().findViewById<Button>(R.id.btnClear_Switch)

        btnClearSwitch.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(android.R.id.content, FirstFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}