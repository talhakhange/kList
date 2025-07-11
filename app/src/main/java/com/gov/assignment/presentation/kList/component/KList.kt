package com.gov.assignment.presentation.kList.component


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items // ✅ THIS IS REQUIRED
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class KListConfig<T> {
    var padding: Dp = 0.dp
    var headerTitle: String? = null
    var data: List<T> = emptyList()
    var itemContent: @Composable (T) -> Unit = {}

    fun padding(padding: Dp) = apply { this.padding = padding }
    fun header(title: String) = apply { this.headerTitle = title }
    fun items(list: List<T>, itemContent: @Composable (T) -> Unit) = apply {
        this.data = list
        this.itemContent = itemContent
    }
}

@Composable
fun <T> KList(configure: KListConfig<T>.() -> Unit) {
    val config = KListConfig<T>().apply(configure)

    LazyColumn(modifier = Modifier.padding(config.padding)) {
        config.headerTitle?.let { title ->
            item {
                Text(text = title, modifier = Modifier.padding(8.dp))
            }
        }
        items(config.data) { item ->
            config.itemContent(item)
        }
    }
}

