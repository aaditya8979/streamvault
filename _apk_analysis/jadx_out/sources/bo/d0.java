package bo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes2.dex */
public class d0 extends a0 {

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements ao.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f5659a;

        public a(CharSequence charSequence) {
            this.f5659a = charSequence;
        }

        @Override // ao.i
        public Iterator<String> iterator() {
            return new i(this.f5659a);
        }
    }

    @NotNull
    public static final ao.i<String> A0(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        return new a(charSequence);
    }

    @NotNull
    public static final List<String> B0(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        return SequencesKt___SequencesKt.U(A0(charSequence));
    }

    @NotNull
    public static final CharSequence C0(@NotNull CharSequence charSequence, int i10, char c10) {
        tn.p.k(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    @NotNull
    public static final String D0(@NotNull String str, int i10, char c10) {
        tn.p.k(str, "<this>");
        return C0(str, i10, c10).toString();
    }

    public static final ao.i<zn.i> E0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        P0(i11);
        return new d(charSequence, i10, i11, new sn.p() { // from class: bo.b0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return d0.I0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final ao.i<zn.i> F0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        P0(i11);
        final List listF = cn.p.f(strArr);
        return new d(charSequence, i10, i11, new sn.p() { // from class: bo.c0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return d0.J0(listF, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ ao.i G0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return E0(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ ao.i H0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return F0(charSequence, strArr, i10, z10, i11);
    }

    public static final Pair I0(char[] cArr, boolean z10, CharSequence charSequence, int i10) {
        tn.p.k(charSequence, "$this$DelimitedRangesSequence");
        int iS0 = s0(charSequence, cArr, i10, z10);
        if (iS0 < 0) {
            return null;
        }
        return bn.h.a(Integer.valueOf(iS0), 1);
    }

    public static final Pair J0(List list, boolean z10, CharSequence charSequence, int i10) {
        tn.p.k(charSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairJ0 = j0(charSequence, list, i10, z10, false);
        if (pairJ0 != null) {
            return bn.h.a(pairJ0.getFirst(), Integer.valueOf(pairJ0.getSecond().length()));
        }
        return null;
    }

    public static final boolean K0(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2, int i11, int i12, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.h(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String L0(@NotNull String str, @NotNull CharSequence charSequence) {
        tn.p.k(str, "<this>");
        tn.p.k(charSequence, "prefix");
        if (!Z0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String M0(@NotNull String str, @NotNull CharSequence charSequence) {
        tn.p.k(str, "<this>");
        tn.p.k(charSequence, "suffix");
        if (!i0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String N0(@NotNull String str, @NotNull CharSequence charSequence) {
        tn.p.k(str, "<this>");
        tn.p.k(charSequence, "delimiter");
        return O0(str, charSequence, charSequence);
    }

    @NotNull
    public static final String O0(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        tn.p.k(str, "<this>");
        tn.p.k(charSequence, "prefix");
        tn.p.k(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !Z0(str, charSequence, false, 2, null) || !i0(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void P0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @NotNull
    public static final List<String> Q0(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z10, int i10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(cArr, "delimiters");
        if (cArr.length == 1) {
            return S0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable iterableV = SequencesKt___SequencesKt.v(G0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(cn.x.x(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(a1(charSequence, (zn.i) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> R0(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z10, int i10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return S0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableV = SequencesKt___SequencesKt.v(H0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(cn.x.x(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(a1(charSequence, (zn.i) it.next()));
        }
        return arrayList;
    }

    public static final List<String> S0(CharSequence charSequence, String str, boolean z10, int i10) {
        P0(i10);
        int length = 0;
        int iN0 = n0(charSequence, str, 0, z10);
        if (iN0 == -1 || i10 == 1) {
            return cn.v.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? zn.n.j(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iN0).toString());
            length = str.length() + iN0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iN0 = n0(charSequence, str, length, z10);
        } while (iN0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List T0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Q0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List U0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return R0(charSequence, strArr, z10, i10);
    }

    public static final boolean V0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        return charSequence.length() > 0 && b.h(charSequence.charAt(0), c10, z10);
    }

    public static final boolean W0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? a0.V((String) charSequence, (String) charSequence2, i10, false, 4, null) : K0(charSequence, i10, charSequence2, 0, charSequence2.length(), z10);
    }

    public static final boolean X0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? a0.W((String) charSequence, (String) charSequence2, false, 2, null) : K0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean Y0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return V0(charSequence, c10, z10);
    }

    public static final boolean Z(@NotNull CharSequence charSequence, char c10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        return q0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ boolean Z0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return X0(charSequence, charSequence2, z10);
    }

    public static final boolean a0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (r0(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (p0(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final String a1(@NotNull CharSequence charSequence, @NotNull zn.i iVar) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(iVar, "range");
        return charSequence.subSequence(iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ boolean b0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Z(charSequence, c10, z10);
    }

    @NotNull
    public static final String b1(@NotNull String str, char c10, @NotNull String str2) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c10, 0, false, 6, null);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iQ0 + 1, str.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean c0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a0(charSequence, charSequence2, z10);
    }

    @NotNull
    public static final String c1(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "delimiter");
        tn.p.k(str3, "missingDelimiterValue");
        int iR0 = r0(str, str2, 0, false, 6, null);
        if (iR0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iR0 + str2.length(), str.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean d0(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return a0.J((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!b.h(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String d1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return b1(str, c10, str2);
    }

    public static final boolean e0(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return tn.p.f(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String e1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return c1(str, str2, str3);
    }

    public static final boolean f0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        return charSequence.length() > 0 && b.h(charSequence.charAt(l0(charSequence)), c10, z10);
    }

    @NotNull
    public static final String f1(@NotNull String str, char c10, @NotNull String str2) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "missingDelimiterValue");
        int iX0 = x0(str, c10, 0, false, 6, null);
        if (iX0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iX0 + 1, str.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean g0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(charSequence2, "suffix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? a0.I((String) charSequence, (String) charSequence2, false, 2, null) : K0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    @NotNull
    public static final String g1(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "delimiter");
        tn.p.k(str3, "missingDelimiterValue");
        int iY0 = y0(str, str2, 0, false, 6, null);
        if (iY0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iY0 + str2.length(), str.length());
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean h0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f0(charSequence, c10, z10);
    }

    public static /* synthetic */ String h1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return f1(str, c10, str2);
    }

    public static /* synthetic */ boolean i0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String i1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return g1(str, str2, str3);
    }

    public static final Pair<Integer, String> j0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object next;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) cn.f0.S0(collection);
            int iR0 = !z11 ? r0(charSequence, str, i10, false, 4, null) : y0(charSequence, str, i10, false, 4, null);
            if (iR0 < 0) {
                return null;
            }
            return bn.h.a(Integer.valueOf(iR0), str);
        }
        zn.g iVar = !z11 ? new zn.i(zn.n.e(i10, 0), charSequence.length()) : zn.n.r(zn.n.j(i10, l0(charSequence)), 0);
        if (charSequence instanceof String) {
            int iF = iVar.f();
            int iG = iVar.g();
            int iH = iVar.h();
            if ((iH > 0 && iF <= iG) || (iH < 0 && iG <= iF)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (a0.M(str2, 0, (String) charSequence, iF, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iF == iG) {
                            break;
                        }
                        iF += iH;
                    } else {
                        return bn.h.a(Integer.valueOf(iF), str3);
                    }
                }
            }
        } else {
            int iF2 = iVar.f();
            int iG2 = iVar.g();
            int iH2 = iVar.h();
            if ((iH2 > 0 && iF2 <= iG2) || (iH2 < 0 && iG2 <= iF2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (K0(str4, 0, charSequence, iF2, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iF2 == iG2) {
                            break;
                        }
                        iF2 += iH2;
                    } else {
                        return bn.h.a(Integer.valueOf(iF2), str5);
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public static final String j1(@NotNull String str, char c10, @NotNull String str2) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c10, 0, false, 6, null);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iQ0);
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final zn.i k0(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        return new zn.i(0, charSequence.length() - 1);
    }

    @NotNull
    public static final String k1(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "delimiter");
        tn.p.k(str3, "missingDelimiterValue");
        int iR0 = r0(str, str2, 0, false, 6, null);
        if (iR0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iR0);
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int l0(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String l1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return j1(str, c10, str2);
    }

    public static final int m0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? s0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String m1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return k1(str, str2, str3);
    }

    public static final int n0(@NotNull CharSequence charSequence, @NotNull String str, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(str, TypedValues.Custom.S_STRING);
        return (z10 || !(charSequence instanceof String)) ? p0(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    @NotNull
    public static final String n1(@NotNull String str, char c10, @NotNull String str2) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "missingDelimiterValue");
        int iX0 = x0(str, c10, 0, false, 6, null);
        if (iX0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iX0);
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int o0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        zn.g iVar = !z11 ? new zn.i(zn.n.e(i10, 0), zn.n.j(i11, charSequence.length())) : zn.n.r(zn.n.j(i10, l0(charSequence)), zn.n.e(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int iF = iVar.f();
            int iG = iVar.g();
            int iH = iVar.h();
            if ((iH <= 0 || iF > iG) && (iH >= 0 || iG > iF)) {
                return -1;
            }
            while (!K0(charSequence2, 0, charSequence, iF, charSequence2.length(), z10)) {
                if (iF == iG) {
                    return -1;
                }
                iF += iH;
            }
            return iF;
        }
        int iF2 = iVar.f();
        int iG2 = iVar.g();
        int iH2 = iVar.h();
        if ((iH2 <= 0 || iF2 > iG2) && (iH2 >= 0 || iG2 > iF2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (a0.M(str, 0, (String) charSequence, iF2, str.length(), z10)) {
                return iF2;
            }
            if (iF2 == iG2) {
                return -1;
            }
            iF2 += iH2;
        }
    }

    @NotNull
    public static final String o1(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "delimiter");
        tn.p.k(str3, "missingDelimiterValue");
        int iY0 = y0(str, str2, 0, false, 6, null);
        if (iY0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iY0);
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int p0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return o0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String p1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return n1(str, c10, str2);
    }

    public static /* synthetic */ int q0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String q1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return o1(str, str2, str3);
    }

    public static /* synthetic */ int r0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n0(charSequence, str, i10, z10);
    }

    @Nullable
    public static final Boolean r1(@NotNull String str) {
        tn.p.k(str, "<this>");
        if (tn.p.f(str, "true")) {
            return Boolean.TRUE;
        }
        if (tn.p.f(str, com.ironsource.mediationsdk.metadata.a.f32683h)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int s0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i10, boolean z10) {
        boolean z11;
        tn.p.k(charSequence, "<this>");
        tn.p.k(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(cn.r.v0(cArr), i10);
        }
        int iE = zn.n.e(i10, 0);
        int iL0 = l0(charSequence);
        if (iE > iL0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (b.h(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iE;
            }
            if (iE == iL0) {
                return -1;
            }
            iE++;
        }
    }

    @NotNull
    public static final CharSequence s1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = bo.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int t0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return s0(charSequence, cArr, i10, z10);
    }

    @NotNull
    public static final String t1(@NotNull String str, @NotNull char... cArr) {
        tn.p.k(str, "<this>");
        tn.p.k(cArr, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM = cn.r.M(cArr, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM) {
                    break;
                }
                length--;
            } else if (zM) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final boolean u0(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!bo.a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final CharSequence u1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!bo.a.c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return "";
    }

    public static final int v0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? z0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    @NotNull
    public static final String v1(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequenceSubSequence;
        tn.p.k(str, "<this>");
        tn.p.k(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!cn.r.M(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final int w0(@NotNull CharSequence charSequence, @NotNull String str, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(str, TypedValues.Custom.S_STRING);
        return (z10 || !(charSequence instanceof String)) ? o0(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    @NotNull
    public static final CharSequence w1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!bo.a.c(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ int x0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = l0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return v0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int y0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = l0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return w0(charSequence, str, i10, z10);
    }

    public static final int z0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i10, boolean z10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(cn.r.v0(cArr), i10);
        }
        for (int iJ = zn.n.j(i10, l0(charSequence)); -1 < iJ; iJ--) {
            char cCharAt = charSequence.charAt(iJ);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (b.h(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iJ;
            }
        }
        return -1;
    }
}
