package model.db.request

import model.generic.Operator

data class DbGenerateRequest(
    var serviceId: String, var control: String,
    var complete: String, var failure: String,
    var amount: String, var amount_gross: String,
    var amount_required: String, var provider: Operator,
    var sign: String
) {
    constructor()
}
