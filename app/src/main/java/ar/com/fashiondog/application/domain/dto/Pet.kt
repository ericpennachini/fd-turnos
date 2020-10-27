package ar.com.fashiondog.application.domain.dto

data class Pet(
    var name: String,
    var race: String,
    var gender: String,
    var size: String,
    var behaviour: String,
    var extraDetails: String?
)