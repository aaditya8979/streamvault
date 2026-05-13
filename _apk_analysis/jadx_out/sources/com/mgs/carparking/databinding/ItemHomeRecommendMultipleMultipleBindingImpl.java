package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import pc.a0;
import pc.g0;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleMultipleBindingImpl extends ItemHomeRecommendMultipleMultipleBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43567n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43568o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f43573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43577m;

    public ItemHomeRecommendMultipleMultipleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f43567n, f43568o));
    }

    public ItemHomeRecommendMultipleMultipleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (RecyclerView) objArr[9], (TextView) objArr[2]);
        this.f43577m = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43569e = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f43570f = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[3];
        this.f43571g = relativeLayout2;
        relativeLayout2.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[4];
        this.f43572h = roundedImageView;
        roundedImageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f43573i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f43574j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f43575k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f43576l = textView3;
        textView3.setTag(null);
        this.f43564b.setTag(null);
        this.f43565c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 32;
        }
        return true;
    }

    public final boolean c(ObservableList<a0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 1;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeRecommendMultipleMultipleBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 16;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43577m |= 2;
        }
        return true;
    }

    public void h(@Nullable g0 g0Var) {
        this.f43566d = g0Var;
        synchronized (this) {
            this.f43577m |= 64;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43577m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43577m = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return g((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableList) obj, i11);
        }
        if (i10 == 3) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return f((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        h((g0) obj);
        return true;
    }
}
