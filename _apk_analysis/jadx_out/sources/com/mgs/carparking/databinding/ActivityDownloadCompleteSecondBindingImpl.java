package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import hc.f1;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityDownloadCompleteSecondBindingImpl extends ActivityDownloadCompleteSecondBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42560l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f42563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f42566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f42567j;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f42559k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{6}, new int[]{R.layout.actionbar_back});
        f42560l = null;
    }

    public ActivityDownloadCompleteSecondBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f42559k, f42560l));
    }

    public ActivityDownloadCompleteSecondBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[6]);
        this.f42567j = -1L;
        setContainedBinding(this.f42557b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42561d = relativeLayout;
        relativeLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f42562e = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f42563f = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.f42564g = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f42565h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[5];
        this.f42566i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42567j |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42567j |= 1;
        }
        return true;
    }

    public final boolean d(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42567j |= 8;
        }
        return true;
    }

    public final boolean e(ObservableArrayList<f1> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42567j |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityDownloadCompleteSecondBindingImpl.executeBindings():void");
    }

    public void f(@Nullable DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel) {
        this.f42558c = downloadcompletesecondviewmodel;
        synchronized (this) {
            this.f42567j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f42567j != 0) {
                return true;
            }
            return this.f42557b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42567j = 32L;
        }
        this.f42557b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return e((ObservableArrayList) obj, i11);
        }
        if (i10 == 2) {
            return b((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return d((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f42557b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((DOWNLOADCOMPLETESECONDVIEWMODEL) obj);
        return true;
    }
}
