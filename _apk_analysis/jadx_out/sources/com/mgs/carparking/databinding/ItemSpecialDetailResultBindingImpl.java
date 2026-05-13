package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
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
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.x2;
import pp.b;
import rp.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemSpecialDetailResultBindingImpl extends ItemSpecialDetailResultBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43721i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43722j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f43724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43726h;

    public ItemSpecialDetailResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43721i, f43722j));
    }

    public ItemSpecialDetailResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RoundedImageView) objArr[1], (TextView) objArr[4]);
        this.f43726h = -1L;
        this.f43718b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43723e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f43724f = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f43725g = textView;
        textView.setTag(null);
        this.f43719c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43726h |= 1;
        }
        return true;
    }

    public void c(@Nullable x2 x2Var) {
        this.f43720d = x2Var;
        synchronized (this) {
            this.f43726h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        String str;
        SpannableString spannableString;
        Drawable drawable;
        b bVar;
        String name;
        String vod_pic;
        RecommandVideosEntity recommandVideosEntity;
        int topType;
        synchronized (this) {
            j10 = this.f43726h;
            this.f43726h = 0L;
        }
        x2 x2Var = this.f43720d;
        String str2 = null;
        if ((j10 & 7) != 0) {
            long j11 = j10 & 6;
            if (j11 != 0) {
                if (x2Var != null) {
                    recommandVideosEntity = x2Var.f63430b;
                    drawable = x2Var.f63431c;
                    bVar = x2Var.f63433e;
                } else {
                    recommandVideosEntity = null;
                    drawable = null;
                    bVar = null;
                }
                if (recommandVideosEntity != null) {
                    name = recommandVideosEntity.getName();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    topType = recommandVideosEntity.getTopType();
                } else {
                    topType = 0;
                    name = null;
                    vod_pic = null;
                }
                boolean z10 = topType == 0;
                if (j11 != 0) {
                    j10 |= z10 ? 16L : 8L;
                }
                i10 = z10 ? 8 : 0;
            } else {
                i10 = 0;
                drawable = null;
                bVar = null;
                name = null;
                vod_pic = null;
            }
            ObservableField<SpannableString> observableField = x2Var != null ? x2Var.f63432d : null;
            updateRegistration(0, observableField);
            spannableString = observableField != null ? observableField.get() : null;
            str = name;
            str2 = vod_pic;
        } else {
            i10 = 0;
            str = null;
            spannableString = null;
            drawable = null;
            bVar = null;
        }
        if ((6 & j10) != 0) {
            a.a(this.f43718b, str2, R.drawable.ic_video_default);
            sp.a.b(this.f43723e, bVar, false);
            this.f43724f.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f43724f, drawable);
            TextViewBindingAdapter.setText(this.f43719c, str);
        }
        if ((j10 & 7) != 0) {
            TextViewBindingAdapter.setText(this.f43725g, spannableString);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43726h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43726h = 4L;
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
        c((x2) obj);
        return true;
    }
}
