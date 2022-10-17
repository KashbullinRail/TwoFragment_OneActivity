package com.example.twofragment_oneactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etFirstName = requireActivity().findViewById<EditText>(R.id.etFirstName)
        val etLastName = requireActivity().findViewById<EditText>(R.id.etLastName)
        val etEmail = requireActivity().findViewById<EditText>(R.id.etEmail)
        val btnAccept = requireActivity().findViewById<Button>(R.id.btnAccept)

        btnAccept.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(android.R.id.content, LastFragment())
                .addToBackStack(null)
                .commit()
        }

    }

}