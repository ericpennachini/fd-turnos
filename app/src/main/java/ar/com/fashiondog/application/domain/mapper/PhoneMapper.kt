package ar.com.fashiondog.application.domain.mapper

import ar.com.fashiondog.application.domain.model.Phone
import ar.com.fashiondog.application.domain.model.PhoneTypes
import ar.com.fashiondog.application.domain.dto.Phone as PhoneDTO

class PhoneMapper {
    companion object {
        fun mapList(phoneListDTO: Set<PhoneDTO>): Set<Phone> {
            val phoneList = mutableSetOf<Phone>()
            phoneListDTO.forEach { phoneList.add(map(it)) }
            return phoneList
        }

        fun map(phoneDTO: PhoneDTO): Phone {
            return Phone(
                number = phoneDTO.number,
                type = PhoneTypes.safeValueOf(phoneDTO.type)
            )
        }
    }
}