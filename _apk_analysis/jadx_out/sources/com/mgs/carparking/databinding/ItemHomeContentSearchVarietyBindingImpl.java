package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
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
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import hc.t2;

/* JADX INFO: loaded from: classes8.dex */
public class ItemHomeContentSearchVarietyBindingImpl extends ItemHomeContentSearchVarietyBinding {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43422t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43423u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f43426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f43427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RTextView f43428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f43429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f43430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f43431s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43423u = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 15);
    }

    public ItemHomeContentSearchVarietyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f43422t, f43423u));
    }

    public ItemHomeContentSearchVarietyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, (RoundedImageView) objArr[2], (RelativeLayout) objArr[15], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[8]);
        this.f43431s = -1L;
        this.f43412b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f43424l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f43425m = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[13];
        this.f43426n = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[14];
        this.f43427o = textView2;
        textView2.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f43428p = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f43429q = imageView;
        imageView.setTag(null);
        TextView textView3 = (TextView) objArr[5];
        this.f43430r = textView3;
        textView3.setTag(null);
        this.f43414d.setTag(null);
        this.f43415e.setTag(null);
        this.f43416f.setTag(null);
        this.f43417g.setTag(null);
        this.f43418h.setTag(null);
        this.f43419i.setTag(null);
        this.f43420j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 32;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 128;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 16;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0134  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ItemHomeContentSearchVarietyBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 1024;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 4;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 256;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43431s != 0;
        }
    }

    public final boolean i(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43431s = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 512;
        }
        return true;
    }

    public final boolean k(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 64;
        }
        return true;
    }

    public final boolean l(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 1;
        }
        return true;
    }

    public final boolean m(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43431s |= 2;
        }
        return true;
    }

    public void n(@Nullable t2 t2Var) {
        this.f43421k = t2Var;
        synchronized (this) {
            this.f43431s |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return l((ObservableField) obj, i11);
            case 1:
                return m((ObservableField) obj, i11);
            case 2:
                return g((ObservableField) obj, i11);
            case 3:
                return b((ObservableField) obj, i11);
            case 4:
                return e((ObservableField) obj, i11);
            case 5:
                return c((ObservableField) obj, i11);
            case 6:
                return k((ObservableField) obj, i11);
            case 7:
                return d((ObservableField) obj, i11);
            case 8:
                return h((ObservableField) obj, i11);
            case 9:
                return j((ObservableField) obj, i11);
            case 10:
                return f((ObservableField) obj, i11);
            case 11:
                return i((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        n((t2) obj);
        return true;
    }
}
