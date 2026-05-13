package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.MaxLayout;
import hc.f2;
import hc.h2;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitySearchVideoBindingImpl extends ActivitySearchVideoBinding {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42737u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42738v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f42740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f42742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InverseBindingListener f42749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42750t;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivitySearchVideoBindingImpl.this.f42730b);
            SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = ActivitySearchVideoBindingImpl.this.f42736h;
            if (searchcontentvideoviewmodel != null) {
                ObservableField<String> observableField = searchcontentvideoviewmodel.f44129h;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42738v = sparseIntArray;
        sparseIntArray.put(R.id.tab_layout, 13);
        sparseIntArray.put(R.id.vp_content, 14);
        sparseIntArray.put(R.id.layout_adView, 15);
    }

    public ActivitySearchVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f42737u, f42738v));
    }

    public ActivitySearchVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (ClearableEditText) objArr[1], (FlowLayout2) objArr[11], (MaxLayout) objArr[15], (LinearLayout) objArr[3], (TabLayout) objArr[13], (ViewPager) objArr[14]);
        this.f42749s = new a();
        this.f42750t = -1L;
        this.f42730b.setTag(null);
        this.f42731c.setTag(null);
        this.f42733e.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f42739i = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[10];
        this.f42740j = imageView;
        imageView.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[12];
        this.f42741k = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f42742l = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.f42743m = linearLayout2;
        linearLayout2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.f42744n = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[6];
        this.f42745o = relativeLayout2;
        relativeLayout2.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[7];
        this.f42746p = recyclerView2;
        recyclerView2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[8];
        this.f42747q = linearLayout3;
        linearLayout3.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[9];
        this.f42748r = relativeLayout3;
        relativeLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 16;
        }
        return true;
    }

    public final boolean c(ObservableList<h2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 2;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 128;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r2
      0x004b: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0027, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5 A[PHI: r2
      0x00a5: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:43:0x007f, B:56:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivitySearchVideoBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 256;
        }
        return true;
    }

    public final boolean g(ObservableList<f2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 512;
        }
        return true;
    }

    public final boolean h(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42750t != 0;
        }
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42750t = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 64;
        }
        return true;
    }

    public final boolean k(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42750t |= 1;
        }
        return true;
    }

    public void l(@Nullable SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel) {
        this.f42736h = searchcontentvideoviewmodel;
        synchronized (this) {
            this.f42750t |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return k((ObservableBoolean) obj, i11);
            case 1:
                return d((ObservableField) obj, i11);
            case 2:
                return c((ObservableList) obj, i11);
            case 3:
                return h((ObservableBoolean) obj, i11);
            case 4:
                return b((ObservableField) obj, i11);
            case 5:
                return i((ObservableField) obj, i11);
            case 6:
                return j((ObservableField) obj, i11);
            case 7:
                return e((ObservableBoolean) obj, i11);
            case 8:
                return f((ObservableField) obj, i11);
            case 9:
                return g((ObservableList) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        l((SEARCHCONTENTVIDEOVIEWMODEL) obj);
        return true;
    }
}
