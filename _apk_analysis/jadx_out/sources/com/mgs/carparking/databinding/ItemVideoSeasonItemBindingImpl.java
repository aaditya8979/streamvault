package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.SeriesInfoEntry;
import hc.a3;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemVideoSeasonItemBindingImpl extends ItemVideoSeasonItemBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43787e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43788f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43790d;

    public ItemVideoSeasonItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f43787e, f43788f));
    }

    public ItemVideoSeasonItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f43790d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f43789c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43790d |= 1;
        }
        return true;
    }

    public void c(@Nullable a3 a3Var) {
        this.f43786b = a3Var;
        synchronized (this) {
            this.f43790d |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        b bVar;
        String series;
        TextView textView;
        int i10;
        SeriesInfoEntry seriesInfoEntry;
        synchronized (this) {
            j10 = this.f43790d;
            this.f43790d = 0L;
        }
        a3 a3Var = this.f43786b;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if ((j10 & 6) != 0) {
                if (a3Var != null) {
                    seriesInfoEntry = a3Var.f63137b;
                    bVar = a3Var.f63139d;
                } else {
                    seriesInfoEntry = null;
                    bVar = null;
                }
                series = seriesInfoEntry != null ? seriesInfoEntry.getSeries() : null;
            } else {
                series = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = a3Var != null ? a3Var.f63138c : null;
            updateRegistration(0, observableField);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 16L : 8L;
            }
            if (zSafeUnbox) {
                textView = this.f43789c;
                i10 = R.color.color_commen;
            } else {
                textView = this.f43789c;
                i10 = R.color.theme_bg_color;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(textView, i10);
            str = series;
        } else {
            colorFromResource = 0;
            bVar = null;
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f43789c, str);
            a.b(this.f43789c, bVar, false);
        }
        if ((j10 & 7) != 0) {
            this.f43789c.setTextColor(colorFromResource);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43790d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43790d = 4L;
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
        c((a3) obj);
        return true;
    }
}
