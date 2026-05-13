package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import aq.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import nc.f0;
import nc.g0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes12.dex */
public class ItemHomeContentMultipleCategoryListBindingImpl extends ItemHomeContentMultipleCategoryListBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43253g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43254h = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43257f;

    public ItemHomeContentMultipleCategoryListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f43253g, f43254h));
    }

    public ItemHomeContentMultipleCategoryListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[1]);
        this.f43257f = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43255d = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f43256e = textView;
        textView.setTag(null);
        this.f43251b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableList<f0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43257f |= 1;
        }
        return true;
    }

    public void c(@Nullable g0 g0Var) {
        this.f43252c = g0Var;
        synchronized (this) {
            this.f43257f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<f0> cVar;
        ObservableList<f0> observableList;
        ObservableList<f0> observableList2;
        synchronized (this) {
            j10 = this.f43257f;
            this.f43257f = 0L;
        }
        g0 g0Var = this.f43252c;
        long j11 = 7 & j10;
        b bVar = null;
        if (j11 != 0) {
            if (g0Var != null) {
                observableList2 = g0Var.f75771c;
                cVar = g0Var.f75772d;
            } else {
                observableList2 = null;
                cVar = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0 && g0Var != null) {
                bVar = g0Var.f75773e;
            }
            observableList = observableList2;
        } else {
            cVar = null;
            observableList = null;
        }
        if ((6 & j10) != 0) {
            a.b(this.f43256e, bVar, false);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f43251b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f43251b, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43257f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43257f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b((ObservableList) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((g0) obj);
        return true;
    }
}
