package aq;

import android.os.Looper;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static void a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("You must only modify the ObservableList on the main thread.");
        }
    }

    @Nullable
    @MainThread
    public static LifecycleOwner b(View view) {
        ViewDataBinding viewDataBindingFindBinding = DataBindingUtil.findBinding(view);
        LifecycleOwner lifecycleOwner = viewDataBindingFindBinding != null ? viewDataBindingFindBinding.getLifecycleOwner() : null;
        Object context = view.getContext();
        return (lifecycleOwner == null && (context instanceof LifecycleOwner)) ? (LifecycleOwner) context : lifecycleOwner;
    }

    public static void c(ViewDataBinding viewDataBinding, int i10, @LayoutRes int i11) {
        String resourceName = viewDataBinding.getRoot().getContext().getResources().getResourceName(i11);
        throw new IllegalStateException("Could not bind variable '" + DataBindingUtil.convertBrIdToString(i10) + "' in layout '" + resourceName + "'");
    }
}
