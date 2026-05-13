package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cm f65057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f65058b;

    public Bm(@NotNull Cm cm2) {
        this.f65057a = cm2;
    }

    @NotNull
    public final R4 a() {
        return this.f65057a.f65134f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C4817gm a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C4765em r10, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C4714cm r11, long r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Bm.a(io.appmetrica.analytics.impl.em, io.appmetrica.analytics.impl.cm, long):io.appmetrica.analytics.impl.gm");
    }

    public final void a(@NotNull Kl kl2) {
        synchronized (this) {
            this.f65058b = null;
        }
        Cm cm2 = this.f65057a;
        cm2.f65132d.a(cm2.f65134f.f65831a, kl2, e());
    }

    public final synchronized void a(@NotNull C4662am c4662am) {
        this.f65057a.f65140l.a(c4662am);
        C4714cm c4714cmD = d();
        if (c4714cmD.f66554k) {
            List list = c4714cmD.f66553j;
            if (list == null || list.isEmpty()) {
                if (c4714cmD.f66548e != null && (!r5.isEmpty())) {
                    C4817gm c4817gmE = e();
                    C4920km c4920km = c4817gmE.f66848c;
                    C4894jm c4894jmA = c4920km.a(c4920km.f67158m);
                    String str = c4817gmE.f66846a;
                    String str2 = c4817gmE.f66847b;
                    c4894jmA.f67051g = null;
                    C4817gm c4817gm = new C4817gm(str, str2, new C4920km(c4894jmA));
                    b(c4817gm);
                    a(c4817gm);
                }
            } else if (!mo.a(list, c4714cmD.f66548e)) {
                C4817gm c4817gmE2 = e();
                C4920km c4920km2 = c4817gmE2.f66848c;
                C4894jm c4894jmA2 = c4920km2.a(c4920km2.f67158m);
                String str3 = c4817gmE2.f66846a;
                String str4 = c4817gmE2.f66847b;
                c4894jmA2.f67051g = list;
                C4817gm c4817gm2 = new C4817gm(str3, str4, new C4920km(c4894jmA2));
                b(c4817gm2);
                a(c4817gm2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:12:0x0035, B:14:0x003c), top: B:24:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C4765em r4, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C4714cm r5, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.mo.a(r6)     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L32
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L54
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L54
            boolean r0 = io.appmetrica.analytics.impl.mo.a(r6)     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L32
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L32
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L32
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L32
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L32
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L3a
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L54
            goto L3c
        L3a:
            r0 = 0
        L3c:
            java.lang.Long r6 = r4.f66701l     // Catch: java.lang.Throwable -> L54
            io.appmetrica.analytics.impl.Yj r2 = io.appmetrica.analytics.impl.Xj.f66181a     // Catch: java.lang.Throwable -> L54
            r2.a(r0, r6)     // Catch: java.lang.Throwable -> L54
            io.appmetrica.analytics.impl.gm r4 = r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L54
            r3.h()     // Catch: java.lang.Throwable -> L54
            r3.b(r4)     // Catch: java.lang.Throwable -> L54
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)
            r3.a(r4)
            return
        L54:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Bm.a(io.appmetrica.analytics.impl.em, io.appmetrica.analytics.impl.cm, java.util.Map):void");
    }

    public final void a(C4817gm c4817gm) {
        ArrayList arrayList;
        Cm cm2 = this.f65057a;
        Gl gl2 = cm2.f65132d;
        String str = cm2.f65130b;
        synchronized (gl2.f65296a.f65377b) {
            Il il2 = gl2.f65296a;
            il2.f65378c = c4817gm;
            Collection collection = (Collection) il2.f65376a.f67572a.get(str);
            arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(c4817gm);
        }
    }

    public final synchronized boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC4740dm.a(e(), list, map, new Am(this));
    }

    @NotNull
    public final Context b() {
        return this.f65057a.f65129a;
    }

    public final synchronized void b(C4817gm c4817gm) {
        this.f65057a.f65140l.a(c4817gm);
        C4791fm c4791fm = this.f65057a.f65135g;
        c4791fm.f66798b.a(c4817gm.f66846a);
        c4791fm.f66798b.b(c4817gm.f66847b);
        c4791fm.f66797a.save(c4817gm.f66848c);
        this.f65057a.f65133e.a(c4817gm);
    }

    @Nullable
    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        if (g()) {
            networkTask = this.f65058b;
            if (networkTask == null || networkTask.isRemoved()) {
                C4714cm c4714cmD = d();
                Wd wd2 = Wd.f66101a;
                Yl yl2 = new Yl(new C4835he(), C5009oa.I.p());
                FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c4714cmD);
                networkTask = new NetworkTask(new SynchronizedBlockingExecutor(), new C5054q5(this.f65057a.f65129a), new AllHostsExponentialBackoffPolicy(Wd.f66101a.a(Ud.STARTUP)), new C5295zm(this, new Sl(), new FullUrlFormer(yl2, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), cn.w.m(), Wd.f66103c);
                this.f65058b = networkTask;
            }
        } else {
            networkTask = null;
        }
        return networkTask;
    }

    @NotNull
    public final C4714cm d() {
        return (C4714cm) this.f65057a.f65140l.a();
    }

    @NotNull
    public final C4817gm e() {
        C4817gm c4817gm;
        Jl jl2 = this.f65057a.f65140l;
        synchronized (jl2) {
            c4817gm = jl2.f67507c.f65562a;
        }
        return c4817gm;
    }

    public final void f() {
        C4817gm c4817gm;
        Jl jl2 = this.f65057a.f65140l;
        synchronized (jl2) {
            c4817gm = jl2.f67507c.f65562a;
        }
        C4920km c4920km = c4817gm.f66848c;
        C4894jm c4894jmA = c4920km.a(c4920km.f67158m);
        String strA = c4817gm.f66846a;
        String str = c4817gm.f66847b;
        qo qoVar = this.f65057a.f65142n;
        String str2 = c4817gm.f66849d;
        qoVar.getClass();
        if (!qo.a(str2)) {
            c4894jmA.f67045a = this.f65057a.f65141m.a().f68099id;
        }
        String str3 = c4817gm.f66846a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f65057a.f65136h.a();
            str = "";
        }
        List<String> list = this.f65057a.f65131c.f66400e;
        if (list == null || !(!list.isEmpty())) {
            list = null;
        }
        c4894jmA.f67051g = list;
        C4817gm c4817gm2 = new C4817gm(strA, str, new C4920km(c4894jmA));
        b(c4817gm2);
        a(c4817gm2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x001b, B:16:0x0033, B:18:0x003b, B:20:0x0043, B:23:0x004c), top: B:34:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean g() {
        /*
            r8 = this;
            monitor-enter(r8)
            io.appmetrica.analytics.impl.oa r0 = io.appmetrica.analytics.impl.C5009oa.I     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.F6 r0 = r0.h()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.isRestrictedForSdk()     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r0 == 0) goto L10
            monitor-exit(r8)
            return r1
        L10:
            io.appmetrica.analytics.impl.gm r0 = r8.e()     // Catch: java.lang.Throwable -> L6c
            java.util.Set r2 = io.appmetrica.analytics.impl.AbstractC4740dm.f66628a     // Catch: java.lang.Throwable -> L6c
            boolean r2 = r0.f66868w     // Catch: java.lang.Throwable -> L6c
            r3 = 1
            if (r2 != 0) goto L30
            long r4 = r0.f66860o     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.Dm r2 = r0.f66871z     // Catch: java.lang.Throwable -> L6c
            int r2 = r2.f65166a     // Catch: java.lang.Throwable -> L6c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L6c
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.AbstractC4740dm.f66629b     // Catch: java.lang.Throwable -> L6c
            long r6 = r2.currentTimeSeconds()     // Catch: java.lang.Throwable -> L6c
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2e
            goto L30
        L2e:
            r2 = r1
            goto L31
        L30:
            r2 = r3
        L31:
            if (r2 != 0) goto L69
            java.lang.String r2 = r0.f66849d     // Catch: java.lang.Throwable -> L6c
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4740dm.a(r2)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f66846a     // Catch: java.lang.Throwable -> L6c
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4740dm.a(r2)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L4c
            java.lang.String r2 = r0.f66847b     // Catch: java.lang.Throwable -> L6c
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4740dm.a(r2)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L4c
            r1 = r3
        L4c:
            r1 = r1 ^ r3
            io.appmetrica.analytics.impl.Cm r2 = r8.f65057a     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.D3 r2 = r2.f65139k     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.cm r4 = r8.d()     // Catch: java.lang.Throwable -> L6c
            java.util.Map r4 = r4.f66551h     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.Cm r5 = r8.f65057a     // Catch: java.lang.Throwable -> L6c
            io.appmetrica.analytics.impl.A3 r5 = r5.f65138j     // Catch: java.lang.Throwable -> L6c
            r2.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = io.appmetrica.analytics.impl.D3.a(r4, r0, r5)     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L67
            if (r0 != 0) goto L67
            goto L6a
        L67:
            r3 = r1
            goto L6a
        L69:
            r3 = r2
        L6a:
            monitor-exit(r8)
            return r3
        L6c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Bm.g():boolean");
    }

    public final synchronized void h() {
        this.f65058b = null;
    }
}
