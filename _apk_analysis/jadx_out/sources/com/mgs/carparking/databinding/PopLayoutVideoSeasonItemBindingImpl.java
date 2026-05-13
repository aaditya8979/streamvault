package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import aq.c;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import hc.a3;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;

/* JADX INFO: loaded from: classes6.dex */
public class PopLayoutVideoSeasonItemBindingImpl extends PopLayoutVideoSeasonItemBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43831e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43832f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43834d;

    public PopLayoutVideoSeasonItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43831e, f43832f));
    }

    public PopLayoutVideoSeasonItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f43834d = -1L;
        RecyclerView recyclerView = (RecyclerView) objArr[0];
        this.f43833c = recyclerView;
        recyclerView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.PopLayoutVideoSeasonItemBinding
    public void b(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.f43830b = videoplaydetailviewmodel;
        synchronized (this) {
            this.f43834d |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    public final boolean c(ObservableList<a3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43834d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<a3> cVar;
        ObservableList<a3> observableList;
        c<a3> cVar2;
        synchronized (this) {
            j10 = this.f43834d;
            this.f43834d = 0L;
        }
        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = this.f43830b;
        long j11 = 7 & j10;
        ObservableList<a3> observableList2 = null;
        if (j11 != 0) {
            if (videoplaydetailviewmodel != null) {
                c<a3> cVar3 = videoplaydetailviewmodel.f44220r0;
                observableList2 = videoplaydetailviewmodel.f44222s0;
                cVar2 = cVar3;
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
            ViewAdapter.b(this.f43833c, a.b());
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f43833c, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43834d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43834d = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return c((ObservableList) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }
}
