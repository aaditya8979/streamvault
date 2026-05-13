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
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hc.w1;
import np.e;

/* JADX INFO: loaded from: classes12.dex */
public class FragmentHomeContentSearchListBindingImpl extends FragmentHomeContentSearchListBinding {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43016t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43017u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f43020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Button f43022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f43027s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43017u = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 10);
        sparseIntArray.put(R.id.header, 11);
        sparseIntArray.put(R.id.tv2, 12);
        sparseIntArray.put(R.id.tv_empty, 13);
        sparseIntArray.put(R.id.tv1, 14);
        sparseIntArray.put(R.id.img_loading, 15);
    }

    public FragmentHomeContentSearchListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f43016t, f43017u));
    }

    public FragmentHomeContentSearchListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (WaterDropHeader) objArr[11], (ImageView) objArr[15], (SmartRefreshLayout) objArr[10], (RecyclerView) objArr[1], (TextView) objArr[14], (TextView) objArr[12], (TextView) objArr[13]);
        this.f43027s = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43018j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f43019k = relativeLayout2;
        relativeLayout2.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f43020l = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f43021m = relativeLayout3;
        relativeLayout3.setTag(null);
        Button button = (Button) objArr[5];
        this.f43022n = button;
        button.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[6];
        this.f43023o = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[7];
        this.f43024p = relativeLayout5;
        relativeLayout5.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[8];
        this.f43025q = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[9];
        this.f43026r = relativeLayout6;
        relativeLayout6.setTag(null);
        this.f43011e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43027s |= 16;
        }
        return true;
    }

    public final boolean c(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43027s |= 4;
        }
        return true;
    }

    public final boolean d(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43027s |= 2;
        }
        return true;
    }

    public final boolean e(ObservableList<w1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43027s |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[PHI: r2
      0x00a5: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:37:0x007f, B:50:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentHomeContentSearchListBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43027s |= 8;
        }
        return true;
    }

    public void g(@Nullable HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel) {
        this.f43015i = homecontentsearchlistviewmodel;
        synchronized (this) {
            this.f43027s |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43027s != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43027s = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return e((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableBoolean) obj, i11);
        }
        if (i10 == 3) {
            return f((ObservableBoolean) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return b((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((HOMECONTENTSEARCHLISTVIEWMODEL) obj);
        return true;
    }
}
