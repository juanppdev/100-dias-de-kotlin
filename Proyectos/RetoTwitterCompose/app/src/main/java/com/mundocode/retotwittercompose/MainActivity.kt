package com.mundocode.retotwittercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mundocode.retotwittercompose.ui.theme.RetoTwitterComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetoTwitterComposeTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF161D26)),
                ) {
                    TwitterCard()
                    TuitDivider()
                    TwitterCard()
                }
            }
        }
    }
}

@Preview
@Composable
fun TwitterCard() {
    var chat by remember { mutableStateOf(false) }
    var rt by remember { mutableStateOf(false) }
    var like by remember { mutableStateOf(false) }

    Row(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF161D26))
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "",
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(55.dp)
        )
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(Modifier.fillMaxWidth()) {
                TextTitle("Juan", Modifier.padding(end = 8.dp))
                DefaultText("@Juanppdev", Modifier.padding(end = 8.dp))
                DefaultText("4h", Modifier.padding(end = 8.dp))
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_dots),
                    contentDescription = "",
                    tint = Color.White
                )
            }
            TextBody(
                "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji" +
                        "Esto es una frase jaja jiji",
                Modifier.padding(bottom = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(10)),
                contentScale = ContentScale.Crop
            )

            Row(Modifier.padding(top = 16.dp)) {
                SocialIcon(
                    modifier = Modifier.weight(1f),
                    unselectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_chat),
                            contentDescription = "",
                            tint = Color(0xFF738B98)
                        )
                    },
                    selectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_chat_filled),
                            contentDescription = "",
                            tint = Color(0xFF738B98)
                        )
                    },
                    isSlected = chat
                ) {
                    chat = !chat
                }

                SocialIcon(
                    modifier = Modifier.weight(1f),
                    unselectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_rt),
                            contentDescription = "",
                            tint = Color(0xFF738B98)
                        )
                    },
                    selectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_rt),
                            contentDescription = "",
                            tint = Color(0xFF00FF27)
                        )
                    },
                    isSlected = rt
                ) {
                    rt = !rt
                }

                SocialIcon(
                    modifier = Modifier.weight(1f),
                    unselectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_like),
                            contentDescription = "",
                            tint = Color(0xFF738B98)
                        )
                    },
                    selectedIcon = {
                        Icon(
                            painterResource(id = R.drawable.ic_like_filled),
                            contentDescription = "",
                            tint = Color(0xFFFF0000)
                        )
                    },
                    isSlected = like
                ) {
                    like = !like
                }

            }
        }
    }
}

@Composable
fun SocialIcon(
    modifier: Modifier,
    unselectedIcon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    isSlected: Boolean,
    onItemSelected: () -> Unit
) {
    val defaultValue = 1

    Row(
        modifier = modifier.clickable { onItemSelected() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (isSlected) {
            selectedIcon()
        } else {
            unselectedIcon()
        }

        Text(
            text = if (isSlected) (defaultValue + 1).toString() else defaultValue.toString(),
            color = Color(0xFF7E8B98),
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 4.dp)
        )
    }

}

@Composable
fun TextBody(text: String, modifier: Modifier = Modifier) {
    Text(text = text, color = Color.White, modifier = modifier)
}


@Composable
fun TextTitle(title: String, modifier: Modifier = Modifier) {
    Text(text = title, color = Color.White, fontWeight = FontWeight.ExtraBold, modifier = modifier)
}

@Composable
fun DefaultText(title: String, modifier: Modifier = Modifier) {
    Text(text = title, color = Color.Gray, modifier = modifier)
}

@Composable
fun TuitDivider() {
    Divider(
        Modifier
            .padding(top = 4.dp)
            .height(0.5.dp), color = Color(0xFF7E8B98)
    )
}