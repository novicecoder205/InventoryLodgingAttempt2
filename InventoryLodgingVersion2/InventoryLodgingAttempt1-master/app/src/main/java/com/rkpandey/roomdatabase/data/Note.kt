package com.rkpandey.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(

    val title: String,
    val description: String,
    val quantity: String,
    val location: String,
    val purpose: String,
    val dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
) //BELOW IS SEARCH
{
    fun doesMatchSearchQuery(query: String): Boolean{
        val matchingCombinations = listOf(
            "$title$quantity",
            "$title $quantity",
            "${title.first()} ${title.last()}",
        )
        return matchingCombinations.any{
            it.contains(query, ignoreCase = true)
        }
    }
}
