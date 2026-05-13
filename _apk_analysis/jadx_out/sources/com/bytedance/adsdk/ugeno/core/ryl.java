package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ra;
import com.bytedance.adsdk.ugeno.vt.ouw;
import com.ironsource.C4157n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ryl {
    private pno bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private vm f11654cf;
    public fkw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private cf f11655jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f11657le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11658lh;
    private String mwh;
    public rn ouw;
    private com.bytedance.adsdk.ugeno.vt.lh<View> pno;
    private bly qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private JSONObject f11659ra;
    private ra ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private float f11661th;
    private ko tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f11662vm;
    public com.bytedance.adsdk.ugeno.yu.mwh vt;
    public List<String> yu;
    private com.bytedance.adsdk.ugeno.yu.ouw.ouw zih;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f11656ko = true;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private boolean f11660rn = false;

    public ryl(Context context) {
        this.f11657le = context;
    }

    private void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        if (lhVar == null) {
            return;
        }
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw)) {
            lhVar.ouw(jSONObject);
            return;
        }
        lhVar.ouw(jSONObject);
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno();
        if (listPno == null || listPno.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            ouw(it.next(), jSONObject);
        }
    }

    private com.bytedance.adsdk.ugeno.vt.lh<View> vt(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        ouw.C0182ouw c0182ouwBly;
        List<ra.ouw> listVt;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        vt vtVar = vtVarOuw;
        if (vtVarOuw == null) {
            this.f11658lh = true;
            if (this.yu == null) {
                this.yu = new ArrayList();
            }
            this.yu.add(str);
            ouwVar.vt = "View";
            vt vtVarOuw2 = yu.ouw("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            if (vtVarOuw2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
            str = "View";
            vtVar = vtVarOuw2;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVar.ouw(this.f11657le);
        if (lhVarOuw == null) {
            return null;
        }
        JSONObject jSONObject = ouwVar.f11652lh;
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.f11659ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(jSONObject);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.vt(this.f11659ra);
        ra raVar = this.ryl;
        if (raVar == null) {
            lhVarOuw.ouw(true);
        } else {
            lhVarOuw.ouw(raVar.vt);
        }
        lhVarOuw.bly = this.f11655jg;
        lhVarOuw.lgp = this.zih;
        Iterator<String> itKeys = jSONObject.keys();
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            c0182ouwBly = ouwVar2.bly();
            lhVarOuw.ouw(ouwVar2);
        } else {
            c0182ouwBly = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString(next), this.f11659ra);
            lhVarOuw.ouw(next, strOuw);
            if (this.qbp != null && !TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOuw) && ((TextUtils.equals(next, "src") || TextUtils.equals(next, "backgroundImage")) && strOuw.startsWith("http"))) {
                throw null;
            }
            if (c0182ouwBly != null) {
                c0182ouwBly.ouw(this.f11657le, next, strOuw);
            }
        }
        if (c0182ouwBly != null) {
            lhVarOuw.ouw(c0182ouwBly.ouw());
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList == null || linkedList.size() <= 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it = listVt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt = vt(it.next(), lhVarOuw);
                        if (lhVarVt != null && lhVarVt.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt);
                        }
                    }
                }
                return lhVarOuw;
            }
            if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(linkedList, new Comparator<ra.ouw>() { // from class: com.bytedance.adsdk.ugeno.core.ryl.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(ra.ouw ouwVar3, ra.ouw ouwVar4) {
                        return ouwVar3.f11652lh.optInt(C4157n2.f33012u, 0) - ouwVar4.f11652lh.optInt(C4157n2.f33012u, 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<ra.ouw> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt2 = vt(it2.next(), lhVarOuw);
                if (lhVarVt2 != null && !lhVarVt2.f11847xn) {
                    ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt2, lhVarVt2.vpp());
                }
            }
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    private void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        try {
            if (!lhVar.ex() || lhVar.jqy() == null || lhVar.jqy().yu == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", lhVar.jqy().yu);
            this.f11659ra.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        List<ra.ouw> listVt;
        ouw.C0182ouw c0182ouwBly = null;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        if (vtVarOuw == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(str)));
            this.f11658lh = true;
            if (this.yu == null) {
                this.yu = new ArrayList();
            }
            this.yu.add(str);
            return null;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVarOuw.ouw(this.f11657le);
        if (lhVarOuw == null) {
            return null;
        }
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.f11659ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(ouwVar.f11652lh);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.bly = this.f11655jg;
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            lhVarOuw.ouw(ouwVar2);
            c0182ouwBly = ouwVar2.bly();
        }
        Iterator<String> itKeys = ouwVar.f11652lh.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.f11652lh.optString(next), this.f11659ra);
            lhVarOuw.ouw(next, strOuw);
            if (c0182ouwBly != null) {
                c0182ouwBly.ouw(this.f11657le, next, strOuw);
            }
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList == null || linkedList.size() <= 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it = listVt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw2 = ouw(it.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                        if (lhVarOuw2 != null && lhVarOuw2.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw2);
                        }
                    }
                }
                return lhVarOuw;
            }
            if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<ra.ouw> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw3 = ouw(it2.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                if (lhVarOuw3 != null && lhVarOuw3.uq()) {
                    ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw3);
                }
            }
        }
        if (c0182ouwBly != null) {
            lhVarOuw.ouw(c0182ouwBly.ouw());
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, JSONObject jSONObject) {
        this.f11659ra = jSONObject;
        vm vmVar = this.f11654cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt) {
            throw null;
        }
        this.pno = vt(ouwVar, null);
        vm vmVar2 = this.f11654cf;
        if (vmVar2 != null) {
            vmVar2.vt();
            this.pno.ixm = this.f11654cf;
        }
        ouw(this.pno);
        return this.pno;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject) {
        vm vmVar = this.f11654cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, this.f11659ra);
        this.ryl = raVar;
        if (this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt) {
            throw null;
        }
        this.pno = ouw(raVar.ouw(), (com.bytedance.adsdk.ugeno.vt.lh<View>) null);
        vm vmVar2 = this.f11654cf;
        if (vmVar2 != null) {
            vmVar2.vt();
            this.pno.ixm = this.f11654cf;
        }
        return this.pno;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f11659ra = jSONObject2;
        vm vmVar = this.f11654cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, jSONObject2, jSONObject3);
        this.ryl = raVar;
        float f10 = this.f11662vm;
        float f11 = this.f11661th;
        raVar.f11649lh = f10;
        raVar.yu = f11;
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt) {
            throw null;
        }
        this.pno = vt(this.ryl.ouw(), null);
        if (this.qbp != null) {
            throw null;
        }
        vm vmVar2 = this.f11654cf;
        if (vmVar2 != null) {
            vmVar2.vt();
            com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.pno;
            vm vmVar3 = this.f11654cf;
            lhVar.ixm = vmVar3;
            vmVar3.lh();
        }
        ouw(this.pno);
        if (this.f11654cf != null) {
            zih zihVar = new zih();
            zihVar.ouw = 0;
            zihVar.f11678lh = this.pno;
            this.f11654cf.ouw(zihVar);
        }
        return this.pno;
    }

    public final void ouw(ko koVar) {
        com.bytedance.adsdk.ugeno.core.ouw.ouw ouwVar = com.bytedance.adsdk.ugeno.fkw.ouw().f11680le;
        if (ouwVar == null) {
            this.tlj = koVar;
        } else {
            if (ouwVar.ouw() != null) {
                throw null;
            }
            this.tlj = koVar;
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        JSONObject jSONObjectQbp = lhVar.qbp();
        Iterator<String> itKeys = jSONObjectQbp.keys();
        com.bytedance.adsdk.ugeno.vt.ouw ouwVarTc = lhVar.tc();
        ouw.C0182ouw c0182ouwBly = ouwVarTc != null ? ouwVarTc.bly() : null;
        vt(lhVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectQbp.optString(next), this.f11659ra);
            lhVar.ouw(next, strOuw);
            if (c0182ouwBly != null) {
                c0182ouwBly.ouw(this.f11657le, next, strOuw);
            }
        }
        lhVar.ouw(this.bly);
        lhVar.ouw(this.tlj);
        lhVar.ouw(this.ouw);
        bly blyVar = this.qbp;
        if (blyVar != null) {
            lhVar.f11828ms = blyVar;
        }
        fkw fkwVar = this.fkw;
        if (fkwVar != null) {
            lhVar.ouw(fkwVar);
        }
        com.bytedance.adsdk.ugeno.yu.mwh mwhVar = this.vt;
        if (mwhVar != null) {
            lhVar.ouw(mwhVar);
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && listPno.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
        if (c0182ouwBly != null) {
            lhVar.ouw(c0182ouwBly.ouw());
        }
        lhVar.vt();
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            ouw(it.next(), str, objArr);
        }
    }

    public final void ouw(String str, cf cfVar) {
        this.f11655jg = cfVar;
        this.mwh = str;
        if (cfVar != null) {
            this.f11659ra = cfVar.f11632lh;
        }
    }

    public final void ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        this.f11659ra = jSONObject;
        lhVar.vt(jSONObject);
        lhVar.bly = this.f11655jg;
        ouw.C0182ouw c0182ouwBly = lhVar.tc() instanceof com.bytedance.adsdk.ugeno.vt.ouw ? lhVar.tc().bly() : null;
        Iterator<String> itKeys = lhVar.qbp().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(lhVar.qbp().optString(next), jSONObject);
            lhVar.ouw(next, strOuw);
            if (c0182ouwBly != null) {
                c0182ouwBly.ouw(this.f11657le, next, strOuw);
            }
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && !listPno.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(jSONObject, it.next());
            }
        }
        if (c0182ouwBly != null) {
            lhVar.ouw(c0182ouwBly.ouw());
        }
    }

    public final void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.vt(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            vt(it.next(), str, objArr);
        }
    }

    public final void vt(JSONObject jSONObject) {
        vm vmVar = this.f11654cf;
        if (vmVar != null) {
            vmVar.lh();
        }
        this.f11659ra = jSONObject;
        ouw(this.pno, jSONObject);
        ouw(this.pno);
        if (this.f11654cf != null) {
            zih zihVar = new zih();
            zihVar.ouw = 0;
            zihVar.f11678lh = this.pno;
            this.f11654cf.ouw(zihVar);
        }
    }
}
