package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4655af extends AbstractC5286zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f66371d = new Ze("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f66372e = new Ze("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f66373f = new Ze("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f66374g = new Ze("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f66375h = new Ze("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f66376i = new Ze("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f66377j = new Ze("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f66378k = new Ze("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f66379l = new Ze("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f66380m = new Ze("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f66381n = new Ze("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f66382o = new Ze("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f66383p = new Ze("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f66384q = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f66385r = new Ze("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f66386s = new Ze("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C4655af(Ia ia2) {
        super(ia2);
    }

    public final int a(@NonNull Ud ud2, int i10) {
        int iOrdinal = ud2.ordinal();
        Ze ze2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? null : f66378k : f66377j : f66376i;
        if (ze2 == null) {
            return i10;
        }
        return this.f66262a.getInt(ze2.f66302b, i10);
    }

    public final long a(int i10) {
        return this.f66262a.getLong(f66372e.f66302b, i10);
    }

    public final long a(long j10) {
        return this.f66262a.getLong(f66375h.f66302b, j10);
    }

    public final long a(@NonNull Ud ud2, long j10) {
        int iOrdinal = ud2.ordinal();
        Ze ze2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? null : f66381n : f66380m : f66379l;
        if (ze2 == null) {
            return j10;
        }
        return this.f66262a.getLong(ze2.f66302b, j10);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f66262a.getString(f66384q.f66302b, null);
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f66384q.f66302b, str).b();
    }

    public final boolean a(boolean z10) {
        return this.f66262a.getBoolean(f66386s.f66302b, z10);
    }

    public final C4655af b(long j10) {
        return (C4655af) b(f66375h.f66302b, j10);
    }

    public final C4655af b(@NonNull Ud ud2, int i10) {
        int iOrdinal = ud2.ordinal();
        Ze ze2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? null : f66378k : f66377j : f66376i;
        return ze2 != null ? (C4655af) b(ze2.f66302b, i10) : this;
    }

    public final C4655af b(@NonNull Ud ud2, long j10) {
        int iOrdinal = ud2.ordinal();
        Ze ze2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? null : f66381n : f66380m : f66379l;
        return ze2 != null ? (C4655af) b(ze2.f66302b, j10) : this;
    }

    public final boolean b(boolean z10) {
        return this.f66262a.getBoolean(f66373f.f66302b, z10);
    }

    public final C4655af c(long j10) {
        return (C4655af) b(f66385r.f66302b, j10);
    }

    public final C4655af c(boolean z10) {
        return (C4655af) b(f66374g.f66302b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f66262a.a();
    }

    public final C4655af d(long j10) {
        return (C4655af) b(f66372e.f66302b, j10);
    }

    public final C4655af d(boolean z10) {
        return (C4655af) b(f66373f.f66302b, z10);
    }

    @Nullable
    public final Boolean d() {
        Ze ze2 = f66374g;
        if (!this.f66262a.a(ze2.f66302b)) {
            return null;
        }
        return Boolean.valueOf(this.f66262a.getBoolean(ze2.f66302b, true));
    }

    public final void e(boolean z10) {
        b(f66386s.f66302b, z10).b();
    }

    public final boolean e() {
        return this.f66262a.getBoolean(f66371d.f66302b, false);
    }

    public final long f() {
        return this.f66262a.getLong(f66385r.f66302b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5286zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f66302b;
    }

    public final void f(boolean z10) {
        b(f66371d.f66302b, z10).b();
    }

    public final C4655af g() {
        return (C4655af) b(f66383p.f66302b, true);
    }

    public final C4655af h() {
        return (C4655af) b(f66382o.f66302b, true);
    }

    public final boolean i() {
        return this.f66262a.getBoolean(f66382o.f66302b, false);
    }

    public final boolean j() {
        return this.f66262a.getBoolean(f66383p.f66302b, false);
    }
}
