package pl.lenistwo.simpay.model.db

data class DbTransaction(val id: Int, val valuenet: Double,
                         val valuenet_gross: Double, val valuenet_partner: Double,
                         val control: String, val number_from: String,
                         val sign: String, val status: String)
