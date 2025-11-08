package com.example.inputnavigasi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inputnavigasi.R

@Composable
fun HomeScreen(
//    onStartClick: () -> Unit
){
    Box(
        Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = dimensionResource(R.dimen.padding_medium)),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(Modifier.weight(1f))

            Text(
                "Selamat Datang",
                fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )

            Spacer(Modifier.weight(0.5f))

            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    "CARD-LST",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = dimensionResource(R.dimen.font_large).value.sp,
                    textAlign = TextAlign.Center
                )

                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "Logo Aplikasi",
                    modifier = Modifier
                        .size(96.dp)
                        .padding(bottom = 8.dp)
                )

                Text(
                    "MOBILE APP",
                    fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                    color = Color.DarkGray
                )
            }
            Spacer(Modifier.weight(1f))

            Text(
                "All Right Reserved Naufal Daffa",
                fontSize = dimensionResource(R.dimen.font_small).value.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = dimensionResource(R.dimen.padding_small))
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(132.dp))
        }
        Button(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(dimensionResource(R.dimen.padding_medium), bottom = 60.dp)
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text("Mulai")
        }
    }
}