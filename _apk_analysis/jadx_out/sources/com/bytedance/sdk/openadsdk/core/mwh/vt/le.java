package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.mwh.vt.lh;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class le extends com.bytedance.sdk.openadsdk.core.le.lh implements lh.ouw, jae.ouw, lh.ouw {
    public ImageView bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private long f13856bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private long f13857cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f13858cf;
    private String ex;
    private lh.InterfaceC0169lh ey;
    private boolean fak;
    public boolean fkw;
    private final Runnable fqk;
    private boolean fvf;
    private final AtomicBoolean hun;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f13859jg;
    private final AtomicBoolean jvy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f13860ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ra f13861le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public FrameLayout f13862lh;
    public int mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f13863od;
    private View osn;
    public final vpp ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private final Handler f13864pd;
    public ImageView pno;
    private boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public RelativeLayout f13865ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vt f13866rn;
    private ViewTreeObserver.OnGlobalLayoutListener rrs;
    public String ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f13867tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f13868th;
    public ImageView tlj;
    private final String uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private final boolean f13869uq;
    private final ViewTreeObserver.OnScrollChangedListener ux;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private ViewGroup f13870vm;
    public lh vt;
    public boolean yu;
    private final Context zih;
    private String zin;
    private static final Integer vpp = 0;
    private static final Integer jqy = 1;

    public interface ouw {
        void ouw(View view, int i10);
    }

    public interface vt {
        void ouw(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, ra raVar) {
        this(context, vppVar, false, raVar);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, String str, ra raVar) {
        this(context, vppVar, false, str, true, raVar);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, boolean z10, ra raVar) {
        this(context, vppVar, z10, "embeded_ad", false, raVar);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, boolean z10, String str, boolean z11, ra raVar) {
        super(context);
        this.f13868th = true;
        this.yu = true;
        this.qbp = false;
        this.fkw = false;
        this.f13867tc = true;
        this.ksc = false;
        this.jae = true;
        this.f13858cf = true;
        this.ryl = "embeded_ad";
        this.mwh = 50;
        this.f13863od = true;
        this.f13869uq = false;
        this.f13864pd = new jae(jg.vt().getLooper(), this);
        this.fak = false;
        this.uoy = Build.MODEL;
        this.f13859jg = false;
        this.f13860ko = true;
        this.jvy = new AtomicBoolean(false);
        this.fqk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.4
            @Override // java.lang.Runnable
            public final void run() {
                le leVar = le.this;
                leVar.ouw(leVar.fvf, le.vpp.intValue());
            }
        };
        this.hun = new AtomicBoolean(false);
        this.ux = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                le.ouw(le.this);
            }
        };
        try {
            if (vppVar.osn()) {
                this.ex = CacheDirFactory.getICacheDir(0).vt();
            }
        } catch (Throwable unused) {
        }
        if (raVar != null) {
            this.f13861le = raVar;
        }
        this.ryl = str;
        this.zih = context;
        this.ouw = vppVar;
        this.qbp = z10;
        setContentDescription("NativeVideoTsView");
        this.ksc = z11;
        this.jae = false;
        vt();
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.f13870vm = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f13862lh = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.osn = view;
        addView(frameLayout);
        fkw();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                le.ouw(le.this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                le.ouw(le.this);
            }
        });
    }

    private boolean ex() {
        int iFqk = this.ouw.fqk();
        zih.yu();
        return 2 == cf.vt(iFqk);
    }

    private void fkw() {
        this.vt = new lh(this.zih, this.f13862lh, this.ouw, this.ryl, !this.qbp, this.ksc, this.jae, this.f13861le);
        ko();
        if (this.rrs == null) {
            this.rrs = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    le leVar;
                    lh lhVar;
                    if (le.this.f13870vm == null || le.this.f13870vm.getViewTreeObserver() == null || (lhVar = (leVar = le.this).vt) == null) {
                        return;
                    }
                    lhVar.ouw(leVar.f13870vm.getWidth(), le.this.f13870vm.getHeight());
                    le.this.f13870vm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    le.this.rrs = null;
                }
            };
            this.f13870vm.getViewTreeObserver().addOnGlobalLayoutListener(this.rrs);
        }
    }

    private void jae() {
        osn.fkw(this.bly);
        osn.fkw(this.f13865ra);
    }

    private void jqy() {
        if (!(this.vt == null || this.qbp || (th() && !com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", false))) && th()) {
            long jTh = this.vt.th();
            long jZih = this.vt.zih() + jTh;
            boolean zOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", false);
            long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jOuw2 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", jZih);
            long jOuw3 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", jTh);
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            lh lhVar = this.vt;
            lhVar.f13827jg = zOuw;
            lhVar.vt(jOuw);
            lh lhVar2 = this.vt;
            lhVar2.uoy = jOuw2;
            lhVar2.f13824bs = jOuw3;
            ko.fkw("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + zOuw + ",position=" + jOuw + ",totalPlayDuration=" + jOuw2 + ",duration=" + jOuw3);
        }
    }

    private void ko() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            return;
        }
        lhVar.osn = this.f13868th;
        lhVar.ouw((lh.ouw) this);
        this.vt.f13831od = this;
    }

    private void ksc() {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || (fkwVar = lhVar.f13833ra) == null) {
            return;
        }
        fkwVar.ouw();
        View viewLh = fkwVar.lh();
        if (viewLh != null) {
            viewLh.setVisibility(8);
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
        }
    }

    private boolean od() {
        return fak.ouw(this, 50, ex.vt(this.ryl) ? 1 : 5, false);
    }

    private void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        try {
            if (this.ouw.osn()) {
                lhVar.f11272lh = this.ex;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void ouw(le leVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = leVar.f13864pd;
        if (handler == null || jElapsedRealtime - leVar.f13856bs <= 500) {
            return;
        }
        leVar.f13856bs = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(boolean z10, int i10) {
        if (this.ouw == null || this.vt == null) {
            return;
        }
        boolean zQbp = qbp();
        zin();
        if (zQbp && this.vt.f13827jg) {
            ko.vt("NativeVideoTsView", "changeVideoStatus---isFromDetailPage()=" + zQbp + "，mNativeVideoController.isPlayComplete()=" + this.vt.f13827jg);
            bly();
            yu();
            return;
        }
        if (z10 && this.f13867tc) {
            lh lhVar = this.vt;
            if (!lhVar.f13827jg && !lhVar.zih) {
                com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = lhVar.f13829le;
                if (lhVar2 == null || !lhVar2.ra()) {
                    if (this.f13868th && this.vt.f13829le == null) {
                        if (!this.jvy.get()) {
                            this.jvy.set(true);
                        }
                        this.hun.set(false);
                        rn();
                        return;
                    }
                    return;
                }
                if (this.f13868th || i10 == 1) {
                    lh lhVar3 = this.vt;
                    if (lhVar3 != null) {
                        ouw(lhVar3.f13834rn, "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.uoy)) {
                        this.vt.ryl();
                    } else {
                        bly.ouw();
                        this.vt.yu(zQbp);
                    }
                    ouw(false);
                    lh.InterfaceC0169lh interfaceC0169lh = this.ey;
                    if (interfaceC0169lh != null) {
                        interfaceC0169lh.i_();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar4 = this.vt.f13829le;
        if (lhVar4 == null || !lhVar4.le()) {
            return;
        }
        this.vt.cf();
        ouw(true);
        lh.InterfaceC0169lh interfaceC0169lh2 = this.ey;
        if (interfaceC0169lh2 != null) {
            interfaceC0169lh2.vt();
        }
    }

    private boolean qbp() {
        if (this.qbp || !th()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void rn() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            fkw();
        } else if ((lhVar instanceof lh) && !this.qbp) {
            lhVar.ey();
        }
        if (this.vt == null || !this.jvy.get()) {
            return;
        }
        this.jvy.set(false);
        vt();
        if (!this.f13868th) {
            if (!this.vt.f13827jg) {
                ko.lh("NativeVideoTsView", "attachTask.......mRlImgCover.....VISIBLE");
                pno();
                osn.ouw((View) this.f13865ra, 0);
                return;
            } else {
                ko.vt("NativeVideoTsView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.vt.f13827jg);
                bly();
                return;
            }
        }
        osn.ouw((View) this.f13865ra, 8);
        ImageView imageView = this.bly;
        if (imageView != null) {
            osn.ouw((View) imageView, 8);
        }
        vpp vppVar = this.ouw;
        if (vppVar == null || vppVar.f13788sd == null) {
            ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f13789sm).lh(), this.ouw);
        vtVarOuw.f11271le = this.ouw.pv;
        vtVarOuw.f11274ra = this.f13870vm.getWidth();
        vtVarOuw.pno = this.f13870vm.getHeight();
        vtVarOuw.bly = this.ouw.yhj;
        vtVarOuw.tlj = 0L;
        vtVarOuw.f11268cf = this.yu;
        ouw(vtVarOuw);
        this.vt.ouw(vtVarOuw);
        this.vt.f13827jg = false;
    }

    private void tc() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            fkw fkwVar = lhVar.f13833ra;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            jae();
        }
    }

    private boolean th() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.fvf;
        return (i10 == 2 || i10 == 1) && 3 == vppVar.f13782pd;
    }

    private void vm() {
        if (!this.jvy.get()) {
            this.jvy.set(true);
            lh lhVar = this.vt;
            if (lhVar != null) {
                lhVar.jg();
            }
        }
        this.hun.set(false);
    }

    private void vpp() {
        this.f13864pd.removeMessages(1);
        jg.lh().removeCallbacks(this.fqk);
    }

    private void yu() {
        ouw(0L, 0);
        this.ey = null;
    }

    private void zih() {
        this.f13866rn = null;
        lh lhVar = this.vt;
        if ((lhVar instanceof lh) && !this.qbp) {
            lhVar.rrs();
        }
        ksc();
        ouw(false);
        vm();
    }

    private void zin() {
        if (this.qbp || !th()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    public final void bly() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.f13827jg = true;
            fkw fkwVar = lhVar.f13833ra;
            if (fkwVar != null) {
                fkwVar.vt();
                View viewLh = fkwVar.lh();
                if (viewLh != null) {
                    if (viewLh.getParent() != null) {
                        ((ViewGroup) viewLh.getParent()).removeView(viewLh);
                    }
                    viewLh.setVisibility(0);
                    addView(viewLh);
                    vpp vppVar = this.ouw;
                    new WeakReference(this.zih);
                    fkwVar.ouw(vppVar);
                }
            }
        }
    }

    public final void cf() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof lh)) {
            return;
        }
        getNativeVideoController().ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public double getCurrentPlayTime() {
        if (this.vt != null) {
            return (r0.bly * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public lh getNativeVideoController() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void le() {
        lh.InterfaceC0169lh interfaceC0169lh = this.ey;
        if (interfaceC0169lh != null) {
            interfaceC0169lh.h_();
        }
    }

    public void lh() {
        if (tlj()) {
            return;
        }
        ryl();
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(this.f13857cd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn();
        if (this.f13860ko) {
            getViewTreeObserver().addOnScrollChangedListener(this.ux);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zih();
        if (this.f13860ko) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.ux);
            }
            ViewGroup viewGroup = this.f13870vm;
            if (viewGroup == null || this.rrs == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.rrs);
                this.rrs = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        rn();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vt vtVar;
        lh lhVar;
        if (!this.qbp && (vtVar = this.f13866rn) != null && (lhVar = this.vt) != null) {
            boolean z10 = lhVar.f13827jg;
            long jTh = lhVar.th();
            lh lhVar2 = this.vt;
            vtVar.ouw(z10, jTh, lhVar2.bly + lhVar2.zih(), this.vt.bly, this.f13868th);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        zih();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        lh lhVar;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2;
        lh lhVar3;
        lh lhVar4;
        if ("open_ad".equals(this.ryl)) {
            vpp();
            return;
        }
        this.f13867tc = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.ouw, z10);
        jqy();
        if (this.f13860ko) {
            if (qbp() && (lhVar4 = this.vt) != null && lhVar4.f13827jg) {
                zin();
                osn.ouw((View) this.f13865ra, 8);
                bly();
                yu();
                return;
            }
            vt();
            if (!this.qbp && this.f13868th && (lhVar3 = this.vt) != null && !lhVar3.zih) {
                Handler handler = this.f13864pd;
                if (handler != null) {
                    if (z10 && lhVar3 != null && !lhVar3.f13827jg) {
                        handler.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        vpp();
                        ouw(false, vpp.intValue());
                        return;
                    }
                }
                return;
            }
            if (this.f13868th) {
                return;
            }
            if (!z10 && (lhVar = this.vt) != null && (lhVar2 = lhVar.f13829le) != null && lhVar2.le()) {
                vpp();
                ouw(false, vpp.intValue());
            } else if (z10) {
                this.f13864pd.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        lh lhVar;
        vpp vppVar;
        Handler handler;
        lh lhVar2;
        lh lhVar3;
        super.onWindowVisibilityChanged(i10);
        jqy();
        if (qbp() && (lhVar3 = this.vt) != null && lhVar3.f13827jg) {
            zin();
            osn.ouw((View) this.f13865ra, 8);
            bly();
            yu();
            return;
        }
        vt();
        if (this.qbp || !this.f13868th || (lhVar = this.vt) == null || lhVar.zih || (vppVar = this.ouw) == null) {
            return;
        }
        if (!this.f13863od || vppVar.f13788sd == null) {
            ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        } else {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f13789sm).lh(), this.ouw);
            vtVarOuw.f11271le = this.ouw.pv;
            vtVarOuw.f11274ra = this.f13870vm.getWidth();
            vtVarOuw.pno = this.f13870vm.getHeight();
            vtVarOuw.bly = this.ouw.yhj;
            vtVarOuw.tlj = this.f13857cd;
            vtVarOuw.f11268cf = this.yu;
            ouw(vtVarOuw);
            this.vt.ouw(vtVarOuw);
            this.f13863od = false;
            osn.ouw((View) this.f13865ra, 8);
        }
        if (i10 != 0 || !this.f13860ko || (handler = this.f13864pd) == null || (lhVar2 = this.vt) == null || lhVar2.f13827jg) {
            return;
        }
        handler.obtainMessage(1).sendToTarget();
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(List<Pair<View, FriendlyObstructionPurpose>> list) {
        lh lhVar = this.vt;
        if (lhVar instanceof lh) {
            return lhVar.ouw(this, list);
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw() {
        ko.ouw("NativeVideoTsView", "embeded_ad", "onTimeOut、、、、、、、、");
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw(long j10, int i10) {
        ko.vt("NativeVideoTsView", "onComplete() called with: totalPlayTime = [" + j10 + "], percent = [" + i10 + C3978d4.j.f31385e);
        lh.InterfaceC0169lh interfaceC0169lh = this.ey;
        if (interfaceC0169lh != null) {
            interfaceC0169lh.j_();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw(long j10, long j11) {
        lh.InterfaceC0169lh interfaceC0169lh = this.ey;
        if (interfaceC0169lh != null) {
            interfaceC0169lh.ouw(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            this.fvf = od();
            bs.ouw(this.fqk);
        }
    }

    public void ouw(boolean z10) {
        if (this.bly == null) {
            this.bly = new ImageView(getContext());
            if (bly.ouw().mwh() != null) {
                this.bly.setImageBitmap(bly.ouw().mwh());
            } else {
                this.bly.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(zih.ouw(), "tt_new_play_video"));
            }
            this.bly.setScaleType(ImageView.ScaleType.FIT_XY);
            int iOuw = osn.ouw(getContext(), this.mwh);
            int iOuw2 = osn.ouw(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iOuw2;
            layoutParams.bottomMargin = iOuw2;
            this.f13870vm.addView(this.bly, layoutParams);
            this.bly.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/le$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_le$5_onClick_8e0027ca8c1292a9f21ea443e9aa3725(view);
                }

                public void safedk_le$5_onClick_8e0027ca8c1292a9f21ea443e9aa3725(View view) {
                    le.this.ryl();
                }
            });
        }
        if (z10) {
            this.bly.setVisibility(0);
        } else {
            this.bly.setVisibility(8);
        }
    }

    public final void ouw(boolean z10, String str) {
        if (ex.vt(this.ryl)) {
            z10 = true;
        }
        this.yu = z10;
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(z10, str);
        }
    }

    public final boolean ouw(long j10, boolean z10, boolean z11) {
        boolean zOuw = false;
        this.f13870vm.setVisibility(0);
        this.f13857cd = j10;
        if (!this.qbp) {
            return true;
        }
        this.vt.vt(false);
        vpp vppVar = this.ouw;
        if (vppVar != null && vppVar.f13788sd != null) {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f13789sm).lh(), this.ouw);
            vtVarOuw.f11271le = this.ouw.pv;
            vtVarOuw.f11274ra = this.f13870vm.getWidth();
            vtVarOuw.pno = this.f13870vm.getHeight();
            vtVarOuw.bly = this.ouw.yhj;
            vtVarOuw.tlj = j10;
            vtVarOuw.f11268cf = this.yu;
            ouw(vtVarOuw);
            if (z11) {
                this.vt.vt(vtVarOuw);
                return true;
            }
            zOuw = this.vt.ouw(vtVarOuw);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.vt != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(this.vt.bly);
            ouwVar.vt(this.vt.th());
            ouwVar.vt = this.vt.zih();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.vt.f13833ra, ouwVar);
        }
        return zOuw;
    }

    public final void pno() {
        View view;
        if (this.zih == null || (view = this.osn) == null || view.getParent() == null || this.ouw == null || this.f13865ra != null) {
            return;
        }
        ViewParent parent = this.osn.getParent();
        Context context = this.zih;
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        raVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        yuVar.setLayoutParams(layoutParams);
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.pno = yuVar;
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setVisibility(8);
        yuVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_play_video"));
        this.tlj = yuVar2;
        raVar.addView(yuVar);
        raVar.addView(yuVar2);
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View view2 = this.osn;
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeViewInLayout(view2);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                viewGroup.addView(raVar, iIndexOfChild, layoutParams3);
            } else {
                viewGroup.addView(raVar, iIndexOfChild);
            }
        }
        this.f13865ra = raVar;
        if (this.f13858cf) {
            osn.ouw((View) this.tlj, 0);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.ouw.f13788sd;
        if (vtVar != null && vtVar.f11283le != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar.f13788sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f11283le, vtVar2.vt, vtVar2.ouw, this.pno, vppVar);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setClickable(true);
            this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/le$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view3);
                    safedk_le$2_onClick_ca4cfea3a654cef3efbc46a54309a093(view3);
                }

                public void safedk_le$2_onClick_ca4cfea3a654cef3efbc46a54309a093(View view3) {
                    le.this.lh();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void ra() {
        vt();
    }

    public final void ryl() {
        if (ksc.ouw(zih.ouw(), 60000L) != 0 && od()) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f13829le;
            if (lhVar != null) {
                if (lhVar.ra()) {
                    ouw(true, jqy.intValue());
                    vt();
                    Handler handler = this.f13864pd;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.vt.f13829le.vt() && !this.f13860ko) {
                    tc();
                    lh lhVar2 = this.vt;
                    if (lhVar2 instanceof lh) {
                        lhVar2.jvy();
                        return;
                    }
                    return;
                }
            }
            if (this.f13868th || this.hun.get()) {
                return;
            }
            this.hun.set(true);
            jae();
            vpp vppVar = this.ouw;
            if (vppVar != null && vppVar.f13788sd != null) {
                jae();
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(this.ouw.f13789sm).lh(), this.ouw);
                vtVarOuw.f11271le = this.ouw.pv;
                vtVarOuw.f11274ra = this.f13870vm.getWidth();
                vtVarOuw.pno = this.f13870vm.getHeight();
                vpp vppVar2 = this.ouw;
                vtVarOuw.bly = vppVar2.yhj;
                vtVarOuw.tlj = this.f13857cd;
                vtVarOuw.f11268cf = this.yu;
                vtVarOuw.f11272lh = CacheDirFactory.getICacheDir(vppVar2.f13789sm).lh();
                ouw(vtVarOuw);
                this.vt.ouw(vtVarOuw);
            }
            Handler handler2 = this.f13864pd;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            ouw(false);
        }
    }

    public void setAdCreativeClickListener(final ouw ouwVar) {
        fkw fkwVar;
        final lh lhVar = this.vt;
        if (lhVar == null || !lhVar.f13828ko || (fkwVar = lhVar.f13833ra) == null) {
            return;
        }
        fkwVar.ey = new ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.2
            @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
            public final void ouw(View view, int i10) {
                le.ouw ouwVar2 = ouwVar;
                if (ouwVar2 != null) {
                    ouwVar2.ouw(view, i10);
                }
            }
        };
    }

    public void setControllerStatusCallBack(vt vtVar) {
        this.f13866rn = vtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setIsAutoPlay(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.fak
            if (r0 == 0) goto L5
            return
        L5:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r6.ouw
            int r0 = r0.fqk()
            com.bytedance.sdk.openadsdk.core.zih.yu()
            int r0 = com.bytedance.sdk.openadsdk.core.settings.cf.vt(r0)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L64
            r3 = 4
            if (r0 == r3) goto L64
            android.content.Context r0 = r6.zih
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = com.bytedance.sdk.component.utils.ksc.ouw(r0, r3)
            r5 = 5
            if (r0 != r5) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L32
            boolean r0 = r6.ex()
            if (r0 != 0) goto L64
        L30:
            r7 = r2
            goto L64
        L32:
            android.content.Context r0 = r6.zih
            int r0 = com.bytedance.sdk.component.utils.ksc.ouw(r0, r3)
            r3 = 6
            if (r0 != r3) goto L3d
            r0 = r1
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L5b
            boolean r0 = r6.ex()
            if (r0 != 0) goto L64
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r6.ouw
            int r0 = r0.fqk()
            com.bytedance.sdk.openadsdk.core.zih.yu()
            int r0 = com.bytedance.sdk.openadsdk.core.settings.cf.vt(r0)
            if (r5 != r0) goto L57
            r0 = r1
            goto L58
        L57:
            r0 = r2
        L58:
            if (r0 != 0) goto L64
            goto L30
        L5b:
            android.content.Context r0 = r6.zih
            boolean r0 = com.bytedance.sdk.component.utils.vm.ouw(r0)
            if (r0 != 0) goto L64
            goto L30
        L64:
            r6.f13868th = r7
            com.bytedance.sdk.openadsdk.core.mwh.vt.lh r0 = r6.vt
            if (r0 == 0) goto L6c
            r0.osn = r7
        L6c:
            if (r7 != 0) goto L93
            r6.pno()
            android.widget.RelativeLayout r7 = r6.f13865ra
            if (r7 == 0) goto L9a
            com.bytedance.sdk.openadsdk.utils.osn.ouw(r7, r2)
            com.bytedance.sdk.openadsdk.core.model.vpp r7 = r6.ouw
            if (r7 == 0) goto L9a
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt r7 = r7.f13788sd
            if (r7 == 0) goto L9a
            com.bytedance.sdk.openadsdk.th.vt.ouw()
            com.bytedance.sdk.openadsdk.core.model.vpp r7 = r6.ouw
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt r0 = r7.f13788sd
            java.lang.String r2 = r0.f11283le
            int r3 = r0.vt
            int r0 = r0.ouw
            android.widget.ImageView r4 = r6.pno
            com.bytedance.sdk.openadsdk.th.vt.ouw(r2, r3, r0, r4, r7)
            goto L9a
        L93:
            android.widget.RelativeLayout r7 = r6.f13865ra
            r0 = 8
            com.bytedance.sdk.openadsdk.utils.osn.ouw(r7, r0)
        L9a:
            r6.fak = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.le.setIsAutoPlay(boolean):void");
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.f13858cf = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.f13860ko = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || !lhVar.f13828ko || (fkwVar = lhVar.f13833ra) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = fkwVar.fak;
        if (ouwVar != null) {
            ouwVar.ouw(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = fkwVar.uoy;
        if (ouwVar2 != null) {
            ouwVar2.ouw(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(lh.InterfaceC0169lh interfaceC0169lh) {
        this.ey = interfaceC0169lh;
    }

    public void setVideoAdLoadListener(lh.yu yuVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.jvy = new WeakReference<>(yuVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.zin = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.mwh.vt.vt vtVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.fqk = vtVar;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            vm();
        }
    }

    public final boolean tlj() {
        boolean z10 = false;
        if (ksc.ouw(zih.ouw(), 60000L) == 0) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f13829le;
        if (lhVar != null && lhVar.le()) {
            ouw(false, vpp.intValue());
            Handler handler = this.f13864pd;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    public void vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            this.f13868th = uoy.yu(iOuw);
        } else if (iVt == 2) {
            this.f13868th = uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw);
        } else if (iVt == 3) {
            this.f13868th = false;
        } else if (iVt == 4) {
            this.f13859jg = true;
        } else if (iVt == 5) {
            this.f13868th = uoy.yu(iOuw) || uoy.le(iOuw);
        }
        if (this.qbp) {
            this.yu = false;
        } else if (!this.fkw || !ex.vt(this.ryl)) {
            zih.yu();
            this.yu = cf.vt(String.valueOf(iFqk));
        }
        if ("open_ad".equals(this.ryl)) {
            this.f13868th = true;
            this.yu = true;
        }
        if (ex.vt(this.ryl)) {
            this.yu = true;
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.osn = this.f13868th;
        }
        this.fkw = true;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void vt(long j10, int i10) {
        com.bytedance.sdk.component.utils.ko.vt("NativeVideoTsView", "onError() called with: totalPlayTime = [" + j10 + "], percent = [" + i10 + C3978d4.j.f31385e);
    }
}
