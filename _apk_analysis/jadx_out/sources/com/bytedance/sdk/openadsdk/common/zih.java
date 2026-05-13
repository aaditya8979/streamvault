package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.model.od;

/* JADX INFO: loaded from: classes12.dex */
public abstract class zih {
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13121le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13122lh;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f13123ra;
    public String vt;
    public String yu;

    public zih(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f13123ra = ouwVar;
        if (this.vt == null) {
            try {
                this.vt = vpp.ouw(ouwVar.hun, "tt_reward_msg");
                this.f13122lh = vpp.ouw(ouwVar.hun, "tt_msgPlayable");
                this.f13121le = vpp.ouw(ouwVar.hun, "tt_negtiveBtnBtnText");
                this.yu = vpp.ouw(ouwVar.hun, "tt_postiveBtnText");
                this.fkw = vpp.ouw(ouwVar.hun, "tt_postiveBtnTextPlayable");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("RewardTipDialogHelper", "init res text failed：" + th2.getMessage());
            }
        }
    }

    private boolean le() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13123ra;
        return !ouwVar.euf && ouwVar.tlj.get();
    }

    public static /* synthetic */ void ouw(zih zihVar, boolean z10) {
        zihVar.f13123ra.ex.cf();
        if (z10) {
            zihVar.f13123ra.ksc.ouw(1000);
        }
        zihVar.f13123ra.qbp.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pno() {
        if (!od.pno(this.f13123ra.vt)) {
            return false;
        }
        this.f13123ra.ksc.ra();
        return true;
    }

    private boolean ra() {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        return com.bytedance.sdk.openadsdk.core.settings.cf.le(String.valueOf(this.f13123ra.f13265le));
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13123ra;
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.qbp.yu("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f13261gh;
        if (pnoVar == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw)) {
            ouwVar.ex.zih();
            ouw.ouw(this.f13123ra);
            ouw(this.f13123ra);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).bly()) {
                return;
            }
            yu();
        }
    }

    public abstract boolean lh();

    public abstract void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar);

    public abstract boolean ouw();

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(final boolean r5, boolean r6, final java.lang.Runnable r7) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.zih.ouw(boolean, boolean, java.lang.Runnable):boolean");
    }

    public abstract void vt();

    public abstract void yu();
}
