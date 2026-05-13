package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import aq.c;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import nc.j0;
import nc.o0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHomeContentMultipleCategoryBindingImpl extends ItemHomeContentMultipleCategoryBinding {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43246j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43247k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f43250i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43247k = sparseIntArray;
        sparseIntArray.put(R.id.tv_more, 4);
        sparseIntArray.put(R.id.iv_right, 5);
    }

    public ItemHomeContentMultipleCategoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f43246j, f43247k));
    }

    public ItemHomeContentMultipleCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[5], (RecyclerView) objArr[3], (TextView) objArr[4], (TextView) objArr[2]);
        this.f43250i = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43248g = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f43249h = relativeLayout;
        relativeLayout.setTag(null);
        this.f43242c.setTag(null);
        this.f43244e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableList<o0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43250i |= 1;
        }
        return true;
    }

    public void c(@Nullable j0 j0Var) {
        this.f43245f = j0Var;
        synchronized (this) {
            this.f43250i |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        c<o0> cVar;
        ObservableList<o0> observableList;
        ObservableList<o0> observableList2;
        b bVar;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f43250i;
            this.f43250i = 0L;
        }
        j0 j0Var = this.f43245f;
        long j11 = 7 & j10;
        b bVar2 = null;
        bVar2 = null;
        if (j11 != 0) {
            if (j0Var != null) {
                observableList2 = j0Var.f75783d;
                cVar = j0Var.f75784e;
            } else {
                observableList2 = null;
                cVar = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (j0Var != null) {
                    homeMultipleEntry = j0Var.f75782c;
                    bVar = j0Var.f75785f;
                } else {
                    bVar = null;
                    homeMultipleEntry = null;
                }
                String module_name = homeMultipleEntry != null ? homeMultipleEntry.getModule_name() : null;
                observableList = observableList2;
                String str2 = module_name;
                bVar2 = bVar;
                str = str2;
            } else {
                str = null;
                observableList = observableList2;
            }
        } else {
            str = null;
            cVar = null;
            observableList = null;
        }
        if ((6 & j10) != 0) {
            a.b(this.f43249h, bVar2, false);
            TextViewBindingAdapter.setText(this.f43244e, str);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f43242c, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f43242c, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43250i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43250i = 4L;
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
        c((j0) obj);
        return true;
    }
}
