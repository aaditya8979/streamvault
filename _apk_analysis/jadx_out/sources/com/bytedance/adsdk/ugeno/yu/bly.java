package com.bytedance.adsdk.ugeno.yu;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class bly implements cf {
    private boolean bly;
    private com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.vt.ouw f11898le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ouw f11899lh;
    public com.bytedance.adsdk.ugeno.core.fkw ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11900ra;
    public mwh vt;
    private Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> yu;

    public static class ouw {
        public Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> ouw;
        public Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> vt;

        public ouw(Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map, Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map2) {
            this.ouw = map;
            this.vt = map2;
        }
    }

    private bly(com.bytedance.adsdk.ugeno.vt.lh lhVar, ouw ouwVar) {
        this.fkw = lhVar;
        this.f11899lh = ouwVar;
        if (ouwVar != null) {
            this.yu = ouwVar.ouw;
        }
        if (lhVar != null && lhVar.eay && this.f11898le == null) {
            this.f11898le = new com.bytedance.adsdk.ugeno.core.vt.ouw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: JSONException -> 0x00d4, TryCatch #0 {JSONException -> 0x00d4, blocks: (B:5:0x0008, B:8:0x0014, B:9:0x0024, B:11:0x002a, B:13:0x0030, B:33:0x0088, B:35:0x0092, B:37:0x009e, B:40:0x00c1, B:38:0x00ae, B:39:0x00b2, B:16:0x0040, B:19:0x0045, B:21:0x004f, B:22:0x005c, B:24:0x0062, B:27:0x006b, B:31:0x007b, B:28:0x0072, B:41:0x00ca, B:42:0x00ce), top: B:47:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.adsdk.ugeno.yu.bly ouw(com.bytedance.adsdk.ugeno.vt.lh r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.yu.bly.ouw(com.bytedance.adsdk.ugeno.vt.lh, java.lang.String):com.bytedance.adsdk.ugeno.yu.bly");
    }

    public final void lh() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> value;
        ouw ouwVar = this.f11899lh;
        if (ouwVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> entry : ouwVar.ouw.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : value) {
                    if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.yu) {
                        lhVar.ouw = this;
                        lhVar.ouw(new Object[0]);
                    }
                }
            }
        }
    }

    public final List<com.bytedance.adsdk.ugeno.yu.yu.lh> ouw(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map = this.yu;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.yu.get(str);
    }

    public final void ouw() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("shake");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu.cf
    public final void ouw(String str, List<le.ouw> list) {
        com.bytedance.adsdk.ugeno.yu.vt.ouw ouwVarOuw;
        com.bytedance.adsdk.ugeno.core.fkw fkwVar = this.ouw;
        if (fkwVar != null) {
            fkwVar.ouw(str);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<le.ouw> it = list.iterator();
        while (it.hasNext()) {
            le.ouw next = it.next();
            if (next != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = this.fkw;
                vt vtVarOuw = yu.ouw(next.yu);
                if (vtVarOuw == null || (ouwVarOuw = vtVarOuw.ouw(lhVar, str, next)) == null) {
                    ouwVarOuw = new com.bytedance.adsdk.ugeno.yu.vt.lh(lhVar, str, next);
                }
                ouwVarOuw.ouw();
                ouwVarOuw.vt();
            }
        }
    }

    public final void ouw(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarVt = vt(str);
        if (lhVarVt != null) {
            lhVarVt.ouw = this;
            lhVarVt.ouw(objArr);
        }
    }

    public final boolean ouw(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("touchStart");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
                if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.ryl) {
                    lhVar.ouw = this;
                    lhVar.ouw(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw2 = ouw("touchEnd");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw3 = ouw("tap");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw4 = ouw("slide");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar2 : listOuw2) {
                if (lhVar2 instanceof com.bytedance.adsdk.ugeno.yu.yu.cf) {
                    lhVar2.ouw = this;
                    this.bly = lhVar2.ouw(motionEvent);
                }
            }
        }
        if ((listOuw3 == null || listOuw3.isEmpty()) && (listOuw4 == null || listOuw4.isEmpty())) {
            return this.bly;
        }
        if (this.bly && motionEvent.getAction() == 1) {
            return true;
        }
        com.bytedance.adsdk.ugeno.core.vt.ouw ouwVar = this.f11898le;
        if (ouwVar != null) {
            if (ouwVar.ouw(motionEvent)) {
                Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                return false;
            }
            this.f11898le.ouw(this.fkw, motionEvent);
        }
        if (listOuw3 != null && !listOuw3.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar3 : listOuw3) {
                if (lhVar3 instanceof com.bytedance.adsdk.ugeno.yu.yu.bly) {
                    ((com.bytedance.adsdk.ugeno.yu.yu.bly) lhVar3).f11906cf = this.vt;
                    lhVar3.ouw = this;
                    this.f11900ra = lhVar3.ouw(motionEvent);
                }
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f11900ra) {
            return true;
        }
        if (listOuw4 != null && !listOuw4.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar4 : listOuw4) {
                if (lhVar4 instanceof com.bytedance.adsdk.ugeno.yu.yu.fkw) {
                    lhVar4.ouw = this;
                    this.pno = lhVar4.ouw(motionEvent);
                }
            }
        }
        if ((action == 1 || action == 3) && !this.f11900ra && !this.pno && this.f11898le != null) {
            Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
            this.f11898le.ouw(this.fkw);
        }
        return this.f11900ra || this.pno;
    }

    public final com.bytedance.adsdk.ugeno.yu.yu.lh vt(String str) {
        Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map;
        if (this.f11899lh == null || TextUtils.isEmpty(str) || (map = this.f11899lh.vt) == null) {
            return null;
        }
        return map.get(str);
    }

    public final void vt() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("twist");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public final void yu() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("animateState");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }
}
