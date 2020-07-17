package utils

import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets
import java.text.DecimalFormat

fun String.toSha256(): String {
    return Hashing.sha256().hashString(this, StandardCharsets.UTF_8).toString()
}

fun Double.formatTwoDigitAfterComma(): String {
    return DecimalFormat("0.##").format(this)
}
