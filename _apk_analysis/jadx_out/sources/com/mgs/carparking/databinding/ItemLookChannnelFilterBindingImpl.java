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
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import hc.a2;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLookChannnelFilterBindingImpl extends ItemLookChannnelFilterBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43603f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43604g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43607e;

    public ItemLookChannnelFilterBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f43603f, f43604g));
    }

    public ItemLookChannnelFilterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f43607e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43605c = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f43606d = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43607e |= 1;
        }
        return true;
    }

    public void c(@Nullable a2 a2Var) {
        this.f43602b = a2Var;
        synchronized (this) {
            this.f43607e |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        String name;
        b bVar;
        Context context;
        int i10;
        long j11;
        long j12;
        ChannnelFilterEntry channnelFilterEntry;
        synchronized (this) {
            j10 = this.f43607e;
            this.f43607e = 0L;
        }
        a2 a2Var = this.f43602b;
        long j13 = j10 & 7;
        Drawable drawable = null;
        if (j13 != 0) {
            if ((j10 & 6) != 0) {
                if (a2Var != null) {
                    channnelFilterEntry = a2Var.f63133b;
                    bVar = a2Var.f63136e;
                } else {
                    channnelFilterEntry = null;
                    bVar = null;
                }
                name = channnelFilterEntry != null ? channnelFilterEntry.getName() : null;
            } else {
                name = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = a2Var != null ? a2Var.f63135d : null;
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
            colorFromResource = ViewDataBinding.getColorFromResource(this.f43606d, zSafeUnbox ? R.color.color_text_light_5 : R.color.color_999999);
            if (zSafeUnbox) {
                context = this.f43606d.getContext();
                i10 = R.drawable.bg_channel_filter_type_selector;
            } else {
                context = this.f43606d.getContext();
                i10 = R.drawable.bg_channel_filter_type_normal;
            }
            drawable = AppCompatResources.getDrawable(context, i10);
        } else {
            colorFromResource = 0;
            name = null;
            bVar = null;
        }
        if ((7 & j10) != 0) {
            this.f43606d.setTextColor(colorFromResource);
            ViewBindingAdapter.setBackground(this.f43606d, drawable);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f43606d, name);
            a.b(this.f43606d, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43607e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43607e = 4L;
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
        c((a2) obj);
        return true;
    }
}
