package com.example.inputnavigasi.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inputnavigasi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(
    onBerandaClick: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var statusPk by remember { mutableStateOf("") }

    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textNama by remember { mutableStateOf("") }

    var showPopup by remember { mutableStateOf(false) }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val status: List<String> = listOf("Janda", "Lajang", "Duda")

    Scaffold(
        bottomBar = {
            BottomAppBar{
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedButton(
                        onClick = onBerandaClick,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Beranda")
                    }

                    Button(
                        onClick = {
                            nama = textNama
                            jenis = textJK
                            statusPk = textStatus
                            alamat = textAlamat
                            showPopup = true
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Submit")
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .background(colorResource(R.color.purple_500))
            ) {
                Text(
                    "Formulir Pendaftaran",
                    modifier =
                        Modifier
                            .align(Alignment.BottomStart)
                            .padding(
                                start = dimensionResource(R.dimen.padding_medium),
                                bottom = dimensionResource(R.dimen.padding_small)
                            ),
                    color = Color.White,
                    fontSize = dimensionResource(R.dimen.font_medium).value.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(top = dimensionResource(R.dimen.padding_small))
            ) {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(dimensionResource(R.dimen.padding_medium))) {
                        Text(text = "NAMA LENGKAP")
                        OutlinedTextField(
                            value = textNama,
                            onValueChange = { textNama = it },
                            modifier =
                                Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        top =
                                            dimensionResource(
                                                R.dimen.padding_small
                                            ),
                                        bottom =
                                            dimensionResource(
                                                R.dimen.padding_medium
                                            )
                                    ),
                            placeholder = { Text("tulis nama lengkap") },
                            singleLine = true
                        )

                        Text(text = "JENIS KELAMIN")
                        Row {
                            gender.forEach { item ->
                                Row(
                                    modifier =
                                        Modifier.selectable(
                                            selected = textJK == item,
                                            onClick = { textJK = item }
                                        ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = textJK == item,
                                        onClick = { textJK = item }
                                    )
                                    Text(item)
                                }
                            }
                        }

                        Text(text = "STATUS PERKAWINAN")
                        Row {
                            status.forEach { item ->
                                Row(
                                    modifier =
                                        Modifier.selectable(
                                            selected = textStatus == item,
                                            onClick = { textStatus = item }
                                        ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = textStatus == item,
                                        onClick = { textStatus = item }
                                    )
                                    Text(item)
                                }
                            }
                        }

                        Text(text = "ALAMAT")
                        OutlinedTextField(
                            value = textAlamat,
                            onValueChange = { textAlamat = it },
                            modifier =
                                Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        top =
                                            dimensionResource(
                                                R.dimen.padding_small
                                            ),
                                        bottom =
                                            dimensionResource(
                                                R.dimen.padding_small
                                            )
                                    ),
                            placeholder = { Text("Alamat") },
                            singleLine = true
                        )
                    }
                }
            }
        }
    }

    if (showPopup) {
        AlertDialog(
            onDismissRequest = { showPopup = false },
            title = { Text("Data Berhasil Disimpan") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(Modifier.fillMaxWidth()) {
                        Text("Nama : ", fontWeight = FontWeight.SemiBold)
                        Text(nama)
                    }
                    Row(Modifier.fillMaxWidth()) {
                        Text("Jenis Kelamin : ", fontWeight = FontWeight.SemiBold)
                        Text(jenis)
                    }
                    Row(Modifier.fillMaxWidth()) {
                        Text("Status : ", fontWeight = FontWeight.SemiBold)
                        Text(statusPk)
                    }
                    Row(Modifier.fillMaxWidth()) {
                        Text("Alamat : ", fontWeight = FontWeight.SemiBold)
                        Text(alamat)
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showPopup = false }) { Text("OK") }
            }
        )
    }
}
