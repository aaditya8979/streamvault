package androidx.lifecycle;

/* JADX INFO: loaded from: classes12.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public MutableLiveData() {
    }

    public MutableLiveData(T t10) {
        super(t10);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t10) {
        super.postValue(t10);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t10) {
        super.setValue(t10);
    }
}
