package com.bytedance.sdk.openadsdk.core.mwh.fkw;

import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.bly;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ryl;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.tlj;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public static final com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw ouw = new com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.ouw();

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(final com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh r21, final com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0167ouw r22) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh, com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw$ouw):void");
    }

    public static /* synthetic */ void ouw(lh lhVar, vpp vppVar) {
        if (ouw(lhVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
            ouwVarOuw.f14421lh = new bly(lhVar.pno(), lhVar.lh());
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(ouwVarOuw);
        }
    }

    public static /* synthetic */ void ouw(lh lhVar, vpp vppVar, long j10) {
        if (ouw(lhVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
            ryl rylVar = new ryl();
            rylVar.ouw = lhVar.pno();
            rylVar.vt = lhVar.lh();
            rylVar.f14423lh = j10;
            if (lhVar.zin == 1) {
                rylVar.yu = 1L;
            } else {
                rylVar.yu = 0L;
            }
            ouwVarOuw.f14421lh = rylVar;
            com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_success", ouwVarOuw);
        }
    }

    private static boolean ouw(lh lhVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(lh lhVar, vpp vppVar, long j10, int i10, String str) {
        if (ouw(lhVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
            tlj tljVar = new tlj();
            tljVar.ouw = lhVar.pno();
            tljVar.vt = lhVar.lh();
            tljVar.f14425lh = j10;
            tljVar.yu = i10;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            tljVar.fkw = str;
            tljVar.f14424le = "";
            ouwVarOuw.f14421lh = tljVar;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(ouwVarOuw);
        }
    }
}
