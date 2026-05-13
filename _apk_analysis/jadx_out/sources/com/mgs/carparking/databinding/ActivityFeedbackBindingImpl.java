package com.mgs.carparking.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import hc.q1;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityFeedbackBindingImpl extends ActivityFeedbackBinding {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42636s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f42638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f42641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f42642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Button f42643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f42644q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f42635r = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{10}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42636s = sparseIntArray;
        sparseIntArray.put(R.id.scrollview, 11);
        sparseIntArray.put(R.id.et_input, 12);
        sparseIntArray.put(R.id.iv_image_select, 13);
    }

    public ActivityFeedbackBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f42635r, f42636s));
    }

    public ActivityFeedbackBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ActionbarBackBinding) objArr[10], (EditText) objArr[12], (ImageView) objArr[6], (ImageView) objArr[13], (ImageView) objArr[4], (RelativeLayout) objArr[1], (ScrollView) objArr[11]);
        this.f42644q = -1L;
        setContainedBinding(this.f42627b);
        this.f42629d.setTag(null);
        this.f42631f.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42637j = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[2];
        this.f42638k = view2;
        view2.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[3];
        this.f42639l = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[5];
        this.f42640m = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f42641n = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f42642o = textView2;
        textView2.setTag(null);
        Button button = (Button) objArr[9];
        this.f42643p = button;
        button.setTag(null);
        this.f42632g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 16;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 1;
        }
        return true;
    }

    public final boolean d(ObservableList<q1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 32;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityFeedbackBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 4;
        }
        return true;
    }

    public final boolean g(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42644q |= 8;
        }
        return true;
    }

    public void h(@Nullable FEEDBACKVIEWMODEL feedbackviewmodel) {
        this.f42634i = feedbackviewmodel;
        synchronized (this) {
            this.f42644q |= 64;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f42644q != 0) {
                return true;
            }
            return this.f42627b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42644q = 128L;
        }
        this.f42627b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return f((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return g((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return b((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return e((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f42627b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        h((FEEDBACKVIEWMODEL) obj);
        return true;
    }
}
