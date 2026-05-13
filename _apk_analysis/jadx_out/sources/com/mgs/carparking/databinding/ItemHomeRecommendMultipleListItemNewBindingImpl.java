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
import pc.c0;

/* JADX INFO: loaded from: classes9.dex */
public class ItemHomeRecommendMultipleListItemNewBindingImpl extends ItemHomeRecommendMultipleListItemNewBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43536o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43537p = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f43540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f43541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f43542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f43543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f43544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f43546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43547n;

    public ItemHomeRecommendMultipleListItemNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f43536o, f43537p));
    }

    public ItemHomeRecommendMultipleListItemNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[2], (RoundedImageView) objArr[1]);
        this.f43547n = -1L;
        this.f43533b.setTag(null);
        this.f43534c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43538e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f43539f = textView;
        textView.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f43540g = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f43541h = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f43542i = view2;
        view2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[6];
        this.f43543j = imageView2;
        imageView2.setTag(null);
        View view3 = (View) objArr[7];
        this.f43544k = view3;
        view3.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f43545l = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.f43546m = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43547n |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43547n |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43547n |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43547n |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[PHI: r2
      0x004c: PHI (r2v4 long) = (r2v0 long), (r2v13 long) binds: [B:9:0x0020, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemNewBindingImpl.executeBindings():void");
    }

    public void f(@Nullable c0 c0Var) {
        this.f43535d = c0Var;
        synchronized (this) {
            this.f43547n |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43547n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43547n = 32L;
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
        f((c0) obj);
        return true;
    }
}
