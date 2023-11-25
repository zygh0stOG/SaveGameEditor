package net.zygh0st.savegameeditor.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mSaveData;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mSaveData = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getSaveData() { return mSaveData; }

    public void setSaveData(String saveData) { mSaveData.setValue(saveData); }
}