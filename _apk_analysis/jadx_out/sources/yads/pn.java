package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C3978d4;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pn extends v73 {
    public final d4 C;
    public final String D;
    public final u02 E;
    public final ey2 F;
    public final ay2 G;
    public final b5 H;
    public final o9 I;
    public final Context J;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pn(Context context, d4 d4Var, at1 at1Var, String str, String str2, u02 u02Var, uo2 uo2Var, oo ooVar, fp2 fp2Var, ey2 ey2Var, int i10) {
        ey2 ey2VarA;
        if ((i10 & 512) != 0) {
            ey2.f89408a.getClass();
            ey2VarA = dy2.a(context);
        } else {
            ey2VarA = ey2Var;
        }
        this(context, d4Var, at1Var, str, str2, u02Var, uo2Var, ooVar, fp2Var, ey2VarA, new ay2(ey2VarA), new b5(), new o9());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Context context, d4 d4Var, at1 at1Var, String str, String str2, u02 u02Var, uo2 uo2Var, oo ooVar, fp2 fp2Var, ey2 ey2Var, ay2 ay2Var, b5 b5Var, o9 o9Var) {
        super(context, d4Var, 1, str, ooVar, d4Var, fp2Var, uo2Var, at1Var, 1536);
        d4Var.c().getClass();
        this.C = d4Var;
        this.D = str2;
        this.E = u02Var;
        this.F = ey2Var;
        this.G = ay2Var;
        this.H = b5Var;
        this.I = o9Var;
        this.J = context.getApplicationContext();
        boolean z10 = ad1.f87661a;
        b(context);
    }

    @Override // yads.v73, yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        boolean z10 = ad1.f87661a;
        int i10 = h4.f90234d;
        return super.a((im3) g4.a(im3Var.f90905b));
    }

    @Override // yads.v73
    public final vp2 a(e82 e82Var, int i10) {
        Object objM7534constructorimpl;
        Map map;
        Integer numValueOf;
        Integer numValueOf2;
        Locale locale;
        Object objA;
        Integer numValueOf3;
        String str;
        String strA;
        if (b(e82Var, i10)) {
            Map mapJ = e82Var.f89159c;
            if (mapJ == null) {
                mapJ = kotlin.collections.a.j();
            }
            Map map2 = mapJ;
            String strC = t01.c(map2, u11.R);
            if (strC != null) {
                tx2 tx2Var = ux2.f95866a;
                Context context = this.f93660s;
                tx2Var.getClass();
                ((tg1) ((vx2) tx2.a(context)).f96221b).a("ServerSideClientIP", strC);
            }
            if (204 != i10) {
                String strC2 = t01.c(map2, u11.f95483e);
                if (strC2 == null) {
                    strC2 = "";
                }
                e00.f89039c.getClass();
                e00 e00VarA = d00.a(strC2);
                d4 d4Var = this.C;
                if (e00VarA != d4Var.f88740a) {
                    return new vp2(new h4(m4.f92249k, e82Var));
                }
                i82 i82Var = new i82(d4Var, new yp2(this.E.f95467a), new iq1(), new rq2(), new tz(), new g11(), new xg1(), new bf(), new w9());
                this.G.a(map2);
                int i11 = e82Var.f89157a;
                xp2 xp2Var = new xp2(e82Var.f89158b);
                Map mapJ2 = e82Var.f89159c;
                if (mapJ2 == null) {
                    mapJ2 = kotlin.collections.a.j();
                }
                wp2 wp2Var = new wp2(i11, xp2Var, mapJ2);
                int iD = t01.d(map2, u11.f95481c);
                int iD2 = t01.d(map2, u11.f95482d);
                String strC3 = t01.c(map2, u11.I);
                String strC4 = t01.c(map2, u11.J);
                String strC5 = t01.c(map2, u11.f95484f);
                String strC6 = t01.c(map2, u11.L);
                if (strC6 != null) {
                    try {
                        Result.a aVar = Result.Companion;
                        JSONObject jSONObject = new JSONObject(strC6);
                        ao.i iVarG = ao.r.g(jSONObject.keys());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : iVarG) {
                            linkedHashMap.put(obj, jSONObject.get((String) obj));
                        }
                        objM7534constructorimpl = Result.m7534constructorimpl(linkedHashMap);
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                    }
                    if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                        objM7534constructorimpl = null;
                    }
                    Map mapJ3 = (Map) objM7534constructorimpl;
                    if (mapJ3 == null) {
                        mapJ3 = kotlin.collections.a.j();
                    }
                    map = mapJ3;
                } else {
                    map = null;
                }
                a03 a03Var = i82Var.f90704a.f88743d.f87866a;
                zz2 zz2VarB = a03Var != null ? a03Var.b() : null;
                String strC7 = t01.c(map2, u11.f95485g);
                int i12 = tb.f95131b;
                if (strC7 != null) {
                    try {
                        numValueOf = Integer.valueOf(strC7);
                    } catch (NumberFormatException unused) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                Long lValueOf = numValueOf != null ? Long.valueOf(((long) numValueOf.intValue()) * i82.f90703i) : null;
                String strC8 = t01.c(map2, u11.f95500v);
                int i13 = tb.f95131b;
                if (strC8 != null) {
                    try {
                        numValueOf2 = Integer.valueOf(strC8);
                    } catch (NumberFormatException unused2) {
                        numValueOf2 = null;
                    }
                } else {
                    numValueOf2 = null;
                }
                Long lValueOf2 = numValueOf2 != null ? Long.valueOf(((long) numValueOf2.intValue()) * i82.f90703i) : null;
                i82Var.f90710g.getClass();
                String strC9 = t01.c(map2, u11.f95490l);
                Locale[] availableLocales = Locale.getAvailableLocales();
                int length = availableLocales.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        locale = null;
                        break;
                    }
                    if (tn.p.f(availableLocales[i14].getLanguage(), strC9)) {
                        locale = new Locale(strC9);
                        break;
                    }
                    i14++;
                }
                String strC10 = t01.c(map2, u11.A);
                boolean z10 = strC10 == null ? false : Boolean.parseBoolean(strC10);
                String strC11 = t01.c(map2, u11.H);
                boolean z11 = strC11 == null ? false : Boolean.parseBoolean(strC11);
                boolean zB = t01.b(map2, u11.f95493o);
                if (zB) {
                    objA = null;
                } else {
                    yp2 yp2Var = i82Var.f90705b;
                    yp2Var.f97268b.getClass();
                    int i15 = wp2Var.f96470a;
                    byte[] bArr = wp2Var.f96471b.f96852a;
                    Map map3 = wp2Var.f96472c;
                    objA = yp2Var.f97267a.a(new e82(i15, bArr, map3, e82.a(map3), true));
                }
                hq1 hq1VarB = zB ? i82Var.f90706c.a(wp2Var) : null;
                String str2 = i82Var.f90704a.f88742c.f90339a;
                ArrayList arrayListE = t01.e(map2, u11.f95491m);
                i82Var.f90711h.getClass();
                c cVarA = w9.a(map2);
                String strC12 = t01.c(map2, u11.f95489k);
                int iD3 = t01.d(map2, u11.f95496r);
                int iD4 = t01.d(map2, u11.f95497s);
                int iD5 = t01.d(map2, u11.f95498t);
                int iD6 = t01.d(map2, u11.f95503y);
                String strC13 = t01.c(map2, u11.f95495q);
                boolean zB2 = t01.b(map2, u11.f95487i);
                String strC14 = t01.c(map2, u11.O);
                String strC15 = t01.c(map2, u11.P);
                String strC16 = t01.c(map2, u11.Q);
                String strC17 = t01.c(map2, u11.f95504z);
                i82Var.f90708e.getClass();
                sz szVar = (sz) tz.f95435a.get(t01.c(map2, u11.f95494p));
                rq2 rq2Var = i82Var.f90707d;
                rq2Var.getClass();
                Map map4 = wp2Var.f96472c;
                String strC18 = t01.c(map4, u11.f95499u);
                int i16 = tb.f95131b;
                if (strC18 != null) {
                    try {
                        numValueOf3 = Integer.valueOf(strC18);
                        str = strC12;
                    } catch (NumberFormatException unused3) {
                        str = strC12;
                        numValueOf3 = null;
                    }
                } else {
                    str = strC12;
                    numValueOf3 = null;
                }
                String strC19 = t01.c(map4, u11.f95501w);
                if (strC19 != null) {
                    rq2Var.f94574a.getClass();
                    strA = hn.a(strC19);
                } else {
                    strA = null;
                }
                rv rvVar = (numValueOf3 == null || strA == null || strA.length() <= 0) ? null : new rv(numValueOf3.intValue(), strA);
                String str3 = (String) cn.f0.v0(t01.e(map4, u11.f95502x));
                qq2 qq2Var = new qq2(t01.b(map4, u11.C), rvVar, (str3 == null || str3.length() <= 0) ? null : new yx2(str3));
                i82Var.f90709f.getClass();
                String strC20 = t01.c(map2, u11.f95486h);
                j5 j5Var = (strC20 == null || strC20.length() <= 0) ? null : new j5(strC20);
                String strC21 = t01.c(map2, u11.K);
                boolean zB3 = t01.b(map2, u11.M);
                String strC22 = t01.c(map2, u11.E);
                wt0 wt0Var = strC22 != null ? new wt0(strC22) : null;
                String strC23 = t01.c(map2, u11.f95488j);
                boolean z12 = strC23 == null ? true : Boolean.parseBoolean(strC23);
                String strC24 = t01.c(map2, u11.S);
                boolean z13 = strC24 == null ? false : Boolean.parseBoolean(strC24);
                String strC25 = t01.c(map2, u11.T);
                boolean z14 = strC25 == null ? true : Boolean.parseBoolean(strC25);
                String strC26 = t01.c(map2, u11.U);
                boolean z15 = strC26 == null ? true : Boolean.parseBoolean(strC26);
                String strC27 = t01.c(map2, u11.V);
                boolean z16 = strC27 == null ? true : Boolean.parseBoolean(strC27);
                String strC28 = t01.c(map2, u11.W);
                boolean z17 = strC28 == null ? true : Boolean.parseBoolean(strC28);
                String strC29 = t01.c(map2, u11.X);
                boolean z18 = strC29 == null ? false : Boolean.parseBoolean(strC29);
                String strC30 = t01.c(map2, u11.Y);
                boolean z19 = strC30 == null ? false : Boolean.parseBoolean(strC30);
                String strC31 = t01.c(map2, u11.Z);
                String strC32 = t01.c(map2, u11.f95479a0);
                return new vp2(new v9(e00VarA, strC3, strC5, strC4, str2, iD, iD2, arrayListE, cVarA, lValueOf, str, locale, j5Var, strC21, strC17, szVar, zz2VarB, strC13, strC14, hq1VarB, qq2Var, lValueOf2, objA, map, strC15, strC16, zB2, zB, z10, z11, iD3, iD4, iD5, iD6, zB3, wt0Var, z12, z13, z14, z15, z16, z17, z18, z19, strC31, strC32 == null ? false : Boolean.parseBoolean(strC32), 4096, 0), v11.a(e82Var));
            }
        }
        int i17 = h4.f90234d;
        return new vp2(g4.a(e82Var));
    }

    public final void b(Context context) {
        Integer num;
        Integer num2;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        int iIntValue = (nt2VarA == null || (num2 = nt2VarA.f92975t0) == null) ? this.C.f88754o : num2.intValue();
        this.I.f93155a.getClass();
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f93682o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.J) == null) ? 0 : num.intValue());
    }

    public boolean b(e82 e82Var, int i10) {
        byte[] bArr;
        if (200 != i10 || (bArr = e82Var.f89158b) == null) {
            return false;
        }
        return (bArr.length == 0) ^ true;
    }

    @Override // yads.po2
    public final byte[] b() {
        if (1 == e()) {
            try {
                String str = this.D;
                Charset charsetForName = Charset.forName("UTF-8");
                tn.p.j(charsetForName, "forName(...)");
                byte[] bytes = str.getBytes(charsetForName);
                tn.p.j(bytes, "getBytes(...)");
                return bytes;
            } catch (UnsupportedEncodingException unused) {
                boolean z10 = ad1.f87661a;
            }
        }
        return null;
    }

    @Override // yads.v73, yads.po2
    public Map d() {
        Map mapD = cn.p0.d();
        String strA = ((fy2) this.F).a();
        if (strA != null) {
            boolean z10 = ad1.f87661a;
        }
        mapD.put(u11.F.a(), this.H.b(this.J));
        mapD.put(u11.G.a(), this.H.a(this.J));
        mapD.putAll(this.C.c().a());
        return cn.p0.c(mapD);
    }

    @Override // yads.po2
    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f93670c == 0) {
            sb2.append(this.D);
        }
        List list = this.C.f88741b.f94197a.f91278b;
        if (sb2.length() > 0 && (!list.isEmpty())) {
            sb2.append(C3978d4.j.f31381c);
        }
        sb2.append(cn.f0.D0(list, C3978d4.j.f31381c, null, null, 0, null, on.f93290b, 30, null));
        return Uri.parse(this.f93671d).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }
}
