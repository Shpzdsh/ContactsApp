package com.example.contactsapp.domain.usecase

import javax.inject.Inject

class RemoveDuplicateContactsUseCase @Inject constructor() {

    sealed class Result {
        object Success : Result()
        object NoDuplicatesFound : Result()
        data class Error(val message: String) : Result()
    }
}