package com.exsample.androidsamples.childFragment

import androidx.lifecycle.MutableLiveData
import com.exsample.androidsamples.base.BaseViewModel

class ParentViewModel: BaseViewModel() {

    val fragmentType = MutableLiveData<FragmentType>()

    var index = 0
    var selectedNumber = 0

    fun initData() {
        fragmentType.postValue(FragmentType.NUMBERS)
    }

    fun showDetail(index: Int, number: Int) {
        if (this.index != index)
            return
        selectedNumber = number
        fragmentType.postValue(FragmentType.DETAIL)
    }
}