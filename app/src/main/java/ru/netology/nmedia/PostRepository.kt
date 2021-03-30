package ru.netology.nmedia

import androidx.lifecycle.LiveData

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun shared(id: Long)
    fun viewed(id: Long)
    fun removeById(id: Long)
    fun save(post: Post)
    fun video ()
}