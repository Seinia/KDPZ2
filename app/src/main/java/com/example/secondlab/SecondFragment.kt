package com.example.secondlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.secondlab.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        /*binding.btncat2.setOnClickListener()
        {
            findNavController().popBackStack()
        }*/

    }


}