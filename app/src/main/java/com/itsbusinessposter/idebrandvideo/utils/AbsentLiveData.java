package com.itsbusinessposter.idebrandvideo.utils;

import androidx.lifecycle.LiveData;

/**
 * A LiveData class that has {@code null} value.
 */
public class AbsentLiveData extends LiveData {

    private AbsentLiveData() {
        postValue(null);
    }

    public static <T> LiveData<T> create() {
        return new AbsentLiveData();
    }

}

