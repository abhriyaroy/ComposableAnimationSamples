package studio.zebro.composeanimationsample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalAnimationApi
@Composable
fun showVisibilityAnimationExample(){
    Row() {
        var editable by remember { mutableStateOf(true) }
        AnimatedVisibility(visible = editable) {
            Text(text = "Edit")
        }
        Spacer(modifier = Modifier.size(12.dp))
        Button(onClick = { editable = editable.not() }) {
            Text("Toggle")
        }
    }
}