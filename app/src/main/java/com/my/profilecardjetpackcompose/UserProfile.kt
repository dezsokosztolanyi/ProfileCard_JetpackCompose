package com.my.profilecardjetpackcompose

data class UserProfile(
    val name : String,
    val status : Boolean,
    val drawableId : Int
)

    val userProfileList = arrayListOf<UserProfile>(
        UserProfile(
            "Dezso Kosztolanyi",true,R.drawable.profile_pic
        ),
        UserProfile(
            "Erlom Ahvlediani",false,R.drawable.profile_pic
        )
    )

