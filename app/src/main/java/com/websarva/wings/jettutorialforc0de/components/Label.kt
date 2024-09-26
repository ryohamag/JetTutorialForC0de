package com.websarva.wings.jettutorialforc0de.components


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
fun Label(
    icon: ImageVector? = null,
    painter: Painter? = null,
    text: String, //表示するテキストを指定
    color: Color = Color.Gray //テキストの色を指定(初期値は灰色)
){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        //実はIcon関数には引数の取り方が複数あり......(今回は割愛)
        if (icon != null) {
            Icon(
                imageVector = icon, //アイコンの指定
                contentDescription = null, //アイコンの説明(nullでも良い)
            )
        } else if (painter != null) {
            Icon(
                painter = painter,
                contentDescription = null,
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text, //関数に代入したテキストが表示される
            color = color, //代入した色が適用される(特に指定が無ければ灰色になる)
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}