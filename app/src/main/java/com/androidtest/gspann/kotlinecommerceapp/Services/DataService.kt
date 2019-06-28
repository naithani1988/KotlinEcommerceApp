package com.androidtest.gspann.kotlinecommerceapp.Services

import com.androidtest.gspann.kotlinecommerceapp.Model.Category
import com.androidtest.gspann.kotlinecommerceapp.Model.Product

object DataService {

    val categories= listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HODIES", "hoodieimage"),
        Category("HATS","hat"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Balck", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoddies= listOf(
        Product("Devsopes Hoddies Red", "$20", "hoodie01"),
        Product("Devsopes Hoddies Grrey", "$18", "hoodie02"),
        Product("Devsopes Hoddies White", "$22", "hoodie03"),
        Product("Devsopes Black Hoddies", "$20", "hoodie04")
    )

    val shirts= listOf(
        Product("Devsopes shirt Red", "$20", "shirt01"),
        Product("Devsopes shirt Grrey", "$18", "shirt02"),
        Product("Devsopes shirt White", "$22", "shirt03"),
        Product("Devsopes Black shirt", "$20", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )

}