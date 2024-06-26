package com.websarva.wings.jettutorialforc0de.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EmailSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        // メールアドレスの表示・非表示を管理する変数。この変数が変更されるとUIが再描写される。
        var isShowAddress by remember { mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Label(icon = Icons.Default.Email, text = "学生メール")

            Spacer(modifier = Modifier.width(10.dp))

            OutlinedButton(
                onClick = { isShowAddress = !isShowAddress }, //ボタンが押されたときの処理(今回はisShowAddressの値を反転させる)
            ) {
                if(isShowAddress) { //isShowAddressの値によってボタンの表示を変える
                    Text(text = "非表示")
                } else {
                    Text(text = "表示")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //isShowAddressがtrueならメールアドレスを表示する
        if(isShowAddress) {
            Text(
                text = "example@hoge.com",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(5.dp))

            HorizontalDivider(
                modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                thickness = 2.dp
            )
        }
    }

}