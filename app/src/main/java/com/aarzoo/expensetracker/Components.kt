package com.aarzoo.expensetracker

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aarzoo.expensetracker.ui.theme.l_red
import com.google.firebase.Timestamp
import java.util.Date
import kotlin.math.roundToInt

// ----- Buttons -----
@Preview
@Composable
fun PrimaryButton(
    text: String = "Button",
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .height(48.dp)
            .width(276.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}

@Preview
@Composable
fun SecondaryButton(
    text: String = "Button",
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.tertiary
        ),
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .height(48.dp)
            .width(276.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}


// ----- Hello Bar -----
@Preview
@Composable
fun HelloBar(
) {
    Row (
        Modifier
            .padding(vertical = 18.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Hello, User",
            fontWeight = FontWeight.SemiBold,
            fontSize = 28.sp
        )

        Spacer(Modifier.weight(1f))

        Icon(
            imageVector = Icons.Filled.AccountCircle,
            contentDescription = "User Settings",

            modifier = Modifier.size(33.dp)
        )
    }
}


// ----- Category Cards -----
@Preview
@Composable
fun CategoryInfo(
    categoryName: String = "Food",
    spentPercent: Int = 65,
    totalSpent: Double = 1280.00
) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(66.dp)
            .width(352.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            Column {
                Text(
                    text = categoryName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.tertiary
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "${spentPercent}% of total spent",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.secondary
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "₹ $totalSpent",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview
@Composable
fun CategoryAdd(
    categoryName: String = "Food",
    spentPercent: Int = 65,
    totalSpent: Double = 1280.00,
    curSpent: Double = 200.00
) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(66.dp)
            .width(352.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            Column {
                Text(
                    text = categoryName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.tertiary
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "${spentPercent}% of total spent",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.secondary
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Column (
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "₹ $totalSpent",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(modifier = Modifier.weight(1f))
                
                Text(
                    text = "Becomes ₹ ${totalSpent + curSpent} | ${((totalSpent + curSpent) / ((100.toDouble() / spentPercent) * totalSpent + curSpent) * 100).roundToInt()}%",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.primary
                )

            }
        }
    }
}

@Preview
@Composable
fun CategoryName(
    categoryName: String = "Food"
) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(66.dp)
            .width(352.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            Text(
                text = categoryName,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Outlined.Create,
                contentDescription = "Edit",
                tint = MaterialTheme.colorScheme.primary,

                modifier = Modifier
                    .size(20.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                imageVector = Icons.Outlined.Delete,
                contentDescription = "Delete",
                tint = l_red,

                modifier = Modifier
                    .size(18.dp)
            )
        }
    }
}


// ----- UPI Box -----
@Preview
@Composable
fun UpiBox(
    upi: String? = "aarju.pal1234@oksbi",
    editable: Boolean = true
) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor =
                if (upi == null)
                    MaterialTheme.colorScheme.secondary
                else
                    MaterialTheme.colorScheme.tertiary
        ),
        modifier = Modifier
            .height(48.dp)
            .width(276.dp)
    ) {
        Text(
            text = upi ?: "Enter UPI ID",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,

            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 15.dp)
                .fillMaxSize()
        )
    }
}


// ----- Text Field -----
@Preview
@Composable
fun InputField(
    text: TextFieldValue = TextFieldValue("Enter your Name"),
    onValueChange: (TextFieldValue) -> Unit = {}
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        colors = TextFieldDefaults.colors(
            disabledContainerColor = MaterialTheme.colorScheme.secondary,
            disabledTextColor = MaterialTheme.colorScheme.secondary,
            focusedContainerColor = MaterialTheme.colorScheme.tertiary,
            focusedTextColor = MaterialTheme.colorScheme.tertiary
        )
    )
}


/** Transaction Card */
@Preview
@Composable
fun TransactionCard(
    upi: String = "aarju.pal1234@oksbi",
    datetime: Timestamp = Timestamp(Date()),
    amount: Double = 100.00
) {
    Box (
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 12.dp)
        ) {
            Text(
                text = upi,
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.tertiary
            )

            Spacer(Modifier.width(70.dp))

            Text(
                text =
                "${toMonth(datetime.toDate().month)} ${datetime.toDate().date}" +
                        "   " +
                        "${datetime.toDate().hours}:${datetime.toDate().minutes}",
                fontSize = 10.sp,
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colorScheme.secondary
            )

            Spacer(Modifier.weight(1f))

            Text(
                text = "₹ $amount",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}


/** Returns the first three alphabets of the month corresponding
 * to the month number provided
 */
fun toMonth(month: Int): String {
    return when (month) {
        1 -> "Jan"
        2 -> "Feb"
        3 -> "Mar"
        4 -> "Apr"
        5 -> "May"
        6 -> "Jun"
        7 -> "Jul"
        8 -> "Aug"
        9 -> "Sep"
        10 -> "Oct"
        11 -> "Nov"
        12 -> "Dec"
        else -> "Invalid month"
    }
}
