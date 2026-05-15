package com.example.contactsapp.data

import com.example.contactsapp.domain.model.ContactDomainModel

data class ContactDataModel (
    val id: Long,
    val displayName: String,
    val phoneNumber: String,
)

fun ContactDataModel.toDomainModel() = ContactDomainModel(
    id = this.id,
    displayName = this.displayName,
    phoneNumber = this.phoneNumber,
)