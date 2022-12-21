package com.example.startcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemComposable(itemModel: ItemModel) {
    val counter = remember {
        mutableStateOf(0)
    }
    val buttonColor = remember {
        mutableStateOf(Color.Yellow)
    }

    var isExpanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable {
                counter.value++
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = itemModel.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(shape = CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = itemModel.name)
                    Text(text = itemModel.prof)
                    Text(text = counter.value.toString())
                    Text(
                        modifier = Modifier
                            .clickable {
                                isExpanded = !isExpanded
                            }
                            .padding(bottom = 5.dp),
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        text = itemModel.content
                    )
                }
                Button(
                    onClick = {
                        when (++counter.value) {
                            10 -> buttonColor.value = Color.Red
                            20 -> buttonColor.value = Color.Green
                        }
                    },
                    modifier = Modifier
                        .padding(start = 10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor.value),
                ) {
                    Text(text = "Click")
                }
            }
        }
    }
}