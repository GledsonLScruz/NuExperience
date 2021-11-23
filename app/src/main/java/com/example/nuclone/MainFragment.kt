package com.example.nuclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val text = view.findViewById<TextView>(R.id.saldocontacorrente)
        text.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_ballanceFragment)}
        val pix = view.findViewById<TextView>(R.id.textpix)
        pix.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_pixFragment)}
        val pagar = view.findViewById<TextView>(R.id.textpagar)
        pagar.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_payFragment)}
        return view
    }
}