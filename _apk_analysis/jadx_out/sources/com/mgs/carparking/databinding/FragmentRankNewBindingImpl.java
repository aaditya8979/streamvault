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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.ranklist.RankNumberNewViewModel;

/* JADX INFO: loaded from: classes7.dex */
public class FragmentRankNewBindingImpl extends FragmentRankNewBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43089o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43090p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Button f43093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43095n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43090p = sparseIntArray;
        sparseIntArray.put(R.id.view_top, 4);
        sparseIntArray.put(R.id.tab_layout, 5);
        sparseIntArray.put(R.id.tabLine, 6);
        sparseIntArray.put(R.id.mRv, 7);
        sparseIntArray.put(R.id.vp_content, 8);
        sparseIntArray.put(R.id.tv_empty, 9);
        sparseIntArray.put(R.id.img_loading, 10);
    }

    public FragmentRankNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f43089o, f43090p));
    }

    public FragmentRankNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[10], (RecyclerView) objArr[7], (TabLayout) objArr[5], (View) objArr[6], (TextView) objArr[9], (View) objArr[4], (ViewPager) objArr[8]);
        this.f43095n = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43091j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[1];
        this.f43092k = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[2];
        this.f43093l = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[3];
        this.f43094m = relativeLayout3;
        relativeLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43095n |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43095n |= 1;
        }
        return true;
    }

    public void d(@Nullable RankNumberNewViewModel rankNumberNewViewModel) {
        this.f43088i = rankNumberNewViewModel;
        synchronized (this) {
            this.f43095n |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.f43095n     // Catch: java.lang.Throwable -> L81
            r4 = 0
            r1.f43095n = r4     // Catch: java.lang.Throwable -> L81
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L81
            com.mgs.carparking.ui.ranklist.RankNumberNewViewModel r0 = r1.f43088i
            r6 = 15
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 0
            r8 = 14
            r10 = 12
            r12 = 13
            if (r6 == 0) goto L5f
            long r15 = r2 & r12
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L32
            if (r0 == 0) goto L25
            androidx.databinding.ObservableField<java.lang.Boolean> r6 = r0.f44943i
            goto L26
        L25:
            r6 = 0
        L26:
            r1.updateRegistration(r7, r6)
            if (r6 == 0) goto L32
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L33
        L32:
            r6 = 0
        L33:
            long r15 = r2 & r8
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L4c
            if (r0 == 0) goto L3e
            androidx.databinding.ObservableField<java.lang.Boolean> r15 = r0.f44942h
            goto L3f
        L3e:
            r15 = 0
        L3f:
            r14 = 1
            r1.updateRegistration(r14, r15)
            if (r15 == 0) goto L4c
            java.lang.Object r14 = r15.get()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            goto L4d
        L4c:
            r14 = 0
        L4d:
            long r17 = r2 & r10
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L58
            if (r0 == 0) goto L58
            pp.b r0 = r0.f44946l
            goto L59
        L58:
            r0 = 0
        L59:
            r19 = r14
            r14 = r6
            r6 = r19
            goto L62
        L5f:
            r0 = 0
            r6 = 0
            r14 = 0
        L62:
            long r12 = r12 & r2
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L6c
            android.widget.RelativeLayout r12 = r1.f43092k
            sp.a.a(r12, r14)
        L6c:
            long r10 = r10 & r2
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto L76
            android.widget.Button r10 = r1.f43093l
            sp.a.b(r10, r0, r7)
        L76:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L80
            android.widget.RelativeLayout r0 = r1.f43094m
            sp.a.a(r0, r6)
        L80:
            return
        L81:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L81
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentRankNewBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43095n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43095n = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((RankNumberNewViewModel) obj);
        return true;
    }
}
