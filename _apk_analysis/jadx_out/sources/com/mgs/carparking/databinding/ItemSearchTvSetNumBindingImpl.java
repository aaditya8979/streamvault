package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import hc.u2;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSearchTvSetNumBindingImpl extends ItemSearchTvSetNumBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43696e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43697f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43699d;

    public ItemSearchTvSetNumBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43696e, f43697f));
    }

    public ItemSearchTvSetNumBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f43699d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f43698c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable u2 u2Var) {
        this.f43695b = u2Var;
        synchronized (this) {
            this.f43699d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f43699d;
            this.f43699d = 0L;
        }
        u2 u2Var = this.f43695b;
        b bVar = null;
        long j11 = j10 & 3;
        if (j11 != 0 && u2Var != null) {
            bVar = u2Var.f63398b;
        }
        if (j11 != 0) {
            a.b(this.f43698c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43699d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43699d = 2L;
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
        b((u2) obj);
        return true;
    }
}
