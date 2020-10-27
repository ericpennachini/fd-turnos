package ar.com.fashiondog.application.domain.model

class Pet(
    var name: String,
    var race: String,
    var gender: String,
    var size: PetSizes,
    var behaviour: String,
    var extraDetails: String?
)