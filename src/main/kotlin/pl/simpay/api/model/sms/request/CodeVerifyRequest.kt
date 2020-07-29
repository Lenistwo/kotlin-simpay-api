package model.sms.request

data class CodeVerifyRequest(var key: String, var secret: String,
                             var service_id: String, var number: String, var code: String){
}
