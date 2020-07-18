package model.db.request

data class DbTransactionLimitsRequest(var key: String, var secret: String, var service_id: String){
    constructor()
}
