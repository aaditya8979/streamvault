package com.inmobi.media;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Oc {
    public static final String a(String str, Mc mc2, Map map) {
        tn.p.k(str, "<this>");
        tn.p.k(mc2, "nativeBeaconModel");
        tn.p.k(map, "extraMacros");
        String strS = bo.a0.S(bo.a0.S(bo.a0.S(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, null), "$LTS", String.valueOf(mc2.f25951a.f26904g), false, 4, null), "$STS", String.valueOf(mc2.f25951a.f26901d), false, 4, null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        String strS2 = bo.a0.S(strS, "[CACHEBUSTING]", string, false, 4, null);
        String str2 = mc2.f25952b;
        if (str2 != null) {
            strS2 = bo.a0.S(strS2, "[UNIVERSALADID]", str2, false, 4, null);
        }
        String strS3 = strS2;
        String str3 = mc2.f25953c;
        if (str3 != null) {
            strS3 = bo.a0.S(strS3, "[ADSERVINGID]", str3, false, 4, null);
        }
        String strS4 = strS3;
        String str4 = mc2.f25954d;
        if (str4 != null) {
            strS4 = bo.a0.S(strS4, "[ASSETURI]", str4, false, 4, null);
        }
        int i11 = mc2.f25955e;
        tn.x xVar = tn.x.f85368a;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i11;
        String str5 = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * ((long) 1000)))}, 4));
        tn.p.j(str5, "format(...)");
        String strS5 = bo.a0.S(strS4, "[CONTENTPLAYHEAD]", str5, false, 4, null);
        String strS6 = strS5;
        for (Map.Entry entry : map.entrySet()) {
            strS6 = bo.a0.S(strS6, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strS6;
    }
}
