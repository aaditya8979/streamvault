package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.v1;

/* JADX INFO: loaded from: classes11.dex */
public class ItemMineHistoryBindingImpl extends ItemMineHistoryBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43627k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43628l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f43630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InverseBindingListener f43633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f43634j;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemMineHistoryBindingImpl.this.f43630f.isChecked();
            v1 v1Var = ItemMineHistoryBindingImpl.this.f43626d;
            if (v1Var != null) {
                ObservableField<Boolean> observableField = v1Var.f63405d;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemMineHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f43627k, f43628l));
    }

    public ItemMineHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (RoundedImageView) objArr[3], (RelativeLayout) objArr[1]);
        this.f43633i = new a();
        this.f43634j = -1L;
        this.f43624b.setTag(null);
        this.f43625c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43629e = relativeLayout;
        relativeLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f43630f = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43631g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f43632h = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43634j |= 4;
        }
        return true;
    }

    public final boolean d(VideoLookHistoryEntry videoLookHistoryEntry, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43634j |= 1;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43634j |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[PHI: r2
      0x004a: PHI (r2v5 long) = (r2v0 long), (r2v7 long) binds: [B:9:0x0020, B:25:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemMineHistoryBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43634j |= 2;
        }
        return true;
    }

    public void g(@Nullable v1 v1Var) {
        this.f43626d = v1Var;
        synchronized (this) {
            this.f43634j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43634j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43634j = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((VideoLookHistoryEntry) obj, i11);
        }
        if (i10 == 1) {
            return f((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return e((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((v1) obj);
        return true;
    }
}
