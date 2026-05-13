package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import com.ironsource.C3978d4;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class F3 {
    public static final float a(float f10) {
        return vn.c.d(f10 * 10.0f) / 10.0f;
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / J5.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        tn.p.k(context, "<this>");
        tn.p.k(intentFilter, "filter");
        C3850x5.f28483a.getClass();
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static final WebResourceResponse a(InputStream inputStream, String str) {
        tn.p.k(inputStream, "<this>");
        tn.p.k(str, "mimeType");
        Map mapG = cn.p0.g(bn.h.a("Access-Control-Allow-Origin", "*"));
        C3850x5.f28483a.getClass();
        return C3850x5.v() ? new WebResourceResponse(str, "UTF-8", 200, "OK", mapG, inputStream) : new WebResourceResponse(str, "UTF-8", inputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3688qh r4, sn.l r5, hn.c r6) {
        /*
            boolean r0 = r6 instanceof com.inmobi.media.D3
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.D3 r0 = (com.inmobi.media.D3) r0
            int r1 = r0.f25290b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25290b = r1
            goto L18
        L13:
            com.inmobi.media.D3 r0 = new com.inmobi.media.D3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25289a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25290b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)     // Catch: java.lang.IllegalStateException -> L43
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.c.b(r6)
            com.inmobi.media.E3 r6 = new com.inmobi.media.E3     // Catch: java.lang.IllegalStateException -> L43
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.IllegalStateException -> L43
            r0.f25290b = r3     // Catch: java.lang.IllegalStateException -> L43
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.lang.IllegalStateException -> L43
            if (r4 != r1) goto L4e
            return r1
        L43:
            r4 = move-exception
            bn.g r5 = com.inmobi.media.P9.f26117a
            com.inmobi.media.L2 r5 = new com.inmobi.media.L2
            r5.<init>(r4)
            com.inmobi.media.P9.a(r5)
        L4e:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F3.a(com.inmobi.media.qh, sn.l, hn.c):java.lang.Object");
    }

    public static final String a(HashMap map) {
        String strEncode;
        String strEncode2;
        tn.p.k(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String string = bo.d0.s1((String) entry.getValue()).toString();
            if (string.length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(C3978d4.j.f31381c);
                }
                tn.x xVar = tn.x.f85368a;
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    tn.p.j(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(string, "UTF-8");
                    tn.p.j(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                String str2 = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2));
                tn.p.j(str2, "format(...)");
                sb2.append(str2);
            }
        }
        String string2 = sb2.toString();
        tn.p.j(string2, "toString(...)");
        return string2;
    }

    public static final String a(Buffer buffer) {
        tn.p.k(buffer, "<this>");
        String strEncodeToString = Base64.encodeToString(buffer.readByteArray(), 0);
        tn.p.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final kotlinx.coroutines.g a(p000do.l0 l0Var, long j10, long j11, sn.l lVar) {
        tn.p.k(l0Var, "<this>");
        tn.p.k(lVar, "action");
        return p000do.i.d(l0Var, null, null, new B3(j10, lVar, j11, null), 3, null);
    }

    public static final void a(wo woVar, RelativeLayout.LayoutParams layoutParams, Df df2) {
        tn.p.k(woVar, "<this>");
        tn.p.k(layoutParams, "layoutParams");
        tn.p.k(df2, "orientation");
        woVar.getClass();
        tn.p.k(df2, "orientation");
        vo voVar = (vo) woVar.f28471a.get(df2);
        int i10 = voVar != null ? voVar.f28393a : 0;
        tn.p.k(df2, "orientation");
        vo voVar2 = (vo) woVar.f28471a.get(df2);
        int i11 = voVar2 != null ? voVar2.f28395c : 0;
        tn.p.k(df2, "orientation");
        vo voVar3 = (vo) woVar.f28471a.get(df2);
        layoutParams.setMargins(i10, 0, i11, voVar3 != null ? voVar3.f28396d : 0);
    }

    public static final void a(p000do.l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        try {
            kotlinx.coroutines.d.e(l0Var, null, 1, null);
        } catch (IllegalStateException unused) {
        }
    }

    public static final boolean a(Context context) {
        ApplicationInfo applicationInfo;
        tn.p.k(context, "<this>");
        C3850x5.f28483a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            tn.p.j(packageInfo, "getPackageInfo(...)");
            applicationInfo = packageInfo.applicationInfo;
        } catch (Exception unused) {
        }
        int i10 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        return i10 >= 35;
    }

    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f10) {
        try {
            return vn.c.d(f10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f10) {
        try {
            return (int) (f10 / J5.b());
        } catch (Exception unused) {
            return 0;
        }
    }
}
