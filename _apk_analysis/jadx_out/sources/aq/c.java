package aq;

import android.util.SparseArray;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: compiled from: ItemBinding.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final d<T> f5257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @LayoutRes
    public int f5259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<Object> f5260d;

    public c(@Nullable d<T> dVar) {
        this.f5257a = dVar;
    }

    @NonNull
    public static <T> c<T> c(int i10, @LayoutRes int i11) {
        return new c(null).f(i10, i11);
    }

    @NonNull
    public static <T> c<T> d(@NonNull d<T> dVar) {
        if (dVar != null) {
            return new c<>(dVar);
        }
        throw new NullPointerException("onItemBind == null");
    }

    public boolean a(@NonNull ViewDataBinding viewDataBinding, T t10) {
        int i10 = this.f5258b;
        if (i10 == 0) {
            return false;
        }
        if (!viewDataBinding.setVariable(i10, t10)) {
            e.c(viewDataBinding, this.f5258b, this.f5259c);
        }
        SparseArray<Object> sparseArray = this.f5260d;
        if (sparseArray == null) {
            return true;
        }
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = this.f5260d.keyAt(i11);
            Object objValueAt = this.f5260d.valueAt(i11);
            if (iKeyAt != 0) {
                viewDataBinding.setVariable(iKeyAt, objValueAt);
            }
        }
        return true;
    }

    @LayoutRes
    public final int b() {
        return this.f5259c;
    }

    public void e(int i10, T t10) {
        d<T> dVar = this.f5257a;
        if (dVar != null) {
            this.f5258b = -1;
            this.f5259c = 0;
            dVar.a(this, i10, t10);
            if (this.f5258b == -1) {
                throw new IllegalStateException("variableId not set in onItemBind()");
            }
            if (this.f5259c == 0) {
                throw new IllegalStateException("layoutRes not set in onItemBind()");
            }
        }
    }

    @NonNull
    public final c<T> f(int i10, @LayoutRes int i11) {
        this.f5258b = i10;
        this.f5259c = i11;
        return this;
    }

    public final int g() {
        return this.f5258b;
    }
}
