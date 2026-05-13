package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
import com.mgs.carparking.model.MAINVIEWMODEL;
import com.mgs.carparking.widgets.tab.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityMainBindingImpl extends ActivityMainBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42691l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42692m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f42696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f42697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42698k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42692m = sparseIntArray;
        sparseIntArray.put(R.id.mFragmentContainerLayout, 6);
        sparseIntArray.put(R.id.mTabLayout, 7);
    }

    public ActivityMainBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f42691l, f42692m));
    }

    public ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[2], (FrameLayout) objArr[6], (TabLayout) objArr[7]);
        this.f42698k = -1L;
        this.f42687b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42693f = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f42694g = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f42695h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f42696i = textView2;
        textView2.setTag(null);
        View view2 = (View) objArr[5];
        this.f42697j = view2;
        view2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42698k |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42698k |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42698k |= 1;
        }
        return true;
    }

    public void e(@Nullable MAINVIEWMODEL mainviewmodel) {
        this.f42690e = mainviewmodel;
        synchronized (this) {
            this.f42698k |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
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
            long r2 = r1.f42698k     // Catch: java.lang.Throwable -> Lbf
            r4 = 0
            r1.f42698k = r4     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lbf
            com.mgs.carparking.model.MAINVIEWMODEL r0 = r1.f42690e
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 24
            r15 = 0
            r16 = 0
            if (r6 == 0) goto L85
            long r17 = r2 & r13
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            if (r0 == 0) goto L2b
            pp.b r6 = r0.f44083n
            pp.b r13 = r0.f44084o
            goto L2e
        L2b:
            r6 = r16
            r13 = r6
        L2e:
            long r19 = r2 & r11
            int r14 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r14 == 0) goto L47
            if (r0 == 0) goto L39
            androidx.databinding.ObservableField<java.lang.Boolean> r14 = r0.f44077h
            goto L3b
        L39:
            r14 = r16
        L3b:
            r1.updateRegistration(r15, r14)
            if (r14 == 0) goto L47
            java.lang.Object r14 = r14.get()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            goto L49
        L47:
            r14 = r16
        L49:
            long r19 = r2 & r9
            int r19 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r19 == 0) goto L63
            if (r0 == 0) goto L54
            androidx.databinding.ObservableField<java.lang.String> r9 = r0.f44076g
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
            long r21 = r2 & r7
            int r10 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r10 == 0) goto L80
            if (r0 == 0) goto L70
            androidx.databinding.ObservableField<java.lang.Boolean> r0 = r0.f44078i
            goto L72
        L70:
            r0 = r16
        L72:
            r10 = 2
            r1.updateRegistration(r10, r0)
            if (r0 == 0) goto L80
            java.lang.Object r0 = r0.get()
            r16 = r0
            java.lang.Boolean r16 = (java.lang.Boolean) r16
        L80:
            r0 = r16
            r16 = 24
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
            android.widget.ImageView r10 = r1.f42687b
            sp.a.b(r10, r6, r15)
            android.widget.TextView r6 = r1.f42696i
            sp.a.b(r6, r13, r15)
        L9d:
            long r10 = r2 & r11
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto La8
            android.widget.LinearLayout r6 = r1.f42694g
            sp.a.a(r6, r14)
        La8:
            r10 = 26
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto Lb4
            android.widget.TextView r6 = r1.f42695h
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r6, r9)
        Lb4:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Lbe
            android.view.View r2 = r1.f42697j
            sp.a.a(r2, r0)
        Lbe:
            return
        Lbf:
            r0 = move-exception
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lbf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityMainBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42698k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42698k = 16L;
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
        e((MAINVIEWMODEL) obj);
        return true;
    }
}
