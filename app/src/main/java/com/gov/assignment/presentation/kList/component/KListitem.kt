package com.gov.assignment.presentation.kList.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gov.assignment.data.kList.Coin

@Composable
fun KListItem(coin: Coin) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clickable {

            }
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = coin.name?:"")
        Text(text = coin.price?:"")
    }
}