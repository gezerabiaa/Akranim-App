package com.kaan.firebasechat.AKRANIM

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kaan.firebasechat.R
import kotlinx.android.synthetic.main.fragment_ana_menu1.*
import kotlinx.android.synthetic.main.fragment_ana_menu1.geriButton
import kotlinx.android.synthetic.main.fragment_ana_menu1.locationButton
import kotlinx.android.synthetic.main.fragment_ana_menu1.kulupButton
import kotlinx.android.synthetic.main.fragment_ana_menu3.*
import kotlinx.android.synthetic.main.fragment_kulupler_sonuc_ekrani.*
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        geriButton.setOnClickListener {
            val action=ProfileFragmentDirections.actionProfileFragmentToAnaMenu1()
            Navigation.findNavController(it).navigate(action)
        }

        locationButton.setOnClickListener {
            val action=ProfileFragmentDirections.actionProfileFragmentToYeditepeHarita()
            Navigation.findNavController(it).navigate(action)
        }

        kulupButton.setOnClickListener {
            val action=ProfileFragmentDirections.actionProfileFragmentToKulupTestinOlduguEkran()
            Navigation.findNavController(it).navigate(action)
        }

        chatButton8.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToUsersActivity()
            Navigation.findNavController(it).navigate(action)
        }
    }

}