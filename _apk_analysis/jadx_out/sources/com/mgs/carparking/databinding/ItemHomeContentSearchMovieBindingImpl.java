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
import com.ruffian.library.widget.RTextView;
import hc.m2;

/* JADX INFO: loaded from: classes4.dex */
public class ItemHomeContentSearchMovieBindingImpl extends ItemHomeContentSearchMovieBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43378s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43379t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RTextView f43382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f43383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final View f43384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f43385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43386r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43379t = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 14);
    }

    public ItemHomeContentSearchMovieBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f43378s, f43379t));
    }

    public ItemHomeContentSearchMovieBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (RoundedImageView) objArr[2], (RelativeLayout) objArr[14], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[13], (TextView) objArr[8], (TextView) objArr[9]);
        this.f43386r = -1L;
        this.f43368b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43380l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f43381m = linearLayout2;
        linearLayout2.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f43382n = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f43383o = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f43384p = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f43385q = textView;
        textView.setTag(null);
        this.f43370d.setTag(null);
        this.f43371e.setTag(null);
        this.f43372f.setTag(null);
        this.f43373g.setTag(null);
        this.f43374h.setTag(null);
        this.f43375i.setTag(null);
        this.f43376j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 32;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 128;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 16;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeContentSearchMovieBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 256;
        }
        return true;
    }

    public final boolean g(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 4;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43386r != 0;
        }
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43386r = 1024L;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43386r |= 2;
        }
        return true;
    }

    public void k(@Nullable m2 m2Var) {
        this.f43377k = m2Var;
        synchronized (this) {
            this.f43386r |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return i((ObservableField) obj, i11);
            case 1:
                return j((ObservableField) obj, i11);
            case 2:
                return g((ObservableField) obj, i11);
            case 3:
                return b((ObservableField) obj, i11);
            case 4:
                return e((ObservableField) obj, i11);
            case 5:
                return c((ObservableField) obj, i11);
            case 6:
                return h((ObservableField) obj, i11);
            case 7:
                return d((ObservableField) obj, i11);
            case 8:
                return f((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((m2) obj);
        return true;
    }
}
