package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4714cm extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f66547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f66548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f66551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5101s3 f66552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f66553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f66554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f66555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f66556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f66557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4965mg f66558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I7 f66559p;

    public C4714cm() {
        this(C5009oa.k().u(), new I7());
    }

    public C4714cm(C4965mg c4965mg, I7 i72) {
        this.f66552i = new C5101s3(null, T7.f65926c);
        this.f66557n = 0L;
        this.f66558o = c4965mg;
        this.f66559p = i72;
    }

    public final long a(long j10) {
        if (this.f66557n == 0) {
            this.f66557n = j10;
        }
        return this.f66557n;
    }

    public final void a(String str) {
        this.f66556m = str;
    }

    public final void a(@Nullable List<String> list) {
        this.f66553j = list;
    }

    public final void a(boolean z10) {
        this.f66554k = z10;
    }

    @NonNull
    public final C5101s3 c() {
        return this.f66552i;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f66551h;
    }

    public final String e() {
        return this.f66556m;
    }

    @Nullable
    public final String f() {
        return this.f66549f;
    }

    public final long g() {
        return this.f66557n;
    }

    @Nullable
    public final String h() {
        return this.f66550g;
    }

    @Nullable
    public final List<String> i() {
        return this.f66553j;
    }

    @NonNull
    public final C4965mg j() {
        return this.f66558o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f66547d
            boolean r1 = io.appmetrica.analytics.impl.mo.a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f66547d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f66548e
            boolean r1 = io.appmetrica.analytics.impl.mo.a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f66548e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.I7 r1 = r9.f66559p
            io.appmetrica.analytics.impl.Um r1 = r1.f65354a
            java.lang.Object r1 = r1.a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L59
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4c
            r7 = r1[r6]
            if (r7 == 0) goto L43
            boolean r8 = bo.d0.u0(r7)
            r8 = r8 ^ 1
            if (r8 == 0) goto L43
            goto L44
        L43:
            r7 = r3
        L44:
            if (r7 == 0) goto L49
            r4.add(r7)
        L49:
            int r6 = r6 + 1
            goto L34
        L4c:
            boolean r1 = r4.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L55
            goto L56
        L55:
            r4 = r3
        L56:
            if (r4 == 0) goto L59
            goto L79
        L59:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L61:
            if (r2 >= r5) goto L79
            r6 = r1[r2]
            if (r6 == 0) goto L70
            boolean r7 = bo.d0.u0(r6)
            r7 = r7 ^ 1
            if (r7 == 0) goto L70
            goto L71
        L70:
            r6 = r3
        L71:
            if (r6 == 0) goto L76
            r4.add(r6)
        L76:
            int r2 = r2 + 1
            goto L61
        L79:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4714cm.k():java.util.List");
    }

    public final List<String> l() {
        return this.f66548e;
    }

    public final List<String> m() {
        return this.f66547d;
    }

    @Nullable
    public final boolean n() {
        return this.f66554k;
    }

    public final boolean o() {
        return this.f66555l;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f66547d + ", mStartupHostsFromClient=" + this.f66548e + ", mDistributionReferrer='" + this.f66549f + "', mInstallReferrerSource='" + this.f66550g + "', mClidsFromClient=" + this.f66551h + ", mNewCustomHosts=" + this.f66553j + ", mHasNewCustomHosts=" + this.f66554k + ", mSuccessfulStartup=" + this.f66555l + ", mCountryInit='" + this.f66556m + "', mFirstStartupTime=" + this.f66557n + "} " + super.toString();
    }
}
