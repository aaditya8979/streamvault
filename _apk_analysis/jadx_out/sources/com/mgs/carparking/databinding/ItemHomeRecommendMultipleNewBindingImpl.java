package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.c0;
import pc.k0;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleNewBindingImpl extends ItemHomeRecommendMultipleNewBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43581i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43582j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43586h;

    public ItemHomeRecommendMultipleNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43581i, f43582j));
    }

    public ItemHomeRecommendMultipleNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f43586h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43583e = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.f43584f = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.f43585g = linearLayout3;
        linearLayout3.setTag(null);
        this.f43578b.setTag(null);
        this.f43579c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableList<c0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43586h |= 1;
        }
        return true;
    }

    public void c(@Nullable k0 k0Var) {
        this.f43580d = k0Var;
        synchronized (this) {
            this.f43586h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r23 = this;
            r1 = r23
            monitor-enter(r23)
            long r2 = r1.f43586h     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            r1.f43586h = r4     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lb1
            pc.k0 r0 = r1.f43580d
            r6 = 7
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 6
            r9 = 0
            r10 = 0
            if (r6 == 0) goto L5e
            if (r0 == 0) goto L1e
            androidx.databinding.ObservableList<pc.c0> r11 = r0.f77216e
            aq.c<pc.c0> r12 = r0.f77217f
            goto L20
        L1e:
            r11 = r9
            r12 = r11
        L20:
            r1.updateRegistration(r10, r11)
            long r13 = r2 & r7
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L56
            if (r0 == 0) goto L32
            com.mgs.carparking.netbean.HomeMultipleEntry r13 = r0.f77215d
            pp.b r14 = r0.f77219h
            pp.b r0 = r0.f77218g
            goto L35
        L32:
            r0 = r9
            r13 = r0
            r14 = r13
        L35:
            if (r13 == 0) goto L44
            int r9 = r13.is_more()
            int r15 = r13.is_change()
            java.lang.String r13 = r13.getModule_name()
            goto L47
        L44:
            r13 = r9
            r9 = r10
            r15 = r9
        L47:
            r10 = 1
            if (r9 != r10) goto L4c
            r9 = r10
            goto L4d
        L4c:
            r9 = 0
        L4d:
            if (r15 != r10) goto L50
            goto L51
        L50:
            r10 = 0
        L51:
            r18 = r11
            r17 = r12
            goto L67
        L56:
            r0 = r9
            r13 = r0
            r14 = r13
            r18 = r11
            r17 = r12
            goto L65
        L5e:
            r0 = r9
            r13 = r0
            r14 = r13
            r17 = r14
            r18 = r17
        L65:
            r9 = 0
            r10 = 0
        L67:
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L8e
            android.widget.LinearLayout r7 = r1.f43584f
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            sp.a.a(r7, r8)
            android.widget.LinearLayout r7 = r1.f43584f
            r8 = 0
            sp.a.b(r7, r0, r8)
            android.widget.LinearLayout r0 = r1.f43585g
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            sp.a.a(r0, r7)
            android.widget.LinearLayout r0 = r1.f43585g
            sp.a.b(r0, r14, r8)
            android.widget.TextView r0 = r1.f43579c
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r13)
        L8e:
            r7 = 4
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L9f
            androidx.recyclerview.widget.RecyclerView r0 = r1.f43578b
            r2 = 3
            me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a$e r2 = me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(r2)
            me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter.b(r0, r2)
        L9f:
            if (r6 == 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r0 = r1.f43578b
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r0
            me.tatarka.bindingcollectionadapter2.a.a(r16, r17, r18, r19, r20, r21, r22)
        Lb0:
            return
        Lb1:
            r0 = move-exception
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeRecommendMultipleNewBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43586h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43586h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b((ObservableList) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((k0) obj);
        return true;
    }
}
