package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import hc.c3;

/* JADX INFO: loaded from: classes4.dex */
public class ItemPopTvSetNumDownloadBindingImpl extends ItemPopTvSetNumDownloadBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43665g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43666h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43667f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43666h = sparseIntArray;
        sparseIntArray.put(R.id.tv_name, 1);
        sparseIntArray.put(R.id.iv_download, 2);
    }

    public ItemPopTvSetNumDownloadBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f43665g, f43666h));
    }

    public ItemPopTvSetNumDownloadBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (RelativeLayout) objArr[0], (TextView) objArr[1]);
        this.f43667f = -1L;
        this.f43662c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable c3 c3Var) {
        this.f43664e = c3Var;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f43667f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43667f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43667f = 2L;
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
        b((c3) obj);
        return true;
    }
}
