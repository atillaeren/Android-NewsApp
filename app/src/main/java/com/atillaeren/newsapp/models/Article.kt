package com.atillaeren.newsapp.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @SerializedName("author")
    val author: String?, // Ariel Zilber
    @SerializedName("content")
    val content: String?, // Stocks are tumbling on Friday as the sharp, recent surge for interest rates keeps weighing on Wall Street while companies reported disappointing quarterly profits.The S&amp;P 500 was 2% lower in af… [+2487 chars]
    @SerializedName("description")
    val description: String?, // Stocks are tumbling on Friday as the sharp, recent surge for interest rates keeps weighing on Wall Street while companies reported disappointing quarterly profits.
    @SerializedName("publishedAt")
    val publishedAt: String?, // 2022-04-22T19:17:35Z
    @SerializedName("source")
    val source: Source?,
    @SerializedName("title")
    val title: String?, // Dow plunges 800 points as Fed signals steeper rate hikes to combat inflation
    @SerializedName("url")
    val url: String?, // https://nypost.com/2022/04/22/dow-plunges-800-points-as-fed-signals-steeper-rate-hikes-to-combat-inflation/
    @SerializedName("urlToImage")
    val urlToImage: String? // https://nypost.com/wp-content/uploads/sites/2/2022/04/brokers-nyse-01.jpg?quality=75&strip=all&w=1024
) : Serializable