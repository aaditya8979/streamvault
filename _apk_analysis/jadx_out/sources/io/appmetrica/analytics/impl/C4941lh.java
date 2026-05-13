package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4941lh extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f67219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f67220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f67221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC4863ih f67222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4915kh f67223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f67224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f67225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f67226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f67227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f67228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f67229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f67230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f67231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f67232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f67233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f67234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f67235x = new HashSet();

    public C4941lh(Y4 y42) {
        this.f67223l = y42;
    }

    public final void a(int i10) {
        this.f67229r = i10;
    }

    public final void a(long j10) {
        this.f67233v = j10;
    }

    public final void a(@Nullable Boolean bool, @NonNull InterfaceC4863ih interfaceC4863ih) {
        this.f67221j = bool;
        this.f67222k = interfaceC4863ih;
    }

    public final void a(@NonNull List<String> list) {
        this.f67234w = list;
    }

    public final void a(@NonNull Set<String> set) {
        this.f67235x = set;
    }

    public final void a(boolean z10) {
        this.f67232u = z10;
    }

    public final void b(int i10) {
        this.f67218g = i10;
    }

    public final void b(long j10) {
        this.f67230s = j10;
    }

    public final void b(List<String> list) {
        this.f67228q = list;
    }

    public final void b(boolean z10) {
        this.f67226o = z10;
    }

    public final String c() {
        return this.f67224m;
    }

    public final void c(int i10) {
        this.f67220i = i10;
    }

    public final void c(long j10) {
        this.f67231t = j10;
    }

    public final void c(boolean z10) {
        this.f67216e = z10;
    }

    public final int d() {
        return this.f67229r;
    }

    public final void d(int i10) {
        this.f67217f = i10;
    }

    public final void d(boolean z10) {
        this.f67215d = z10;
    }

    @NonNull
    public final Set<String> e() {
        return this.f67235x;
    }

    public final void e(boolean z10) {
        this.f67219h = z10;
    }

    @Nullable
    public final List<String> f() {
        return this.f67234w;
    }

    public final void f(boolean z10) {
        this.f67225n = z10;
    }

    public final boolean g() {
        return this.f67232u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f67227p, "");
    }

    public final boolean i() {
        return this.f67222k.a(this.f67221j);
    }

    public final int j() {
        return this.f67218g;
    }

    public final long k() {
        return this.f67233v;
    }

    public final int l() {
        return this.f67220i;
    }

    public final long m() {
        return this.f67230s;
    }

    public final long n() {
        return this.f67231t;
    }

    public final List<String> o() {
        return this.f67228q;
    }

    public final int p() {
        return this.f67217f;
    }

    public final boolean q() {
        return this.f67226o;
    }

    public final boolean r() {
        return this.f67216e;
    }

    public final boolean s() {
        return this.f67215d;
    }

    public final boolean t() {
        return this.f67225n;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f67215d + ", mFirstActivationAsUpdate=" + this.f67216e + ", mSessionTimeout=" + this.f67217f + ", mDispatchPeriod=" + this.f67218g + ", mLogEnabled=" + this.f67219h + ", mMaxReportsCount=" + this.f67220i + ", dataSendingEnabledFromArguments=" + this.f67221j + ", dataSendingStrategy=" + this.f67222k + ", mPreloadInfoSendingStrategy=" + this.f67223l + ", mApiKey='" + this.f67224m + "', mPermissionsCollectingEnabled=" + this.f67225n + ", mFeaturesCollectingEnabled=" + this.f67226o + ", mClidsFromStartupResponse='" + this.f67227p + "', mReportHosts=" + this.f67228q + ", mAttributionId=" + this.f67229r + ", mPermissionsCollectingIntervalSeconds=" + this.f67230s + ", mPermissionsForceSendIntervalSeconds=" + this.f67231t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f67232u + ", mMaxReportsInDbCount=" + this.f67233v + ", mCertificates=" + this.f67234w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !mo.a((Collection) this.f67228q) && this.f67232u;
    }

    public final boolean v() {
        return ((Y4) this.f67223l).B();
    }
}
