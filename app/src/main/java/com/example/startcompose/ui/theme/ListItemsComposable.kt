package com.example.startcompose.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListLazyColumnItemsComposable(itemModel: ItemModel) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(count = 30) {
            ItemComposable(itemModel)
        }
    }
}