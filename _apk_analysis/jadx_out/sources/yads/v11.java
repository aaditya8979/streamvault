package yads;

import com.ironsource.G5;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.download.Command;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v11 {
    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || Y1.f30690f.equals(str)) {
                boolean z10 = lm3.f92036a;
                boolean z11 = ad1.f87661a;
                return 0L;
            }
            boolean z12 = lm3.f92036a;
            boolean z13 = ad1.f87661a;
            return 0L;
        }
    }

    public static String a(Map map) {
        String str;
        if (map != null && (str = (String) map.get("Content-Type")) != null) {
            String[] strArrSplit = str.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(G5.M)) {
                    return strArrSplit2[1];
                }
            }
        }
        return "ISO-8859-1";
    }

    public static lr a(e82 e82Var) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = e82Var.f89159c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (z10) {
            j13 = jCurrentTimeMillis + (j10 * 1000);
            if (i10 != 0) {
                j12 = j13;
            } else {
                j12 = j13;
                j13 = (j11 * 1000) + j13;
            }
        } else {
            j12 = 0;
            if (jA <= 0 || jA2 < jA) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jA2 - jA);
                j12 = j13;
            }
        }
        lr lrVar = new lr();
        lrVar.f92064a = e82Var.f89158b;
        lrVar.f92065b = str5;
        lrVar.f92069f = j12;
        lrVar.f92068e = j13;
        lrVar.f92066c = jA;
        lrVar.f92067d = jA3;
        lrVar.f92070g = map;
        lrVar.f92071h = e82Var.f89160d;
        return lrVar;
    }
}
