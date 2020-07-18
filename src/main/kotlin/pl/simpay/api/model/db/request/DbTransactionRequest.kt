package model.db.request

data class DbTransactionRequest(var id: Int, var key: String, var secret: String){
    constructor()
}

