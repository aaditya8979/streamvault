package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hc.w2;

/* JADX INFO: loaded from: classes3.dex */
public class ActivitySpecialDetailNewBindingImpl extends ActivitySpecialDetailNewBinding {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42784r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42785s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f42787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Button f42790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f42793q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42785s = sparseIntArray;
        sparseIntArray.put(R.id.sortToolbar, 8);
        sparseIntArray.put(R.id.rl_title, 9);
        sparseIntArray.put(R.id.tv_empty, 10);
        sparseIntArray.put(R.id.img_loading1, 11);
        sparseIntArray.put(R.id.refresh_layout, 12);
        sparseIntArray.put(R.id.header, 13);
    }

    public ActivitySpecialDetailNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f42784r, f42785s));
    }

    public ActivitySpecialDetailNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (WaterDropHeader) objArr[13], (ImageView) objArr[11], (SmartRefreshLayout) objArr[12], (RelativeLayout) objArr[9], (Toolbar) objArr[8], (TextView) objArr[2], (TextView) objArr[10]);
        this.f42793q = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42786j = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f42787k = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[3];
        this.f42788l = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f42789m = relativeLayout3;
        relativeLayout3.setTag(null);
        Button button = (Button) objArr[5];
        this.f42790n = button;
        button.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[6];
        this.f42791o = relativeLayout4;
        relativeLayout4.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[7];
        this.f42792p = recyclerView;
        recyclerView.setTag(null);
        this.f42781g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42793q |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42793q |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42793q |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42793q |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivitySpecialDetailNewBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableList<w2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42793q |= 2;
        }
        return true;
    }

    public void g(@Nullable SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel) {
        this.f42783i = specialdetailnewviewmodel;
        synchronized (this) {
            this.f42793q |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42793q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42793q = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return f((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return e((ObservableField) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return d((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((SPECIALDETAILNEWVIEWMODEL) obj);
        return true;
    }
}
