package com.mrpaul.locationsharingapp.model

import com.google.firebase.firestore.PropertyName

class User(
val userId:String,
@get:PropertyName("DisplayName")
@set:PropertyName("DisplayName")
var displayname:String="",


@get:PropertyName("email")
@set:PropertyName("email")
var email:String ="",

@get:PropertyName("location")
@set:PropertyName("location")
var location:String ="" ){
    constructor():this("","","")
}