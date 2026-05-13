package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4955m6 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4980n6 f67264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f67265b;

    public C4955m6(@NotNull C4980n6 c4980n6) {
        this.f67264a = c4980n6;
        this.f67265b = c4980n6.a();
        C4696c4.l().getClass();
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Gh gh2 = this.f67265b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (gh2) {
                    E8 e82 = gh2.f65283c;
                    e82.f65189b.b(e82.f65188a, key, value);
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(@NotNull Rn rn2) {
        C5241xi c5241xi = this.f67264a.f67327a;
        C5215wh c5215whA = c5241xi.a(rn2, this.f67265b);
        Gh gh2 = c5215whA.f67906e;
        Ql ql2 = c5241xi.f67957e;
        if (ql2 != null) {
            gh2.f65350b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        c5241xi.f67955c.b(c5215whA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + rn2, new Object[0]);
    }
}
