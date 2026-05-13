package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class th implements Handler.Callback {
    public View bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public ValueAnimator f13712bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f13713cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public TextView f13714cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public int f13715cj;
    private boolean coz;
    public FrameLayout ex;
    public com.bytedance.sdk.openadsdk.core.lh.vt ey;
    public ObjectAnimator fak;
    public FrameLayout fkw;
    public ILoader fqk;
    public ObjectAnimator fvf;
    public final View jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public bs f13716jg;
    public final vpp jqy;
    public String jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public FrameLayout f13717kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f13718ko;
    public final com.bytedance.sdk.openadsdk.core.mwh.yu.vt ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public View f13719le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public FrameLayout f13720lh;
    private com.bytedance.sdk.openadsdk.core.bly.qbp lvd;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final boolean f13721mq;
    public TextView mwh;
    public ValueAnimator myk;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public int f13723od;
    public com.bytedance.sdk.openadsdk.core.lh.ouw osn;
    public Handler ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public boolean f13724pd;
    public View pno;
    public com.bytedance.sdk.openadsdk.common.fkw pv;
    public View qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public RelativeLayout f13725ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public FrameLayout f13726rn;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.fkw rrs;
    public com.bytedance.sdk.openadsdk.core.widget.zih ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public String f13728tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public ImageView f13729th;
    public TextView tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public int f13730ub;
    public AtomicBoolean ucs;
    public lh.ouw uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.mwh f13731uq;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.zih f13732vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public View f13733vm;
    public final Activity vpp;
    public ImageView vt;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.yu f13734wp;
    public LinearLayout.LayoutParams yhj;
    public com.bytedance.sdk.openadsdk.core.le.pno yib;
    public TextView yu;
    public com.bytedance.sdk.openadsdk.common.mwh zih;
    public long zin;
    public vt zvq;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private final AtomicBoolean f13722ng = new AtomicBoolean(false);
    private final AtomicBoolean fwd = new AtomicBoolean(false);
    public volatile int hun = 0;
    public volatile int ux = 0;
    public volatile int lso = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f13727sd = -1.0f;
    public final AtomicBoolean mt = new AtomicBoolean(false);
    public long xdk = -1;
    private final AtomicBoolean euf = new AtomicBoolean(false);
    private long njr = 0;

    public static class ouw implements com.bytedance.sdk.component.fkw.pno {
        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), bitmap, 25);
        }
    }

    public static class vt implements com.bytedance.sdk.openadsdk.yu.ryl {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f13740lh;
        private final int ouw;
        private final vpp vt;
        private final WeakReference<th> yu;

        public vt(int i10, vpp vppVar, String str, th thVar) {
            this.ouw = i10;
            this.vt = vppVar;
            this.f13740lh = str;
            this.yu = new WeakReference<>(thVar);
        }

        @Override // com.bytedance.sdk.openadsdk.yu.ryl
        public final void ouw(int i10) {
            th thVar = this.yu.get();
            if (thVar != null) {
                lh.ouw.ouw(this.ouw, thVar.lso, thVar.ux, thVar.hun - thVar.ux, this.vt, this.f13740lh, i10);
            }
        }
    }

    public th(Activity activity, final vpp vppVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, View view) {
        this.vpp = activity;
        this.jqy = vppVar;
        this.f13728tc = str;
        this.ksc = vtVar;
        this.jae = view;
        this.f13723od = uoy.ouw(str);
        if (vppVar != null) {
            this.jvy = vppVar.f13767ki;
        }
        this.f13721mq = vppVar.tpk && fkw(vppVar);
        if (!TextUtils.isEmpty(this.jvy)) {
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            this.fqk = com.bytedance.sdk.openadsdk.ra.vt.vt();
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.fqk, this.jvy);
            this.f13730ub = iOuw;
            this.f13715cj = iOuw > 0 ? 2 : 0;
        }
        boolean zYu = yu(vppVar);
        boolean zRa = ra(vppVar);
        boolean zVt = vt(vppVar);
        if (zVt) {
            this.f13728tc = "landingpage_split_screen";
        } else if (zYu) {
            this.f13728tc = "landingpage_direct";
        } else if (zRa) {
            this.f13728tc = "aggregate_page";
        } else if (lh(vppVar)) {
            this.f13728tc = "landingpage_split_ceiling";
        }
        this.osn = new com.bytedance.sdk.openadsdk.core.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), vppVar, this.f13728tc, uoy.ouw(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.osn.ouw(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.osn.ouw(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.lh.vt(activity, vppVar, this.f13728tc, uoy.ouw(str)) { // from class: com.bytedance.sdk.openadsdk.core.model.th.1
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt
            public final boolean ouw(cf cfVar, Map<String, Object> map2) {
                if (th.tlj(vppVar) && th.this.rrs != null) {
                    th.this.rrs.f14034cf = cfVar;
                    th.this.rrs.ryl = map2;
                    if (th.bly(th.this.jqy) || th.this.coz) {
                        return true;
                    }
                }
                return super.ouw(cfVar, map2);
            }
        };
        this.ey = vtVar2;
        vtVar2.ouw(map);
        this.ey.ouw(viewFindViewById);
        this.ex = frameLayout;
        if (zVt || zYu || zRa) {
            try {
                this.ouw = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e10) {
                Log.e("LandingPageModel", "LandingPageModel: ", e10);
                return;
            }
        }
        if (vppVar.tpk) {
            return;
        }
        if (zYu || zRa) {
            Handler handler = this.ouw;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static boolean bly(vpp vppVar) {
        return (vppVar == null || vppVar.f13757cj == 1 || !tlj(vppVar)) ? false : true;
    }

    public static boolean cf(vpp vppVar) {
        return vppVar != null && vppVar.fvf == 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fkw(int i10) {
        osn.ouw((View) this.f13732vh, i10);
        osn.ouw((View) this.yib, i10);
        if (this.fwd.get()) {
            osn.ouw((View) this.tlj, i10);
            osn.ouw((View) this.f13714cf, i10);
            osn.ouw((View) this.ryl, i10);
            osn.ouw((View) this.mwh, 0);
        }
    }

    public static boolean fkw(vpp vppVar) {
        tc tcVar;
        if (vppVar == null) {
            return false;
        }
        return (vppVar.f13782pd == 3 && !od.vt(vppVar) && ((vppVar.ex() > 0.0f ? 1 : (vppVar.ex() == 0.0f ? 0 : -1)) == 0 || (vppVar.ex() > 100.0f ? 1 : (vppVar.ex() == 100.0f ? 0 : -1)) == 0)) && (tcVar = vppVar.ccd) != null && tcVar.f13711lh == 1;
    }

    public static /* synthetic */ int jg(th thVar) {
        int i10 = thVar.ux;
        thVar.ux = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int ko(th thVar) {
        int i10 = thVar.lso;
        thVar.lso = i10 + 1;
        return i10;
    }

    public static /* synthetic */ void le(th thVar) {
        LinearLayout.LayoutParams layoutParams;
        if (thVar.f13722ng.get()) {
            return;
        }
        if ((yu(thVar.jqy) || ra(thVar.jqy)) && (thVar.vpp instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.vt)) {
            thVar.ksc.zih();
            thVar.ksc.vm();
        }
        thVar.fwd.set(true);
        thVar.yu(-1);
        thVar.ksc.ryl();
        com.bytedance.sdk.openadsdk.common.mwh mwhVar = thVar.zih;
        if (mwhVar != null) {
            mwhVar.vt();
        }
        if (ra(thVar.jqy)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.jqy, thVar.f13728tc, "show_agg_backup");
            View view = thVar.bly;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) thVar.bly.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                thVar.bly.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = thVar.f13725ra;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$2;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f53147u, view2);
                            safedk_th$2_onClick_655a295566712095149472db742db9b7(view2);
                        }

                        public void safedk_th$2_onClick_655a295566712095149472db742db9b7(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        thVar.pno.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) thVar.pno.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        thVar.pno.setLayoutParams(layoutParams3);
        zih zihVar = thVar.jqy.fak;
        if (zihVar != null && !TextUtils.isEmpty(zihVar.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = thVar.jqy;
            zih zihVar2 = vppVar.fak;
            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar2.ouw, zihVar2.vt, zihVar2.f13812lh, thVar.ryl, vppVar);
        }
        thVar.tlj.setText(thVar.jqy.f13798vh);
        thVar.f13714cf.setText(thVar.jqy.hun);
        if (thVar.mwh != null) {
            vpp vppVar2 = thVar.jqy;
            if (vppVar2 != null && !TextUtils.isEmpty(vppVar2.vpp())) {
                thVar.mwh.setText(thVar.jqy.vpp());
            }
            thVar.mwh.setClickable(true);
            thVar.mwh.setOnClickListener(thVar.osn);
            thVar.mwh.setOnTouchListener(thVar.osn);
        }
        if (!lh(thVar.jqy) || (layoutParams = thVar.yhj) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            thVar.fkw(8);
        } else {
            thVar.fkw(0);
        }
    }

    public static boolean le(vpp vppVar) {
        tc tcVar;
        return (vppVar == null || (tcVar = vppVar.ccd) == null || tcVar.f13711lh != 2) ? false : true;
    }

    public static boolean lh(vpp vppVar) {
        return vppVar != null && vppVar.f13782pd == 3 && vppVar.f13754bs == 38 && vppVar.jqy() == 1;
    }

    public static boolean mwh(vpp vppVar) {
        return (vppVar == null || !com.bytedance.sdk.openadsdk.core.zih.yu().jg() || !vppVar.vm() || vt(vppVar) || yu(vppVar) || ra(vppVar)) ? false : true;
    }

    public static boolean ouw(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5;
    }

    public static /* synthetic */ boolean ouw(th thVar, Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - thVar.njr < 100) {
            return false;
        }
        thVar.njr = jCurrentTimeMillis;
        runnable.run();
        return true;
    }

    public static boolean ouw(vpp vppVar) {
        if (vppVar == null || cf(vppVar) || le(vppVar) || fkw(vppVar)) {
            return false;
        }
        return yu(vppVar) || vt(vppVar) || ra(vppVar);
    }

    public static boolean pno(vpp vppVar) {
        return yu(vppVar) && !cf(vppVar);
    }

    private void ra() {
        this.f13725ra.setVisibility(8);
        if (yu(this.jqy) || ra(this.jqy) || !vt() || lh(this.jqy)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.fak = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.fak.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.f13726rn.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                th thVar = th.this;
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                thVar.lh();
                th.this.f13726rn.setLayoutParams(layoutParams);
            }
        });
        this.fak.start();
    }

    public static boolean ra(vpp vppVar) {
        return vppVar != null && vppVar.fvf == 33;
    }

    public static /* synthetic */ int ryl(th thVar) {
        int i10 = thVar.hun;
        thVar.hun = i10 + 1;
        return i10;
    }

    public static boolean ryl(vpp vppVar) {
        if (vppVar != null) {
            return fkw(vppVar) || le(vppVar);
        }
        return false;
    }

    public static boolean tlj(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.fvf;
        return i10 == 19 || i10 == 20;
    }

    public static /* synthetic */ boolean uq(th thVar) {
        return vpp.fkw(thVar.jqy);
    }

    public static /* synthetic */ boolean vpp(th thVar) {
        thVar.coz = true;
        return true;
    }

    public static boolean vt(vpp vppVar) {
        return vppVar != null && vppVar.f13782pd == 3 && vppVar.fvf == 6 && !od.vt(vppVar) && vppVar.jqy() == 1 && (vppVar.ex() == 0.0f || vppVar.ex() == 100.0f);
    }

    private void yu(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onHideLoadingLayout ->".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.le();
        }
    }

    public static boolean yu(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        if (cf(vppVar)) {
            return true;
        }
        return vppVar.f13782pd == 3 && (vppVar.fvf == 5 || fkw(vppVar)) && !od.vt(vppVar) && (vppVar.ex() == 0.0f || vppVar.ex() == 100.0f);
    }

    public final boolean fkw() {
        AtomicBoolean atomicBoolean;
        return (!lh(this.jqy) || (atomicBoolean = this.ucs) == null || atomicBoolean.get()) ? false : true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        vpp vppVar;
        qbp qbpVar;
        vpp vppVar2;
        qbp qbpVar2;
        int i10 = message.what;
        if (i10 == 100) {
            int i11 = message.arg1;
            long j10 = 20;
            if (yu(this.jqy) && (vppVar2 = this.jqy) != null && (qbpVar2 = vppVar2.f13770kq) != null) {
                j10 = qbpVar2.vt;
            } else if (ra(this.jqy) && (vppVar = this.jqy) != null && (qbpVar = vppVar.f13770kq) != null) {
                j10 = qbpVar.yu;
            }
            lh.ouw ouwVar = this.uoy;
            if (ouwVar != null) {
                ouwVar.ouw(((long) i11) * 1000, j10 * 1000);
            }
            long j11 = i11;
            if (j11 >= j10) {
                lh.ouw ouwVar2 = this.uoy;
                if (ouwVar2 != null) {
                    ouwVar2.ouw(j10 * 1000, 100);
                }
            } else if (j11 < j10 && this.ouw != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i11 + 1;
                this.ouw.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i10 == 101) {
            le();
        }
        return true;
    }

    public final void le() {
        if ("landingpage_split_screen".equals(this.f13728tc) && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("default_split_style", false) && this.euf.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.10
                @Override // java.lang.Runnable
                public final void run() {
                    th.this.myk = ValueAnimator.ofFloat(1.0f, 0.0f);
                    th.this.myk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (th.this.qbp != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.qbp.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                th.this.qbp.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    th.this.myk.setDuration(500L);
                    th.this.myk.start();
                    if (th.this.f13733vm != null) {
                        th.this.f13733vm.setVisibility(8);
                    }
                }
            });
        }
    }

    public final void lh() {
        try {
            this.ksc.ko();
        } catch (Throwable unused) {
        }
    }

    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onPageFinished loadSuccess =" + this.f13722ng.get() + ",hasShowBackup ->" + this.fwd.get());
        if (this.f13722ng.get() || this.fwd.get()) {
            return;
        }
        this.f13722ng.set(true);
        yu(0);
        long jElapsedRealtime = this.xdk == -1 ? 0L : SystemClock.elapsedRealtime() - this.xdk;
        if (lh(this.jqy)) {
            com.bytedance.sdk.openadsdk.yu.lh.lh(this.jqy, this.f13728tc, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(this.jqy, this.f13728tc, System.currentTimeMillis() - this.zin, true);
        ra();
    }

    public final void ouw(@NonNull com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar, FrameLayout frameLayout) {
        this.lvd = qbpVar;
        this.f13717kn = frameLayout;
    }

    public final void vt(int i10) {
        com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar = this.lvd;
        if (qbpVar != null) {
            qbpVar.yu(i10);
        }
    }

    public final boolean vt() {
        int i10 = this.jqy.ucs;
        return i10 == 15 || i10 == 16;
    }

    public final void yu() {
        FrameLayout frameLayout = this.f13726rn;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.qbp;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
}
