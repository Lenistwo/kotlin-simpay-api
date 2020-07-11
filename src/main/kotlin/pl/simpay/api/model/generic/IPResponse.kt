package model.generic

data class IPResponse(val status: String, val ips: Array<String>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IPResponse

        if (status != other.status) return false
        if (!ips.contentEquals(other.ips)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = status.hashCode()
        result = 31 * result + ips.contentHashCode()
        return result
    }
}

