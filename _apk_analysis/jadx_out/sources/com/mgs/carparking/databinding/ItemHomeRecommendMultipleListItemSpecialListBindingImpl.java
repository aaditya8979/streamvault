package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import pc.o0;
import pp.b;
import rp.a;

/* JADX INFO: loaded from: classes6.dex */
public class ItemHomeRecommendMultipleListItemSpecialListBindingImpl extends ItemHomeRecommendMultipleListItemSpecialListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43560e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43561f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43563d;

    public ItemHomeRecommendMultipleListItemSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43560e, f43561f));
    }

    public ItemHomeRecommendMultipleListItemSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f43563d = -1L;
        RoundedImageView roundedImageView = (RoundedImageView) objArr[0];
        this.f43562c = roundedImageView;
        roundedImageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable o0 o0Var) {
        this.f43559b = o0Var;
        synchronized (this) {
            this.f43563d |= 1;
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
            j10 = this.f43563d;
            this.f43563d = 0L;
        }
        o0 o0Var = this.f43559b;
        long j11 = j10 & 3;
        String banner_pic = null;
        if (j11 != 0) {
            if (o0Var != null) {
                bVar = o0Var.f77237d;
                blockListEntry = o0Var.f77235b;
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
            a.a(this.f43562c, banner_pic, R.drawable.ic_video_default_smart_horiz);
            sp.a.b(this.f43562c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43563d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43563d = 2L;
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
        b((o0) obj);
        return true;
    }
}
