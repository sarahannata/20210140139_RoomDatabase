package com.example.pampraktikum7.ui.halaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.pampraktikum7.R
import com.example.pampraktikum7.model.DetailSiswa

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
  
 }
}