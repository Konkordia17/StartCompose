package com.example.startcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.startcompose.ui.theme.ItemModel
import com.example.startcompose.ui.theme.ListLazyColumnItemsComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListLazyColumnItemsComposable(
                itemModel =
                ItemModel(
                    image = R.drawable.avatar,
                    name = "Ksenia",
                    prof = "AndroidDeveloper",
                    content = "Александр Пушкин\n" +
                        "Ты и Вы\n" +
                        "Пустое вы сердечным ты\n" +
                        "Она, обмолвясь, заменила\n" +
                        "И все счастливые мечты\n" +
                        "В душе влюбленной возбудила.\n" +
                        "Пред ней задумчиво стою,\n" +
                        "Свести очей с нее нет силы;\n" +
                        "И говорю ей: как вы милы!\n" +
                        "И мыслю: как тебя люблю!"
                )
            )
        }
    }
}

