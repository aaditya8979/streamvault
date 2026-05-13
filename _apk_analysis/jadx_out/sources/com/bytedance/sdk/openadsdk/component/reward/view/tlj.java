package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj {
    private final vpp bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f13364cf;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Handler f13366lh;
    public yu ouw;
    private final Activity pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    @NonNull
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f13367ra;
    private final String tlj;
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh vt;
    public boolean yu = false;
    public boolean fkw = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13365le = false;

    public tlj(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f13367ra = ouwVar;
        this.pno = ouwVar.jvy;
        this.bly = ouwVar.vt;
        this.tlj = ouwVar.fkw;
    }

    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ouw(vpp vppVar) {
        if (vppVar.f13782pd == 4) {
            return com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.pno, this.tlj);
        }
        return null;
    }

    private void pno() {
        if (vpp.fkw(this.bly)) {
            vpp vppVar = this.bly;
            if (vppVar.wbf == 3 && vppVar.zih() == 0) {
                try {
                    if (this.bly.jqy() == 1) {
                        int iOuw = osn.ouw(zih.ouw(), 90.0f);
                        FrameLayout frameLayout = (FrameLayout) this.ouw.getBackupContainerBackgroundView();
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            layoutParams.bottomMargin = iOuw;
                            frameLayout.setLayoutParams(layoutParams);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final int fkw() {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            return yuVar.getDynamicShowType();
        }
        return 0;
    }

    public final void le() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.jg();
    }

    public final void lh() {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.cf();
        }
    }

    public final FrameLayout ouw() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = yuVar.getVideoFrameLayout();
        if (this.ouw.zih()) {
            pno();
        }
        return videoFrameLayout;
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            return yuVar.ouw(jSONObject, this.f13367ra.vt);
        }
        return null;
    }

    public final void ouw(int i10, String str) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, str);
        }
    }

    public final void ouw(int i10, boolean z10) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i10, z10, false);
        }
    }

    public final void ouw(AdSlot adSlot, th thVar) {
        if (this.f13365le) {
            return;
        }
        this.f13365le = true;
        yu yuVar = new yu(this.f13367ra, adSlot, this.tlj);
        this.ouw = yuVar;
        if (thVar != null) {
            thVar.ouw(yuVar, yuVar.getVideoFrameLayout());
        }
    }

    public final void ouw(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.bly blyVar, com.bytedance.sdk.openadsdk.core.bly.pno pnoVar) {
        vpp vppVar;
        if (this.ouw == null || (vppVar = this.bly) == null) {
            return;
        }
        this.vt = ouw(vppVar);
        blyVar.ouw(this.ouw);
        blyVar.ouw(this.vt);
        this.ouw.setClickListener(blyVar);
        pnoVar.ouw((View) this.ouw);
        pnoVar.ouw(this.vt);
        this.ouw.setClickCreativeListener(pnoVar);
    }

    public final void ouw(ko koVar) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.setExpressVideoListenerProxy(koVar);
    }

    public final void ra() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.ko();
        this.ouw.cf();
    }

    public final void vt() {
        if (this.f13364cf) {
            return;
        }
        this.f13364cf = true;
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.mwh();
        }
        Handler handler = this.f13366lh;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final boolean yu() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return false;
        }
        return yuVar.zih();
    }
}
