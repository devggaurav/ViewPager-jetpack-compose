package com.gc.viewpager

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent


//
// Created by Code For Android on 21/07/22.
// Copyright (c) 2022 CFA. All rights reserved.
//

@Composable
fun PagerItemScreen(imageUrl: String, count: Int) {

    Box(modifier = Modifier.fillMaxSize()) {
        SubcomposeAsyncImage(
            model = imageUrl,
            contentDescription = "image",
            modifier = Modifier.fillMaxSize()
        ) {

            val state = painter.state

            if (state is AsyncImagePainter.State.Loading || state is AsyncImagePainter.State.Error) {
                CircularProgressIndicator()
            } else {
                SubcomposeAsyncImageContent()
            }


        }

        Text(
            text = "Page $count",
            fontSize = MaterialTheme.typography.h2.fontSize,
            color = Color.Red,
            modifier = Modifier.align(alignment = Alignment.BottomStart)
        )


    }


}