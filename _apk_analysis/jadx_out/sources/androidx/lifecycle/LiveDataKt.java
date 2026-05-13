package androidx.lifecycle;

import androidx.annotation.MainThread;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: LiveData.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class LiveDataKt {
    @MainThread
    @NotNull
    public static final <T> Observer<T> observe(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final l<? super T, r> lVar) {
        p.k(liveData, "<this>");
        p.k(lifecycleOwner, "owner");
        p.k(lVar, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t10) {
                lVar.invoke(t10);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
