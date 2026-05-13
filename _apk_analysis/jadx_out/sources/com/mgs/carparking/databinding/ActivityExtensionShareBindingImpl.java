package com.mgs.carparking.databinding;

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
import androidx.lifecycle.LifecycleOwner;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.ruffian.library.widget.RConstraintLayout;
import com.ruffian.library.widget.RTextView;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityExtensionShareBindingImpl extends ActivityExtensionShareBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42623m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f42625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42626k;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        f42622l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{5}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42623m = sparseIntArray;
        sparseIntArray.put(R.id.cl_code, 6);
        sparseIntArray.put(R.id.ll_add, 7);
    }

    public ActivityExtensionShareBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f42622l, f42623m));
    }

    public ActivityExtensionShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[5], (RConstraintLayout) objArr[6], (ImageView) objArr[2], (LinearLayout) objArr[7], (TextView) objArr[1], (RTextView) objArr[4]);
        this.f42626k = -1L;
        setContainedBinding(this.f42615b);
        this.f42617d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42624i = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f42625j = textView;
        textView.setTag(null);
        this.f42619f.setTag(null);
        this.f42620g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42626k |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42626k |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42626k |= 1;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42626k |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
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
            long r2 = r1.f42626k     // Catch: java.lang.Throwable -> Lc5
            r4 = 0
            r1.f42626k = r4     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lc5
            com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL r0 = r1.f42621h
            r6 = 59
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 50
            r9 = 49
            r11 = 56
            r13 = 48
            r15 = 0
            r16 = 0
            if (r6 == 0) goto L85
            long r17 = r2 & r13
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            if (r0 == 0) goto L2b
            pp.b r6 = r0.f43982u
            com.mgs.carparking.ui.toolbar.ToolbarViewModel r13 = r0.f44970n
            goto L2e
        L2b:
            r6 = r16
            r13 = r6
        L2e:
            long r19 = r2 & r9
            int r14 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r14 == 0) goto L47
            if (r0 == 0) goto L39
            androidx.databinding.ObservableField<java.lang.String> r14 = r0.f43980s
            goto L3b
        L39:
            r14 = r16
        L3b:
            r1.updateRegistration(r15, r14)
            if (r14 == 0) goto L47
            java.lang.Object r14 = r14.get()
            java.lang.String r14 = (java.lang.String) r14
            goto L49
        L47:
            r14 = r16
        L49:
            long r19 = r2 & r7
            int r19 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r19 == 0) goto L63
            if (r0 == 0) goto L54
            androidx.databinding.ObservableField<java.lang.String> r9 = r0.f43979r
            goto L56
        L54:
            r9 = r16
        L56:
            r10 = 1
            r1.updateRegistration(r10, r9)
            if (r9 == 0) goto L63
            java.lang.Object r9 = r9.get()
            java.lang.String r9 = (java.lang.String) r9
            goto L65
        L63:
            r9 = r16
        L65:
            long r21 = r2 & r11
            int r10 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r10 == 0) goto L80
            if (r0 == 0) goto L70
            androidx.databinding.ObservableField<java.lang.String> r0 = r0.f43978q
            goto L72
        L70:
            r0 = r16
        L72:
            r10 = 3
            r1.updateRegistration(r10, r0)
            if (r0 == 0) goto L80
            java.lang.Object r0 = r0.get()
            r16 = r0
            java.lang.String r16 = (java.lang.String) r16
        L80:
            r0 = r16
            r16 = 48
            goto L8d
        L85:
            r0 = r16
            r6 = r0
            r9 = r6
            r16 = r13
            r13 = r9
            r14 = r13
        L8d:
            long r16 = r2 & r16
            int r10 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r10 == 0) goto L9d
            com.mgs.carparking.databinding.ActionbarBackBinding r10 = r1.f42615b
            r10.b(r13)
            com.ruffian.library.widget.RTextView r10 = r1.f42620g
            sp.a.b(r10, r6, r15)
        L9d:
            long r10 = r2 & r11
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto La8
            android.widget.ImageView r6 = r1.f42617d
            rp.a.a(r6, r0, r15)
        La8:
            long r6 = r2 & r7
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb3
            android.widget.TextView r0 = r1.f42625j
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r9)
        Lb3:
            r6 = 49
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lbf
            android.widget.TextView r0 = r1.f42619f
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
        Lbf:
            com.mgs.carparking.databinding.ActionbarBackBinding r0 = r1.f42615b
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        Lc5:
            r0 = move-exception
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityExtensionShareBindingImpl.executeBindings():void");
    }

    public void f(@Nullable EXTENSIONSHAREVIEWMODEL extensionshareviewmodel) {
        this.f42621h = extensionshareviewmodel;
        synchronized (this) {
            this.f42626k |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f42626k != 0) {
                return true;
            }
            return this.f42615b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42626k = 32L;
        }
        this.f42615b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return e((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f42615b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((EXTENSIONSHAREVIEWMODEL) obj);
        return true;
    }
}
