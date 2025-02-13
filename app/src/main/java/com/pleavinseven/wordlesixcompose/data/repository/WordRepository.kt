package com.pleavinseven.wordlesixcompose.data.repository

import com.pleavinseven.wordlesixcompose.data.WordListDao

class WordRepository(private val wordListDao: WordListDao) {

    suspend fun readWord(): String {
        return wordListDao.readWord()
    }

    suspend fun updateWord(word: String) {
        return wordListDao.updateWord(word)
    }
}