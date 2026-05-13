package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.util.ScrollTextView;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentHomeBindingImpl extends FragmentHomeBinding {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42971u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42972v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f42973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final View f42974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final Button f42977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42978t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42972v = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 10);
        sparseIntArray.put(R.id.iv_home_search, 11);
        sparseIntArray.put(R.id.marqueeText, 12);
        sparseIntArray.put(R.id.tab_layout, 13);
        sparseIntArray.put(R.id.vp_content, 14);
        sparseIntArray.put(R.id.img_loading, 15);
        sparseIntArray.put(R.id.tv_empty, 16);
    }

    public FragmentHomeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, f42971u, f42972v));
    }

    public FragmentHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[15], (ImageView) objArr[3], (ImageView) objArr[11], (ImageView) objArr[4], (RelativeLayout) objArr[0], (ScrollTextView) objArr[12], (RelativeLayout) objArr[1], (RelativeLayout) objArr[10], (TabLayout) objArr[13], (TextView) objArr[16], (TextView) objArr[5], (SuperViewPager) objArr[14]);
        this.f42978t = -1L;
        this.f42959c.setTag(null);
        this.f42961e.setTag(null);
        this.f42962f.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f42973o = textView;
        textView.setTag(null);
        View view2 = (View) objArr[6];
        this.f42974p = view2;
        view2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[7];
        this.f42975q = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[8];
        this.f42976r = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[9];
        this.f42977s = button;
        button.setTag(null);
        this.f42964h.setTag(null);
        this.f42968l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42978t |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42978t |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42978t |= 2;
        }
        return true;
    }

    public void e(@Nullable HomePageViewModel homePageViewModel) {
        this.f42970n = homePageViewModel;
        synchronized (this) {
            this.f42978t |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentHomeBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42978t != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42978t = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((HomePageViewModel) obj);
        return true;
    }
}
