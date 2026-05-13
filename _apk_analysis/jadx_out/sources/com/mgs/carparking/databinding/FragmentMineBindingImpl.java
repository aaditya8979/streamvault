package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;

/* JADX INFO: loaded from: classes8.dex */
public class FragmentMineBindingImpl extends FragmentMineBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts D = null;

    @Nullable
    public static final SparseIntArray E;

    @NonNull
    public final RelativeLayout A;

    @NonNull
    public final RelativeLayout B;
    public long C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ScrollView f43053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final View f43061u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final ImageView f43064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final TextView f43065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43066z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.vipBg, 20);
        sparseIntArray.put(R.id.tvTopVp, 21);
        sparseIntArray.put(R.id.tvBottomVp, 22);
        sparseIntArray.put(R.id.llRightLayout, 23);
        sparseIntArray.put(R.id.view_18, 24);
        sparseIntArray.put(R.id.swh_status, 25);
    }

    public FragmentMineBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, D, E));
    }

    public FragmentMineBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (CircularImageView) objArr[2], (LinearLayout) objArr[19], (LinearLayout) objArr[23], (Switch) objArr[25], (LinearLayout) objArr[4], (TextView) objArr[22], (TextView) objArr[3], (TextView) objArr[21], (RelativeLayout) objArr[24], (ConstraintLayout) objArr[20]);
        this.C = -1L;
        this.f43042b.setTag(null);
        this.f43043c.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f43053m = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f43054n = constraintLayout;
        constraintLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[10];
        this.f43055o = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[11];
        this.f43056p = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[12];
        this.f43057q = relativeLayout3;
        relativeLayout3.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[13];
        this.f43058r = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[14];
        this.f43059s = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[15];
        this.f43060t = relativeLayout6;
        relativeLayout6.setTag(null);
        View view2 = (View) objArr[16];
        this.f43061u = view2;
        view2.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) objArr[17];
        this.f43062v = relativeLayout7;
        relativeLayout7.setTag(null);
        RelativeLayout relativeLayout8 = (RelativeLayout) objArr[18];
        this.f43063w = relativeLayout8;
        relativeLayout8.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.f43064x = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f43065y = textView;
        textView.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[7];
        this.f43066z = constraintLayout2;
        constraintLayout2.setTag(null);
        RelativeLayout relativeLayout9 = (RelativeLayout) objArr[8];
        this.A = relativeLayout9;
        relativeLayout9.setTag(null);
        RelativeLayout relativeLayout10 = (RelativeLayout) objArr[9];
        this.B = relativeLayout10;
        relativeLayout10.setTag(null);
        this.f43046f.setTag(null);
        this.f43048h.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 64;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentMineBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 128;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.C != 0;
        }
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.C = 512L;
        }
        requestRebind();
    }

    public void j(@Nullable MINEVIEWMODEL mineviewmodel) {
        this.f43052l = mineviewmodel;
        synchronized (this) {
            this.C |= 256;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g((ObservableField) obj, i11);
            case 1:
                return c((ObservableField) obj, i11);
            case 2:
                return d((ObservableField) obj, i11);
            case 3:
                return i((ObservableField) obj, i11);
            case 4:
                return b((ObservableField) obj, i11);
            case 5:
                return h((ObservableField) obj, i11);
            case 6:
                return e((ObservableField) obj, i11);
            case 7:
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
        j((MINEVIEWMODEL) obj);
        return true;
    }
}
