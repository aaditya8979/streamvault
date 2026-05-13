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
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleVideoEntry;
import nc.k0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHomeContentMultipleGalleryBindingImpl extends ItemHomeContentMultipleGalleryBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43262i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43263j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43266h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43263j = sparseIntArray;
        sparseIntArray.put(R.id.iv_right, 3);
        sparseIntArray.put(R.id.viewPager, 4);
    }

    public ItemHomeContentMultipleGalleryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43262i, f43263j));
    }

    public ItemHomeContentMultipleGalleryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[2], (ViewPager) objArr[4]);
        this.f43266h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43264f = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f43265g = relativeLayout;
        relativeLayout.setTag(null);
        this.f43259c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable k0 k0Var) {
        this.f43261e = k0Var;
        synchronized (this) {
            this.f43266h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String moduleName;
        b bVar;
        HomeMultipleVideoEntry homeMultipleVideoEntry;
        synchronized (this) {
            j10 = this.f43266h;
            this.f43266h = 0L;
        }
        k0 k0Var = this.f43261e;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 != 0) {
            if (k0Var != null) {
                bVar = k0Var.f75789e;
                homeMultipleVideoEntry = k0Var.f75787c;
            } else {
                bVar = null;
                homeMultipleVideoEntry = null;
            }
            b bVar3 = bVar;
            moduleName = homeMultipleVideoEntry != null ? homeMultipleVideoEntry.getModuleName() : null;
            bVar2 = bVar3;
        } else {
            moduleName = null;
        }
        if (j11 != 0) {
            a.b(this.f43265g, bVar2, false);
            TextViewBindingAdapter.setText(this.f43259c, moduleName);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43266h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43266h = 2L;
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
        b((k0) obj);
        return true;
    }
}
