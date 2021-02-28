package com.example.oopkotlin

import java.lang.NullPointerException

class kullanici: Insan {

    var isim: String? = null
    var yas: Int? = null

    constructor(isim:String,yas:Int){
        this.isim= isim
        this.yas= yas

    }

    // init ilk çağrılır
    init{
        println("init çağrıldı.")
    }

}