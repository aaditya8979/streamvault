package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.w1;

/* JADX INFO: loaded from: classes5.dex */
public class ItemHomeContentSearchRecommendListBindingImpl extends ItemHomeContentSearchRecommendListBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43389f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43390g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43392e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43390g = sparseIntArray;
        sparseIntArray.put(R.id.item_img, 1);
    }

    public ItemHomeContentSearchRecommendListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f43389f, f43390g));
    }

    public ItemHomeContentSearchRecommendListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundedImageView) objArr[1]);
        this.f43392e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43391d = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable w1 w1Var) {
        this.f43388c = w1Var;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f43392e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43392e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43392e = 2L;
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
        b((w1) obj);
        return true;
    }
}
