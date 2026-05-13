package yads;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class aj1 {
    public static String a() {
        String lowerCase = bo.a0.S(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
