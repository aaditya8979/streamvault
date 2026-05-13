package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;
import np.e;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityFeedbackRecordBindingImpl extends ActivityFeedbackRecordBinding {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42649n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f42655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f42656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f42657l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f42648m = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{7}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42649n = sparseIntArray;
        sparseIntArray.put(R.id.tv_empty, 8);
    }

    public ActivityFeedbackRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f42648m, f42649n));
    }

    public ActivityFeedbackRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ActionbarBackBinding) objArr[7], (TextView) objArr[8]);
        this.f42657l = -1L;
        setContainedBinding(this.f42645b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f42650e = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f42651f = linearLayout;
        linearLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[2];
        this.f42652g = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f42653h = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[4];
        this.f42654i = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[5];
        this.f42655j = button;
        button.setTag(null);
        ImageView imageView = (ImageView) objArr[6];
        this.f42656k = imageView;
        imageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42657l |= 16;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42657l |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42657l |= 1;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42657l |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityFeedbackRecordBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42657l |= 2;
        }
        return true;
    }

    public void g(@Nullable FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel) {
        this.f42647d = feedbackrecordviewmodel;
        synchronized (this) {
            this.f42657l |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f42657l != 0) {
                return true;
            }
            return this.f42645b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42657l = 64L;
        }
        this.f42645b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return f((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return b((ActionbarBackBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f42645b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((FEEDBACKRECORDVIEWMODEL) obj);
        return true;
    }
}
