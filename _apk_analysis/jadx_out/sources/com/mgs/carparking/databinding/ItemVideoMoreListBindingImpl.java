package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.y2;

/* JADX INFO: loaded from: classes6.dex */
public class ItemVideoMoreListBindingImpl extends ItemVideoMoreListBinding {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43762q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43763r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final View f43765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f43766p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43763r = sparseIntArray;
        sparseIntArray.put(R.id.rl_left, 12);
    }

    public ItemVideoMoreListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f43762q, f43763r));
    }

    public ItemVideoMoreListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (RoundedImageView) objArr[1], (ImageView) objArr[2], (RelativeLayout) objArr[12], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[11]);
        this.f43766p = -1L;
        this.f43750b.setTag(null);
        this.f43751c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43764n = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[3];
        this.f43765o = view2;
        view2.setTag(null);
        this.f43753e.setTag(null);
        this.f43754f.setTag(null);
        this.f43755g.setTag(null);
        this.f43756h.setTag(null);
        this.f43757i.setTag(null);
        this.f43758j.setTag(null);
        this.f43759k.setTag(null);
        this.f43760l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 64;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemVideoMoreListBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 32;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 1;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43766p |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43766p != 0;
        }
    }

    public void i(@Nullable y2 y2Var) {
        this.f43761m = y2Var;
        synchronized (this) {
            this.f43766p |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43766p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g((ObservableField) obj, i11);
            case 1:
                return h((ObservableField) obj, i11);
            case 2:
                return e((ObservableField) obj, i11);
            case 3:
                return b((ObservableField) obj, i11);
            case 4:
                return d((ObservableField) obj, i11);
            case 5:
                return f((ObservableField) obj, i11);
            case 6:
                return c((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        i((y2) obj);
        return true;
    }
}
