package com.applovin.impl.sdk;

import android.app.ActivityManager;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f10183l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10184a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f10187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10188e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f10192i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10185b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f10189f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10190g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f10193j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f10194k = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10195a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10196b;

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f10196b;
            aVar.f10196b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f10196b;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f10195a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }
    }

    public n(k kVar) {
        this.f10184a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f10191h >= l10.longValue()) {
            this.f10184a.O();
            if (o.a()) {
                this.f10184a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f10190g.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f10185b.get() && System.currentTimeMillis() - this.f10186c >= l10.longValue()) {
            this.f10184a.O();
            if (o.a()) {
                this.f10184a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public Object a() {
        return this.f10192i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = com.applovin.impl.w3.a(r8)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f10185b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L8e
            r7.f10192i = r8
            long r0 = java.lang.System.currentTimeMillis()
            r7.f10186c = r0
            com.applovin.impl.sdk.k r0 = r7.f10184a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L42
            com.applovin.impl.sdk.k r0 = r7.f10184a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting fullscreen ad displayed: "
            r1.append(r2)
            long r2 = r7.f10186c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FullScreenAdTracker"
            r0.a(r2, r1)
        L42:
            android.content.Context r0 = com.applovin.impl.sdk.k.o()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r0 = com.applovin.impl.n7.a(r0)
            r1 = 0
            if (r0 == 0) goto L68
            long r3 = r7.f10188e
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L68
            long r5 = r0.availMem
            long r3 = r3 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.f10187d = r0
            r7.f10188e = r1
            goto L6b
        L68:
            r0 = 0
            r7.f10187d = r0
        L6b:
            java.lang.String r0 = "com.applovin.fullscreen_ad_displayed"
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject(r0, r8)
            com.applovin.impl.sdk.k r0 = r7.f10184a
            com.applovin.impl.x4 r3 = com.applovin.impl.x4.K1
            java.lang.Object r0 = r0.a(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L8e
            com.applovin.impl.sdk.d1 r1 = new com.applovin.impl.sdk.d1
            r1.<init>()
            long r2 = r0.longValue()
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.lang.Object):void");
    }

    public void a(String str) {
        synchronized (this.f10194k) {
            this.f10193j.remove(str);
        }
    }

    public void a(boolean z10) {
        synchronized (this.f10189f) {
            this.f10190g.set(z10);
            if (z10) {
                this.f10191h = System.currentTimeMillis();
                this.f10184a.O();
                if (o.a()) {
                    this.f10184a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f10191h);
                }
                ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY));
                if (memoryInfoA != null) {
                    this.f10188e = memoryInfoA.availMem;
                }
                final Long l10 = (Long) this.f10184a.a(x4.J1);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.e1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10030b.a(l10);
                        }
                    }, l10.longValue());
                }
            } else {
                this.f10191h = 0L;
                this.f10184a.O();
                if (o.a()) {
                    this.f10184a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f10186c;
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f10194k) {
            aVar = (a) this.f10193j.get(str);
            if (aVar == null) {
                aVar = f10183l;
            }
        }
        return aVar;
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f10185b.compareAndSet(true, false)) {
            this.f10192i = null;
            this.f10184a.O();
            if (o.a()) {
                this.f10184a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public Long c() {
        return this.f10187d;
    }

    public void c(String str) {
        synchronized (this.f10194k) {
            a aVar = (a) this.f10193j.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f10193j.put(str, aVar);
            }
            aVar.f10195a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public boolean d() {
        return this.f10185b.get();
    }

    public boolean e() {
        return this.f10190g.get();
    }
}
