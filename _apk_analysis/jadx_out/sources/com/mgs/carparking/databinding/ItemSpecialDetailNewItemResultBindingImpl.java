package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.w2;

/* JADX INFO: loaded from: classes9.dex */
public class ItemSpecialDetailNewItemResultBindingImpl extends ItemSpecialDetailNewItemResultBinding {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43706q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43707r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f43709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f43710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f43714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f43715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f43716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f43717p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43707r = sparseIntArray;
        sparseIntArray.put(R.id.rl_left, 12);
    }

    public ItemSpecialDetailNewItemResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f43706q, f43707r));
    }

    public ItemSpecialDetailNewItemResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (RoundedImageView) objArr[1], (RelativeLayout) objArr[12], (TextView) objArr[10], (TextView) objArr[11]);
        this.f43717p = -1L;
        this.f43701b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43708g = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f43709h = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f43710i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43711j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f43712k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f43713l = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[7];
        this.f43714m = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[8];
        this.f43715n = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[9];
        this.f43716o = textView6;
        textView6.setTag(null);
        this.f43703d.setTag(null);
        this.f43704e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 64;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemSpecialDetailNewItemResultBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 32;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 1;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43717p |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43717p != 0;
        }
    }

    public void i(@Nullable w2 w2Var) {
        this.f43705f = w2Var;
        synchronized (this) {
            this.f43717p |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43717p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g((ObservableField) obj, i11);
            case 1:
                return h((ObservableField) obj, i11);
            case 2:
                return e((ObservableField) obj, i11);
            case 3:
                return b((ObservableField) obj, i11);
            case 4:
                return d((ObservableField) obj, i11);
            case 5:
                return f((ObservableField) obj, i11);
            case 6:
                return c((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        i((w2) obj);
        return true;
    }
}
