package net.qamar.ssotwithdaggercleanatchitecture.mapper

interface Mapper<out V, in D> {
// v = model in your presentation or app layer , D = model into Domain layer
    fun mapToView(type: D): V

}