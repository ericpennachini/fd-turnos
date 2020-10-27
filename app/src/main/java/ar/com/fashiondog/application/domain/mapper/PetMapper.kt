package ar.com.fashiondog.application.domain.mapper

import ar.com.fashiondog.application.domain.model.Pet
import ar.com.fashiondog.application.domain.model.PetSizes
import ar.com.fashiondog.application.domain.dto.Pet as PetDTO

class PetMapper {
    companion object {
        fun mapList(petListDTO: Set<PetDTO>): Set<Pet> {
            return petListDTO.map { map(it) }.toSet()
        }

        fun map(petDTO: PetDTO): Pet {
            return Pet(
                name = petDTO.name,
                race = petDTO.race,
                gender = petDTO.gender,
                size = PetSizes.valueOf(petDTO.size),
                behaviour = petDTO.behaviour,
                extraDetails = petDTO.extraDetails
            )
        }
    }
}