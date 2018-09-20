package com.example.generic

class Stuff {

    String name

    static constraints = {
        name size: 1..255
    }
}
