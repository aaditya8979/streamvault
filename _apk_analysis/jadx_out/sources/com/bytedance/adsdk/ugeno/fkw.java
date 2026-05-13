package com.bytedance.adsdk.ugeno;

import com.bytedance.adsdk.ugeno.yu.pno;
import com.bytedance.adsdk.ugeno.yu.tlj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fkw {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile fkw f11679ra;
    public com.bytedance.adsdk.ugeno.core.vt.yu fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.core.ouw.ouw f11680le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw f11681lh;
    public List<com.bytedance.adsdk.ugeno.core.vt> ouw;
    public com.bytedance.adsdk.ugeno.core.lh vt;
    public com.bytedance.adsdk.ugeno.lh.ouw yu;

    private fkw() {
    }

    public static fkw ouw() {
        if (f11679ra == null) {
            synchronized (fkw.class) {
                if (f11679ra == null) {
                    f11679ra = new fkw();
                }
            }
        }
        return f11679ra;
    }

    public static void ouw(com.bytedance.adsdk.ugeno.yu.lh lhVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.fkw().ouw());
        arrayList.addAll(lhVar.ouw());
        com.bytedance.adsdk.ugeno.yu.yu.ouw(arrayList);
    }

    public static void ouw(pno pnoVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.ouw().ouw());
        arrayList.addAll(pnoVar.ouw());
        tlj.ouw(arrayList);
    }
}
