package com.gov.assignment.presentation.kList

import androidx.lifecycle.ViewModel
import com.gov.assignment.data.kList.Coin
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class KListViewModel: ViewModel() {

    private val _coinList = MutableStateFlow<List<Coin>>(emptyList())
    val coinList: StateFlow<List<Coin>> = _coinList

    init {
        loadCoins()
    }

    private fun loadCoins() {

        _coinList.value = listOf(
            Coin("Bitcoin", "Rs 1000"),
            Coin("Ethereum", "Rs 2100"),
            Coin("Cardano", "Rs 3000")
        )
    }

}