package com.bytedance.sdk.openadsdk.yu;

import com.bytedance.sdk.openadsdk.yu.lh.ouw;
import com.ironsource.C4157n2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class vt {
    public static final String ouw = ouw.InterfaceC0265ouw.ouw;
    public static final String vt = ouw.InterfaceC0265ouw.vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String f14526lh = ouw.InterfaceC0265ouw.f14465lh;
    public static final String yu = ouw.InterfaceC0265ouw.yu;
    public static final String fkw = ouw.InterfaceC0265ouw.fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public static final String f14525le = ouw.InterfaceC0265ouw.f14464le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final Set<String> f14527ra = new HashSet(Arrays.asList("click", C4157n2.f33013v, "insight_log"));

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public static String f14528lh = "direct";
        public static String ouw = "openDetailPage";
        public static String vt = "openAdLandPageLinks";
        public static String yu = "saLandingPageLinks";
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.yu.vt$vt, reason: collision with other inner class name */
    public static class C0269vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public static int f14529lh = 100;
        public static int ouw = 1;
        public static int vt = 2;
    }

    public static boolean ouw(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
