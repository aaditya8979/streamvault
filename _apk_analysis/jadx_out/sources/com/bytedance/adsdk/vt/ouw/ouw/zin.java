package com.bytedance.adsdk.vt.ouw.ouw;

import com.bytedance.adsdk.vt.lh.vt.th;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class zin implements lh, ouw.InterfaceC0186ouw {
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f12139le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f12140lh;
    public final boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<ouw.InterfaceC0186ouw> f12141ra = new ArrayList();
    public final th.ouw vt;
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> yu;

    public zin(com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.th thVar) {
        this.f12139le = thVar.ouw;
        this.ouw = thVar.f12067le;
        this.vt = thVar.vt;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = thVar.f12068lh.ouw();
        this.f12140lh = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw2 = thVar.yu.ouw();
        this.yu = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = thVar.fkw.ouw();
        this.fkw = ouwVarOuw3;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        for (int i10 = 0; i10 < this.f12141ra.size(); i10++) {
            this.f12141ra.get(i10).ouw();
        }
    }

    public final void ouw(ouw.InterfaceC0186ouw interfaceC0186ouw) {
        this.f12141ra.add(interfaceC0186ouw);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
    }
}
