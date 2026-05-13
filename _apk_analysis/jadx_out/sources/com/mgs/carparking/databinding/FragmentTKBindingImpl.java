package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.shorttk.TKFragmentViewModel;
import com.mgs.carparking.shorttk.VerticalViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class FragmentTKBindingImpl extends FragmentTKBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43107f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43108g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43110e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43108g = sparseIntArray;
        sparseIntArray.put(R.id.vpPager, 1);
    }

    public FragmentTKBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f43107f, f43108g));
    }

    public FragmentTKBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (VerticalViewPager) objArr[1]);
        this.f43110e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f43109d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable TKFragmentViewModel tKFragmentViewModel) {
        this.f43106c = tKFragmentViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f43110e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43110e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43110e = 2L;
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
        b((TKFragmentViewModel) obj);
        return true;
    }
}
