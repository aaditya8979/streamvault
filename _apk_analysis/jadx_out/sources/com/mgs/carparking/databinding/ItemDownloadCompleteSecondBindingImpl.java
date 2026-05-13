package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
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
import hc.f1;

/* JADX INFO: loaded from: classes10.dex */
public class ItemDownloadCompleteSecondBindingImpl extends ItemDownloadCompleteSecondBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43149k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43150l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f43152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InverseBindingListener f43155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f43156j;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownloadCompleteSecondBindingImpl.this.f43152f.isChecked();
            f1 f1Var = ItemDownloadCompleteSecondBindingImpl.this.f43148d;
            if (f1Var != null) {
                ObservableField<Boolean> observableField = f1Var.f63197f;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownloadCompleteSecondBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f43149k, f43150l));
    }

    public ItemDownloadCompleteSecondBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (RelativeLayout) objArr[1], (RoundedImageView) objArr[3]);
        this.f43155i = new a();
        this.f43156j = -1L;
        this.f43146b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43151e = relativeLayout;
        relativeLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f43152f = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43153g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f43154h = textView2;
        textView2.setTag(null);
        this.f43147c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43156j |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43156j |= 2;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43156j |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[PHI: r2
      0x0049: PHI (r2v5 long) = (r2v0 long), (r2v7 long) binds: [B:9:0x001e, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemDownloadCompleteSecondBindingImpl.executeBindings():void");
    }

    public void f(@Nullable f1 f1Var) {
        this.f43148d = f1Var;
        synchronized (this) {
            this.f43156j |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43156j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43156j = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return e((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((f1) obj);
        return true;
    }
}
