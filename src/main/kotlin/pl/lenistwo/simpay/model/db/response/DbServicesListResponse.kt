package pl.lenistwo.simpay.model.db.response

import pl.lenistwo.simpay.model.db.DbService

data class DbServicesListResponse(val status: String, val services: List<DbService>)
