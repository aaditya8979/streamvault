package com.bytedance.sdk.openadsdk.core.vt;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.lh;
import com.bytedance.sdk.openadsdk.vm.yu;
import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw implements vpp.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final boolean f14023lh;
    public final vpp.ouw ouw;
    public final AdSlot vt;

    public ouw(vpp.ouw ouwVar, AdSlot adSlot, boolean z10) {
        this.ouw = ouwVar;
        this.vt = adSlot;
        this.f14023lh = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
    public final void ouw(final int i10, final String str) {
        AdSlot adSlot;
        if (this.ouw != null) {
            if (bs.le() || !((adSlot = this.vt) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.vpp.ouw.ouw("getads_callback_async", 0) != 1)) {
                this.ouw.ouw(i10, str);
            } else {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.ouw(i10, str);
                    }
                });
            }
            if (!this.f14023lh || this.vt == null) {
                return;
            }
            lh.lh(new yu() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f14401lh = Constants.LOAD_AD;
                    ouwVar.f14402ra = ouw.this.vt.getCodeId();
                    ouwVar.pno = uoy.lh(ouw.this.vt.getDurationSlotType());
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                    ouwVar.mwh = uoy.ouw(ouw.this.vt).toString();
                    return ouwVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
    public final void ouw(final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, final com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        AdSlot adSlot;
        if (this.ouw != null) {
            if (bs.le() || !((adSlot = this.vt) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.vpp.ouw.ouw("getads_callback_async", 0) != 1)) {
                this.ouw.ouw(ouwVar, lhVar);
            } else {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.ouw(ouwVar, lhVar);
                    }
                });
            }
            if (!this.f14023lh || this.vt == null) {
                return;
            }
            lh.vt(new yu() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.4
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar2.f14401lh = Constants.LOAD_AD;
                    ouwVar2.f14402ra = ouw.this.vt.getCodeId();
                    ouwVar2.pno = uoy.lh(ouw.this.vt.getDurationSlotType());
                    ouwVar2.vt = BuildConfig.VERSION_NAME;
                    ouwVar2.mwh = uoy.ouw(ouw.this.vt).toString();
                    return ouwVar2;
                }
            });
        }
    }
}
