package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.FeedbackTypeEntry;
import hc.q1;
import pp.b;

/* JADX INFO: loaded from: classes8.dex */
public class ItemFeedbackTypeNewBindingImpl extends ItemFeedbackTypeNewBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43213h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43214i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CheckBox f43216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InverseBindingListener f43218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43219g;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemFeedbackTypeNewBindingImpl.this.f43216d.isChecked();
            q1 q1Var = ItemFeedbackTypeNewBindingImpl.this.f43212b;
            if (q1Var != null) {
                ObservableField<Boolean> observableField = q1Var.f63336e;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemFeedbackTypeNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f43213h, f43214i));
    }

    public ItemFeedbackTypeNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f43218f = new a();
        this.f43219g = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43215c = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[1];
        this.f43216d = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f43217e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43219g |= 1;
        }
        return true;
    }

    public void d(@Nullable q1 q1Var) {
        this.f43212b = q1Var;
        synchronized (this) {
            this.f43219g |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zSafeUnbox;
        int colorFromResource;
        String name;
        b bVar;
        FeedbackTypeEntry feedbackTypeEntry;
        synchronized (this) {
            j10 = this.f43219g;
            this.f43219g = 0L;
        }
        q1 q1Var = this.f43212b;
        long j11 = j10 & 7;
        if (j11 != 0) {
            if ((j10 & 6) != 0) {
                if (q1Var != null) {
                    feedbackTypeEntry = q1Var.f63335d;
                    bVar = q1Var.f63338g;
                } else {
                    feedbackTypeEntry = null;
                    bVar = null;
                }
                name = feedbackTypeEntry != null ? feedbackTypeEntry.getName() : null;
            } else {
                name = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = q1Var != null ? q1Var.f63336e : null;
            updateRegistration(0, observableField);
            zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 16L : 8L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f43217e, zSafeUnbox ? R.color.color_333333 : R.color.color_666666);
        } else {
            zSafeUnbox = false;
            colorFromResource = 0;
            name = null;
            bVar = null;
        }
        if ((6 & j10) != 0) {
            sp.a.b(this.f43215c, bVar, false);
            TextViewBindingAdapter.setText(this.f43217e, name);
        }
        if ((7 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f43216d, zSafeUnbox);
            this.f43217e.setTextColor(colorFromResource);
        }
        if ((j10 & 4) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f43216d, null, this.f43218f);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43219g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43219g = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((q1) obj);
        return true;
    }
}
