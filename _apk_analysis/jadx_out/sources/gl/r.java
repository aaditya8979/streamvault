package gl;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final boolean c(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';' || str.charAt(i11) == ',';
    }

    @NotNull
    public static final List<i> d(@Nullable String str) {
        return e(str, false);
    }

    @NotNull
    public static final List<i> e(@Nullable String str, boolean z10) {
        if (str == null) {
            return cn.w.m();
        }
        int iG = 0;
        bn.g gVarA = kotlin.b.a(LazyThreadSafetyMode.NONE, new sn.a() { // from class: gl.p
            @Override // sn.a
            public final Object invoke() {
                return r.f();
            }
        });
        while (iG <= bo.d0.l0(str)) {
            iG = g(str, iG, gVarA, z10);
        }
        return n(gVarA);
    }

    public static final ArrayList f() {
        return new ArrayList();
    }

    public static final int g(String str, int i10, bn.g<? extends ArrayList<i>> gVar, boolean z10) {
        bn.g gVarA = kotlin.b.a(LazyThreadSafetyMode.NONE, new sn.a() { // from class: gl.q
            @Override // sn.a
            public final Object invoke() {
                return r.h();
            }
        });
        Integer numValueOf = z10 ? Integer.valueOf(i10) : null;
        int i11 = i10;
        while (i11 <= bo.d0.l0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',') {
                gVar.getValue().add(new i(m(str, i10, numValueOf != null ? numValueOf.intValue() : i11), n(gVarA)));
                return i11 + 1;
            }
            if (cCharAt != ';') {
                i11 = z10 ? i(str, i11, gVarA) : i11 + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i11);
                }
                i11 = i(str, i11 + 1, gVarA);
            }
        }
        gVar.getValue().add(new i(m(str, i10, numValueOf != null ? numValueOf.intValue() : i11), n(gVarA)));
        return i11;
    }

    public static final ArrayList h() {
        return new ArrayList();
    }

    public static final int i(String str, int i10, bn.g<? extends ArrayList<j>> gVar) {
        int i11 = i10;
        while (i11 <= bo.d0.l0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                j(gVar, str, i10, i11, "");
                return i11;
            }
            if (cCharAt == '=') {
                Pair<Integer, String> pairK = k(str, i11 + 1);
                int iIntValue = pairK.component1().intValue();
                j(gVar, str, i10, i11, pairK.component2());
                return iIntValue;
            }
            i11++;
        }
        j(gVar, str, i10, i11, "");
        return i11;
    }

    public static final void j(bn.g<? extends ArrayList<j>> gVar, String str, int i10, int i11, String str2) {
        String strM = m(str, i10, i11);
        if (strM.length() == 0) {
            return;
        }
        gVar.getValue().add(new j(strM, str2));
    }

    public static final Pair<Integer, String> k(String str, int i10) {
        if (str.length() == i10) {
            return bn.h.a(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return l(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= bo.d0.l0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                return bn.h.a(Integer.valueOf(i11), m(str, i10, i11));
            }
            i11++;
        }
        return bn.h.a(Integer.valueOf(i11), m(str, i10, i11));
    }

    public static final Pair<Integer, String> l(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= bo.d0.l0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' && c(str, i10)) {
                return bn.h.a(Integer.valueOf(i10 + 1), sb2.toString());
            }
            if (cCharAt != '\\' || i10 >= bo.d0.l0(str) - 2) {
                sb2.append(cCharAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        return bn.h.a(numValueOf, '\"' + string);
    }

    public static final String m(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        tn.p.j(strSubstring, "substring(...)");
        return bo.d0.s1(strSubstring).toString();
    }

    public static final <T> List<T> n(bn.g<? extends List<? extends T>> gVar) {
        return gVar.isInitialized() ? gVar.getValue() : cn.w.m();
    }
}
