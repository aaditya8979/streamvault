package com.bytedance.sdk.openadsdk.vm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.zih;
import com.ironsource.mediationsdk.metadata.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile HandlerThread f14395lh = pno.ouw("pag__bus_monitor", 0);
    private static volatile ouw ouw;
    private static Boolean vt;
    private static volatile Handler yu;

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler fkw() {
        if (f14395lh == null || !f14395lh.isAlive()) {
            synchronized (jg.class) {
                if (f14395lh == null || !f14395lh.isAlive()) {
                    f14395lh = pno.ouw("csj_init_handle", -1);
                    yu = new Handler(f14395lh.getLooper());
                }
            }
        } else if (yu == null) {
            synchronized (jg.class) {
                if (yu == null) {
                    yu = new Handler(f14395lh.getLooper());
                }
            }
        }
        return yu;
    }

    public static void lh(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 0, 0, 1));
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                if (ouw == null) {
                    ouw = ouw.ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.vm.lh.1
                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final Context getContext() {
                            return zih.ouw();
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final Handler getHandler() {
                            return lh.fkw();
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final int getOnceLogCount() {
                            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "once_count", 10);
                            if (iOuw > 100 || iOuw < 5) {
                                return 10;
                            }
                            return iOuw;
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final int getOnceLogInterval() {
                            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "once_interval", 10000);
                            if (iOuw < 10000) {
                                return 10000;
                            }
                            return iOuw;
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final HandlerThread getSafeHandlerThread(String str, int i10) {
                            return pno.ouw(str, i10);
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final int getUploadIntervalTime() {
                            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "interval", BrandSafetyUtils.f51650g);
                            return iOuw < 3600000 ? BrandSafetyUtils.f51650g : iOuw;
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final boolean isMonitorOpen() {
                            if (lh.vt != null) {
                                return lh.vt.booleanValue();
                            }
                            Boolean unused = lh.vt = Boolean.valueOf(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", a.f32685j, 1) == 1);
                            return lh.vt.booleanValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.vm.vt
                        public final void onMonitorUpload(List<com.bytedance.sdk.openadsdk.vm.vt.ouw> list) {
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            for (final com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar : list) {
                                com.bytedance.sdk.openadsdk.rn.lh.ouw();
                                com.bytedance.sdk.openadsdk.rn.lh.ouw("bus_monitor", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.vm.lh.1.1
                                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("sdk_version", ouwVar.vt);
                                            jSONObject.put("scene", ouwVar.f14401lh);
                                            jSONObject.put("start_count", ouwVar.yu);
                                            jSONObject.put("success_count", ouwVar.fkw);
                                            jSONObject.put("fail_count", ouwVar.f14400le);
                                            jSONObject.put("rit", ouwVar.f14402ra);
                                            jSONObject.put("tag", ouwVar.pno);
                                            jSONObject.put("label", ouwVar.bly);
                                            jSONObject.put("mediation", ouwVar.f14399cf);
                                            jSONObject.put("is_init", ouwVar.ryl);
                                            jSONObject.put("extra", ouwVar.mwh);
                                            jSONObject.put("date_device", ouwVar.tlj);
                                            String string = jSONObject.toString();
                                            com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                                            yuVar.ouw = "bus_monitor";
                                            yuVar.bly = string;
                                            ko.vt("BusMonitorUtils", "logStr = ", string);
                                            return yuVar;
                                        } catch (Exception e10) {
                                            qbp.ouw("BusMonitorUtils", "onMonitorUpload: ", e10);
                                            return null;
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
        return ouw;
    }

    public static void ouw(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 1, 0, 0));
    }

    public static void vt() {
        ouw().ouw(true);
    }

    public static void vt(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 0, 1, 0));
    }
}
