package bruhcollective.itaysonlab.jetispot.ui.screens.nowplaying.fullscreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NowPlayingHeader(
  stateTitle: String,
  state: String,
  onCloseClick: () -> Unit,
  modifier: Modifier
) {
  Row(modifier, verticalAlignment = Alignment.CenterVertically) {
    IconButton(onClick = onCloseClick, Modifier.size(32.dp)) {
      Icon(imageVector = Icons.Default.KeyboardArrowDown, tint = Color.White, contentDescription = null)
    }

    Column(Modifier.weight(1f).padding(vertical = 8.dp)) {
      Text(
        text = stateTitle.uppercase(),
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 16.dp),
        textAlign = TextAlign.Center,
        color = Color.White.copy(alpha = 0.7f),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        letterSpacing = 2.sp,
        fontSize = 10.sp
      )

      Text(
        text = state,
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 16.dp),
        color = Color.White,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
      )
    }

    IconButton(onClick = { /*TODO*/ }, Modifier.size(32.dp)) {
      Icon(imageVector = Icons.Default.MoreVert, tint = Color.White, contentDescription = null)
    }
  }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun NowPlayingHeader_Preview() {
  NowPlayingHeader(
    stateTitle = "playing from album",
    state = "Example Title",
    onCloseClick = {},
    modifier = Modifier.fillMaxWidth()
  )
}