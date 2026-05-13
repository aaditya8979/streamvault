package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BidCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f38569a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONArray f38570b;

    public static String a(Context context, String str) {
        HashMap map = new HashMap();
        map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        if (com.mbridge.msdk.config.manager.a.b().c()) {
            try {
                com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                lb.a aVar2 = new lb.a(aVar);
                HashMap map2 = new HashMap();
                map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                HashMap map3 = new HashMap();
                map3.put("callback", aVar2);
                map2.put("sdk_context", map3);
                com.mbridge.msdk.config.manager.a.b().a(com.mbridge.msdk.config.component.common.util.c.a(), "create_buyer_id", map2);
                Object objA = aVar.a(5000L);
                if (objA instanceof Map) {
                    Object obj = ((Map) objA).get(CreativeInfo.L);
                    if (obj instanceof String) {
                        return String.valueOf(obj);
                    }
                }
            } catch (Throwable th2) {
                q0.b("BidCommon", th2.getMessage());
                return a(context, map);
            }
        }
        return a(context, map);
    }

    public static String a(Context context, String str, String str2) {
        long jA;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    com.mbridge.msdk.foundation.controller.c.n().b(context);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("BidCommon", e10.getMessage());
                }
            }
        }
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.d());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(1, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(2, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.s());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.t());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.s(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.n(context));
        stringBuffer.append(VastAttributes.HORIZONTAL_POSITION);
        stringBuffer.append(m0.m(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.i());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(3, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(v0.b(20));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.f37695d);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.v());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.h());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(4, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(5, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(a.a(6, gVarD, context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(t0.c());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(t0.a());
        stringBuffer.append(ImpressionLog.Q);
        try {
            jA = l0.a();
        } catch (Exception unused) {
            jA = 0;
        }
        if (jA > 0) {
            stringBuffer.append(jA);
            stringBuffer.append(ImpressionLog.Q);
        } else {
            stringBuffer.append("");
            stringBuffer.append(ImpressionLog.Q);
        }
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b"));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c"));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.j());
        String strA = gVarD != null ? gVarD.a() : "";
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(strA);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(v0.a());
        stringBuffer.append(ImpressionLog.Q);
        String strC = v0.c();
        if (TextUtils.isEmpty(strC)) {
            strC = "";
        }
        stringBuffer.append(strC);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(v0.c(str));
        stringBuffer.append(ImpressionLog.Q);
        if (gVarD != null && gVarD.t0() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append(a.a(7, gVarD, context));
        }
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.E());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.D(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.B() + "");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.C());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() ? "1" : "2");
        stringBuffer.append(ImpressionLog.Q);
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (com.mbridge.msdk.util.b.b()) {
                stringBuffer.append(m0.D());
            } else {
                stringBuffer.append(a.a(8, gVarD, context));
            }
        }
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("1");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c());
        stringBuffer.append(ImpressionLog.Q);
        if (m0.y() != 0) {
            stringBuffer.append(m0.y() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append(ImpressionLog.Q);
            stringBuffer.append(1);
        } else {
            stringBuffer.append(ImpressionLog.Q);
            stringBuffer.append("");
        }
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(str2);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.r(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.q(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.e());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.a());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(com.mbridge.msdk.util.c.f41169b);
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append("");
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(g0.a().b());
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.k(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.u(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(m0.o(context));
        stringBuffer.append(ImpressionLog.Q);
        stringBuffer.append(Build.VERSION.RELEASE);
        return k0.b(stringBuffer.toString());
    }

    public static String a(Context context, Map<String, String> map) {
        String md5;
        f38569a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                com.mbridge.msdk.foundation.controller.c.n().b(context);
            }
            if (f38570b == null) {
                f38570b = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b()).j0();
            }
            md5 = SameMD5.getMD5(v0.d());
            try {
                if (b(context, md5)) {
                    return "";
                }
                Map<String, String> map2 = f38569a;
                return a(context, (map2 == null || !map2.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) ? "" : f38569a.get(BidConstants.BID_FILTER_KEY_UNIT_ID), md5);
            } catch (Exception unused) {
                return a(context, "", md5);
            }
        } catch (Exception unused2) {
            md5 = "";
        }
    }

    private static void a(int i10, JSONObject jSONObject, int i11, int i12) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", "2000122");
                jSONObject2.put("filter", i10);
                jSONObject2.put("network_type", m0.s(contextD));
                jSONObject2.put("timeout", i11);
                if (jSONObject != null && jSONObject.length() > 0) {
                    jSONObject2.put("hitNode", jSONObject);
                }
                jSONObject2.put("hitRate", i12);
                Map<String, String> map = f38569a;
                if (map != null) {
                    if (map.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                        jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, f38569a.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                    }
                    if (f38569a.containsKey(BidConstants.BID_FILTER_KEY_PLACEMENT_ID)) {
                        jSONObject2.put("placementId", f38569a.get(BidConstants.BID_FILTER_KEY_PLACEMENT_ID));
                    }
                    if (f38569a.containsKey(BidConstants.BID_FILTER_KEY_AD_TYPE)) {
                        jSONObject2.put("adType", f38569a.get(BidConstants.BID_FILTER_KEY_AD_TYPE));
                    }
                }
                d.b().a(jSONObject2);
            }
        } catch (Throwable th2) {
            q0.b("BidCommon", th2.getMessage());
        }
    }

    public static void a(Context context, String str, long j10) {
        x0.b(context, str, Long.valueOf(j10));
    }

    private static void a(String str, int i10) {
        e eVar = new e();
        eVar.a("filter", Integer.valueOf(i10));
        eVar.a("lrid", str);
        d.b().b("2000124", eVar);
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d) && str3.endsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e)) {
                String strSubstring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = f38569a;
                if (map != null && map.containsKey(strSubstring)) {
                    String strValueOf = String.valueOf(f38569a.get(strSubstring));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        str = str.replace(str3, strValueOf + "");
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r14 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r12 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if ((r14 - r12) >= (((long) r7.optInt("ttl")) * 1000)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = r7.optDouble("rate");
        r0 = new java.util.Random().nextInt(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r8 == 0.0d) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if ((r8 * 100.0d) < r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r3 = r0;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        r0 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("BidCommon", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbid.common.b.b(android.content.Context, java.lang.String):boolean");
    }
}
