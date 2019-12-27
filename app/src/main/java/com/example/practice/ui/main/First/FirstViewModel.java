package com.example.practice.ui.main.First;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class FirstViewModel extends ViewModel {
/*    private MutableLiveData<List<User>> userList;
    public LiveData<List<User>> getUsers(){
        if(userList == null){
            userList = new MutableLiveData<List<User>>();
            loadUsers();
        }
        return userList;
    }*/
public FirstViewModel() {};

    private void loadUsers(){
        // Do an asynchronous operation to fetch userList.
    }
}