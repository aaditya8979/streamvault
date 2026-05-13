package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.libutils.statusbar.StatusBarHeightView;
import com.mgs.carparking.model.SPIELVIEWMODEL;

/* JADX INFO: loaded from: classes12.dex */
public class FragmentSpielBindingImpl extends FragmentSpielBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43101i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43102j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43104h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43102j = sparseIntArray;
        sparseIntArray.put(R.id.bar, 1);
        sparseIntArray.put(R.id.iv_home, 2);
        sparseIntArray.put(R.id.progressBar1, 3);
        sparseIntArray.put(R.id.web, 4);
    }

    public FragmentSpielBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43101i, f43102j));
    }

    public FragmentSpielBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (StatusBarHeightView) objArr[1], (ImageView) objArr[2], (ProgressBar) objArr[3], (WebView) objArr[4]);
        this.f43104h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43103g = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable SPIELVIEWMODEL spielviewmodel) {
        this.f43100f = spielviewmodel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f43104h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43104h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43104h = 2L;
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
        b((SPIELVIEWMODEL) obj);
        return true;
    }
}
