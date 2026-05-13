package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class ObservableField<T> extends BaseObservableField implements Serializable {
    public static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField() {
    }

    public ObservableField(T t10) {
        this.mValue = t10;
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }

    @Nullable
    public T get() {
        return this.mValue;
    }

    public void set(T t10) {
        if (t10 != this.mValue) {
            this.mValue = t10;
            notifyChange();
        }
    }
}
