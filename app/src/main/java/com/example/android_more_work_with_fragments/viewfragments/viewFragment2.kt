package com.example.android_more_work_with_fragments.viewfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.android_more_work_with_fragments.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class viewFragment2 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_view2, container, false)

        var displayMessage = arguments?.getString("txtAtoB") //get the string from bundle string "txtAtoB"

        val textRecv = view.findViewById<TextView>(R.id.textOutput)

        textRecv.text = displayMessage

        return view
    }


}