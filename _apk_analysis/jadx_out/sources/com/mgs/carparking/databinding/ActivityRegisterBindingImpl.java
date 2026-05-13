package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42720q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f42722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InverseBindingListener f42723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InverseBindingListener f42724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InverseBindingListener f42725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42726o;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f42713d);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f42718i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f44119r;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public class b implements InverseBindingListener {
        public b() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f42714e);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f42718i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f44120s;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public class c implements InverseBindingListener {
        public c() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f42715f);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f42718i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f44118q;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f42719p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{8}, new int[]{R.layout.actionbar_back});
        f42720q = null;
    }

    public ActivityRegisterBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f42719p, f42720q));
    }

    public ActivityRegisterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[8], (Button) objArr[6], (EditText) objArr[2], (EditText) objArr[4], (ClearableEditText) objArr[1], (ImageView) objArr[3], (ImageView) objArr[5]);
        this.f42723l = new a();
        this.f42724m = new b();
        this.f42725n = new c();
        this.f42726o = -1L;
        setContainedBinding(this.f42711b);
        this.f42712c.setTag(null);
        this.f42713d.setTag(null);
        this.f42714e.setTag(null);
        this.f42715f.setTag(null);
        this.f42716g.setTag(null);
        this.f42717h.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f42721j = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f42722k = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42726o |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42726o |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42726o |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42726o |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityRegisterBindingImpl.executeBindings():void");
    }

    public void f(@Nullable REGISTERVIEWMODEL registerviewmodel) {
        this.f42718i = registerviewmodel;
        synchronized (this) {
            this.f42726o |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f42726o != 0) {
                return true;
            }
            return this.f42711b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42726o = 32L;
        }
        this.f42711b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f42711b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((REGISTERVIEWMODEL) obj);
        return true;
    }
}
