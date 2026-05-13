package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class tc {
    private static String fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f14381le = Integer.MAX_VALUE;
    public static boolean ouw;
    public static boolean vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final CharSequence f14382lh = "amigo";
    private static final CharSequence yu = "funtouch";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f14383ra = new ConcurrentHashMap<>();

    public static class ouw implements Callable<String> {
        private final String ouw;

        public ouw(String str) {
            this.ouw = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() throws Exception {
            String str = (String) tc.f14383ra.get(this.ouw);
            if (str != null) {
                return str;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLh = tc.lh(this.ouw);
            com.bytedance.sdk.component.utils.ko.vt("RomUtils", "property:" + strLh + ", use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (strLh != null) {
                tc.f14383ra.put(this.ouw, strLh);
            }
            return strLh;
        }
    }

    private static boolean bly() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean le() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lh(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        Process processExec;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                    } catch (IllegalThreadStateException unused) {
                        bufferedReader = null;
                    }
                } catch (IOException e10) {
                    com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e10);
                }
            } catch (IllegalThreadStateException unused2) {
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            bufferedReader = null;
            th2 = th3;
        }
        try {
            line = bufferedReader.readLine();
            processExec.exitValue();
            bufferedReader.close();
        } catch (IllegalThreadStateException unused3) {
            process = processExec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return line;
        } catch (Throwable th4) {
            th2 = th4;
            try {
                com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                return line;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e11);
                    }
                }
            }
        }
        return line;
    }

    public static boolean lh() {
        if (!vt) {
            try {
                Class.forName("miui.os.Build");
                ouw = true;
                vt = true;
                return true;
            } catch (Exception unused) {
                vt = true;
            }
        }
        return ouw;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[PHI: r0
      0x006c: PHI (r0v28 java.lang.String) = (r0v13 java.lang.String), (r0v15 java.lang.String), (r0v29 java.lang.String) binds: [B:35:0x00cb, B:66:0x01b0, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String ouw() {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.tc.ouw():java.lang.String");
    }

    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = yu("ro.build.version.emui");
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || bly();
    }

    private static boolean pno() {
        if (f14381le == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strFkw = uoy.fkw("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strFkw)) {
                f14381le = 0;
            } else {
                f14381le = 1;
            }
        }
        return f14381le == 1;
    }

    private static String ra() {
        if (le()) {
            try {
                return "smartisan_".concat(String.valueOf(yu("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean vt() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String yu() {
        return yu("ro.build.version.emui");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String yu(String str) {
        String str2;
        com.bytedance.sdk.component.utils.ko.ouw("RomUtils", "getSystemPropertyTask() called with: propName = [", str, C3978d4.j.f31385e);
        String str3 = f14383ra.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.pno.ra raVar = new com.bytedance.sdk.component.pno.ra(new ouw(str));
            bs.vt(new com.bytedance.sdk.component.pno.pno("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.tc.1
                @Override // java.lang.Runnable
                public final void run() {
                    raVar.run();
                }
            });
            str2 = (String) raVar.get(1L, TimeUnit.SECONDS);
        } else {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }
}
