package com.websarva.wings.jettutorialforc0de.components


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Label(vector: ImageVector, text: String, color: Color = Color.Gray){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = vector, //アイコンの指定
            contentDescription = null, //アイコンの説明(nullでも良い)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            color = color,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Label(painter: Painter, text: String, color: Color = Color.Gray){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painter, //アイコンの指定
            contentDescription = null, //アイコンの説明(nullでも良い)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            color = color,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}