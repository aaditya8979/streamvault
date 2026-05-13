package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j22 {
    public static Float a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            tn.x xVar = tn.x.f85368a;
            tn.p.j(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f87661a;
            return null;
        }
    }
}
