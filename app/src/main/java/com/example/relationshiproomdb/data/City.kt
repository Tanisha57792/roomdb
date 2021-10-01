package com.example.relationshiproomdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "city")
data class City(@PrimaryKey val id:Int, val state:String, val city:String)