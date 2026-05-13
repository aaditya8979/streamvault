package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import nc.e0;
import pp.b;
import rp.a;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHomeContentListBindingImpl extends ItemHomeContentListBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43235h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43236i = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43240g;

    public ItemHomeContentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f43235h, f43236i));
    }

    public ItemHomeContentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundedImageView) objArr[1]);
        this.f43240g = -1L;
        this.f43233b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43237d = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f43238e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f43239f = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void b(@Nullable e0 e0Var) {
        this.f43234c = e0Var;
        synchronized (this) {
            this.f43240g |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String name;
        b bVar;
        String str;
        RecommandVideosEntity recommandVideosEntity;
        synchronized (this) {
            j10 = this.f43240g;
            this.f43240g = 0L;
        }
        e0 e0Var = this.f43234c;
        long j11 = j10 & 3;
        String str2 = null;
        if (j11 != 0) {
            if (e0Var != null) {
                recommandVideosEntity = e0Var.f75762b;
                bVar = e0Var.f75763c;
            } else {
                recommandVideosEntity = null;
                bVar = null;
            }
            if (recommandVideosEntity != null) {
                String videoDesc = recommandVideosEntity.getVideoDesc();
                String vod_pic = recommandVideosEntity.getVod_pic();
                name = recommandVideosEntity.getName();
                str = videoDesc;
                str2 = vod_pic;
            } else {
                name = null;
                str = null;
            }
        } else {
            name = null;
            bVar = null;
            str = null;
        }
        if (j11 != 0) {
            a.a(this.f43233b, str2, R.drawable.ic_video_default);
            sp.a.b(this.f43237d, bVar, false);
            TextViewBindingAdapter.setText(this.f43238e, name);
            TextViewBindingAdapter.setText(this.f43239f, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43240g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43240g = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((e0) obj);
        return true;
    }
}
