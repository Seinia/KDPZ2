package com.example.secondlab

abstract class Animal(val name: String, val desc: String, val imageURL: String) {


    init {

    }

    abstract fun go(seconds: Int): Boolean

    companion object

}

class Dog(name: String, desc: String, imageURL: String) : Animal(name, desc, imageURL), Voicable,
    Runnable2 {
    override fun go(seconds: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun voice(seconds: Int): Boolean {
        TODO("Not yet implemented")
    }


}

object Plate {}


interface Voicable {
    fun voice(seconds: Int): Boolean
}

interface Runnable2

