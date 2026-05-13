package p7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f77093c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f77094d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f77095a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f77096b = new StringBuilder();

    public static boolean b(a0 a0Var) {
        int iE = a0Var.e();
        int iF = a0Var.f();
        byte[] bArrD = a0Var.d();
        if (iE + 2 > iF) {
            return false;
        }
        int i10 = iE + 1;
        if (bArrD[iE] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArrD[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF) {
                a0Var.Q(iF - a0Var.e());
                return true;
            }
            if (((char) bArrD[i11]) == '*' && ((char) bArrD[i12]) == '/') {
                i11 = i12 + 1;
                iF = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(a0 a0Var) {
        char cK = k(a0Var, a0Var.e());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        a0Var.Q(1);
        return true;
    }

    public static void e(String str, d dVar) {
        Matcher matcher = f77094d.matcher(y7.a.e(str));
        if (!matcher.matches()) {
            q.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) s7.a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                dVar.t(3);
                break;
            case "em":
                dVar.t(2);
                break;
            case "px":
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) s7.a.e(matcher.group(1))));
    }

    public static String f(a0 a0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iE = a0Var.e();
        int iF = a0Var.f();
        while (iE < iF && !z10) {
            char c10 = (char) a0Var.d()[iE];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iE++;
                sb2.append(c10);
            }
        }
        a0Var.Q(iE - a0Var.e());
        return sb2.toString();
    }

    @Nullable
    public static String g(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String strF = f(a0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) a0Var.D());
    }

    @Nullable
    public static String h(a0 a0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iE = a0Var.e();
            String strG = g(a0Var, sb2);
            if (strG == null) {
                return null;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strG) || ";".equals(strG)) {
                a0Var.P(iE);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    @Nullable
    public static String i(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() < 5 || !"::cue".equals(a0Var.A(5))) {
            return null;
        }
        int iE = a0Var.e();
        String strG = g(a0Var, sb2);
        if (strG == null) {
            return null;
        }
        if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d.equals(strG)) {
            a0Var.P(iE);
            return "";
        }
        String strL = "(".equals(strG) ? l(a0Var) : null;
        if (")".equals(g(a0Var, sb2))) {
            return strL;
        }
        return null;
    }

    public static void j(a0 a0Var, d dVar, StringBuilder sb2) {
        n(a0Var);
        String strF = f(a0Var, sb2);
        if (!"".equals(strF) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(g(a0Var, sb2))) {
            n(a0Var);
            String strH = h(a0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iE = a0Var.e();
            String strG = g(a0Var, sb2);
            if (!";".equals(strG)) {
                if (!com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strG)) {
                    return;
                } else {
                    a0Var.P(iE);
                }
            }
            if ("color".equals(strF)) {
                dVar.q(s7.f.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                dVar.n(s7.f.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                dVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                dVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, dVar);
            }
        }
    }

    public static char k(a0 a0Var, int i10) {
        return (char) a0Var.d()[i10];
    }

    public static String l(a0 a0Var) {
        int iE = a0Var.e();
        int iF = a0Var.f();
        boolean z10 = false;
        while (iE < iF && !z10) {
            int i10 = iE + 1;
            z10 = ((char) a0Var.d()[iE]) == ')';
            iE = i10;
        }
        return a0Var.A((iE - 1) - a0Var.e()).trim();
    }

    public static void m(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.p())) {
        }
    }

    public static void n(a0 a0Var) {
        while (true) {
            for (boolean z10 = true; a0Var.a() > 0 && z10; z10 = false) {
                if (c(a0Var) || b(a0Var)) {
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
            Matcher matcher = f77093c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.z((String) s7.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrH0 = m0.H0(str, "\\.");
        String str2 = strArrH0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.y(str2.substring(0, iIndexOf2));
            dVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (strArrH0.length > 1) {
            dVar.w((String[]) m0.B0(strArrH0, 1, strArrH0.length));
        }
    }

    public List<d> d(a0 a0Var) {
        this.f77096b.setLength(0);
        int iE = a0Var.e();
        m(a0Var);
        this.f77095a.N(a0Var.d(), a0Var.e());
        this.f77095a.P(iE);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f77095a, this.f77096b);
            if (strI == null || !com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d.equals(g(this.f77095a, this.f77096b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iE2 = this.f77095a.e();
                String strG = g(this.f77095a, this.f77096b);
                boolean z11 = strG == null || com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(strG);
                if (!z11) {
                    this.f77095a.P(iE2);
                    j(this.f77095a, dVar, this.f77096b);
                }
                str = strG;
                z10 = z11;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e.equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
