package com.mgs.carparking.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoTypeCategoryEntry;
import hc.q0;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChannnelFilterBindingImpl extends ItemChannnelFilterBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43114f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43115g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43118e;

    public ItemChannnelFilterBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f43114f, f43115g));
    }

    public ItemChannnelFilterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f43118e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43116c = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f43117d = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43118e |= 1;
        }
        return true;
    }

    public void c(@Nullable q0 q0Var) {
        this.f43113b = q0Var;
        synchronized (this) {
            this.f43118e |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        String typeName;
        b bVar;
        Context context;
        int i10;
        long j11;
        long j12;
        VideoTypeCategoryEntry videoTypeCategoryEntry;
        synchronized (this) {
            j10 = this.f43118e;
            this.f43118e = 0L;
        }
        q0 q0Var = this.f43113b;
        long j13 = j10 & 7;
        Drawable drawable = null;
        if (j13 != 0) {
            if ((j10 & 6) != 0) {
                if (q0Var != null) {
                    videoTypeCategoryEntry = q0Var.f63330b;
                    bVar = q0Var.f63332d;
                } else {
                    videoTypeCategoryEntry = null;
                    bVar = null;
                }
                typeName = videoTypeCategoryEntry != null ? videoTypeCategoryEntry.getTypeName() : null;
            } else {
                typeName = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = q0Var != null ? q0Var.f63331c : null;
            updateRegistration(0, observableField);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j13 != 0) {
                if (zSafeUnbox) {
                    j11 = j10 | 16;
                    j12 = 64;
                } else {
                    j11 = j10 | 8;
                    j12 = 32;
                }
                j10 = j11 | j12;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f43117d, zSafeUnbox ? R.color.white : R.color.color_999999);
            if (zSafeUnbox) {
                context = this.f43117d.getContext();
                i10 = R.drawable.bg_channel_filter_type_selector;
            } else {
                context = this.f43117d.getContext();
                i10 = R.drawable.bg_channel_filter_type_normal;
            }
            drawable = AppCompatResources.getDrawable(context, i10);
        } else {
            colorFromResource = 0;
            typeName = null;
            bVar = null;
        }
        if ((7 & j10) != 0) {
            this.f43117d.setTextColor(colorFromResource);
            ViewBindingAdapter.setBackground(this.f43117d, drawable);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f43117d, typeName);
            a.b(this.f43117d, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43118e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43118e = 4L;
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
        c((q0) obj);
        return true;
    }
}
