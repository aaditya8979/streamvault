package bo;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes.dex */
public class t extends q {
    public static final sn.l<String, String> d(final String str) {
        return str.length() == 0 ? new sn.l() { // from class: bo.r
            @Override // sn.l
            public final Object invoke(Object obj) {
                return t.e((String) obj);
            }
        } : new sn.l() { // from class: bo.s
            @Override // sn.l
            public final Object invoke(Object obj) {
                return t.f(str, (String) obj);
            }
        };
    }

    public static final String e(String str) {
        tn.p.k(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        tn.p.k(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    @NotNull
    public static final String h(@NotNull String str, @NotNull String str2) {
        String strInvoke;
        tn.p.k(str, "<this>");
        tn.p.k(str2, "newIndent");
        List<String> listB0 = d0.B0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB0) {
            if (!d0.u0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) cn.f0.J0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listB0.size());
        sn.l<String, String> lVarD = d(str2);
        int iO = cn.w.o(listB0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listB0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iO) && d0.u0(str3)) {
                str3 = null;
            } else {
                String strX1 = f0.x1(str3, iIntValue);
                if (strX1 != null && (strInvoke = lVarD.invoke(strX1)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) cn.f0.A0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    public static final String i(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i10;
        String strInvoke;
        tn.p.k(str, "<this>");
        tn.p.k(str2, "newIndent");
        tn.p.k(str3, "marginPrefix");
        if (!(!d0.u0(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listB0 = d0.B0(str);
        int length = str.length() + (str2.length() * listB0.size());
        sn.l<String, String> lVarD = d(str2);
        int iO = cn.w.o(listB0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listB0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                cn.w.w();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iO) && d0.u0(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!a.c(str4.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (a0.V(str4, str3, i10, false, 4, null)) {
                        int length3 = i14 + str3.length();
                        tn.p.i(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        tn.p.j(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarD.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i11 = i12;
        }
        return ((StringBuilder) cn.f0.A0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    public static final String j(@NotNull String str) {
        tn.p.k(str, "<this>");
        return h(str, "");
    }

    @NotNull
    public static final String k(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "marginPrefix");
        return i(str, "", str2);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = ImpressionLog.Q;
        }
        return k(str, str2);
    }
}
