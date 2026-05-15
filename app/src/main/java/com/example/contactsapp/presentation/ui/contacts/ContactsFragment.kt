package com.example.contactsapp.presentation.ui.contacts

import androidx.fragment.app.Fragment
import com.example.contactsapp.databinding.FragmentContactsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactsFragment : Fragment() {

    private var _binding: FragmentContactsBinding? = null
    private val binding get() = _binding!!

}