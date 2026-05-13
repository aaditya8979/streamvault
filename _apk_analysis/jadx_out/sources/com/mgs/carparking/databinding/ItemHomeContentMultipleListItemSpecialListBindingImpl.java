package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.BlockListEntry;
import nc.e1;
import pp.b;
import rp.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeContentMultipleListItemSpecialListBindingImpl extends ItemHomeContentMultipleListItemSpecialListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43317e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43318f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f43319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43320d;

    public ItemHomeContentMultipleListItemSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43317e, f43318f));
    }

    public ItemHomeContentMultipleListItemSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f43320d = -1L;
        ImageView imageView = (ImageView) objArr[0];
        this.f43319c = imageView;
        imageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable e1 e1Var) {
        this.f43316b = e1Var;
        synchronized (this) {
            this.f43320d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        BlockListEntry blockListEntry;
        synchronized (this) {
            j10 = this.f43320d;
            this.f43320d = 0L;
        }
        e1 e1Var = this.f43316b;
        long j11 = j10 & 3;
        String banner_pic = null;
        if (j11 != 0) {
            if (e1Var != null) {
                bVar = e1Var.f75767e;
                blockListEntry = e1Var.f75764b;
            } else {
                bVar = null;
                blockListEntry = null;
            }
            if (blockListEntry != null) {
                banner_pic = blockListEntry.getBanner_pic();
            }
        } else {
            bVar = null;
        }
        if (j11 != 0) {
            a.a(this.f43319c, banner_pic, R.drawable.ic_video_default_smart_horiz);
            sp.a.b(this.f43319c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43320d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43320d = 2L;
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
        b((e1) obj);
        return true;
    }
}
