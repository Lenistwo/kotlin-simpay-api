package model.db.response

import model.db.DbService

data class DbServicesListResponse(val status: String, val services: List<DbService>)
