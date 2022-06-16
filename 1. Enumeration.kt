package com.dave099.kotlin

fun main ()
{
    val warna : Color = Color.GREEN //nama variabel 'warna'
    print(warna) //GREEN adalah warna yang dipilih
}

enum class Color //enum adalah sebuah perintah untuk membuat konstanta
{
    RED,GREEN,BLUE //nilai konstanta
}