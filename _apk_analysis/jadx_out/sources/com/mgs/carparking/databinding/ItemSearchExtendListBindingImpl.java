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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import hc.f2;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemSearchExtendListBindingImpl extends ItemSearchExtendListBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43690g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43691h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43694f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43691h = sparseIntArray;
        sparseIntArray.put(R.id.iv_search, 2);
    }

    public ItemSearchExtendListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f43690g, f43691h));
    }

    public ItemSearchExtendListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[2]);
        this.f43694f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43692d = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f43693e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43694f |= 1;
        }
        return true;
    }

    public void c(@Nullable f2 f2Var) {
        this.f43689c = f2Var;
        synchronized (this) {
            this.f43694f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        SpannableString spannableString;
        synchronized (this) {
            j10 = this.f43694f;
            this.f43694f = 0L;
        }
        f2 f2Var = this.f43689c;
        long j11 = 7 & j10;
        b bVar = null;
        if (j11 != 0) {
            b bVar2 = ((j10 & 6) == 0 || f2Var == null) ? null : f2Var.f63202d;
            ObservableField<SpannableString> observableField = f2Var != null ? f2Var.f63201c : null;
            updateRegistration(0, observableField);
            spannableString = observableField != null ? observableField.get() : null;
            bVar = bVar2;
        } else {
            spannableString = null;
        }
        if ((j10 & 6) != 0) {
            a.b(this.f43692d, bVar, false);
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f43693e, spannableString);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43694f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43694f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((f2) obj);
        return true;
    }
}
