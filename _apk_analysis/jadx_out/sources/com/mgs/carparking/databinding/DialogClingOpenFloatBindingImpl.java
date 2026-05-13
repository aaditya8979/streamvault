package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import pp.b;
import sp.a;

/* JADX INFO: loaded from: classes4.dex */
public class DialogClingOpenFloatBindingImpl extends DialogClingOpenFloatBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42833i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42834j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f42836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f42837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f42838h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42834j = sparseIntArray;
        sparseIntArray.put(R.id.tv_message, 3);
        sparseIntArray.put(R.id.f14952ll, 4);
    }

    public DialogClingOpenFloatBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f42833i, f42834j));
    }

    public DialogClingOpenFloatBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.f42838h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f42835e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f42836f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f42837g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.DialogClingOpenFloatBinding
    public void b(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.f42832d = videoplaydetailviewmodel;
        synchronized (this) {
            this.f42838h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f42838h;
            this.f42838h = 0L;
        }
        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = this.f42832d;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 == 0 || videoplaydetailviewmodel == null) {
            bVar = null;
        } else {
            bVar2 = videoplaydetailviewmodel.f44187a1;
            bVar = videoplaydetailviewmodel.f44189b1;
        }
        if (j11 != 0) {
            a.b(this.f42836f, bVar2, false);
            a.b(this.f42837g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42838h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42838h = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }
}
