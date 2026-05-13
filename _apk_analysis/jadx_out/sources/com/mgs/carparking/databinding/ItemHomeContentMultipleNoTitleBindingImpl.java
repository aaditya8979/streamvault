package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import aq.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;
import nc.a1;
import nc.u0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeContentMultipleNoTitleBindingImpl extends ItemHomeContentMultipleNoTitleBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43332f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43333g = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43335e;

    public ItemHomeContentMultipleNoTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f43332f, f43333g));
    }

    public ItemHomeContentMultipleNoTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[1]);
        this.f43335e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43334d = linearLayout;
        linearLayout.setTag(null);
        this.f43330b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableList<u0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43335e |= 1;
        }
        return true;
    }

    public void c(@Nullable a1 a1Var) {
        this.f43331c = a1Var;
        synchronized (this) {
            this.f43335e |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<u0> cVar;
        ObservableList<u0> observableList;
        c<u0> cVar2;
        synchronized (this) {
            j10 = this.f43335e;
            this.f43335e = 0L;
        }
        a1 a1Var = this.f43331c;
        long j11 = 7 & j10;
        ObservableList<u0> observableList2 = null;
        if (j11 != 0) {
            if (a1Var != null) {
                observableList2 = a1Var.f75746d;
                cVar2 = a1Var.f75747e;
            } else {
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            cVar = cVar2;
            observableList = observableList2;
        } else {
            cVar = null;
            observableList = null;
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f43330b, a.a(3));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f43330b, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43335e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43335e = 4L;
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
        c((a1) obj);
        return true;
    }
}
