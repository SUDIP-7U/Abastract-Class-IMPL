package com.example.abastractimpl

abstract class Animal {

    abstract fun Human(): String
    abstract fun Manush(): String
    abstract fun Money(): String

    fun breathe(): String {
        return "All animals breathe..."
    }
}

class Jibon : Animal(){
    override fun Human(): String {
        return "I am Human 👨"
    }

    override fun Manush(): String {
        return "Manush means Having Great sense but live in Darkness"
    }

    override fun Money(): String {
        return "Humans invented money 💰"
    }
}
