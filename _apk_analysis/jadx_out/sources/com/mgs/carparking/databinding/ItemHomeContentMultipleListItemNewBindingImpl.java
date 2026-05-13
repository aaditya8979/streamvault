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
import com.ruffian.library.widget.RTextView;
import nc.s0;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentMultipleListItemNewBindingImpl extends ItemHomeContentMultipleListItemNewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43305n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43306o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f43308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f43309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f43310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f43311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43315m;

    public ItemHomeContentMultipleListItemNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f43305n, f43306o));
    }

    public ItemHomeContentMultipleListItemNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[3], (RoundedImageView) objArr[1]);
        this.f43315m = -1L;
        this.f43302b.setTag(null);
        this.f43303c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43307e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f43308f = imageView;
        imageView.setTag(null);
        RTextView rTextView = (RTextView) objArr[4];
        this.f43309g = rTextView;
        rTextView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.f43310h = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[6];
        this.f43311i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f43312j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f43313k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.f43314l = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43315m |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43315m |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43315m |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43315m |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[PHI: r2
      0x004c: PHI (r2v4 long) = (r2v0 long), (r2v14 long) binds: [B:9:0x0020, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeContentMultipleListItemNewBindingImpl.executeBindings():void");
    }

    public void f(@Nullable s0 s0Var) {
        this.f43304d = s0Var;
        synchronized (this) {
            this.f43315m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43315m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43315m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableField) obj, i11);
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
        f((s0) obj);
        return true;
    }
}
