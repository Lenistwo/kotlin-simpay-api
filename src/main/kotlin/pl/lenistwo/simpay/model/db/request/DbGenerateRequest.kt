package pl.lenistwo.simpay.model.db.request

import pl.lenistwo.simpay.model.Operator

data class DbGenerateRequest(val serviceId: String, val control: String,
                             val complete: String, val failure: String,
                             val amount: String, val amount_gross: String,
                             val amount_required: String, val provider: Operator,
                             val sign: String)
