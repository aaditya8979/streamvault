package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class oj2 {
    public static String a(long j10) {
        long jCeil = (long) Math.ceil(j10 / 1000);
        tn.x xVar = tn.x.f85368a;
        String str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)}, 2));
        tn.p.j(str, "format(...)");
        return str;
    }
}
