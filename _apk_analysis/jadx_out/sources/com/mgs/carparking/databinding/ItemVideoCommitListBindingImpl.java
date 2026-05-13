package com.mgs.carparking.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
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
import com.dramarush.shortin.R;
import com.green.hand.library.widget.EmojiTextview;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.rv.ChildRecycleView;
import hc.u0;
import hc.y0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemVideoCommitListBindingImpl extends ItemVideoCommitListBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43736s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43737t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f43739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ChildRecycleView f43741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f43742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f43743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f43745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final EmojiTextview f43746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43747r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43737t = sparseIntArray;
        sparseIntArray.put(R.id.rl_filter, 13);
        sparseIntArray.put(R.id.iv_filter, 14);
    }

    public ItemVideoCommitListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f43736s, f43737t));
    }

    public ItemVideoCommitListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (ImageView) objArr[14], (CircularImageView) objArr[1], (LinearLayout) objArr[4], (RelativeLayout) objArr[13], (TextView) objArr[6], (TextView) objArr[2]);
        this.f43747r = -1L;
        this.f43730c.setTag(null);
        this.f43731d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43738i = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f43739j = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[11];
        this.f43740k = relativeLayout;
        relativeLayout.setTag(null);
        ChildRecycleView childRecycleView = (ChildRecycleView) objArr[12];
        this.f43741l = childRecycleView;
        childRecycleView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f43742m = textView2;
        textView2.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.f43743n = imageView;
        imageView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[7];
        this.f43744o = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f43745p = textView3;
        textView3.setTag(null);
        EmojiTextview emojiTextview = (EmojiTextview) objArr[9];
        this.f43746q = emojiTextview;
        emojiTextview.setTag(null);
        this.f43733f.setTag(null);
        this.f43734g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 128;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 256;
        }
        return true;
    }

    public final boolean d(ObservableList<u0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemVideoCommitListBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 16;
        }
        return true;
    }

    public final boolean g(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 2;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43747r != 0;
        }
    }

    public final boolean i(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43747r = 1024L;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43747r |= 1;
        }
        return true;
    }

    public void k(@Nullable y0 y0Var) {
        this.f43735h = y0Var;
        synchronized (this) {
            this.f43747r |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return j((ObservableField) obj, i11);
            case 1:
                return g((ObservableField) obj, i11);
            case 2:
                return d((ObservableList) obj, i11);
            case 3:
                return e((ObservableField) obj, i11);
            case 4:
                return f((ObservableField) obj, i11);
            case 5:
                return i((ObservableField) obj, i11);
            case 6:
                return h((ObservableField) obj, i11);
            case 7:
                return b((ObservableField) obj, i11);
            case 8:
                return c((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((y0) obj);
        return true;
    }
}
