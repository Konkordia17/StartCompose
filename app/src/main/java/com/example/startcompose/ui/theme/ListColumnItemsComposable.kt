package com.example.startcompose.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListColumnItemsComposable(itemModel: ItemModel) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        for (i in 0..20) {
            ItemComposable(itemModel)
        }
    }
}