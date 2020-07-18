package utils

import com.google.common.hash.Hashing
import model.db.request.DbServiceCommissionRequest
import java.nio.charset.StandardCharsets
import java.text.DecimalFormat
import java.text.Normalizer

internal fun String.toSha256(): String {
    return Hashing.sha256().hashString(this, StandardCharsets.UTF_8).toString()
}

internal fun String.normalizeToNFKD(): String {
    return Normalizer.normalize(this, Normalizer.Form.NFKD)
}

internal fun Double.formatTwoDigitAfterComma(): String {
    return DecimalFormat("0.##").format(this)
}


fun main() {
    DbServiceCommissionRequest()
}
