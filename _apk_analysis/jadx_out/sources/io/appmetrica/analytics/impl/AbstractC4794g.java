package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4794g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f66800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f66801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vk f66802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qk f66803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sa f66804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f66805f;

    public AbstractC4794g(@NonNull Y4 y42, @NonNull Rk rk2, @NonNull Vk vk2, @NonNull Qk qk2, @NonNull Sa sa2, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f66800a = y42;
        this.f66801b = rk2;
        this.f66802c = vk2;
        this.f66803d = qk2;
        this.f66804e = sa2;
        this.f66805f = systemTimeProvider;
    }

    @NonNull
    public final Ek a(@NonNull Fk fk2) {
        if (this.f66802c.h()) {
            this.f66804e.reportEvent("create session with non-empty storage");
        }
        Y4 y42 = this.f66800a;
        Vk vk2 = this.f66802c;
        long jA = this.f66801b.a();
        Vk vk3 = this.f66802c;
        vk3.a(Vk.f66052f, Long.valueOf(jA));
        vk3.a(Vk.f66050d, Long.valueOf(fk2.f65257a));
        vk3.a(Vk.f66054h, Long.valueOf(fk2.f65257a));
        vk3.a(Vk.f66053g, 0L);
        vk3.a(Vk.f66055i, Boolean.TRUE);
        vk3.b();
        this.f66800a.f66218e.a(jA, this.f66803d.f65824a, TimeUnit.MILLISECONDS.toSeconds(fk2.f65258b));
        return new Ek(y42, vk2, a(), new SystemTimeProvider());
    }

    @NonNull
    public final /* bridge */ Ek a(@NonNull Object obj) {
        return a((Fk) obj);
    }

    public final Hk a() {
        Gk gk2 = new Gk(this.f66803d);
        gk2.f65294g = this.f66802c.i();
        gk2.f65293f = this.f66802c.f66058c.a(Vk.f66053g);
        gk2.f65291d = this.f66802c.f66058c.a(Vk.f66054h);
        gk2.f65290c = this.f66802c.f66058c.a(Vk.f66052f);
        gk2.f65295h = this.f66802c.f66058c.a(Vk.f66050d);
        gk2.f65288a = this.f66802c.f66058c.a(Vk.f66051e);
        return new Hk(gk2);
    }

    @Nullable
    public final Ek b() {
        if (this.f66802c.h()) {
            return new Ek(this.f66800a, this.f66802c, a(), this.f66805f);
        }
        return null;
    }
}
