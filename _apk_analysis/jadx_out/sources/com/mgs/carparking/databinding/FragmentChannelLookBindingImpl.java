package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hc.a2;
import hc.c2;
import hc.y1;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentChannelLookBindingImpl extends FragmentChannelLookBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts B = null;

    @Nullable
    public static final SparseIntArray C;
    public long A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final Button f42939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42944y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42945z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 13);
        sparseIntArray.put(R.id.collapsingToolbarLayout, 14);
        sparseIntArray.put(R.id.sortToolbar, 15);
        sparseIntArray.put(R.id.sortToolbar_title, 16);
        sparseIntArray.put(R.id.ll_top, 17);
        sparseIntArray.put(R.id.tv_name, 18);
        sparseIntArray.put(R.id.img_loading1, 19);
        sparseIntArray.put(R.id.refresh_layout, 20);
        sparseIntArray.put(R.id.header, 21);
        sparseIntArray.put(R.id.tv_empty, 22);
        sparseIntArray.put(R.id.img_loading, 23);
    }

    public FragmentChannelLookBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, B, C));
    }

    public FragmentChannelLookBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (AppBarLayout) objArr[13], (RecyclerView) objArr[2], (RecyclerView) objArr[6], (CollapsingToolbarLayout) objArr[14], (WaterDropHeader) objArr[21], (ImageView) objArr[23], (ImageView) objArr[19], (LinearLayout) objArr[17], (SmartRefreshLayout) objArr[20], (RelativeLayout) objArr[1], (RecyclerView) objArr[3], (Toolbar) objArr[15], (TextView) objArr[16], (TextView) objArr[22], (TextView) objArr[18]);
        this.A = -1L;
        this.f42922c.setTag(null);
        this.f42923d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42937r = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[10];
        this.f42938s = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[11];
        this.f42939t = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[12];
        this.f42940u = relativeLayout3;
        relativeLayout3.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[4];
        this.f42941v = recyclerView;
        recyclerView.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[5];
        this.f42942w = recyclerView2;
        recyclerView2.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[7];
        this.f42943x = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[8];
        this.f42944y = relativeLayout5;
        relativeLayout5.setTag(null);
        RecyclerView recyclerView3 = (RecyclerView) objArr[9];
        this.f42945z = recyclerView3;
        recyclerView3.setTag(null);
        this.f42930k.setTag(null);
        this.f42931l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 256;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 512;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentChannelLookBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 16;
        }
        return true;
    }

    public final boolean g(ObservableList<a2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 128;
        }
        return true;
    }

    public final boolean h(ObservableList<y1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.A != 0;
        }
    }

    public final boolean i(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.A = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    public final boolean j(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 8;
        }
        return true;
    }

    public final boolean k(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 32;
        }
        return true;
    }

    public void l(@Nullable LOOKCHANNELVIEWMODEL lookchannelviewmodel) {
        this.f42936q = lookchannelviewmodel;
        synchronized (this) {
            this.A |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return b((ObservableField) obj, i11);
            case 1:
                return i((ObservableList) obj, i11);
            case 2:
                return d((ObservableField) obj, i11);
            case 3:
                return j((ObservableList) obj, i11);
            case 4:
                return f((ObservableList) obj, i11);
            case 5:
                return k((ObservableList) obj, i11);
            case 6:
                return h((ObservableList) obj, i11);
            case 7:
                return g((ObservableList) obj, i11);
            case 8:
                return c((ObservableField) obj, i11);
            case 9:
                return e((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        l((LOOKCHANNELVIEWMODEL) obj);
        return true;
    }
}
