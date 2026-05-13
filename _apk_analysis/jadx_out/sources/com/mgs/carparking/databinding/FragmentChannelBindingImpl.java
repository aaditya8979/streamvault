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
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hc.p0;
import hc.q0;
import hc.s0;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentChannelBindingImpl extends FragmentChannelBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts H = null;

    @Nullable
    public static final SparseIntArray I;

    @NonNull
    public final RelativeLayout A;

    @NonNull
    public final ImageView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final RelativeLayout D;

    @NonNull
    public final RecyclerView E;

    @NonNull
    public final RecyclerView F;
    public long G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ImageView f42913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f42914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final Button f42919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42920z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 18);
        sparseIntArray.put(R.id.collapsingToolbarLayout, 19);
        sparseIntArray.put(R.id.sortToolbar, 20);
        sparseIntArray.put(R.id.rl_title, 21);
        sparseIntArray.put(R.id.sortToolbar_title, 22);
        sparseIntArray.put(R.id.ll_top, 23);
        sparseIntArray.put(R.id.tv_name, 24);
        sparseIntArray.put(R.id.img_loading1, 25);
        sparseIntArray.put(R.id.refresh_layout, 26);
        sparseIntArray.put(R.id.header, 27);
        sparseIntArray.put(R.id.tv_empty, 28);
        sparseIntArray.put(R.id.img_loading, 29);
    }

    public FragmentChannelBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, H, I));
    }

    public FragmentChannelBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, (AppBarLayout) objArr[18], (RecyclerView) objArr[6], (RecyclerView) objArr[10], (CollapsingToolbarLayout) objArr[19], (WaterDropHeader) objArr[27], (ImageView) objArr[29], (ImageView) objArr[25], (LinearLayout) objArr[23], (SmartRefreshLayout) objArr[26], (RelativeLayout) objArr[21], (RecyclerView) objArr[7], (Toolbar) objArr[20], (TextView) objArr[22], (TextView) objArr[28], (TextView) objArr[24]);
        this.G = -1L;
        this.f42897c.setTag(null);
        this.f42898d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42912r = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f42913s = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.f42914t = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[12];
        this.f42915u = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[13];
        this.f42916v = relativeLayout3;
        relativeLayout3.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[14];
        this.f42917w = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[15];
        this.f42918x = relativeLayout4;
        relativeLayout4.setTag(null);
        Button button = (Button) objArr[16];
        this.f42919y = button;
        button.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[17];
        this.f42920z = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[2];
        this.A = relativeLayout6;
        relativeLayout6.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.B = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.C = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) objArr[5];
        this.D = relativeLayout7;
        relativeLayout7.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[8];
        this.E = recyclerView2;
        recyclerView2.setTag(null);
        RecyclerView recyclerView3 = (RecyclerView) objArr[9];
        this.F = recyclerView3;
        recyclerView3.setTag(null);
        this.f42906l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1024;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentChannelBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 32;
        }
        return true;
    }

    public final boolean g(ObservableList<q0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 512;
        }
        return true;
    }

    public final boolean h(ObservableList<p0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    public final boolean i(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.G = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        requestRebind();
    }

    public final boolean j(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 16;
        }
        return true;
    }

    public final boolean k(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 64;
        }
        return true;
    }

    public final boolean l(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 256;
        }
        return true;
    }

    public final boolean m(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 8;
        }
        return true;
    }

    public void n(@Nullable CHANNELVIEWMODEL channelviewmodel) {
        this.f42911q = channelviewmodel;
        synchronized (this) {
            this.G |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
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
                return m((ObservableField) obj, i11);
            case 4:
                return j((ObservableList) obj, i11);
            case 5:
                return f((ObservableList) obj, i11);
            case 6:
                return k((ObservableList) obj, i11);
            case 7:
                return h((ObservableList) obj, i11);
            case 8:
                return l((ObservableField) obj, i11);
            case 9:
                return g((ObservableList) obj, i11);
            case 10:
                return c((ObservableField) obj, i11);
            case 11:
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
        n((CHANNELVIEWMODEL) obj);
        return true;
    }
}
