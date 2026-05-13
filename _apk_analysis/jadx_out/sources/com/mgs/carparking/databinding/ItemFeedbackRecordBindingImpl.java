package com.mgs.carparking.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.CircularImageView;
import hc.o1;

/* JADX INFO: loaded from: classes12.dex */
public class ItemFeedbackRecordBindingImpl extends ItemFeedbackRecordBinding {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43197m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43198n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f43200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CircularImageView f43202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f43203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f43206l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43198n = sparseIntArray;
        sparseIntArray.put(R.id.iv_right, 7);
        sparseIntArray.put(R.id.iv_left, 8);
    }

    public ItemFeedbackRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f43197m, f43198n));
    }

    public ItemFeedbackRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[8], (ImageView) objArr[7]);
        this.f43206l = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43199e = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.f43200f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f43201g = textView;
        textView.setTag(null);
        CircularImageView circularImageView = (CircularImageView) objArr[3];
        this.f43202h = circularImageView;
        circularImageView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f43203i = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.f43204j = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f43205k = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43206l |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43206l |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43206l |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43206l |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemFeedbackRecordBindingImpl.executeBindings():void");
    }

    public void f(@Nullable o1 o1Var) {
        this.f43196d = o1Var;
        synchronized (this) {
            this.f43206l |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43206l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43206l = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((o1) obj);
        return true;
    }
}
