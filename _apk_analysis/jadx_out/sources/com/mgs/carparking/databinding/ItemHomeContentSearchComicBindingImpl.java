package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
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
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import hc.k2;
import hc.u2;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHomeContentSearchComicBindingImpl extends ItemHomeContentSearchComicBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43359s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43360t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RTextView f43364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f43365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f43366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43367r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43360t = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 14);
    }

    public ItemHomeContentSearchComicBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f43359s, f43360t));
    }

    public ItemHomeContentSearchComicBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (RoundedImageView) objArr[2], (RelativeLayout) objArr[14], (TextView) objArr[11], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[8]);
        this.f43367r = -1L;
        this.f43349b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43361l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f43362m = linearLayout2;
        linearLayout2.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[13];
        this.f43363n = recyclerView;
        recyclerView.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f43364o = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f43365p = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.f43366q = textView;
        textView.setTag(null);
        this.f43351d.setTag(null);
        this.f43352e.setTag(null);
        this.f43353f.setTag(null);
        this.f43354g.setTag(null);
        this.f43355h.setTag(null);
        this.f43356i.setTag(null);
        this.f43357j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 64;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f A[PHI: r2
      0x012f: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:77:0x0101, B:91:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeContentSearchComicBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 512;
        }
        return true;
    }

    public final boolean g(ObservableList<u2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 128;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 256;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43367r != 0;
        }
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43367r = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 1;
        }
        return true;
    }

    public final boolean k(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43367r |= 2;
        }
        return true;
    }

    public void l(@Nullable k2 k2Var) {
        this.f43358k = k2Var;
        synchronized (this) {
            this.f43367r |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return j((ObservableField) obj, i11);
            case 1:
                return k((ObservableField) obj, i11);
            case 2:
                return b((ObservableField) obj, i11);
            case 3:
                return e((ObservableField) obj, i11);
            case 4:
                return c((ObservableField) obj, i11);
            case 5:
                return i((ObservableField) obj, i11);
            case 6:
                return d((ObservableField) obj, i11);
            case 7:
                return g((ObservableList) obj, i11);
            case 8:
                return h((ObservableField) obj, i11);
            case 9:
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
        l((k2) obj);
        return true;
    }
}
