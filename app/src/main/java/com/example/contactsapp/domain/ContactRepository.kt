package com.example.contactsapp.domain

import com.example.contactsapp.domain.model.ContactDomainModel
import com.example.contactsapp.domain.usecase.RemoveDuplicateContactsUseCase

interface ContactRepository {
    suspend fun getAllContacts(): List<ContactDomainModel>
    suspend fun removeDuplicateContacts(): RemoveDuplicateContactsUseCase.Result
}