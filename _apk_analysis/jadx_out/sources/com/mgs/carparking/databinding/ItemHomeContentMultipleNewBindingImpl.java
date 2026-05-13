package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import aq.c;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import nc.s0;
import nc.y0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemHomeContentMultipleNewBindingImpl extends ItemHomeContentMultipleNewBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43324i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43325j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43329h;

    public ItemHomeContentMultipleNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43324i, f43325j));
    }

    public ItemHomeContentMultipleNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f43329h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43326e = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.f43327f = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.f43328g = linearLayout3;
        linearLayout3.setTag(null);
        this.f43321b.setTag(null);
        this.f43322c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43329h |= 1;
        }
        return true;
    }

    public void c(@Nullable y0 y0Var) {
        this.f43323d = y0Var;
        synchronized (this) {
            this.f43329h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String module_name;
        b bVar;
        c<s0> cVar;
        ObservableList<s0> observableList;
        ObservableList<s0> observableList2;
        c<s0> cVar2;
        b bVar2;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f43329h;
            this.f43329h = 0L;
        }
        y0 y0Var = this.f43323d;
        long j11 = 7 & j10;
        b bVar3 = null;
        bVar3 = null;
        if (j11 != 0) {
            if (y0Var != null) {
                observableList2 = y0Var.f75841e;
                cVar2 = y0Var.f75842f;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (y0Var != null) {
                    homeMultipleEntry = y0Var.f75840d;
                    bVar = y0Var.f75844h;
                    bVar2 = y0Var.f75843g;
                } else {
                    bVar2 = null;
                    homeMultipleEntry = null;
                    bVar = null;
                }
                observableList = observableList2;
                cVar = cVar2;
                bVar3 = bVar2;
                module_name = homeMultipleEntry != null ? homeMultipleEntry.getModule_name() : null;
            } else {
                module_name = null;
                bVar = null;
                observableList = observableList2;
                cVar = cVar2;
            }
        } else {
            module_name = null;
            bVar = null;
            cVar = null;
            observableList = null;
        }
        if ((6 & j10) != 0) {
            a.b(this.f43327f, bVar3, false);
            a.b(this.f43328g, bVar, false);
            TextViewBindingAdapter.setText(this.f43322c, module_name);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f43321b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(3));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f43321b, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43329h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43329h = 4L;
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
        c((y0) obj);
        return true;
    }
}
