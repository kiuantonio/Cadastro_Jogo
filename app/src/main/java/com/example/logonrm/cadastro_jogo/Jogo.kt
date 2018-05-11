package com.example.logonrm.cadastro_jogo

/**
 * Created by logonrm on 11/05/2018.
 */

import android.os.Parcel
import android.os.Parcelable

data class jogo (val nome: String,
                 val genero: String,
                 val anoLancamento: Int) : Parcelable {


    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(genero)
        parcel.writeInt(anoLancamento)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<jogo> {
        override fun createFromParcel(parcel: Parcel): jogo {
            return jogo(parcel)
        }

        override fun newArray(size: Int): Array<jogo?> {
            return arrayOfNulls(size)
        }
    }
}