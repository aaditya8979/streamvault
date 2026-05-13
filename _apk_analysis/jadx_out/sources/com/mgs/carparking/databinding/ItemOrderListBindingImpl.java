package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import hc.d2;

/* JADX INFO: loaded from: classes11.dex */
public class ItemOrderListBindingImpl extends ItemOrderListBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43641i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43642j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43644h;

    public ItemOrderListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f43641i, f43642j));
    }

    public ItemOrderListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f43644h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f43643g = constraintLayout;
        constraintLayout.setTag(null);
        this.f43636b.setTag(null);
        this.f43637c.setTag(null);
        this.f43638d.setTag(null);
        this.f43639e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43644h |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43644h |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43644h |= 1;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43644h |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            long r2 = r1.f43644h     // Catch: java.lang.Throwable -> Lb8
            r4 = 0
            r1.f43644h = r4     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb8
            hc.d2 r0 = r1.f43640f
            r6 = 63
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 56
            r9 = 50
            r11 = 49
            r13 = 52
            if (r6 == 0) goto L88
            long r16 = r2 & r11
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            if (r0 == 0) goto L26
            androidx.databinding.ObservableField<java.lang.String> r6 = r0.f63177e
            goto L27
        L26:
            r6 = 0
        L27:
            r15 = 0
            r1.updateRegistration(r15, r6)
            if (r6 == 0) goto L34
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            goto L35
        L34:
            r6 = 0
        L35:
            long r17 = r2 & r9
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L4e
            if (r0 == 0) goto L40
            androidx.databinding.ObservableField<java.lang.String> r15 = r0.f63178f
            goto L41
        L40:
            r15 = 0
        L41:
            r11 = 1
            r1.updateRegistration(r11, r15)
            if (r15 == 0) goto L4e
            java.lang.Object r11 = r15.get()
            java.lang.String r11 = (java.lang.String) r11
            goto L4f
        L4e:
            r11 = 0
        L4f:
            long r19 = r2 & r13
            int r12 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r12 == 0) goto L68
            if (r0 == 0) goto L5a
            androidx.databinding.ObservableField<java.lang.String> r12 = r0.f63179g
            goto L5b
        L5a:
            r12 = 0
        L5b:
            r15 = 2
            r1.updateRegistration(r15, r12)
            if (r12 == 0) goto L68
            java.lang.Object r12 = r12.get()
            java.lang.String r12 = (java.lang.String) r12
            goto L69
        L68:
            r12 = 0
        L69:
            long r19 = r2 & r7
            int r15 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r15 == 0) goto L85
            if (r0 == 0) goto L74
            androidx.databinding.ObservableField<java.lang.String> r0 = r0.f63176d
            goto L75
        L74:
            r0 = 0
        L75:
            r15 = 3
            r1.updateRegistration(r15, r0)
            if (r0 == 0) goto L85
            java.lang.Object r0 = r0.get()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r0 = r15
            r15 = r12
            goto L8c
        L85:
            r15 = r12
            r0 = 0
            goto L8c
        L88:
            r0 = 0
            r6 = 0
            r11 = 0
            r15 = 0
        L8c:
            long r12 = r2 & r13
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L97
            android.widget.TextView r12 = r1.f43636b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r12, r15)
        L97:
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto La1
            android.widget.TextView r9 = r1.f43637c
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r11)
        La1:
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto Lab
            android.widget.TextView r7 = r1.f43638d
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r7, r0)
        Lab:
            r7 = 49
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb7
            android.widget.TextView r0 = r1.f43639e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        Lb7:
            return
        Lb8:
            r0 = move-exception
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemOrderListBindingImpl.executeBindings():void");
    }

    public void f(@Nullable d2 d2Var) {
        this.f43640f = d2Var;
        synchronized (this) {
            this.f43644h |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43644h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43644h = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((d2) obj);
        return true;
    }
}
