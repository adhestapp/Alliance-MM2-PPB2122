package com.alliance_mm2.resepemak.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alliance_mm2.resepemak.models.FoodRecipe
import com.alliance_mm2.resepemak.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}