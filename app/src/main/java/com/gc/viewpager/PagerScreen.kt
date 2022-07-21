package com.gc.viewpager

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


//
// Created by Code For Android on 21/07/22.
// Copyright (c) 2022 CFA. All rights reserved.
//

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PagerScreen() {

    val scope = rememberCoroutineScope()


    val imageList = Constants.imageList
    val pagerState = rememberPagerState()


    Column(modifier = Modifier.fillMaxSize()) {

        HorizontalPager(count = imageList.size, state = pagerState) { page ->

            PagerItemScreen(imageUrl = imageList[page],page)

        }

   LaunchedEffect(key1 = pagerState,{
               pagerState.animateScrollToPage(5)
   })


    }


}