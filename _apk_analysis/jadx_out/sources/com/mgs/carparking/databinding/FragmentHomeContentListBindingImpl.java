package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import com.mgs.carparking.util.DotView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.cardbanner.CardBanner;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import nc.e0;

/* JADX INFO: loaded from: classes4.dex */
public class FragmentHomeContentListBindingImpl extends FragmentHomeContentListBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42987o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42988p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Button f42991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f42993n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42988p = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 5);
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.homeCardBanner, 7);
        sparseIntArray.put(R.id.dotView, 8);
        sparseIntArray.put(R.id.tv_empty, 9);
        sparseIntArray.put(R.id.img_loading, 10);
    }

    public FragmentHomeContentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f42987o, f42988p));
    }

    public FragmentHomeContentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (DotView) objArr[8], (WaterDropHeader) objArr[6], (CardBanner) objArr[7], (ImageView) objArr[10], (SmartRefreshLayout) objArr[5], (RecyclerView) objArr[1], (TextView) objArr[9]);
        this.f42993n = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42989j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f42990k = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f42991l = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f42992m = relativeLayout3;
        relativeLayout3.setTag(null);
        this.f42984g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42993n |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42993n |= 2;
        }
        return true;
    }

    public final boolean d(ObservableList<e0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42993n |= 1;
        }
        return true;
    }

    public void e(@Nullable HomeContentListViewModel homeContentListViewModel) {
        this.f42986i = homeContentListViewModel;
        synchronized (this) {
            this.f42993n |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentHomeContentListBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42993n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42993n = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((HomeContentListViewModel) obj);
        return true;
    }
}
