package com.pluu.sample.compose.bottomsheetfragment

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pluu.sample.compose.bottomsheetfragment.ui.theme.SampleTheme

@Composable
fun Greeting(list: List<Int>) {
    LazyColumn(
        modifier = Modifier.nestedScroll(rememberNestedScrollInteropConnection()),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(items = list) {
            Text(
                text = it.toString(),
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleTheme {
        Greeting((0..10).toList())
    }
}
