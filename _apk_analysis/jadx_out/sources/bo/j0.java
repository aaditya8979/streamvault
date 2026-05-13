package bo;

import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public static final byte a(@NotNull String str) {
        tn.p.k(str, "<this>");
        bn.i iVarB = b(str);
        if (iVarB != null) {
            return iVarB.f();
        }
        z.q(str);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final bn.i b(@NotNull String str) {
        tn.p.k(str, "<this>");
        return c(str, 10);
    }

    @Nullable
    public static final bn.i c(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        bn.k kVarF = f(str, i10);
        if (kVarF == null) {
            return null;
        }
        int iF = kVarF.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, bn.k.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return bn.i.a(bn.i.b((byte) iF));
    }

    public static final int d(@NotNull String str) {
        tn.p.k(str, "<this>");
        bn.k kVarE = e(str);
        if (kVarE != null) {
            return kVarE.f();
        }
        z.q(str);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final bn.k e(@NotNull String str) {
        tn.p.k(str, "<this>");
        return f(str, 10);
    }

    @Nullable
    public static final bn.k f(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (tn.p.m(cCharAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iB = bn.k.b(i10);
        int iA = 119304647;
        while (i12 < length) {
            int iB2 = a.b(str.charAt(i12), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = i0.a(-1, iB);
                    if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = bn.k.b(i11 * iB);
            int iB4 = bn.k.b(bn.k.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i11 = iB4;
        }
        return bn.k.a(i11);
    }

    public static final long g(@NotNull String str) {
        tn.p.k(str, "<this>");
        bn.m mVarH = h(str);
        if (mVarH != null) {
            return mVarH.f();
        }
        z.q(str);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final bn.m h(@NotNull String str) {
        tn.p.k(str, "<this>");
        return i(str, 10);
    }

    @Nullable
    public static final bn.m i(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (tn.p.m(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long jB = bn.m.b(i10);
        long j11 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = h0.a(j10, jB);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = bn.m.b(j11 * jB);
            long jB3 = bn.m.b(bn.m.b(((long) bn.k.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j11 = jB3;
            j10 = -1;
        }
        return bn.m.a(j11);
    }

    public static final short j(@NotNull String str) {
        tn.p.k(str, "<this>");
        bn.p pVarK = k(str);
        if (pVarK != null) {
            return pVarK.f();
        }
        z.q(str);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final bn.p k(@NotNull String str) {
        tn.p.k(str, "<this>");
        return l(str, 10);
    }

    @Nullable
    public static final bn.p l(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        bn.k kVarF = f(str, i10);
        if (kVarF == null) {
            return null;
        }
        int iF = kVarF.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, bn.k.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return bn.p.a(bn.p.b((short) iF));
    }
}
