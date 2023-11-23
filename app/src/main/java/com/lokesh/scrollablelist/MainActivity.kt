package com.lokesh.scrollablelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lokesh.scrollablelist.data.Datasource
import com.lokesh.scrollablelist.model.Affirmation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
AffirmationsApp()
        }
    }
}

@Composable
fun AffirmationsApp() {
    AffirmationList(
        affirmationList = Datasource().loadAffirmation(),
        )
}

@Composable
fun AffirmationCard(affirmation: Affirmation,modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
Column {
       Row {

           Image(
               painter = painterResource(id = affirmation.imageResourceId),
               contentDescription = stringResource(id = affirmation.stringResourceId),
               modifier = Modifier
                   .wrapContentSize(Alignment.TopStart)
//                   .height(50.dp)
                   .clip(CircleShape),
               contentScale = ContentScale.Fit
           )
           Image(
               painter = painterResource(id = affirmation.imageResourceId),
               contentDescription = stringResource(id = affirmation.stringResourceId),
               modifier = Modifier,
               contentScale = ContentScale.Fit
           )
       }
    Text(
        text = LocalContext.current.getString(affirmation.stringResourceId),
        modifier = Modifier
            .align(Alignment.CenterHorizontally),
        style = MaterialTheme.typography.headlineSmall
    )


       }
    }

}

@Preview
@Composable
private fun AffirmationCardPreview() {
    AffirmationsApp()
}


@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier){
        items(affirmationList){ affirmation ->
            AffirmationCard(
                affirmation  = affirmation,
                modifier = Modifier.padding(2.dp)
            )

        }
    }
}

