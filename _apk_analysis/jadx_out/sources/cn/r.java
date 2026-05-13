package cn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes5.dex */
public class r extends p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements ao.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f6758a;

        public a(Object[] objArr) {
            this.f6758a = objArr;
        }

        @Override // ao.i
        public Iterator<T> iterator() {
            return tn.b.a(this.f6758a);
        }
    }

    @NotNull
    public static final <T> List<T> A0(@NotNull T[] tArr, int i10) {
        tn.p.k(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return w.m();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return G0(tArr);
        }
        if (i10 == 1) {
            return v.e(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C B0(@NotNull int[] iArr, @NotNull C c10) {
        tn.p.k(iArr, "<this>");
        tn.p.k(c10, "destination");
        for (int i10 : iArr) {
            c10.add(Integer.valueOf(i10));
        }
        return c10;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C C0(@NotNull T[] tArr, @NotNull C c10) {
        tn.p.k(tArr, "<this>");
        tn.p.k(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    @NotNull
    public static final HashSet<Integer> D0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        return (HashSet) B0(iArr, new HashSet(p0.f(iArr.length)));
    }

    @NotNull
    public static final <T> HashSet<T> E0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return (HashSet) C0(tArr, new HashSet(p0.f(tArr.length)));
    }

    @NotNull
    public static final List<Integer> F0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? H0(iArr) : v.e(Integer.valueOf(iArr[0])) : w.m();
    }

    @NotNull
    public static final <T> List<T> G0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? I0(tArr) : v.e(tArr[0]) : w.m();
    }

    @NotNull
    public static final List<Integer> H0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> I0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return new ArrayList(w.h(tArr));
    }

    @NotNull
    public static final <T> Set<T> J0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) C0(tArr, new LinkedHashSet(p0.f(tArr.length))) : v0.d(tArr[0]) : w0.f();
    }

    @NotNull
    public static final <T> ao.i<T> K(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return tArr.length == 0 ? ao.r.i() : new a(tArr);
    }

    @NotNull
    public static final <T> Iterable<h0<T>> K0(@NotNull final T[] tArr) {
        tn.p.k(tArr, "<this>");
        return new i0(new sn.a() { // from class: cn.q
            @Override // sn.a
            public final Object invoke() {
                return r.L0(tArr);
            }
        });
    }

    public static final boolean L(@NotNull byte[] bArr, byte b10) {
        tn.p.k(bArr, "<this>");
        return e0(bArr, b10) >= 0;
    }

    public static final Iterator L0(Object[] objArr) {
        return tn.b.a(objArr);
    }

    public static final boolean M(@NotNull char[] cArr, char c10) {
        tn.p.k(cArr, "<this>");
        return f0(cArr, c10) >= 0;
    }

    public static final boolean N(@NotNull int[] iArr, int i10) {
        tn.p.k(iArr, "<this>");
        return g0(iArr, i10) >= 0;
    }

    public static final boolean O(@NotNull long[] jArr, long j10) {
        tn.p.k(jArr, "<this>");
        return h0(jArr, j10) >= 0;
    }

    public static final <T> boolean P(@NotNull T[] tArr, T t10) {
        tn.p.k(tArr, "<this>");
        return i0(tArr, t10) >= 0;
    }

    public static final boolean Q(@NotNull short[] sArr, short s10) {
        tn.p.k(sArr, "<this>");
        return j0(sArr, s10) >= 0;
    }

    @NotNull
    public static final <T> List<T> R(@NotNull T[] tArr, int i10) {
        tn.p.k(tArr, "<this>");
        if (i10 >= 0) {
            return A0(tArr, zn.n.e(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> S(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return (List) T(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C T(@NotNull T[] tArr, @NotNull C c10) {
        tn.p.k(tArr, "<this>");
        tn.p.k(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final float U(@NotNull float[] fArr) {
        tn.p.k(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final int V(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final <T> T W(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    @Nullable
    public static final <T> T X(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    public static final zn.i Y(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        return new zn.i(0, a0(iArr));
    }

    public static final int Z(@NotNull float[] fArr) {
        tn.p.k(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final int a0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final int b0(@NotNull long[] jArr) {
        tn.p.k(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final <T> int c0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return tArr.length - 1;
    }

    @Nullable
    public static final <T> T d0(@NotNull T[] tArr, int i10) {
        tn.p.k(tArr, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < tArr.length) {
            z10 = true;
        }
        if (z10) {
            return tArr[i10];
        }
        return null;
    }

    public static final int e0(@NotNull byte[] bArr, byte b10) {
        tn.p.k(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int f0(@NotNull char[] cArr, char c10) {
        tn.p.k(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int g0(@NotNull int[] iArr, int i10) {
        tn.p.k(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int h0(@NotNull long[] jArr, long j10) {
        tn.p.k(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int i0(@NotNull T[] tArr, T t10) {
        tn.p.k(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (tn.p.f(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int j0(@NotNull short[] sArr, short s10) {
        tn.p.k(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, A extends Appendable> A k0(@NotNull T[] tArr, @NotNull A a10, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable sn.l<? super T, ? extends CharSequence> lVar) throws IOException {
        tn.p.k(tArr, "<this>");
        tn.p.k(a10, "buffer");
        tn.p.k(charSequence, "separator");
        tn.p.k(charSequence2, "prefix");
        tn.p.k(charSequence3, "postfix");
        tn.p.k(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bo.q.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    public static final <T> String m0(@NotNull T[] tArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable sn.l<? super T, ? extends CharSequence> lVar) {
        tn.p.k(tArr, "<this>");
        tn.p.k(charSequence, "separator");
        tn.p.k(charSequence2, "prefix");
        tn.p.k(charSequence3, "postfix");
        tn.p.k(charSequence4, "truncated");
        return ((StringBuilder) k0(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String n0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, sn.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return m0(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final int o0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[a0(iArr)];
    }

    public static final <T> T p0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[c0(tArr)];
    }

    public static final int q0(@NotNull byte[] bArr, byte b10) {
        tn.p.k(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static final <T> int r0(@NotNull T[] tArr, T t10) {
        tn.p.k(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (tn.p.f(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Float s0(@NotNull Float[] fArr) {
        tn.p.k(fArr, "<this>");
        int i10 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int iC0 = c0(fArr);
        if (1 <= iC0) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                if (i10 == iC0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @Nullable
    public static final Float t0(@NotNull Float[] fArr) {
        tn.p.k(fArr, "<this>");
        int i10 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int iC0 = c0(fArr);
        if (1 <= iC0) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i10].floatValue());
                if (i10 == iC0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @Nullable
    public static final Integer u0(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        int i10 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int iA0 = a0(iArr);
        if (1 <= iA0) {
            while (true) {
                int i12 = iArr[i10];
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i10 == iA0) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(i11);
    }

    public static final char v0(@NotNull char[] cArr) {
        tn.p.k(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final <T> T w0(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static final List<Byte> x0(@NotNull byte[] bArr, @NotNull zn.i iVar) {
        tn.p.k(bArr, "<this>");
        tn.p.k(iVar, "indices");
        return iVar.isEmpty() ? w.m() : p.e(p.q(bArr, iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final <T> List<T> y0(@NotNull T[] tArr, @NotNull zn.i iVar) {
        tn.p.k(tArr, "<this>");
        tn.p.k(iVar, "indices");
        return iVar.isEmpty() ? w.m() : p.f(p.s(tArr, iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1));
    }

    public static final float z0(@NotNull float[] fArr) {
        tn.p.k(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }
}
