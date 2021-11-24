package com.example.basicnavigation.ui.leftdestination

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basicnavigation.R
import com.example.basicnavigation.databinding.FragmentDestinationBinding

class DestinationFragment : Fragment() {

    class User(username: String, id: String){
        val username = username
        val id = id
    }

    fun generateData(): List<User>{
        var users = mutableListOf<User>()
        for(x in 1..70){
            users.add(User("user${x}","$x"))
        }
        return users
    }

    private lateinit var binding: FragmentDestinationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDestinationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val receivedUsername = arguments?.getString("username_arg")
        binding.tvReceivedArg.setText(receivedUsername)
        binding.rvUserEntries.layoutManager = LinearLayoutManager(view?.context)
        val adapter = DestinationAdapter(generateData())
        binding.rvUserEntries.adapter = adapter


    }


}