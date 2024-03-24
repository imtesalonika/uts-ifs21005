package com.ifs21005.dinopedia

import android.os.Parcel
import android.os.Parcelable

data class Dinosaurus (
    val gambarDinosaurus : Int,
    val namaDinosaurus : String,
    val deskripsiDinosaurus: String,
    val karakteristikDinosaurus: String,
    val kelompokDinosaurus: String,
    val habitatDinosaurus: String,
    val makananDinosaurus: String,
    val panjangDinosaurus: String,
    val tinggiDinosaurus: String,
    val bobotDinosaurus: String,
    val kelemahanDinosaurus: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambarDinosaurus)
        parcel.writeString(namaDinosaurus)
        parcel.writeString(deskripsiDinosaurus)
        parcel.writeString(karakteristikDinosaurus)
        parcel.writeString(kelompokDinosaurus)
        parcel.writeString(habitatDinosaurus)
        parcel.writeString(makananDinosaurus)
        parcel.writeString(panjangDinosaurus)
        parcel.writeString(tinggiDinosaurus)
        parcel.writeString(bobotDinosaurus)
        parcel.writeString(kelemahanDinosaurus)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dinosaurus> {
        override fun createFromParcel(parcel: Parcel): Dinosaurus {
            return Dinosaurus(parcel)
        }

        override fun newArray(size: Int): Array<Dinosaurus?> {
            return arrayOfNulls(size)
        }
    }
}
