package com.juandevs.rmpaging.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.juandevs.rmpaging.presentation.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickMortyRepository @Inject constructor(val api: RickMortyApiService) {

    companion object{
        const val MAX_ITEMS  = 10
        const val PREFETCH_ITEMS  = 3
    }

    fun getAllCharacter(): Flow<PagingData<CharacterModel>> {
        return Pager(config = PagingConfig(pageSize = MAX_ITEMS, prefetchDistance = PREFETCH_ITEMS),
            pagingSourceFactory = {
                CharacterPagingSource(api)
            }).flow
    }
}