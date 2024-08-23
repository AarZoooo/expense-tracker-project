package com.aarzoo.expensetracker.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aarzoo.expensetracker.R

@Preview(showBackground = true)
@Composable
fun WelcomePage(modifier: Modifier = Modifier) {
    Scaffold { paddingValues ->
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // App Name Heading
            Text(
                text = stringResource(R.string.appName),

            )

            // Image
//            Image(
//                painter = painterResource(id = R.drawable.welcome_art),
//                contentDescription = "Welcome art",
//
//                modifier = Modifier
//                    .size(200.dp)
//            )


        }
    }
}