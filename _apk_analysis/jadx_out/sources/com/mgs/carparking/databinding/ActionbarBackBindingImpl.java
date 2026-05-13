package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;

/* JADX INFO: loaded from: classes4.dex */
public class ActionbarBackBindingImpl extends ActionbarBackBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42541l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42542m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42543k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42542m = sparseIntArray;
        sparseIntArray.put(R.id.iv_actionbar_back, 7);
    }

    public ActionbarBackBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f42541l, f42542m));
    }

    public ActionbarBackBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ImageView) objArr[7], (ImageView) objArr[6], (RelativeLayout) objArr[0], (LinearLayout) objArr[1], (RelativeLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3]);
        this.f42543k = -1L;
        this.f42533c.setTag(null);
        this.f42534d.setTag(null);
        this.f42535e.setTag(null);
        this.f42536f.setTag(null);
        this.f42537g.setTag(null);
        this.f42538h.setTag(null);
        this.f42539i.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.ActionbarBackBinding
    public void b(@Nullable ToolbarViewModel toolbarViewModel) {
        this.f42540j = toolbarViewModel;
        synchronized (this) {
            this.f42543k |= 64;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    public final boolean c(ObservableField<Drawable> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064 A[PHI: r2
      0x0064: PHI (r2v3 long) = (r2v0 long), (r2v8 long) binds: [B:18:0x003f, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActionbarBackBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 32;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 1;
        }
        return true;
    }

    public final boolean h(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42543k |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42543k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42543k = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return g((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return h((ObservableBoolean) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return f((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (6 != i10) {
            return false;
        }
        b((ToolbarViewModel) obj);
        return true;
    }
}
