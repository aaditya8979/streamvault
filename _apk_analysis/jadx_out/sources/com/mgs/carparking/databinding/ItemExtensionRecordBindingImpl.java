package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.CircularImageView;
import hc.l1;

/* JADX INFO: loaded from: classes10.dex */
public class ItemExtensionRecordBindingImpl extends ItemExtensionRecordBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43188h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43189i = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43193g;

    public ItemExtensionRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f43188h, f43189i));
    }

    public ItemExtensionRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (CircularImageView) objArr[1]);
        this.f43193g = -1L;
        this.f43186b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43190d = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f43191e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f43192f = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43193g |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43193g |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43193g |= 1;
        }
        return true;
    }

    public void e(@Nullable l1 l1Var) {
        this.f43187c = l1Var;
        synchronized (this) {
            this.f43193g |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.f43193g     // Catch: java.lang.Throwable -> L8c
            r4 = 0
            r1.f43193g = r4     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8c
            hc.l1 r0 = r1.f43187c
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 26
            r9 = 25
            r11 = 28
            r13 = 0
            if (r6 == 0) goto L68
            long r14 = r2 & r9
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            if (r0 == 0) goto L25
            androidx.databinding.ObservableField<java.lang.String> r6 = r0.f63260d
            goto L26
        L25:
            r6 = r13
        L26:
            r14 = 0
            r1.updateRegistration(r14, r6)
            if (r6 == 0) goto L33
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            goto L34
        L33:
            r6 = r13
        L34:
            long r14 = r2 & r7
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L4d
            if (r0 == 0) goto L3f
            androidx.databinding.ObservableField<java.lang.String> r14 = r0.f63261e
            goto L40
        L3f:
            r14 = r13
        L40:
            r15 = 1
            r1.updateRegistration(r15, r14)
            if (r14 == 0) goto L4d
            java.lang.Object r14 = r14.get()
            java.lang.String r14 = (java.lang.String) r14
            goto L4e
        L4d:
            r14 = r13
        L4e:
            long r15 = r2 & r11
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L6a
            if (r0 == 0) goto L59
            androidx.databinding.ObservableField<java.lang.String> r0 = r0.f63259c
            goto L5a
        L59:
            r0 = r13
        L5a:
            r15 = 2
            r1.updateRegistration(r15, r0)
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r0.get()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            goto L6a
        L68:
            r6 = r13
            r14 = r6
        L6a:
            long r11 = r11 & r2
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L77
            com.mgs.carparking.widgets.CircularImageView r0 = r1.f43186b
            r11 = 2131231324(0x7f08025c, float:1.8078726E38)
            rp.a.a(r0, r13, r11)
        L77:
            long r9 = r9 & r2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L81
            android.widget.TextView r0 = r1.f43191e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L81:
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8b
            android.widget.TextView r0 = r1.f43192f
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
        L8b:
            return
        L8c:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemExtensionRecordBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43193g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43193g = 16L;
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
        if (i10 != 2) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((l1) obj);
        return true;
    }
}
