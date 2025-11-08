package com.example.inputnavigasi.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inputnavigasi.R

@Composable
fun ListParticipantScreen(
    onBerandaClick: () -> Unit,
    onFormulirClick: () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedButton(
                        onClick = onBerandaClick, modifier = Modifier.weight(1f)
                    ) { Text("Beranda") }

                    OutlinedButton(
                        onClick = onFormulirClick, modifier = Modifier.weight(1f)
                    ) { Text("Formulir") }
                }
            }
        }) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = dimensionResource(R.dimen.padding_medium),
                        dimensionResource(R.dimen.padding_large)
                    )
            ) {
                Text(
                    "List Peserta",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = dimensionResource(R.dimen.font_large).value.sp,
                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium))
                )

                Column(
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(Modifier.padding(horizontal = 14.dp, vertical = 12.dp)) {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        "NAMA LENGKAP",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Antoni", fontSize = 17.sp
                                    )
                                    Spacer(Modifier.height(8.dp))
                                    Text(
                                        "STATUS PERKAWINAN",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Duda", fontSize = 17.sp
                                    )
                                }
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        "JENIS KELAMIN",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Laki-laki", fontSize = 17.sp
                                    )
                                    Spacer(Modifier.height(8.dp))
                                    Text(
                                        "ALAMAT",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Semarang", fontSize = 17.sp
                                    )
                                }
                            }
                        }
                    }
                    Spacer(Modifier.height(15.dp))
                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(Modifier.padding(horizontal = 14.dp, vertical = 12.dp)) {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        "NAMA LENGKAP",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Nana", fontSize = 17.sp
                                    )
                                    Spacer(Modifier.height(8.dp))
                                    Text(
                                        "STATUS PERKAWINAN",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Janda", fontSize = 17.sp
                                    )
                                }
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        "JENIS KELAMIN",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Perempuan", fontSize = 17.sp
                                    )
                                    Spacer(Modifier.height(8.dp))
                                    Text(
                                        "ALAMAT",
                                        fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                    Text(
                                        "Bantul", fontSize = 17.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

