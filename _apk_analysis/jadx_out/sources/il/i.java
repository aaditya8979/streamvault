package il;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import gl.x;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Chars.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c<x> f64313a = c.f64295b.d(x.f62623b.a(), new l() { // from class: il.g
        @Override // sn.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(i.c((x) obj));
        }
    }, new p() { // from class: il.h
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return Character.valueOf(i.d((x) obj, ((Integer) obj2).intValue()));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final long[] f64314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final byte[] f64315c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r6
      0x005b: PHI (r6v2 long) = (r6v1 long), (r6v0 long) binds: [B:21:0x0069, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            il.c$a r0 = il.c.f64295b
            gl.x$a r1 = gl.x.f62623b
            java.util.List r1 = r1.a()
            il.g r2 = new il.g
            r2.<init>()
            il.h r3 = new il.h
            r3.<init>()
            il.c r0 = r0.d(r1, r2, r3)
            il.i.f64313a = r0
            zn.i r0 = new zn.i
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r0.<init>(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = cn.x.x(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L76
            r4 = r0
            cn.k0 r4 = (cn.k0) r4
            int r4 = r4.nextInt()
            r5 = 48
            if (r5 > r4) goto L46
            r5 = 58
            if (r4 >= r5) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = r1
        L47:
            if (r5 == 0) goto L4e
            long r4 = (long) r4
            r6 = 48
            long r4 = r4 - r6
            goto L6e
        L4e:
            long r4 = (long) r4
            r6 = 97
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L5f
            r8 = 102(0x66, double:5.04E-322)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L5f
        L5b:
            long r4 = r4 - r6
            long r6 = (long) r3
            long r4 = r4 + r6
            goto L6e
        L5f:
            r6 = 65
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L6c
            r8 = 70
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L6c
            goto L5b
        L6c:
            r4 = -1
        L6e:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.add(r4)
            goto L2f
        L76:
            long[] r0 = cn.f0.h1(r2)
            il.i.f64314b = r0
            zn.i r0 = new zn.i
            r2 = 15
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = cn.x.x(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb0
            r2 = r0
            cn.k0 r2 = (cn.k0) r2
            int r2 = r2.nextInt()
            if (r2 >= r3) goto La2
            int r2 = r2 + 48
            goto La7
        La2:
            int r2 = r2 + 97
            char r2 = (char) r2
            int r2 = r2 - r3
            char r2 = (char) r2
        La7:
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            goto L90
        Lb0:
            byte[] r0 = cn.f0.b1(r1)
            il.i.f64315c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il.i.<clinit>():void");
    }

    public static final int c(x xVar) {
        tn.p.k(xVar, "it");
        return xVar.f().length();
    }

    public static final char d(x xVar, int i10) {
        tn.p.k(xVar, InneractiveMediationDefs.GENDER_MALE);
        return xVar.f().charAt(i10);
    }

    public static final boolean e(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence charSequence2) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "other");
        if (i11 - i10 != charSequence2.length()) {
            return false;
        }
        int i12 = i10;
        while (true) {
            if (i12 >= i11) {
                return true;
            }
            int iCharAt = charSequence.charAt(i12);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt = (iCharAt - 65) + 97;
            }
            int iCharAt2 = charSequence2.charAt(i12 - i10);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 = (iCharAt2 - 65) + 97;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
            i12++;
        }
    }

    public static final int f(@NotNull CharSequence charSequence, int i10, int i11) {
        tn.p.k(charSequence, "<this>");
        int i12 = 0;
        while (i10 < i11) {
            int iCharAt = charSequence.charAt(i10);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt = (iCharAt - 65) + 97;
            }
            i12 = (i12 * 31) + iCharAt;
            i10++;
        }
        return i12;
    }

    public static /* synthetic */ int g(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return f(charSequence, i10, i11);
    }

    public static final void h(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }

    public static final void i(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10) + " at position " + i10);
    }

    public static final long j(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            h(charSequence);
        }
        if (length == 19) {
            return k(charSequence);
        }
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                i(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
        }
        return j10;
    }

    public static final long k(CharSequence charSequence) {
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                i(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
            if (j10 < 0) {
                h(charSequence);
            }
        }
        return j10;
    }
}
