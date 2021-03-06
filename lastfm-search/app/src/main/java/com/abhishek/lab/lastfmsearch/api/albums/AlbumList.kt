package com.abhishek.lab.lastfmsearch.api.albums

import com.abhishek.lab.lastfmsearch.model.Album
import com.google.gson.annotations.SerializedName

/**
 *
 * Created by  Abhishek Pathak on 16-06-2020.
 * Copyright (C) 2020 myofficework000@gmail.com. All rights reserved
 */
class AlbumList(
    @SerializedName("album")
    val albums: List<Album>
)