package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class yu implements ko, rn, com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.yu<View> {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private static float f13521cd = 0.0f;
    private static long jae = 0;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private static float f13522od = 0.0f;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private static float f13523pd = 0.0f;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private static float f13524uq = 0.0f;
    public static int zin = 24;
    public com.bytedance.sdk.openadsdk.core.bly.ko bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private qbp f13525bs;
    public JSONObject ex;
    public vpp fkw;
    private fkw fvf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public float f13527jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public float f13528ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f13529le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh<View> f13530lh;
    public com.bytedance.adsdk.ugeno.vt.lh mwh;
    public ryl ouw;
    public com.bytedance.sdk.component.adexpress.vt.pno pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public FrameLayout f13531ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public float f13532rn;
    public com.bytedance.adsdk.ugeno.vt.lh ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.ra f13533tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public long f13534th;
    public jg tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public long f13535vm;
    public String vpp;
    public Context vt;
    public JSONObject yu;
    public float zih;
    public boolean qbp = true;
    public SparseArray<lh.ouw> jqy = new SparseArray<>();
    private String fak = "";
    private final com.bytedance.sdk.component.pno.pno uoy = new com.bytedance.sdk.component.pno.pno("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.1
        @Override // java.lang.Runnable
        public final void run() {
            yu yuVar = yu.this;
            yuVar.yu = yuVar.ouw();
            if (yu.this.f13525bs != null) {
                yu yuVar2 = yu.this;
                yuVar2.fak = yuVar2.f13525bs.getUgenTemplateErrorReason();
            } else {
                yu.this.fak = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.jg.lh().post(yu.this.osn);
        }
    };
    private final Runnable osn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.2
        @Override // java.lang.Runnable
        public final void run() {
            if (yu.this.f13533tc != null) {
                yu yuVar = yu.this;
                yu.ouw(yuVar, yuVar.f13533tc);
            }
        }
    };
    private boolean ey = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f13526cf = new AtomicBoolean(false);

    static {
        if (zih.ouw() != null) {
            zin = zih.vt();
        }
    }

    public yu(Context context, vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        this.vt = context;
        this.ksc = z10;
        this.ouw = new ryl(context);
        this.fkw = vppVar;
        this.f13529le = ouwVar;
        this.f13531ra = new FrameLayout(context);
        if (viewGroup instanceof qbp) {
            this.f13525bs = (qbp) viewGroup;
        }
        this.vpp = ouwVar.ouw;
        JSONObject jSONObjectYu = yu();
        this.ex = jSONObjectYu;
        this.fvf = new fkw(this.vt, this.fkw, this.vpp, jSONObjectYu);
    }

    public static /* synthetic */ void ouw(yu yuVar, com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        vpp vppVar;
        int i10;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
            yuVar.f13529le.vt.ra();
        } else {
            yuVar.f13529le.f13507cd.ouw();
        }
        if (yuVar.yu == null) {
            raVar.ouw(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + yuVar.fak);
            return;
        }
        if (yuVar.ex == null) {
            raVar.ouw(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iFkw = yuVar.fkw();
        ryl rylVar = yuVar.ouw;
        if (rylVar.f11658lh) {
            List<String> list = rylVar.yu;
            if (list == null) {
                raVar.ouw(138, "unknow widget");
                return;
            }
            raVar.ouw(138, "unknow widget;" + list.toString());
            return;
        }
        if (iFkw != 0) {
            raVar.ouw(iFkw, "ugen render fail");
            return;
        }
        if (yuVar.f13530lh == null) {
            raVar.ouw(138, "ugen render error");
            return;
        }
        vt vtVar = new vt();
        yuVar.tlj = vtVar;
        vtVar.vt = true;
        vtVar.ouw = yuVar.vt();
        yuVar.setSoundMute(yuVar.ksc);
        if (yuVar.f13530lh != null) {
            if (yuVar.fkw.osn() && (lhVarFkw = yuVar.f13530lh.fkw("tvskip")) != 0) {
                lhVarFkw.vt(8);
            }
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw2 = yuVar.f13530lh.fkw("skip");
            if (lhVarFkw2 != 0 && (lhVarFkw2 instanceof com.bytedance.adsdk.ugeno.bly.yu.lh)) {
                cf.vt();
                if (!cf.tlj(String.valueOf(yuVar.fkw.fqk())) || (i10 = (vppVar = yuVar.fkw).fvf) == 5 || i10 == 6 || vppVar.lna == 3) {
                    ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw2).mwh("local://tt_close_btn");
                    lhVarFkw2.vt();
                }
            }
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarBly = yuVar.bly();
        yuVar.ryl = lhVarBly;
        if (lhVarBly != null && (lhVarBly instanceof com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt)) {
            ((vt) yuVar.tlj).zih = ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt) lhVarBly).fkw).getVideoView();
        }
        fkw fkwVar = yuVar.fvf;
        if (fkwVar != null) {
            fkwVar.ouw(fkwVar.f13499cf, fkwVar.ryl, fkwVar.mwh);
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarRa = yuVar.ra();
        yuVar.mwh = lhVarRa;
        if (lhVarRa != null && (lhVarRa instanceof com.bytedance.adsdk.ugeno.bly.vt.vt)) {
            ((vt) yuVar.tlj).f13520vm = (FrameLayout) lhVarRa.fkw;
        }
        if (od.lh(yuVar.fkw)) {
            com.bytedance.adsdk.ugeno.vt.lh lhVarPno = yuVar.pno();
            if (lhVarPno instanceof com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) {
                ((vt) yuVar.tlj).f13519th = ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) lhVarPno).fkw).getPlayableView();
            }
        }
        int iOd = yuVar.f13530lh.od();
        int iCd = yuVar.f13530lh.cd();
        com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: width=" + iOd + "; height=" + iCd);
        yuVar.f13531ra.removeAllViews();
        yuVar.f13531ra.addView(yuVar.f13530lh.fkw, new FrameLayout.LayoutParams(iOd, iCd));
        ouw ouwVar = yuVar.f13529le;
        float f10 = ouwVar.f13510uq;
        float f11 = ouwVar.f13509pd;
        com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: adWidth = " + f10 + "; adHeight = " + f11);
        float fOuw = (float) osn.ouw(yuVar.vt, f10);
        float fOuw2 = (float) osn.ouw(yuVar.vt, f11);
        if (yuVar.vt() != 7) {
            yuVar.f13531ra.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (f11 <= 0.0f) {
            yuVar.f13531ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, -2));
        } else {
            yuVar.f13531ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, (int) fOuw2));
        }
        if (f11 <= 0.0f || f10 <= 0.0f) {
            yuVar.f13531ra.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iVt = osn.vt(yuVar.vt, yuVar.f13531ra.getMeasuredWidth());
            int iVt2 = osn.vt(yuVar.vt, yuVar.f13531ra.getMeasuredHeight());
            jg jgVar = yuVar.tlj;
            jgVar.f12444lh = iVt;
            jgVar.yu = iVt2;
        } else {
            jg jgVar2 = yuVar.tlj;
            jgVar2.f12444lh = f10;
            jgVar2.yu = f11;
        }
        if (yuVar.f13526cf.get()) {
            raVar.ouw(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            yuVar.ouw.ouw(yuVar.f13530lh, "renderDidFinish", new Object[0]);
            raVar.ouw(yuVar.f13531ra, yuVar.tlj);
        }
    }

    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.fkw("video");
    }

    public int fkw() {
        this.ouw.ouw(this);
        ryl rylVar = this.ouw;
        rylVar.ouw = this;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw = rylVar.ouw(this.yu);
        this.f13530lh = lhVarOuw;
        final fkw fkwVar = this.fvf;
        if (fkwVar != null && lhVarOuw != null) {
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw = lhVarOuw.fkw("swiperLayout");
            fkwVar.fkw = lhVarFkw;
            if (lhVarFkw instanceof com.bytedance.adsdk.ugeno.lh) {
                fkwVar.f13500jg = fkwVar.tlj.optJSONArray("dpa_data");
                fkwVar.f13503lh = lhVarOuw.fkw("swiperLeftArrow");
                fkwVar.yu = lhVarOuw.fkw("swiperRightArrow");
                com.bytedance.adsdk.ugeno.lh lhVar = (com.bytedance.adsdk.ugeno.lh) fkwVar.fkw;
                com.bytedance.adsdk.ugeno.le.lh lhVar2 = new com.bytedance.adsdk.ugeno.le.lh() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.fkw.1
                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10, float f10, int i11) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                        fkw fkwVar2 = fkw.this;
                        fkwVar2.vt = i10;
                        fkwVar2.ouw = i11;
                        fkwVar2.f13499cf = z10;
                        fkwVar2.ryl = z11;
                        fkwVar2.mwh = z12;
                        fkwVar2.ouw(z10, z11, z12);
                        fkw fkwVar3 = fkw.this;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("index", i10);
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.vt(fkwVar3.f13502le, fkwVar3.f13504ra, "carousel_show", jSONObject);
                    }
                };
                T t10 = lhVar.fkw;
                if (t10 != 0) {
                    ((com.bytedance.adsdk.ugeno.le.vt) t10).setOnPageChangeListener(lhVar2);
                }
            }
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
            this.f13529le.f13507cd.vt();
            this.f13529le.f13507cd.lh();
        }
        this.ouw.vt(this.ex);
        return 0;
    }

    public final void le() {
        this.f13526cf.set(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final View lh() {
        return this.f13531ra;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    public JSONObject ouw() {
        return this.f13529le.ouw();
    }

    public void ouw(long j10, long j11) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
        int i10;
        JSONObject jSONObject;
        boolean zOuw;
        String str;
        fkw fkwVar;
        fkw fkwVar2;
        int i11;
        fkw fkwVar3;
        int i12;
        mwh mwhVar2;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (mwhVar == null) {
            return;
        }
        int i13 = mwhVar.vt;
        int i14 = 4;
        boolean z10 = true;
        if ((i13 == 1 || i13 == 4) && this.pno != null) {
            String strOptString = mwhVar.f11642lh.optString("type");
            if ("swiperLeft".equals(strOptString) && (fkwVar3 = this.fvf) != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = fkwVar3.fkw;
                if ((lhVar instanceof com.bytedance.adsdk.ugeno.lh) && (i12 = fkwVar3.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar).ouw(i12 - 1);
                }
            } else if (!"swiperRight".equals(strOptString) || (fkwVar2 = this.fvf) == null) {
                if (!"swiperClick".equals(strOptString) || (fkwVar = this.fvf) == null) {
                    i10 = 0;
                    jSONObject = null;
                    zOuw = false;
                } else {
                    zOuw = fkwVar.ouw(mwhVar);
                    jSONObject = this.fvf.bly;
                    i10 = 2;
                }
                strOptString.hashCode();
                switch (strOptString) {
                    case "privacy":
                        i14 = 7;
                        break;
                    case "feedback":
                        i14 = 3;
                        break;
                    case "mute":
                        i14 = 5;
                        break;
                    case "skip":
                        i14 = 6;
                        break;
                    case "video":
                        break;
                    case "creative":
                        i14 = 2;
                        break;
                    default:
                        i14 = i10;
                        break;
                }
                com.bytedance.adsdk.ugeno.vt.lh lhVar2 = mwhVar.ouw;
                ko.ouw ouwVar2 = new ko.ouw();
                ouwVar2.f13677le = this.f13527jg;
                ouwVar2.fkw = this.f13528ko;
                ouwVar2.yu = this.f13532rn;
                ouwVar2.f13678lh = this.zih;
                ouwVar2.vt = this.f13535vm;
                ouwVar2.ouw = this.f13534th;
                ko.ouw ouwVarOuw = ouwVar2.ouw(this.jqy);
                if (mwhVar.vt == 1 && !this.qbp) {
                    z10 = false;
                }
                ouwVarOuw.f13676ko = z10;
                if (lhVar2 == null) {
                    str = "";
                } else {
                    str = lhVar2.jae() + "_" + lhVar2.ksc();
                }
                ouwVarOuw.pno = str;
                ouwVarOuw.mwh = zOuw;
                ouwVarOuw.ryl = jSONObject;
                this.pno.ouw(mwhVar.ouw.fkw, i14, ouwVarOuw.ouw());
            } else {
                com.bytedance.adsdk.ugeno.vt.lh lhVar3 = fkwVar2.fkw;
                if ((lhVar3 instanceof com.bytedance.adsdk.ugeno.lh) && (i11 = fkwVar2.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar3).ouw(i11 + 1);
                }
            }
        }
        if (mwhVar.vt == 10) {
            JSONObject jSONObject2 = mwhVar.f11642lh;
            if (this.f13530lh != null && jSONObject2 != null) {
                String strOptString2 = jSONObject2.optString("type");
                String strOptString3 = jSONObject2.optString("nodeId");
                if (!TextUtils.isEmpty(strOptString3) && (lhVarFkw = this.f13530lh.fkw(strOptString3)) != 0) {
                    if (TextUtils.equals(strOptString2, "onShow")) {
                        lhVarFkw.vt(0);
                    } else if (TextUtils.equals(strOptString2, "onDismiss")) {
                        lhVarFkw.vt(8);
                    }
                }
            }
        }
        if (ouwVar == null || (mwhVar2 = mwhVar.yu) == null) {
            return;
        }
        ouwVar.ouw(mwhVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.rn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.yu.ouw(com.bytedance.adsdk.ugeno.vt.lh, android.view.MotionEvent):void");
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, le.ouw ouwVar) {
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.vt.pno pnoVar) {
        this.pno = pnoVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.f13533tc = raVar;
        bs.vt(this.uoy);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.ko koVar) {
        this.bly = koVar;
    }

    public final void ouw(vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        this.fkw = vppVar;
        this.f13529le = ouwVar;
        this.vpp = ouwVar.ouw;
        this.ex = yu();
        this.f13525bs = (qbp) viewGroup;
        this.ksc = z10;
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        fkw fkwVar2 = this.fvf;
        if (fkwVar2 != null) {
            fkwVar2.pno = fkwVar;
        }
    }

    public com.bytedance.adsdk.ugeno.vt.lh pno() {
        return null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh ra() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("PlayableComponent");
    }

    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null || (lhVarFkw = lhVar.fkw(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_unmute");
        }
        lhVarFkw.vt();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTime(java.lang.CharSequence r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r6.f13530lh
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            r2 = 0
            if (r8 != r1) goto Lb
            r8 = r1
            goto Lc
        Lb:
            r8 = r2
        Lc:
            r3 = 8
            if (r0 == 0) goto L9f
            java.lang.String r4 = "countdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.fkw(r4)
            if (r0 == 0) goto L9f
            T extends android.view.View r0 = r0.fkw
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto L9f
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L26
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L26
            goto L35
        L26:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "parse duration exception"
            r4[r2] = r5
            r4[r1] = r7
            java.lang.String r5 = "UGenRender"
            com.bytedance.sdk.component.utils.qbp.yu(r5, r4)
            r4 = r2
        L35:
            if (r10 != 0) goto L9c
            if (r4 <= 0) goto L9c
            boolean r4 = r6.ey
            if (r4 == 0) goto L3e
            goto L9c
        L3e:
            r0.setVisibility(r2)
            if (r8 != 0) goto L6d
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r4 = r6.f13529le
            boolean r5 = r4.f12462vm
            if (r5 == 0) goto L6d
            java.lang.String r4 = r4.ouw
            boolean r4 = com.bytedance.sdk.component.adexpress.yu.le.ouw(r4)
            if (r4 == 0) goto L6d
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r7 = com.bytedance.sdk.component.adexpress.yu.ouw()
            java.lang.String r4 = "tt_reward_full_skip"
            java.lang.String r7 = com.bytedance.sdk.component.utils.vpp.ouw(r7, r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r2] = r9
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.setText(r7)
            goto L9f
        L6d:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r9 = r6.f13529le
            java.lang.String r9 = r9.ouw
            java.lang.String r4 = "open_ad"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L85
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r9 = r6.f13529le
            boolean r9 = r9.f12462vm
            if (r9 == 0) goto L85
            r6.ey = r1
            r0.setVisibility(r3)
            goto L9f
        L85:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = "s"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r0.setText(r7)
            goto L9f
        L9c:
            r0.setVisibility(r3)
        L9f:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r7 = r6.f13530lh
            if (r7 == 0) goto Lb9
            java.lang.String r9 = "skip"
            com.bytedance.adsdk.ugeno.vt.lh r7 = r7.fkw(r9)
            if (r7 == 0) goto Lb9
            T extends android.view.View r7 = r7.fkw
            if (r7 == 0) goto Lb9
            if (r8 == 0) goto Lb2
            goto Lb6
        Lb2:
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            r2 = r3
        Lb6:
            r7.setVisibility(r2)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.yu.setTime(java.lang.CharSequence, int, int, boolean):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i10) {
    }

    public int vt() {
        return this.fkw.kfa;
    }

    public JSONObject yu() {
        return this.f13529le.f13508od;
    }
}
