package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ge0 implements xm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe0 f89960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f89961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ae0 f89962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f89966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f89967h;

    public ge0(o30 o30Var, od0 od0Var) {
        this.f89961b = o30Var;
        fe0 fe0Var = new fe0(od0Var);
        this.f89960a = fe0Var;
        fe0Var.b(o30Var);
        this.f89963d = -9223372036854775807L;
        this.f89964e = -9223372036854775807L;
        this.f89965f = -9223372036854775807L;
        this.f89966g = -3.4028235E38f;
        this.f89967h = -3.4028235E38f;
    }

    public static xm1 a(Class cls, o30 o30Var) {
        try {
            return (xm1) cls.getConstructor(o30.class).newInstance(o30Var);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // yads.xm1
    public final mo a(fm1 fm1Var) {
        Uri uri;
        String str;
        String str2;
        Object obj;
        List list;
        p51 p51Var;
        float f10;
        am1 am1Var;
        fm1 fm1Var2 = fm1Var;
        fm1Var2.f89625c.getClass();
        String scheme = fm1Var2.f89625c.f97653a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        am1 am1Var2 = fm1Var2.f89625c;
        int iA = ib3.a(am1Var2.f97653a, am1Var2.f97654b);
        fe0 fe0Var = this.f89960a;
        xm1 xm1Var = (xm1) fe0Var.f89547d.get(Integer.valueOf(iA));
        if (xm1Var == null) {
            y43 y43VarA = fe0Var.a(iA);
            if (y43VarA == null) {
                xm1Var = null;
            } else {
                xm1Var = (xm1) y43VarA.get();
                hd0 hd0Var = fe0Var.f89549f;
                if (hd0Var != null) {
                    xm1Var.a(hd0Var);
                }
                ae0 ae0Var = fe0Var.f89550g;
                if (ae0Var != null) {
                    xm1Var.a(ae0Var);
                }
                fe0Var.f89547d.put(Integer.valueOf(iA), xm1Var);
            }
        }
        ni.a(xm1Var, "No suitable media source factory found for content type: " + iA);
        yl1 yl1Var = fm1Var2.f89626d;
        yl1Var.getClass();
        long j10 = yl1Var.f97220b;
        long j11 = yl1Var.f97221c;
        long j12 = yl1Var.f97222d;
        float f11 = yl1Var.f97223e;
        float f12 = yl1Var.f97224f;
        yl1 yl1Var2 = fm1Var2.f89626d;
        if (yl1Var2.f97220b == -9223372036854775807L) {
            j10 = this.f89963d;
        }
        long j13 = j10;
        if (yl1Var2.f97223e == -3.4028235E38f) {
            f11 = this.f89966g;
        }
        float f13 = f11;
        if (yl1Var2.f97224f == -3.4028235E38f) {
            f12 = this.f89967h;
        }
        float f14 = f12;
        if (yl1Var2.f97221c == -9223372036854775807L) {
            j11 = this.f89964e;
        }
        long j14 = j11;
        if (yl1Var2.f97222d == -9223372036854775807L) {
            j12 = this.f89965f;
        }
        yl1 yl1Var3 = new yl1(j13, j14, j12, f13, f14);
        if (!yl1Var3.equals(fm1Var2.f89626d)) {
            vl1 vl1Var = new vl1();
            List listEmptyList = Collections.emptyList();
            sm2 sm2VarG = p51.g();
            cm1 cm1Var = cm1.f88503d;
            ul1 ul1Var = fm1Var2.f89628f;
            ul1Var.getClass();
            sl1 sl1Var = new sl1(ul1Var);
            String str3 = fm1Var2.f89624b;
            jm1 jm1Var = fm1Var2.f89627e;
            fm1Var2.f89626d.getClass();
            cm1 cm1Var2 = fm1Var2.f89629g;
            am1 am1Var3 = fm1Var2.f89625c;
            if (am1Var3 != null) {
                String str4 = am1Var3.f97657e;
                String str5 = am1Var3.f97654b;
                Uri uri2 = am1Var3.f97653a;
                List list2 = am1Var3.f97656d;
                p51 p51Var2 = am1Var3.f97658f;
                Object obj2 = am1Var3.f97659g;
                wl1 wl1Var = am1Var3.f97655c;
                if (wl1Var != null) {
                    str2 = str4;
                    list = list2;
                    p51Var = p51Var2;
                    obj = obj2;
                    vl1Var = new vl1(wl1Var);
                } else {
                    str2 = str4;
                    list = list2;
                    p51Var = p51Var2;
                    obj = obj2;
                    vl1Var = new vl1();
                }
                str = str5;
                uri = uri2;
            } else {
                uri = null;
                str = null;
                str2 = null;
                obj = null;
                list = listEmptyList;
                p51Var = sm2VarG;
            }
            long j15 = yl1Var3.f97220b;
            vl1 vl1Var2 = vl1Var;
            long j16 = yl1Var3.f97221c;
            long j17 = yl1Var3.f97222d;
            float f15 = yl1Var3.f97223e;
            float f16 = yl1Var3.f97224f;
            if (vl1Var2.f96127b != null && vl1Var2.f96126a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                f10 = f15;
                am1Var = new am1(uri, str, vl1Var2.f96126a != null ? new wl1(vl1Var2) : null, list, str2, p51Var, obj);
            } else {
                f10 = f15;
                am1Var = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            fm1Var2 = new fm1(str3, new ul1(sl1Var), am1Var, new yl1(j15, j16, j17, f10, f16), jm1Var != null ? jm1Var : jm1.H, cm1Var2);
        }
        mo moVarA = xm1Var.a(fm1Var2);
        p51 p51Var3 = fm1Var2.f89625c.f97658f;
        if (!p51Var3.isEmpty()) {
            mo[] moVarArr = new mo[p51Var3.size() + 1];
            moVarArr[0] = moVarA;
            int i10 = 0;
            while (i10 < p51Var3.size()) {
                o30 o30Var = this.f89961b;
                o30Var.getClass();
                ae0 ae0Var2 = new ae0(0);
                ae0 ae0Var3 = this.f89962c;
                if (ae0Var3 != null) {
                    ae0Var2 = ae0Var3;
                }
                int i11 = i10 + 1;
                moVarArr[i11] = new uz2((dm1) p51Var3.get(i10), o30Var, ae0Var2, true);
                i10 = i11;
            }
            moVarA = new qs1(moVarArr, 0);
        }
        mo wvVar = moVarA;
        ul1 ul1Var2 = fm1Var2.f89628f;
        long j18 = ul1Var2.f95260b;
        if (j18 != 0 || ul1Var2.f95261c != Long.MIN_VALUE || ul1Var2.f95263e) {
            long jA = ib3.a(j18);
            long jA2 = ib3.a(fm1Var2.f89628f.f95261c);
            ul1 ul1Var3 = fm1Var2.f89628f;
            wvVar = new wv(wvVar, jA, jA2, !ul1Var3.f95264f, ul1Var3.f95262d, ul1Var3.f95263e);
        }
        fm1Var2.f89625c.getClass();
        fm1Var2.f89625c.getClass();
        return wvVar;
    }

    @Override // yads.xm1
    public final xm1 a(ae0 ae0Var) {
        if (ae0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f89962c = ae0Var;
        fe0 fe0Var = this.f89960a;
        fe0Var.f89550g = ae0Var;
        Iterator it = fe0Var.f89547d.values().iterator();
        while (it.hasNext()) {
            ((xm1) it.next()).a(ae0Var);
        }
        return this;
    }

    @Override // yads.xm1
    public final xm1 a(hd0 hd0Var) {
        fe0 fe0Var = this.f89960a;
        if (hd0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        fe0Var.f89549f = hd0Var;
        Iterator it = fe0Var.f89547d.values().iterator();
        while (it.hasNext()) {
            ((xm1) it.next()).a(hd0Var);
        }
        return this;
    }
}
