package ar.com.fashiondog.application.domain.dto

import java.util.Date

data class Session(
    var customer: Customer,
    var pet: Pet,
    var date: Date,
    var service: Set<Service>,
    var customPrice: Float?
)