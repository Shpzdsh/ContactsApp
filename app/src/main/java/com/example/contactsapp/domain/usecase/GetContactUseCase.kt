package com.example.contactsapp.domain.usecase

import com.example.contactsapp.domain.ContactRepository
import com.example.contactsapp.domain.model.ContactDomainModel
import javax.inject.Inject

class GetContactUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {

    suspend operator fun invoke(): List<ContactDomainModel> {
        return contactRepository.getAllContacts()
    }
}