package com.juandevs.rmpaging.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.juandevs.rmpaging.data.RickMortyRepository
import com.juandevs.rmpaging.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickListViewModel  @Inject constructor(rickMortyRepository: RickMortyRepository): ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickMortyRepository.getAllCharacter()
}