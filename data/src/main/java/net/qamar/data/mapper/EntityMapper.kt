package net.qamar.data.mapper


interface EntityMapper<E, D> {
// E = model into your Data layer , D = model into your Domain layer
    fun mapFromEntity(entity: E): D

    fun mapToEntity(domain: D): E
}