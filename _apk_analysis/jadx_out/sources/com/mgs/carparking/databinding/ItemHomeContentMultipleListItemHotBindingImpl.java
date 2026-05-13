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
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import nc.q0;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentMultipleListItemHotBindingImpl extends ItemHomeContentMultipleListItemHotBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43292l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43293m = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f43295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f43296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f43299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43301k;

    public ItemHomeContentMultipleListItemHotBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f43292l, f43293m));
    }

    public ItemHomeContentMultipleListItemHotBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1]);
        this.f43301k = -1L;
        this.f43290b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43294d = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f43295e = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f43296f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43297g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f43298h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f43299i = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[7];
        this.f43300j = textView4;
        textView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43301k |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43301k |= 2;
        }
        return true;
    }

    public void d(@Nullable q0 q0Var) {
        this.f43291c = q0Var;
        synchronized (this) {
            this.f43301k |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeContentMultipleListItemHotBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43301k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43301k = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((q0) obj);
        return true;
    }
}
