package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5061qc extends Y4 implements Na, Ma {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C4965mg f67576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5065qg f67577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final F6 f67578y;

    public C5061qc(Context context, R4 r42, C5028p4 c5028p4, C4898k0 c4898k0, TimePassedChecker timePassedChecker, C5110sc c5110sc, C4965mg c4965mg, F6 f62) {
        super(context, r42, c4898k0, timePassedChecker, c5110sc, c5028p4);
        this.f67576w = c4965mg;
        Y8 y8K = k();
        y8K.a(EnumC4703cb.EVENT_TYPE_REGULAR, new Ig(y8K.b()));
        this.f67577x = c5110sc.a(this);
        this.f67578y = f62;
        C5009oa.k().x().onMainReporterCreated(new C5218wk(this, c5028p4));
    }

    public C5061qc(@NonNull Context context, @NonNull C4817gm c4817gm, @NonNull R4 r42, @NonNull C5028p4 c5028p4, @NonNull C4965mg c4965mg, @NonNull F6 f62, @NonNull W4 w42) {
        this(context, r42, c5028p4, new C4898k0(), new TimePassedChecker(), new C5110sc(context, r42, c5028p4, w42, c4817gm, new C4936lc(f62), C5009oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C5009oa.k().w(), C5009oa.k().l(), new C4781fc()), c4965mg, f62);
    }

    @Override // io.appmetrica.analytics.impl.Y4
    public final void C() {
        this.f67576w.a(this.f67577x);
    }

    public final boolean D() {
        boolean zOptBoolean;
        yo yoVar = this.f66233t;
        synchronized (yoVar) {
            zOptBoolean = yoVar.f68052a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a() {
        yo yoVar = this.f66233t;
        synchronized (yoVar) {
            zo zoVar = yoVar.f68052a;
            zoVar.a(zoVar.a().put("referrer_handled", true));
        }
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C5028p4 c5028p4) {
        super.a(c5028p4);
        this.f67578y.a(c5028p4.f67498i);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }
}
