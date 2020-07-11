package model.sms.request

data class CodeVerifyRequest(val key: String, val secret: String,
                             val service_id: String, val number: String, val code: String)
