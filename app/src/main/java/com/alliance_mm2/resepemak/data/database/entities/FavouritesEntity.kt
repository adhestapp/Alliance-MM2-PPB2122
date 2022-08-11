package com.alliance_mm2.resepemak.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alliance_mm2.resepemak.models.Result
import com.alliance_mm2.resepemak.util.Constants.Companion.FAVOURITE_RECIPES_TABLE

@Entity(tableName = FAVOURITE_RECIPES_TABLE)
class FavouritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)