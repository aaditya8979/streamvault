package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.OvalImageView;
import pc.l;

/* JADX INFO: loaded from: classes12.dex */
public class ItemHomeRecommendMultipleGusslikeBindingImpl extends ItemHomeRecommendMultipleGusslikeBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43449p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43450q = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final OvalImageView f43455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f43456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f43457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f43458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f43459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f43461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f43462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f43463o;

    public ItemHomeRecommendMultipleGusslikeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f43449p, f43450q));
    }

    public ItemHomeRecommendMultipleGusslikeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4);
        this.f43463o = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43451c = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f43452d = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f43453e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.f43454f = textView2;
        textView2.setTag(null);
        OvalImageView ovalImageView = (OvalImageView) objArr[2];
        this.f43455g = ovalImageView;
        ovalImageView.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f43456h = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.f43457i = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.f43458j = imageView3;
        imageView3.setTag(null);
        View view2 = (View) objArr[6];
        this.f43459k = view2;
        view2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.f43460l = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[8];
        this.f43461m = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[9];
        this.f43462n = textView5;
        textView5.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43463o |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43463o |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43463o |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43463o |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeRecommendMultipleGusslikeBindingImpl.executeBindings():void");
    }

    public void f(@Nullable l lVar) {
        this.f43448b = lVar;
        synchronized (this) {
            this.f43463o |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43463o != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43463o = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return d((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((l) obj);
        return true;
    }
}
