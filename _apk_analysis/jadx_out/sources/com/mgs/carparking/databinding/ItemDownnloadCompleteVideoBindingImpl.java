package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.c1;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDownnloadCompleteVideoBindingImpl extends ItemDownnloadCompleteVideoBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43160l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43161m = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CheckBox f43163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f43167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InverseBindingListener f43168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43169k;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownnloadCompleteVideoBindingImpl.this.f43163e.isChecked();
            c1 c1Var = ItemDownnloadCompleteVideoBindingImpl.this.f43159c;
            if (c1Var != null) {
                ObservableField<Boolean> observableField = c1Var.f63149b;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownnloadCompleteVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f43160l, f43161m));
    }

    public ItemDownnloadCompleteVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (RelativeLayout) objArr[1]);
        this.f43168j = new a();
        this.f43169k = -1L;
        this.f43158b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43162d = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f43163e = checkBox;
        checkBox.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[3];
        this.f43164f = roundedImageView;
        roundedImageView.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43165g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f43166h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f43167i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43169k |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43169k |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43169k |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[PHI: r2
      0x004a: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:9:0x0020, B:25:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemDownnloadCompleteVideoBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43169k |= 4;
        }
        return true;
    }

    public final boolean g(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43169k |= 8;
        }
        return true;
    }

    public void h(@Nullable c1 c1Var) {
        this.f43159c = c1Var;
        synchronized (this) {
            this.f43169k |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43169k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43169k = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return f((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return g((ObservableBoolean) obj, i11);
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
        h((c1) obj);
        return true;
    }
}
