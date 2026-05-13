package v5;

import a6.k0;
import a6.t;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CssParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f85871c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f85872a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f85873b = new StringBuilder();

    public static boolean b(t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f3620a;
        if (iC + 2 > iD) {
            return false;
        }
        int i10 = iC + 1;
        if (bArr[iC] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArr[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iD) {
                tVar.M(iD - tVar.c());
                return true;
            }
            if (((char) bArr[i11]) == '*' && ((char) bArr[i12]) == '/') {
                i11 = i12 + 1;
                iD = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(t tVar) {
        char cJ = j(tVar, tVar.c());
        if (cJ != '\t' && cJ != '\n' && cJ != '\f' && cJ != '\r' && cJ != ' ') {
            return false;
        }
        tVar.M(1);
        return true;
    }

    public static String e(t tVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iC = tVar.c();
        int iD = tVar.d();
        while (iC < iD && !z10) {
            char c10 = (char) tVar.f3620a[iC];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iC++;
                sb2.append(c10);
            }
        }
        tVar.M(iC - tVar.c());
        return sb2.toString();
    }

    @Nullable
    public static String f(t tVar, StringBuilder sb2) {
        m(tVar);
        if (tVar.a() == 0) {
            return null;
        }
        String strE = e(tVar, sb2);
        if (!"".equals(strE)) {
            return strE;
        }
        return "" + ((char) tVar.y());
    }

    @Nullable
    public static String g(t tVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iC = tVar.c();
            String strF = f(tVar, sb2);
            if (strF == null) {
                return null;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strF) || ";".equals(strF)) {
                tVar.L(iC);
                z10 = true;
            } else {
                sb3.append(strF);
            }
        }
        return sb3.toString();
    }

    @Nullable
    public static String h(t tVar, StringBuilder sb2) {
        m(tVar);
        if (tVar.a() < 5 || !"::cue".equals(tVar.v(5))) {
            return null;
        }
        int iC = tVar.c();
        String strF = f(tVar, sb2);
        if (strF == null) {
            return null;
        }
        if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d.equals(strF)) {
            tVar.L(iC);
            return "";
        }
        String strK = "(".equals(strF) ? k(tVar) : null;
        if (")".equals(f(tVar, sb2))) {
            return strK;
        }
        return null;
    }

    public static void i(t tVar, d dVar, StringBuilder sb2) {
        m(tVar);
        String strE = e(tVar, sb2);
        if (!"".equals(strE) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(f(tVar, sb2))) {
            m(tVar);
            String strG = g(tVar, sb2);
            if (strG == null || "".equals(strG)) {
                return;
            }
            int iC = tVar.c();
            String strF = f(tVar, sb2);
            if (!";".equals(strF)) {
                if (!com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strF)) {
                    return;
                } else {
                    tVar.L(iC);
                }
            }
            if ("color".equals(strE)) {
                dVar.p(a6.e.c(strG));
                return;
            }
            if ("background-color".equals(strE)) {
                dVar.n(a6.e.c(strG));
                return;
            }
            if ("text-decoration".equals(strE)) {
                if ("underline".equals(strG)) {
                    dVar.w(true);
                }
            } else {
                if ("font-family".equals(strE)) {
                    dVar.q(strG);
                    return;
                }
                if ("font-weight".equals(strE)) {
                    if ("bold".equals(strG)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(strE) && "italic".equals(strG)) {
                    dVar.r(true);
                }
            }
        }
    }

    public static char j(t tVar, int i10) {
        return (char) tVar.f3620a[i10];
    }

    public static String k(t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        boolean z10 = false;
        while (iC < iD && !z10) {
            int i10 = iC + 1;
            z10 = ((char) tVar.f3620a[iC]) == ')';
            iC = i10;
        }
        return tVar.v((iC - 1) - tVar.c()).trim();
    }

    public static void l(t tVar) {
        while (!TextUtils.isEmpty(tVar.l())) {
        }
    }

    public static void m(t tVar) {
        while (true) {
            for (boolean z10 = true; tVar.a() > 0 && z10; z10 = false) {
                if (c(tVar) || b(tVar)) {
                    break;
                }
            }
            return;
        }
    }

    public final void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f85871c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.v(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrD0 = k0.D0(str, "\\.");
        String str2 = strArrD0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.u(str2.substring(0, iIndexOf2));
            dVar.t(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.u(str2);
        }
        if (strArrD0.length > 1) {
            dVar.s((String[]) k0.r0(strArrD0, 1, strArrD0.length));
        }
    }

    public List<d> d(t tVar) {
        this.f85873b.setLength(0);
        int iC = tVar.c();
        l(tVar);
        this.f85872a.J(tVar.f3620a, tVar.c());
        this.f85872a.L(iC);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strH = h(this.f85872a, this.f85873b);
            if (strH == null || !com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d.equals(f(this.f85872a, this.f85873b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strH);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iC2 = this.f85872a.c();
                String strF = f(this.f85872a, this.f85873b);
                boolean z11 = strF == null || com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strF);
                if (!z11) {
                    this.f85872a.L(iC2);
                    i(this.f85872a, dVar, this.f85873b);
                }
                str = strF;
                z10 = z11;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
