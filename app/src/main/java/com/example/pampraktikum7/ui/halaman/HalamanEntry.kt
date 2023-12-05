package com.example.pampraktikum7.ui.halaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.example.pampraktikum7.R
import com.example.pampraktikum7.model.DetailSiswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
 detailSiswa: DetailSiswa,
 modifier: Modifier = Modifier,
 onValueChange: (DetailSiswa) -> Unit = {},
 enabled: Boolean = true
){
 Column(
  modifier = modifier,
  verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
 ) {
  OutlinedTextField(
   value = detailSiswa.nama,
   onValueChange = {onValueChange(detailSiswa.copy(nama = it))},
   label = { Text(stringResource(id = R.string.nama))},
   modifier = Modifier.fillMaxWidth(),
   enabled = enabled,
   singleLine = true
  )
  OutlinedTextField(
   value = detailSiswa.alamat,
   onValueChange = {onValueChange(detailSiswa.copy(alamat = it))},
   label = { Text(stringResource(id = R.string.alamat))},
   modifier = Modifier.fillMaxWidth(),
   enabled = enabled,
   singleLine = true
  )
  OutlinedTextField(
   value = detailSiswa.telpon,
   onValueChange = {onValueChange(detailSiswa.copy(telpon = it))},
   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
   label = { Text(stringResource(id = R.string.telpon))},
   modifier = Modifier.fillMaxWidth(),
   enabled = enabled,
   singleLine = true
  )
 }
}