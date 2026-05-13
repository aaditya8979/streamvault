package com.bytedance.sdk.openadsdk.le;

import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.lh;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    private static volatile ouw zih;
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int[] f14150cf;
    public int[] fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f14151jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f14152ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int[] f14153le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f14154lh;
    public boolean mwh;
    public boolean ouw;
    public int[] pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int[] f14155ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f14156rn;
    public boolean ryl;
    public boolean tlj;
    public boolean vt;
    public int[] yu;

    private ouw() {
        vt();
    }

    public static ouw ouw() {
        if (zih == null) {
            synchronized (lh.class) {
                if (zih == null) {
                    zih = new ouw();
                }
            }
        }
        return zih;
    }

    public static /* synthetic */ boolean ouw(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    public static /* synthetic */ int[] vt(String[] strArr) {
        return strArr.length > 0 ? yu(strArr[0].split(StringUtils.COMMA)) : new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] yu(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public final void vt() {
        jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.mwh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("feature_switch", false);
                if (ouw.this.mwh) {
                    try {
                        ouw.this.f14156rn = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("exclude_banner_native", false);
                        ouw.this.f14151jg = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("feature_timer_interval", 10000);
                        ouw.this.f14152ko = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_ad_show_cnt", "1,3,5&session").split(C3978d4.j.f31381c);
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_ad_click_cnt", "1,3,5&session").split(C3978d4.j.f31381c);
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_play_cnt", "1,3,5&session").split(C3978d4.j.f31381c);
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_dislike_cnt", "1,3,5session").split(StringUtils.COMMA);
                        ouw.this.ouw = ouw.ouw(strArrSplit);
                        ouw.this.vt = ouw.ouw(strArrSplit2);
                        ouw.this.f14154lh = ouw.ouw(strArrSplit3);
                        ouw.this.yu = ouw.vt(strArrSplit);
                        ouw.this.fkw = ouw.vt(strArrSplit2);
                        ouw.this.f14153le = ouw.vt(strArrSplit3);
                        ouw.this.f14150cf = ouw.yu(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_landingPage_stay_time", "1,3,5&session").split(C3978d4.j.f31381c);
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_stay_time", "1,3,5&session").split(C3978d4.j.f31381c);
                        ouw.this.bly = ouw.ouw(strArrSplit5);
                        ouw.this.tlj = ouw.ouw(strArrSplit6);
                        ouw.this.f14155ra = ouw.vt(strArrSplit5);
                        ouw.this.pno = ouw.vt(strArrSplit6);
                        ouw.this.ryl = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_30p_session", true);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        });
    }
}
