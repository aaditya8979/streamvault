package yads;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0 f89544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f89545b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f89546c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f89547d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o30 f89548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd0 f89549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ae0 f89550g;

    public fe0(od0 od0Var) {
        this.f89544a = od0Var;
    }

    public static xm1 a(Class cls) {
        try {
            return (xm1) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final /* synthetic */ xm1 a(o30 o30Var) {
        return new gk2(o30Var, this.f89544a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.y43 a(int r5) {
        /*
            r4 = this;
            java.lang.Class<yads.xm1> r0 = yads.xm1.class
            java.util.HashMap r1 = r4.f89545b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L1b
            java.util.HashMap r0 = r4.f89545b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            yads.y43 r5 = (yads.y43) r5
            return r5
        L1b:
            r1 = 0
            yads.o30 r2 = r4.f89548e
            r2.getClass()
            if (r5 == 0) goto L68
            r3 = 1
            if (r5 == r3) goto L58
            r3 = 2
            if (r5 == r3) goto L48
            r3 = 3
            if (r5 == r3) goto L37
            r0 = 4
            if (r5 == r0) goto L30
            goto L74
        L30:
            bt.u1 r0 = new bt.u1     // Catch: java.lang.ClassNotFoundException -> L74
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L74
            r1 = r0
            goto L74
        L37:
            java.lang.String r2 = "com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L74
            java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L74
            bt.v1 r2 = new bt.v1     // Catch: java.lang.ClassNotFoundException -> L74
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L74
            r1 = r2
            goto L74
        L48:
            java.lang.String r3 = "com.monetization.ads.exo.source.hls.HlsMediaSource$Factory"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L74
            java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L74
            bt.w1 r3 = new bt.w1     // Catch: java.lang.ClassNotFoundException -> L74
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L74
            goto L73
        L58:
            java.lang.String r3 = "com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L74
            java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L74
            bt.x1 r3 = new bt.x1     // Catch: java.lang.ClassNotFoundException -> L74
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L74
            goto L73
        L68:
            java.lang.Class<com.monetization.ads.exo.source.dash.DashMediaSource$Factory> r3 = com.monetization.ads.exo.source.dash.DashMediaSource$Factory.class
            java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L74
            bt.y1 r3 = new bt.y1     // Catch: java.lang.ClassNotFoundException -> L74
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L74
        L73:
            r1 = r3
        L74:
            java.util.HashMap r0 = r4.f89545b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.put(r2, r1)
            if (r1 == 0) goto L88
            java.util.HashSet r0 = r4.f89546c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fe0.a(int):yads.y43");
    }

    public final void b(o30 o30Var) {
        if (o30Var != this.f89548e) {
            this.f89548e = o30Var;
            this.f89545b.clear();
            this.f89547d.clear();
        }
    }
}
