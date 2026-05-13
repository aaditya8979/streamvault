package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc f92784a = new bc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg2 f92785b = new bg2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final at2 f92786c = new at2();

    public final fo2 a(g9 g9Var) {
        String str;
        boolean z10;
        fo2 fo2Var = new fo2((Map) null, 3);
        if (g9Var != null) {
            Map map = g9Var.f89883g;
            this.f92784a.getClass();
            HashMap map2 = new HashMap();
            if (!tn.y.m(map2)) {
                map2 = null;
            }
            if (map2 == null) {
                map2 = new LinkedHashMap();
            }
            if (map != null) {
                String str2 = (String) map.get("adapter_network_name");
                String str3 = (String) map.get("adapter_version");
                String str4 = (String) map.get("adapter_network_sdk_version");
                if (str2 != null) {
                    map2.put("adapter_network_name", str2);
                }
                if (str3 != null) {
                    map2.put("adapter_version", str3);
                }
                if (str4 != null) {
                    map2.put("adapter_network_sdk_version", str4);
                }
            }
            this.f92785b.getClass();
            yf2 yf2Var = (yf2) ag2.f87694a.getValue();
            if (yf2Var != null) {
                int iOrdinal = yf2Var.ordinal();
                if (iOrdinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (iOrdinal == 1) {
                    str = "react-native";
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "unity";
                }
            } else {
                str = map != null ? (String) map.get("plugin_type") : null;
            }
            String str5 = map != null ? (String) map.get("plugin_version") : null;
            Map mapD = cn.p0.d();
            if (str != null) {
                mapD.put("plugin_type", str);
            }
            if (str5 != null) {
                mapD.put("plugin_version", str5);
            }
            Map mapC = cn.p0.c(mapD);
            String str6 = g9Var.f89888l;
            at2 at2Var = this.f92786c;
            at2Var.getClass();
            HashMap map3 = new HashMap();
            if (!tn.y.m(map3)) {
                map3 = null;
            }
            if (map3 == null) {
                map3 = new LinkedHashMap();
            }
            dw2 dw2Var = at2Var.f87806a;
            dw2Var.getClass();
            synchronized (dw2.f89000j) {
                z10 = dw2Var.f89008g;
            }
            map3.put("app_ad_analytics_enabled", Boolean.valueOf(z10));
            fo2Var.f89652a.putAll(map2);
            fo2Var.f89652a.putAll(mapC);
            fo2Var.a(str6, "preload_type");
            fo2Var.f89652a.putAll(map3);
        }
        String str7 = g9Var != null ? g9Var.f89884h : null;
        if (str7 != null && str7.length() != 0) {
            fo2Var.a("openbidding", "integration_type");
        }
        return fo2Var;
    }
}
