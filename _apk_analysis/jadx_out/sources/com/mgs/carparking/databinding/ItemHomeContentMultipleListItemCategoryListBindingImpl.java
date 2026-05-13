package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import nc.f0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHomeContentMultipleListItemCategoryListBindingImpl extends ItemHomeContentMultipleListItemCategoryListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43286e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43287f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43289d;

    public ItemHomeContentMultipleListItemCategoryListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43286e, f43287f));
    }

    public ItemHomeContentMultipleListItemCategoryListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f43289d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f43288c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable f0 f0Var) {
        this.f43285b = f0Var;
        synchronized (this) {
            this.f43289d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f43289d;
            this.f43289d = 0L;
        }
        f0 f0Var = this.f43285b;
        long j11 = j10 & 3;
        String str = null;
        if (j11 == 0 || f0Var == null) {
            bVar = null;
        } else {
            bVar = f0Var.f75770c;
            str = f0Var.f75769b;
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f43288c, str);
            a.b(this.f43288c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43289d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43289d = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((f0) obj);
        return true;
    }
}
