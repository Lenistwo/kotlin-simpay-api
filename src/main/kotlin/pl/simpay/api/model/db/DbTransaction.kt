package model.db

data class DbTransaction(
    var id: Int, var varuenet: Double,
    var varuenet_gross: Double, var varuenet_partner: Double,
    var control: String, var number_from: String,
    var sign: String, var status: String
){
    constructor()
}
