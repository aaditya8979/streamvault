package kl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Charset.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final boolean a(char c10) {
        return Character.toLowerCase(c10) == c10;
    }

    @NotNull
    public static final char[] b(@NotNull String str) {
        tn.p.k(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
        }
        return cArr;
    }
}
