package model.db.request

data class DbTransactionLimitsRequest(val key: String, val secret: String, val service_id: String)
