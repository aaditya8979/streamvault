package com.bytedance.sdk.openadsdk.jg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.lh;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ra.vt;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.zin;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f14139lh = 2;
    private static volatile ouw ouw = null;
    private static long yu = 3600000;
    private LinkedHashMap<Integer, SoftReference<le>> fkw;
    private final Handler vt;

    public ouw() {
        f14139lh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_count", 2);
        long jOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_duration", 3600000);
        yu = jOuw;
        if (f14139lh <= 0) {
            f14139lh = 2;
        }
        if (jOuw <= 0) {
            yu = 3600000L;
        }
        this.fkw = new LinkedHashMap<>();
        this.vt = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(@NonNull Message message) {
                SoftReference softReference;
                int i10 = message.what;
                if (ouw.this.fkw == null || (softReference = (SoftReference) ouw.this.fkw.get(Integer.valueOf(i10))) == null) {
                    return false;
                }
                le leVar = (le) softReference.get();
                ouw.this.ouw(i10, 2, new vpp(), leVar == null ? "" : leVar.getTag());
                ko.vt("LPPreRenderManager", "time to delete PreRenderModel, reason is MODEL_DESTROY_REASON_OVER_TIME");
                return false;
            }
        });
    }

    public static boolean lh(vpp vppVar) {
        return th.pno(vppVar) || th.vt(vppVar) || th.lh(vppVar);
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (ouw.class) {
                if (ouw == null) {
                    ouw = new ouw();
                }
            }
        }
        return ouw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(int i10, int i11, vpp vppVar, String str) {
        LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i10))) {
            this.fkw.remove(Integer.valueOf(i10));
        }
        Handler handler = this.vt;
        if (handler != null) {
            handler.removeMessages(i10);
        }
        ouw(vppVar, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final int i10, final vpp vppVar, final String str, final boolean z10) {
        ko.ouw("LPPreRenderManager", "begin pre render, useGecko", Boolean.valueOf(z10));
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3
            /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 402
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.jg.ouw.AnonymousClass3.run():void");
            }
        });
    }

    public static /* synthetic */ void ouw(le leVar, String str) {
        if (leVar != null) {
            lh lhVarOuw = lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setMixedContentMode(0);
            ko.ouw("LPPreRenderManager", "begin to render,url is", str);
            zin.ouw(leVar, str);
        }
    }

    public static void ouw(vpp vppVar, String str, final float f10, String str2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.4
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onWebPreRender", Float.valueOf(f10));
                return jSONObject;
            }
        });
    }

    private static void ouw(vpp vppVar, final String str, final int i10) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.5
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i10);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onDeletePreRenderWeb", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public final void ouw(final vpp vppVar) {
        if (vppVar == null || !lh(vppVar)) {
            return;
        }
        vm vmVar = vppVar.f13775mb;
        if (vmVar == null) {
            vmVar = new vm();
        }
        ko.ouw("LPPreRenderManager", "open pre render:", Boolean.valueOf(vppVar.ucs()));
        if (vppVar.ucs()) {
            String str = vppVar.osn;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            final int iHashCode = str.hashCode();
            final String str2 = th.vt(vppVar) ? "landingpage_split_screen" : th.yu(vppVar) ? "landingpage_direct" : th.lh(vppVar) ? "landingpage_split_ceiling" : "";
            LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
            if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                ko.vt("LPPreRenderManager", "mPreRenderLPModelMap has target url, return");
                return;
            }
            HashMap map = new HashMap();
            map.put(vppVar.f13767ki, vppVar);
            int i10 = vmVar.bly;
            if (i10 == 2) {
                vt.ouw().ouw((Map<String, vpp>) map, new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.2
                    @Override // com.bytedance.sdk.openadsdk.ra.vt.ouw
                    public final void ouw() {
                        ouw.this.ouw(iHashCode, vppVar, str2, true);
                    }
                }, true);
                return;
            }
            if (i10 == 1) {
                vt.ouw().ouw((Map<String, vpp>) map, (vt.ouw) null, true);
                ouw(iHashCode, vppVar, str2, true);
            } else if (i10 == 0) {
                ouw(iHashCode, vppVar, str2, false);
            }
        }
    }

    public final le vt(vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.osn)) {
            return null;
        }
        String str = vppVar.osn;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iHashCode = str.hashCode();
        SoftReference<le> softReference = this.fkw.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        le leVar = softReference.get();
        ouw(vppVar, leVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue(), "web_use_pre_render");
        ouw(iHashCode, 3, vppVar, leVar.getTag());
        return leVar;
    }
}
