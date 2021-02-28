package com.example.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(".............sınıflar...........")

        var Kullanici = kullanici("Ayşe", 12)


        println(".............Encapsulation...........")

        var ahmet = sanatci("Ahmet", 50, "Müzisyen")
        println(ahmet.isim + "  " + ahmet.yas + "  " + ahmet.meslek)
        ahmet.isim = "ahmet2"
        println(ahmet.isim)

        println(".............Inheritance...........")
        val mehmet = OzelSanatci("Mehmet", 50, "Müzisyen")

        println(".............Polymorphizm...........")

        // Statik Polymorphizm
        val islem = islemler()
        islem.carpma()
        println(islem.carpma())
        println(islem.carpma(2, 3))
        println(islem.carpma(3, 3, 4))

        //Dinamik Polymorphizm

        val barley = kopek()
        barley.sesCikar()
        println(".............Abstraction(Soyut sınıf) & Interface...........")

        Kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.marka = "Gitar Markası"
        gitar.elektro = true
        gitar.bilgi()
        println("............Lambda Gösterimi (Expression)..........")
        yazdiiginiYazdir("test")
        val yazdigimiYazdirLambda = { verilenString: String -> println(verilenString) }

        val carpmaIslemiLambda = { a: Int, b: Int -> a * b }
        println(carpmaIslemiLambda(6,7))

        val carpmaLambdaVol2 :(Int,Int)-> Int={a,b->a+b}
        println(carpmaLambdaVol2(6,7))
    }

    fun yazdiiginiYazdir(string: String) {
        println(string)
    }


}