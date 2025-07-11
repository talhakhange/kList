package com.gov.assignment.presentation.kList

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gov.assignment.data.kList.Coin
import com.gov.assignment.presentation.kList.component.KList
import com.gov.assignment.presentation.kList.component.KListItem



@Composable
fun KListScreen(
    viewModel: KListViewModel = hiltViewModel() // Injects ViewModel using Hilt
) {
    val coins by viewModel.coinList.collectAsState()

    KList {
        padding(16.dp)
        header("Gainers")
        items(coins) {
            KListItem(it)
        }
    }
}
