package yads;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes4.dex */
public final class qe1 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh1 f94021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f94022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j53 f94023c;

    public qe1(Context context, eh1 eh1Var) {
        this.f94021a = eh1Var;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f94022b = locationManager;
        this.f94023c = new j53(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // yads.ch1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location a() {
        /*
            r9 = this;
            r0 = 0
            android.location.LocationManager r1 = r9.f94022b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> Lc
            goto Lf
        La:
            r1 = r0
            goto Lf
        Lc:
            boolean r1 = yads.ad1.f87661a
            goto La
        Lf:
            if (r1 == 0) goto L70
            java.util.List r2 = cn.v.c()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            yads.j53 r4 = r9.f94023c
            yads.gc2 r5 = r4.f91101b
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r5 = r5.a(r6)
            yads.gc2 r6 = r4.f91101b
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = r6.a(r7)
            java.util.HashSet r7 = yads.j53.f91098c
            boolean r7 = r7.contains(r3)
            r7 = r7 ^ 1
            java.util.HashSet r8 = yads.j53.f91099d
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L4e
            if (r7 == 0) goto L5f
            if (r5 == 0) goto L5f
            if (r6 == 0) goto L5f
            goto L52
        L4e:
            if (r7 == 0) goto L5f
            if (r5 == 0) goto L5f
        L52:
            android.location.LocationManager r4 = r4.f91100a     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L5f
            android.location.Location r3 = r4.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r4 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            boolean r3 = yads.ad1.f87661a
        L5f:
            r3 = r0
        L60:
            if (r3 == 0) goto L19
            r2.add(r3)
            goto L19
        L66:
            java.util.List r0 = cn.v.a(r2)
            yads.eh1 r1 = r9.f94021a
            android.location.Location r0 = r1.a(r0)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qe1.a():android.location.Location");
    }
}
