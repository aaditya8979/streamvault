package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.WorkerThread;
import com.bykv.vk.openvk.ouw.ouw.ouw.ouw;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.jg;
import com.bytedance.sdk.openadsdk.ko.mwh;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lh extends com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw {

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private final String f13871cj;
    public vt fqk;
    public int hun;
    public WeakReference<lh.yu> jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private WeakReference<ouw> f13872kn;
    private long lso;
    private int mt;
    private int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private boolean f13873ng;
    private final boolean pv;
    public boolean rrs;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private final boolean f13874ub;
    private int ucs;
    private long ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f13875vh;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private final boolean f13876wp;
    private final Runnable xdk;
    private final ouw.InterfaceC0168ouw yhj;
    private ra yib;
    private final ksc.ouw zvq;

    public interface ouw {
        void le();

        void ra();
    }

    public lh(Context context, ViewGroup viewGroup, vpp vppVar, String str, boolean z10, boolean z11, boolean z12, ra raVar) {
        super(context, vppVar, viewGroup);
        this.ux = 0L;
        this.lso = 0L;
        this.rrs = true;
        this.ucs = 0;
        this.f13875vh = 0;
        this.yhj = new ouw.InterfaceC0168ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1
            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.vt(lh.this.bly);
                }
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.ouw(1);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void lh(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 5);
                            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.pno, 5);
                            if (lh.this.f13825cd != null) {
                                lh.this.f13825cd.ouw(9);
                            }
                        } catch (Exception unused) {
                        }
                        lh.fkw(lh.this);
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                yuVar.lh(lh.this.bly);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
                lh.sd(lh.this);
                lh.this.f13830lh.removeCallbacks(lh.this.xdk);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.f13833ra.vt();
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.ouw(5);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11) {
                bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ksc();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11, int i12) {
                lh.mt(lh.this);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f13833ra != null) {
                            lh.this.f13833ra.vm();
                            lh.this.f13830lh.postDelayed(lh.this.xdk, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 2);
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.ouw(4);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10) {
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh.cf(lh.this);
                lh.this.f13830lh.removeCallbacks(lh.this.xdk);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f13833ra != null) {
                            lh.this.f13833ra.vt();
                        }
                        if (!lh.this.f13828ko || lh.this.f13872kn == null || lh.this.f13872kn.get() == null) {
                            return;
                        }
                        ((ouw) lh.this.f13872kn.get()).le();
                    }
                });
                lh.this.osn();
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.vt();
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, final long j10, final long j11) {
                if (Math.abs(j10 - lh.this.bly) < 50) {
                    return;
                }
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ouw(j10, j11);
                        lh.this.vt(j10, j11);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, final com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar2) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                if (vpp.le(lh.this.pno)) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.5
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            try {
                                ouwVar3.f14401lh = "video_player";
                                ouwVar3.pno = uoy.ouw(lh.this.pno);
                                ouwVar3.vt = BuildConfig.VERSION_NAME;
                            } catch (Throwable unused) {
                            }
                            return ouwVar3;
                        }
                    });
                }
                ko.fkw(lh.this.ouw, "onError: " + ouwVar2.ouw + ", " + ouwVar2.vt + ", " + ouwVar2.f11279lh);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar3 = ouwVar2;
                        int i10 = ouwVar3.ouw;
                        int i11 = ouwVar3.vt;
                        if (!lh.this.fvf() || i11 == -1004) {
                            if (lh.ouw(lh.this, i10, i11)) {
                                ko.fkw(lh.this.ouw, "Play video error，show result page、、、、、、、");
                                lh.this.f13833ra.ouw(lh.this.pno);
                                lh lhVar = lh.this;
                                lhVar.f13827jg = true;
                                lhVar.ko();
                            }
                            if (lh.this.f13833ra != null) {
                                lh.this.f13833ra.vt();
                            }
                            if (lh.this.f13831od != null) {
                                lh.this.f13831od.vt(lh.this.lso, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(lh.this.bly, lh.this.f13824bs));
                            }
                            if (lh.this.jvy == null || lh.this.jvy.get() == null || lh.this.fvf()) {
                                return;
                            }
                            ((lh.yu) lh.this.jvy.get()).ouw(i10, i11);
                        }
                    }
                });
                lh.this.ouw(ouwVar2);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 6);
                com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(lh.this.pno);
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.ouw(14);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, boolean z13) {
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f13833ra != null) {
                            lh.this.f13833ra.vt();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                lh.this.f13830lh.removeCallbacks(lh.this.xdk);
                lh.this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.jvy != null && lh.this.jvy.get() != null) {
                            ((lh.yu) lh.this.jvy.get()).k_();
                        }
                        if (lh.this.f13833ra != null) {
                            lh.this.f13833ra.vt();
                        }
                    }
                });
                if (lh.this.f13874ub) {
                    return;
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0168ouw
            public final void yu(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(lh.this.bly);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 3);
                if (lh.this.f13825cd != null) {
                    lh.this.f13825cd.ouw(0);
                }
            }
        };
        this.mt = 0;
        this.xdk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.f13833ra != null) {
                    lh.this.f13833ra.ouw(lh.this.pno);
                    lh.this.f13833ra.vt();
                    lh lhVar = lh.this;
                    lhVar.f13827jg = true;
                    ko.fkw(lhVar.ouw, "Show result page after error.......showAdCard");
                }
            }
        };
        this.zvq = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            @WorkerThread
            public final void ouw(boolean z13, final int i10) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.ouw(lh.this, i10);
                    }
                });
            }
        };
        this.f13873ng = false;
        this.myk = ksc.ouw(context, 60000L);
        vt(z10);
        this.f13871cj = str;
        try {
            this.ucs = viewGroup.getWidth();
            this.f13875vh = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        ViewGroup jgVar = this.f13828ko ? new jg(context) : new mwh(context);
        boolean z13 = this.f13828ko;
        if (z13) {
            this.f13833ra = new fkw(context, jgVar, this.pno, this, z13);
        } else {
            this.f13833ra = new yu(context, jgVar, this.pno, this);
        }
        this.f13833ra.ouw((com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw) this);
        this.f13874ub = true;
        this.pv = z11;
        this.f13876wp = z12;
        if (raVar != null) {
            this.yib = raVar;
        }
    }

    public static /* synthetic */ boolean cf(lh lhVar) {
        lhVar.f13835tc = false;
        return false;
    }

    public static /* synthetic */ void fkw(lh lhVar) {
        lhVar.mt++;
        fkw fkwVar = lhVar.f13833ra;
        if (fkwVar != null) {
            fkwVar.vt();
            lh.ouw ouwVar = lhVar.f13831od;
            if (ouwVar != null) {
                ouwVar.ouw(lhVar.lso, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(lhVar.bly, lhVar.f13824bs));
            }
            lhVar.lso = System.currentTimeMillis() - lhVar.ux;
            if (lhVar.rrs) {
                lhVar.f13833ra.ouw(lhVar.pno);
            }
            if (!lhVar.vpp) {
                lhVar.vpp = true;
                long j10 = lhVar.f13824bs;
                lhVar.vt(j10, j10);
                long j11 = lhVar.f13824bs;
                lhVar.bly = j11;
                lhVar.tlj = j11;
                lhVar.vt(lhVar.yib);
            }
            if (!lhVar.f13828ko && lhVar.f13836th) {
                lhVar.pd();
            }
            lhVar.f13827jg = true;
        }
    }

    private void fqk() {
        ko.vt(this.ouw, "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f13829le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                if (this.mwh) {
                    cd();
                } else {
                    vt(this.fak);
                }
                ko.vt(this.ouw, "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
            } else {
                this.f13829le.ouw(false, this.bly, this.f13834rn);
            }
        }
        if (this.qbp.get()) {
            fak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.ouw.ouw.ouw.le.vt hun() {
        fkw fkwVar;
        if (this.f13826cf.getResources().getConfiguration().orientation != 1 || (fkwVar = this.f13833ra) == null) {
            return null;
        }
        return fkwVar.f13845le;
    }

    public static /* synthetic */ boolean mt(lh lhVar) {
        lhVar.f13835tc = true;
        return true;
    }

    public static /* synthetic */ void ouw(lh lhVar, int i10) {
        lhVar.yu(i10);
        if (i10 == 4) {
            lhVar.zih = false;
        }
    }

    public static /* synthetic */ boolean ouw(lh lhVar, int i10, int i11) {
        ko.vt(lhVar.ouw, "OnError - Error code: " + i10 + " Extra code: " + i11);
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    public static /* synthetic */ boolean sd(lh lhVar) {
        lhVar.f13835tc = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        this.pno.f13796uq = j10;
        this.bly = j10;
        this.f13824bs = j11;
        this.f13833ra.ouw(j10, j11);
        this.f13833ra.ouw(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10, j11));
        try {
            lh.ouw ouwVar = this.f13831od;
            if (ouwVar != null) {
                ouwVar.ouw(j10, j11);
            }
        } catch (Throwable th2) {
            qbp.ouw(this.ouw, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.ouw(j10, j11, this.f13825cd);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void bly() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f13829le;
        if (lhVar != null) {
            lhVar.ryl();
        }
    }

    public final void ey() {
        if (this.f13873ng || !this.jqy) {
            return;
        }
        Context applicationContext = zih.ouw().getApplicationContext();
        this.f13873ng = true;
        ksc.ouw(this.zvq, applicationContext);
    }

    public final void fkw(boolean z10) {
        if (z10 || this.fvf) {
            if (z10) {
                this.fvf = false;
            }
            if (this.vpp || !this.qbp.get()) {
                return;
            }
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(rn());
            ouwVar.vt(th());
            ouwVar.vt = zih();
            ouwVar.tlj = 3;
            ouwVar.ryl = vm();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.f13833ra, ouwVar, this.yib);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void jg() {
        if (!this.vpp && this.qbp.get()) {
            fkw(false);
            this.vpp = false;
        }
        ko();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f13825cd;
        if (leVar != null) {
            leVar.yu();
        }
    }

    public final void jvy() {
        if (this.f13829le != null) {
            this.f13827jg = false;
            uoy();
            this.qbp.set(false);
            this.vpp = false;
            ouw(this.yib);
            this.f13829le.ryl();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ko() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f13829le;
        if (lhVar != null) {
            lhVar.jg();
            this.f13829le = null;
        }
        if (this.rrs) {
            if ("embeded_ad".equals(this.f13871cj)) {
                this.f13833ra.zin();
            } else {
                this.f13833ra.ouw(this.pno);
            }
            this.f13830lh.removeCallbacksAndMessages(null);
            this.ryl.clear();
            if (this.f13828ko) {
                rrs();
            }
        }
    }

    public final void ksc() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        int i10;
        int i11;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (hun() != null && (lhVar = this.f13829le) != null && this.ksc != null) {
                int iYu = lhVar.yu();
                int iFkw = this.f13829le.fkw();
                final int width = this.ksc.getWidth();
                final int height = this.ksc.getHeight();
                if (width > 0 && height > 0 && iFkw > 0 && iYu > 0) {
                    if (iYu == iFkw) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iYu > iFkw) {
                        i11 = (int) ((((double) width) * 1.0d) / ((double) ((iYu * 1.0f) / iFkw)));
                        i10 = width;
                    } else {
                        i10 = (int) ((((double) height) * 1.0d) / ((double) ((iFkw * 1.0f) / iYu)));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
                    }
                    this.f13830lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (lh.this.hun() instanceof TextureView) {
                                    ((TextureView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                } else if (lh.this.hun() instanceof SurfaceView) {
                                    ((SurfaceView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                }
                            } catch (Throwable unused) {
                                com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] setLayoutParams exception");
                            }
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, " container or video exist size <= 0");
                return;
            }
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-1] >>>>> mContextRef=" + this.f13826cf + ",getIRenderView() =" + hun());
            String str = this.ouw;
            StringBuilder sb2 = new StringBuilder("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z10 = true;
            sb2.append(this.f13829le == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f13829le == null) {
                z10 = false;
            }
            sb2.append(z10);
            com.bytedance.sdk.component.utils.ko.vt(str, sb2.toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-11] >>>>> changeVideoSize error !!!!! ：".concat(String.valueOf(th2)));
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void mwh() {
        jg();
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.pno.uq()) {
            return null;
        }
        if (this.f13825cd == null) {
            this.f13825cd = new com.bytedance.sdk.openadsdk.core.ryl.le();
        }
        this.f13825cd.ouw(view, this.pno);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.f13825cd.ouw((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.f13825cd;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f13829le;
        if (lhVar == null) {
            return;
        }
        if (lhVar.le()) {
            cf();
            this.f13833ra.le(true);
            this.f13833ra.pno();
            return;
        }
        if (this.f13829le.ra()) {
            yu(false);
            fkw fkwVar = this.f13833ra;
            if (fkwVar != null) {
                fkwVar.le(false);
                return;
            }
            return;
        }
        fkw fkwVar2 = this.f13833ra;
        if (fkwVar2 != null) {
            fkwVar2.lh(this.ksc);
        }
        lh(this.bly);
        fkw fkwVar3 = this.f13833ra;
        if (fkwVar3 != null) {
            fkwVar3.le(false);
        }
    }

    public final void ouw(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.ucs = i10;
        this.f13875vh = i11;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "width=" + i10 + "height=" + i11);
    }

    public final void ouw(ouw ouwVar) {
        this.f13872kn = new WeakReference<>(ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        super.ouw(lhVar);
        if (this.f13829le != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(lhVar.pno())) {
            com.bytedance.sdk.component.utils.ko.fkw(this.ouw, "[video] play video stop , because no video info");
            return false;
        }
        this.f13827jg = false;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "url is " + lhVar.pno());
        lhVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        int i10 = this.hun + 1;
        this.hun = i10;
        lhVar.jqy = i10;
        vt(lhVar);
        uoy();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f13825cd;
        if (leVar != null) {
            leVar.ouw(false, 0.0f);
        }
        if (!ex.vt(this.f13871cj) || this.bly <= 0) {
            this.bly = lhVar.tlj;
        }
        if (ex.vt(this.f13871cj) && this.bly == this.f13824bs) {
            this.bly = 0L;
        }
        long j10 = lhVar.tlj;
        if (j10 <= 0) {
            this.vpp = false;
            this.qbp.set(false);
        } else {
            this.bly = j10;
            this.tlj = Math.max(this.tlj, j10);
        }
        fkw fkwVar = this.f13833ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            if (this.mt == 0) {
                this.f13833ra.tlj();
            }
            this.f13833ra.vt(lhVar.f11274ra, lhVar.pno);
            this.f13833ra.lh(this.ksc);
            this.f13833ra.ouw(lhVar.f11274ra, lhVar.pno);
        }
        if (this.f13829le == null) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.mwh.yu.lh();
            this.f13829le = lhVar2;
            lhVar2.ouw(this.yhj);
        }
        od();
        this.lso = 0L;
        try {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[video] playVideo has invoke !");
            lhVar.f11270ko = 0;
            this.f13829le.ouw(lhVar);
            this.ux = System.currentTimeMillis();
            this.f13833ra.lh(8);
            this.f13833ra.lh(0);
            ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (lh.this.f13829le == null) {
                        return;
                    }
                    lh.this.ux = System.currentTimeMillis();
                    lh.this.f13833ra.yu(0);
                    lh.this.f13829le.ouw(true, lh.this.bly, lh.this.f13834rn);
                }
            });
            if (this.f13828ko) {
                ey();
            }
            return true;
        } catch (Exception e10) {
            ouw(new com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(e10.getMessage()));
            qbp.lh(this.ouw, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final void pd() {
        this.f13836th = !this.f13836th;
        if (!(this.f13826cf instanceof Activity)) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "context is not activity, not support this function.");
            return;
        }
        fkw fkwVar = this.f13833ra;
        if (fkwVar != null) {
            fkwVar.vt(this.ksc);
            this.f13833ra.yu(false);
        }
        lh(1);
        WeakReference<lh.vt> weakReference = this.jae;
        lh.vt vtVar = weakReference != null ? weakReference.get() : null;
        if (vtVar != null) {
            vtVar.ouw(this.f13836th);
        }
    }

    public final void rrs() {
        if (this.f13873ng && this.jqy) {
            this.f13873ng = false;
            ksc.ouw(this.zvq);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ryl() {
        fkw fkwVar = this.f13833ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.f13833ra;
        if (fkwVar2 != null) {
            fkwVar2.th();
        }
        fqk();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yu(int r10) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.yu(int):void");
    }

    public final void yu(boolean z10) {
        fkw fkwVar = this.f13833ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.f13833ra;
        if (fkwVar2 != null && z10) {
            fkwVar2.th();
        }
        fqk();
    }
}
