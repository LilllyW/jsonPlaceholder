package com.example.json

import android.graphics.Bitmap

class PhotoDataModel(
    albumId: String, id: String,
    title: String, url: String,
    thumbnailUrl: String,
//    image: Bitmap,
    thumbnailImage: Bitmap
) {
    private val albumId: String
    private val id: String
    private val title: String
    private val url: String
    private val thumbnailUrl: String
    //    private val image: Bitmap
    private val thumbnailImage: Bitmap

    fun getAlbumId(): String {
        return albumId
    }

    fun getID(): String {
        return id
    }

    fun getTitle(): String {
        return title
    }

    fun getUrl(): String {
        return url
    }

    fun getThumbnailUrl(): String {
        return thumbnailUrl
    }

//    fun getImage(): Bitmap {
//        return image
//    }

    fun getThumbnailImage(): Bitmap{
        return thumbnailImage
    }

    init {
        this.albumId = albumId
        this.id = id
        this.title = title
        this.url = url
        this.thumbnailUrl = thumbnailUrl
//        this.image = image
        this.thumbnailImage = thumbnailImage
    }
}