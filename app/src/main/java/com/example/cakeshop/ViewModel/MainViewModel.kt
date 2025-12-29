package com.example.cakeshop.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.cakeshop.Activity.Domain.CategoryModel
import com.example.cakeshop.Activity.Domain.ItemsModel
import com.example.cakeshop.Activity.Domain.SliderModel
import com.example.cakeshop.Repository.MainRepository

class MainViewModel:ViewModel() {

    private val repository = MainRepository()

    fun loadBanner():LiveData<MutableList<SliderModel>>{
        return repository.loadBanner()
    }

    fun loadCategory():LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }

    fun loadBestSeller():LiveData<MutableList<ItemsModel>>{
        return repository.loadBestSeller()
    }

    fun liadFiltered(id:String):LiveData<MutableList<ItemsModel>>{
        return repository.loadFiltered(id)
    }
}