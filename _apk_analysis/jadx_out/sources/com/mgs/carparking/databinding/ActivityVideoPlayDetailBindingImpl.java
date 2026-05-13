package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ObservableScrollView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.rv.ScrollRecyclerView;
import com.ruffian.library.widget.RTextView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hc.c3;
import hc.e3;
import hc.s1;
import hc.y0;

/* JADX INFO: loaded from: classes9.dex */
public class ActivityVideoPlayDetailBindingImpl extends ActivityVideoPlayDetailBinding {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f42821c0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f42822d0;

    @NonNull
    public final LinearLayout J;

    @NonNull
    public final RelativeLayout K;

    @NonNull
    public final ConstraintLayout L;

    @NonNull
    public final ImageView M;

    @NonNull
    public final TextView N;

    @NonNull
    public final RelativeLayout O;

    @NonNull
    public final TextView P;

    @NonNull
    public final ImageView Q;

    @NonNull
    public final RelativeLayout R;

    @NonNull
    public final TextView S;

    @NonNull
    public final ScrollRecyclerView T;

    @NonNull
    public final RelativeLayout U;

    @NonNull
    public final RelativeLayout V;

    @NonNull
    public final Button W;

    @NonNull
    public final RelativeLayout X;

    @NonNull
    public final TextView Y;

    @NonNull
    public final TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NonNull
    public final TextView f42823a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f42824b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42822d0 = sparseIntArray;
        sparseIntArray.put(R.id.tv_no_net, 29);
        sparseIntArray.put(R.id.exo_play_context_id, 30);
        sparseIntArray.put(R.id.iv_back, 31);
        sparseIntArray.put(R.id.refresh_layout, 32);
        sparseIntArray.put(R.id.header, 33);
        sparseIntArray.put(R.id.scrollView, 34);
        sparseIntArray.put(R.id.joinSkipAd, 35);
        sparseIntArray.put(R.id.tvRightJoin, 36);
        sparseIntArray.put(R.id.tv_intro, 37);
        sparseIntArray.put(R.id.iv_video_right, 38);
        sparseIntArray.put(R.id.iv_sh, 39);
        sparseIntArray.put(R.id.iv_feed, 40);
        sparseIntArray.put(R.id.iv_down, 41);
        sparseIntArray.put(R.id.iv_collection, 42);
        sparseIntArray.put(R.id.rl_yuan, 43);
        sparseIntArray.put(R.id.tv_yuan_title, 44);
        sparseIntArray.put(R.id.iv_video_set_right, 45);
        sparseIntArray.put(R.id.iv_video_set_right_variety, 46);
        sparseIntArray.put(R.id.tv1, 47);
        sparseIntArray.put(R.id.img_loading, 48);
        sparseIntArray.put(R.id.iv_comment_head, 49);
        sparseIntArray.put(R.id.flContainer, 50);
    }

    public ActivityVideoPlayDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 51, f42821c0, f42822d0));
    }

    public ActivityVideoPlayDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 24, (VideoPlayerView) objArr[30], (FrameLayout) objArr[50], (WaterDropHeader) objArr[33], (ImageView) objArr[48], (ImageView) objArr[31], (TextView) objArr[42], (CircularImageView) objArr[49], (TextView) objArr[41], (ConstraintLayout) objArr[11], (TextView) objArr[40], (ConstraintLayout) objArr[10], (TextView) objArr[39], (ConstraintLayout) objArr[9], (ImageView) objArr[38], (ImageView) objArr[45], (ImageView) objArr[46], (TextView) objArr[35], (FrameLayout) objArr[22], (SmartRefreshLayout) objArr[32], (RelativeLayout) objArr[23], (RelativeLayout) objArr[43], (RecyclerView) objArr[24], (RecyclerView) objArr[19], (RecyclerView) objArr[21], (ObservableScrollView) objArr[34], (RTextView) objArr[17], (TextView) objArr[47], (TextView) objArr[37], (TextView) objArr[29], (TextView) objArr[36], (TextView) objArr[14], (TextView) objArr[44], (ConstraintLayout) objArr[4]);
        this.f42824b0 = -1L;
        this.f42804j.setTag(null);
        this.f42806l.setTag(null);
        this.f42808n.setTag(null);
        this.f42813s.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[12];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[13];
        this.M = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[15];
        this.N = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[16];
        this.O = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[18];
        this.P = textView2;
        textView2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.Q = imageView2;
        imageView2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[20];
        this.R = relativeLayout3;
        relativeLayout3.setTag(null);
        TextView textView3 = (TextView) objArr[25];
        this.S = textView3;
        textView3.setTag(null);
        ScrollRecyclerView scrollRecyclerView = (ScrollRecyclerView) objArr[26];
        this.T = scrollRecyclerView;
        scrollRecyclerView.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[27];
        this.U = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[28];
        this.V = relativeLayout5;
        relativeLayout5.setTag(null);
        Button button = (Button) objArr[3];
        this.W = button;
        button.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[5];
        this.X = relativeLayout6;
        relativeLayout6.setTag(null);
        TextView textView4 = (TextView) objArr[6];
        this.Y = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[7];
        this.Z = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[8];
        this.f42823a0 = textView6;
        textView6.setTag(null);
        this.f42815u.setTag(null);
        this.f42817w.setTag(null);
        this.f42818x.setTag(null);
        this.f42819y.setTag(null);
        this.A.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        return true;
    }

    public final boolean c(ObservableField<Drawable> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityVideoPlayDetailBindingImpl.executeBindings():void");
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 16384;
        }
        return true;
    }

    public final boolean g(ObservableField observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 2097152;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 8388608;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f42824b0 != 0;
        }
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 512;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f42824b0 = 33554432L;
        }
        requestRebind();
    }

    public final boolean j(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        return true;
    }

    public final boolean k(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 8;
        }
        return true;
    }

    public final boolean l(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    public final boolean m(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 64;
        }
        return true;
    }

    public final boolean n(ObservableList<y0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    public final boolean o(ObservableList<s1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return y((ObservableField) obj, i11);
            case 1:
                return d((ObservableField) obj, i11);
            case 2:
                return c((ObservableField) obj, i11);
            case 3:
                return k((ObservableField) obj, i11);
            case 4:
                return q((ObservableList) obj, i11);
            case 5:
                return x((ObservableField) obj, i11);
            case 6:
                return m((ObservableField) obj, i11);
            case 7:
                return p((ObservableList) obj, i11);
            case 8:
                return r((ObservableField) obj, i11);
            case 9:
                return i((ObservableField) obj, i11);
            case 10:
                return w((ObservableField) obj, i11);
            case 11:
                return l((ObservableField) obj, i11);
            case 12:
                return u((ObservableField) obj, i11);
            case 13:
                return n((ObservableList) obj, i11);
            case 14:
                return f((ObservableField) obj, i11);
            case 15:
                return t((ObservableField) obj, i11);
            case 16:
                return j((ObservableField) obj, i11);
            case 17:
                return s((ObservableField) obj, i11);
            case 18:
                return b((ObservableField) obj, i11);
            case 19:
                return o((ObservableList) obj, i11);
            case 20:
                return e((ObservableField) obj, i11);
            case 21:
                return g((ObservableField) obj, i11);
            case 22:
                return v((ObservableField) obj, i11);
            case 23:
                return h((ObservableField) obj, i11);
            default:
                return false;
        }
    }

    public final boolean p(ObservableList<e3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 128;
        }
        return true;
    }

    public final boolean q(ObservableList<c3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 16;
        }
        return true;
    }

    public final boolean r(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 256;
        }
        return true;
    }

    public final boolean s(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        z((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }

    public final boolean t(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        return true;
    }

    public final boolean u(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    public final boolean v(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
        }
        return true;
    }

    public final boolean w(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 1024;
        }
        return true;
    }

    public final boolean x(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 32;
        }
        return true;
    }

    public final boolean y(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f42824b0 |= 1;
        }
        return true;
    }

    public void z(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.I = videoplaydetailviewmodel;
        synchronized (this) {
            this.f42824b0 |= 16777216;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
