package yads;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vu0 {
    public static uu0 a(Context context, d4 d4Var, ox2 ox2Var) {
        String string;
        String strDecode;
        String strDecode2;
        uu0 uu0VarA = a(context, ox2Var, d4Var.f88741b, new sp2(), new pa2(ug1.a(context)));
        g9 g9Var = d4Var.f88744e;
        if (g9Var != null) {
            uu0VarA.J = uu0VarA.f95796a ? null : g9Var;
            String str = g9Var.f89880d;
            if (str == null || str.length() == 0) {
                strDecode = null;
            } else {
                String strEncode = Uri.encode(str);
                if (strEncode != null && strEncode.length() > 1024) {
                    bv1 bv1Var = fl2.f89616a;
                    fl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String strEncode2 = Uri.encode(Z7.f30794r);
                    String strSubstring = strEncode.substring(0, 1024);
                    tn.p.j(strSubstring, "substring(...)");
                    boolean zV = bo.a0.V(strEncode, strEncode2, 1024, false, 4, null);
                    int iY0 = bo.d0.y0(strSubstring, strEncode2, 0, false, 6, null);
                    if (zV || iY0 < 0) {
                        strEncode = strSubstring;
                    } else {
                        strEncode = strSubstring.substring(0, iY0);
                        tn.p.j(strEncode, "substring(...)");
                    }
                }
                strDecode = Uri.decode(strEncode);
            }
            uu0VarA.U = strDecode;
            List<String> list = g9Var.f89881e;
            String string2 = "";
            if (list != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : list) {
                    sb2.append(string2);
                    sb2.append(str2);
                    sb2.append("\n");
                    string2 = ExifInterface.GPS_MEASUREMENT_3D;
                }
                string2 = sb2.toString();
                tn.p.j(string2, "toString(...)");
            }
            if (string2.length() == 0) {
                strDecode2 = null;
            } else {
                String strEncode3 = Uri.encode(string2);
                if (strEncode3 != null && strEncode3.length() > 2048) {
                    bv1 bv1Var2 = fl2.f89616a;
                    fl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String strEncode4 = Uri.encode("\n");
                    strEncode3 = strEncode3.substring(0, 2048);
                    tn.p.j(strEncode3, "substring(...)");
                    int iY02 = bo.d0.y0(strEncode3, strEncode4, 0, false, 6, null);
                    if (!bo.a0.I(strEncode3, strEncode4, false, 2, null) && iY02 >= 0) {
                        strEncode3 = strEncode3.substring(0, iY02);
                        tn.p.j(strEncode3, "substring(...)");
                    }
                }
                strDecode2 = Uri.decode(strEncode3);
            }
            uu0VarA.V = strDecode2;
            uu0VarA.f95845y0 = m9.a(g9Var.f89878b);
            uu0VarA.f95847z0 = m9.a(g9Var.f89879c);
            uu0VarA.f95799b0 = g9Var.f89884h;
            gp2 gp2Var = g9Var.f89886j;
            if (gp2Var != null) {
                uu0VarA.D0 = m9.a(gp2Var.f90085b);
            }
            HashMap mapA = m9.a(g9Var.f89883g);
            if (mapA != null) {
                uu0VarA.f95810h.putAll(mapA);
            }
        }
        e00 e00Var = d4Var.f88740a;
        if (e00Var != null) {
            uu0VarA.f95840w = e00Var.f89049b;
        }
        uu0VarA.f95822n = d4Var.f88749j;
        uu0VarA.f95838v = d4Var.f88742c.f90339a;
        v42 v42Var = d4Var.f88745f;
        if (v42Var != null) {
            uu0VarA.X = v42Var.f95922b;
        }
        a03 a03Var = d4Var.f88743d.f87866a;
        if (a03Var != null) {
            uu0VarA.f95846z = a03Var.b().f97849b;
            uu0VarA.f95842x = Integer.valueOf(a03Var.c(context));
            uu0VarA.f95844y = Integer.valueOf(a03Var.a(context));
        }
        uu0VarA.f95801c0 = d4Var.f88747h;
        uu0VarA.f95803d0 = d4Var.f88748i;
        int i10 = d4Var.f88753n;
        uu0VarA.A = 1 == i10 ? C3978d4.i.D : C3978d4.i.C;
        String str3 = d4Var.f88742c.f90339a;
        if (str3 != null && (string = oy2.a(new oy2(), context, "ViewSizeInfoStorage").getString(el3.a(new fl3(i10, str3)), null)) != null) {
            uu0VarA.F0 = string;
        }
        return uu0VarA;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:0|2|167|3|6|(4:8|(1:16)(1:15)|17|(1:22))|23|(1:28)|29|(4:31|(1:39)(1:38)|40|(1:45))|46|(2:181|47)|(2:49|(1:55)(1:52))(0)|56|(2:179|57)|(1:59)(1:61)|62|169|63|(1:65)(1:67)|68|165|69|(42:72|(1:74)|75|(4:77|(3:79|(2:81|200)(2:82|199)|83)|198|84)|87|(1:89)(1:90)|91|177|92|95|173|96|99|171|100|(1:102)|103|(1:105)(1:106)|107|(1:109)(1:110)|111|(1:113)(1:114)|115|358|119|(1:121)|122|(1:124)(1:125)|(1:127)|128|(1:130)|131|(3:134|(4:185|139|(2:140|(1:IC)(2:142|(3:186|144|190)(1:191)))|187)(2:188|187)|132)|183|145|(4:148|(3:193|150|196)(1:195)|194|146)|192|151|(2:154|152)|197|155|156)(1:71)|86|87|(0)(0)|91|177|92|95|173|96|99|171|100|(0)|103|(0)(0)|107|(0)(0)|111|(0)(0)|115|358) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f3, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0215, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.uu0 a(android.content.Context r19, yads.ox2 r20, yads.qx r21, yads.sp2 r22, yads.pa2 r23) {
        /*
            Method dump skipped, instruction units count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vu0.a(android.content.Context, yads.ox2, yads.qx, yads.sp2, yads.pa2):yads.uu0");
    }
}
