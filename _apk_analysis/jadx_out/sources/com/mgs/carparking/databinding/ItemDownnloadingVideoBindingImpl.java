package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;

/* JADX INFO: loaded from: classes8.dex */
public class ItemDownnloadingVideoBindingImpl extends ItemDownnloadingVideoBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43174n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43175o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f43177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f43180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f43182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InverseBindingListener f43183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43184m;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownnloadingVideoBindingImpl.this.f43177f.isChecked();
            com.mgs.carparking.model.a aVar = ItemDownnloadingVideoBindingImpl.this.f43173d;
            if (aVar != null) {
                ObservableField<Boolean> observableField = aVar.f44267b;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownnloadingVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f43174n, f43175o));
    }

    public ItemDownnloadingVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (ProgressBar) objArr[5], (RelativeLayout) objArr[1]);
        this.f43183l = new a();
        this.f43184m = -1L;
        this.f43171b.setTag(null);
        this.f43172c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43176e = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f43177f = checkBox;
        checkBox.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[3];
        this.f43178g = roundedImageView;
        roundedImageView.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f43179h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.f43180i = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.f43181j = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[8];
        this.f43182k = textView4;
        textView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 128;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[PHI: r2
      0x0050: PHI (r2v4 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0026, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemDownnloadingVideoBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 256;
        }
        return true;
    }

    public final boolean g(ObservableField<Integer> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 16;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43184m != 0;
        }
    }

    public final boolean i(ObservableField<Integer> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43184m = 1024L;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 32;
        }
        return true;
    }

    public final boolean k(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43184m |= 64;
        }
        return true;
    }

    public void l(@Nullable com.mgs.carparking.model.a aVar) {
        this.f43173d = aVar;
        synchronized (this) {
            this.f43184m |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return h((ObservableField) obj, i11);
            case 1:
                return i((ObservableField) obj, i11);
            case 2:
                return d((ObservableField) obj, i11);
            case 3:
                return e((ObservableField) obj, i11);
            case 4:
                return g((ObservableField) obj, i11);
            case 5:
                return j((ObservableField) obj, i11);
            case 6:
                return k((ObservableBoolean) obj, i11);
            case 7:
                return c((ObservableField) obj, i11);
            case 8:
                return f((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        l((com.mgs.carparking.model.a) obj);
        return true;
    }
}
