package bo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes.dex */
public class z extends y {
    @NotNull
    public static final Void q(@NotNull String str) {
        tn.p.k(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @Nullable
    public static final Integer r(@NotNull String str) {
        tn.p.k(str, "<this>");
        return s(str, 10);
    }

    @Nullable
    public static final Integer s(@NotNull String str, int i10) {
        boolean z10;
        int i11;
        tn.p.k(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (tn.p.m(cCharAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int iB = a.b(str.charAt(i14), i10);
            if (iB < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + iB) {
                return null;
            }
            i12 = i11 - iB;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    @Nullable
    public static final Long t(@NotNull String str) {
        tn.p.k(str, "<this>");
        return u(str, 10);
    }

    @Nullable
    public static final Long u(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        boolean z10 = true;
        if (tn.p.m(cCharAt, 48) >= 0) {
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iB = a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i10);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i10);
            long j15 = iB;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
