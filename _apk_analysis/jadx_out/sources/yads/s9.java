package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class s9 {
    public static String a(String str, String str2) {
        tn.x xVar = tn.x.f85368a;
        String str3 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{str2}, 1));
        tn.p.j(str3, "format(...)");
        return str3;
    }
}
