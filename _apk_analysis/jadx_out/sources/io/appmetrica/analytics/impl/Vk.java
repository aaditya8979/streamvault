package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Vk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f66050d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66051e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66052f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66053g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66054h = "SESSION_INIT_TIME";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f66055i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Xe f66057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4806gb f66058c;

    public Vk(@NonNull Xe xe2, @NonNull String str) {
        this.f66057b = xe2;
        this.f66056a = str;
        C4806gb c4806gb = new C4806gb();
        try {
            String strH = xe2.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c4806gb = new C4806gb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f66058c = c4806gb;
    }

    public final Vk a(long j10) {
        a(f66054h, Long.valueOf(j10));
        return this;
    }

    public final Vk a(boolean z10) {
        a(f66055i, Boolean.valueOf(z10));
        return this;
    }

    public final void a() {
        this.f66058c = new C4806gb();
        b();
    }

    public final void a(String str, Object obj) {
        try {
            this.f66058c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final Vk b(long j10) {
        a(f66051e, Long.valueOf(j10));
        return this;
    }

    public final void b() {
        this.f66057b.e(this.f66056a, this.f66058c.toString());
        this.f66057b.b();
    }

    public final Vk c(long j10) {
        a(f66053g, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.f66058c.a(f66054h);
    }

    public final Vk d(long j10) {
        a(f66052f, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long d() {
        return this.f66058c.a(f66051e);
    }

    public final Vk e(long j10) {
        a(f66050d, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.f66058c.a(f66053g);
    }

    @Nullable
    public final Long f() {
        return this.f66058c.a(f66052f);
    }

    @Nullable
    public final Long g() {
        return this.f66058c.a(f66050d);
    }

    public final boolean h() {
        return this.f66058c.length() > 0;
    }

    @Nullable
    public final Boolean i() {
        C4806gb c4806gb = this.f66058c;
        c4806gb.getClass();
        try {
            return Boolean.valueOf(c4806gb.getBoolean(f66055i));
        } catch (Throwable unused) {
            return null;
        }
    }
}
