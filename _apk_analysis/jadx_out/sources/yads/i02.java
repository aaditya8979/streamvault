package yads;

import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o61 f90614a;

    public /* synthetic */ i02() {
        this(new o61());
    }

    public i02(o61 o61Var) {
        this.f90614a = o61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static List a(w02 w02Var) {
        ?? E;
        if (w02Var instanceof v22) {
            ArrayList arrayListI = ((v22) w02Var).i();
            E = new ArrayList(cn.x.x(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                E.add(((w02) it.next()).a());
            }
        } else {
            E = cn.v.e(w02Var != null ? w02Var.a() : null);
        }
        return cn.f0.q0(E);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(yads.w02 r5) {
        /*
            boolean r0 = r5 instanceof yads.v22
            r1 = 0
            if (r0 == 0) goto L4a
            yads.v22 r5 = (yads.v22) r5
            java.util.ArrayList r5 = r5.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r5.next()
            yads.w02 r2 = (yads.w02) r2
            if (r2 == 0) goto L27
            java.lang.String r3 = r2.getCreativeId()
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 != 0) goto L37
            if (r2 == 0) goto L31
            java.lang.String r3 = r2.getCampaignId()
            goto L32
        L31:
            r3 = r1
        L32:
            if (r3 == 0) goto L35
            goto L37
        L35:
            r3 = r1
            goto L44
        L37:
            yads.k00 r3 = new yads.k00
            java.lang.String r4 = r2.getCreativeId()
            java.lang.String r2 = r2.getCampaignId()
            r3.<init>(r4, r2)
        L44:
            if (r3 == 0) goto L14
            r0.add(r3)
            goto L14
        L4a:
            if (r5 == 0) goto L65
            java.lang.String r0 = r5.getCreativeId()
            if (r0 != 0) goto L58
            java.lang.String r0 = r5.getCampaignId()
            if (r0 == 0) goto L65
        L58:
            yads.k00 r1 = new yads.k00
            java.lang.String r0 = r5.getCreativeId()
            java.lang.String r5 = r5.getCampaignId()
            r1.<init>(r0, r5)
        L65:
            java.util.List r0 = cn.w.q(r1)
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.i02.b(yads.w02):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.util.List] */
    public final String c(w02 w02Var) {
        ?? Q;
        if (w02Var instanceof v22) {
            ArrayList arrayListI = ((v22) w02Var).i();
            Q = new ArrayList();
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                String info = ((w02) it.next()).getInfo();
                if (info != null) {
                    Q.add(info);
                }
            }
        } else {
            Q = cn.w.q(w02Var != null ? w02Var.getInfo() : null);
        }
        ?? r22 = Q;
        this.f90614a.getClass();
        if (r22.isEmpty()) {
            return null;
        }
        return cn.f0.D0(r22, StringUtils.COMMA, C3978d4.j.f31383d, C3978d4.j.f31385e, 0, null, null, 56, null);
    }
}
