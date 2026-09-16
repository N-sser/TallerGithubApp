package me.maximilianovera.tallergithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun GreetingCard() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        Column(
            modifier = Modifier
                .padding(all = 15.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.me),
                contentDescription = "Task done",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(BorderStroke(3.dp, Color(0xFF357FE1)), CircleShape)
                    .padding(2.dp)
            )
            Text(
                text = "name",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "occupation",
                color = Color(0xFF357FE1)
            )
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalDivider(thickness = 2.dp)
        }
        Column(
            modifier = Modifier
                .padding(all = 15.dp)
        ) {
            Text(
                text = "EDAD",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "n"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "CORREO",
                color = Color.Gray

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "[email protected]",
                color = Color.Blue,
                textDecoration = TextDecoration.Underline

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "CIUDAD",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "City, Country"
            )
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalDivider(thickness = 2.dp)
        }
        Column(
            modifier = Modifier
                .padding(all = 15.dp)
                .height(350.dp)
        ) {}
        Column(
            modifier = Modifier
                .padding(all = 15.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
        ) {
            Text(
                text = "Contactar conmigo",
                color = Color.White,
                modifier = Modifier
                    .background(color = Color(0xFF1565C0), shape = RoundedCornerShape(15.dp))
                    .padding(8.dp),
            )
        }
    }
}
