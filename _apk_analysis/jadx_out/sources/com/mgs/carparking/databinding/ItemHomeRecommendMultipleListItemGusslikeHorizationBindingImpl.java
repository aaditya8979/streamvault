package com.mgs.carparking.databinding;

import android.text.SpannableString;
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
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import pc.y;

/* JADX INFO: loaded from: classes12.dex */
public class ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl extends ItemHomeRecommendMultipleListItemGusslikeHorizationBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43499n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43500o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f43502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f43504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f43505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f43508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43509m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43500o = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 9);
    }

    public ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f43499n, f43500o));
    }

    public ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (RoundedImageView) objArr[3], (RelativeLayout) objArr[9]);
        this.f43509m = -1L;
        this.f43496b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43501e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f43502f = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.f43503g = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.f43504h = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[5];
        this.f43505i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f43506j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f43507k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f43508l = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43509m |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43509m |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43509m |= 4;
        }
        return true;
    }

    public void e(@Nullable y yVar) {
        this.f43498d = yVar;
        synchronized (this) {
            this.f43509m |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43509m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43509m = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return d((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((y) obj);
        return true;
    }
}
