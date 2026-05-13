package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes9.dex */
public class ActivityLoginBindingImpl extends ActivityLoginBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42676p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42677q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f42679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f42680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f42681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InverseBindingListener f42682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InverseBindingListener f42683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42684o;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityLoginBindingImpl.this.f42670c);
            LOGINVIEWMODEL loginviewmodel = ActivityLoginBindingImpl.this.f42675h;
            if (loginviewmodel != null) {
                ObservableField<String> observableField = loginviewmodel.f44042g;
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
            String textString = TextViewBindingAdapter.getTextString(ActivityLoginBindingImpl.this.f42671d);
            LOGINVIEWMODEL loginviewmodel = ActivityLoginBindingImpl.this.f42675h;
            if (loginviewmodel != null) {
                ObservableField<String> observableField = loginviewmodel.f44041f;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42677q = sparseIntArray;
        sparseIntArray.put(R.id.iv_top, 9);
    }

    public ActivityLoginBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f42676p, f42677q));
    }

    public ActivityLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (Button) objArr[5], (EditText) objArr[3], (ClearableEditText) objArr[2], (ImageView) objArr[4], (ImageView) objArr[9], (TextView) objArr[8]);
        this.f42682m = new a();
        this.f42683n = new b();
        this.f42684o = -1L;
        this.f42669b.setTag(null);
        this.f42670c.setTag(null);
        this.f42671d.setTag(null);
        this.f42672e.setTag(null);
        this.f42674g.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42678i = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f42679j = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f42680k = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f42681l = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42684o |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42684o |= 1;
        }
        return true;
    }

    public void d(@Nullable LOGINVIEWMODEL loginviewmodel) {
        this.f42675h = loginviewmodel;
        synchronized (this) {
            this.f42684o |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityLoginBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42684o != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42684o = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((LOGINVIEWMODEL) obj);
        return true;
    }
}
