package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4916ki implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cf f67135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5241xi f67136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f67137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pl f67138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5135tc f67139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f67140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fn f67141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f67142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4859ic f67143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C4955m6 f67144k;

    public C4916ki(@NotNull Context context, @NotNull Cf cf2, @NotNull C5241xi c5241xi, @NotNull Handler handler, @NotNull Pl pl2) {
        this.f67134a = context;
        this.f67135b = cf2;
        this.f67136c = c5241xi;
        this.f67137d = handler;
        this.f67138e = pl2;
        this.f67139f = new C5135tc(context, cf2, c5241xi, pl2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f67140g = linkedHashMap;
        this.f67141h = new Fn(new C4967mi(linkedHashMap));
        this.f67142i = cn.w.p("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    public final synchronized Va a(@NotNull AppMetricaConfig appMetricaConfig) {
        C4955m6 c4955m6;
        c4955m6 = this.f67144k;
        if (c4955m6 != null) {
            c4955m6.a(appMetricaConfig);
        } else {
            C4955m6 c4955m62 = new C4955m6(new C4980n6(this.f67135b, this.f67139f.f67735e, this.f67136c, appMetricaConfig));
            this.f67144k = c4955m62;
            c4955m6 = c4955m62;
        }
        return c4955m6;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        if (this.f67140g.containsKey(reporterConfig.apiKey)) {
            LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
        } else {
            b(reporterConfig);
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    public final synchronized Sa b(@NotNull ReporterConfig reporterConfig) {
        Sa sa2;
        sa2 = (Sa) this.f67140g.get(reporterConfig.apiKey);
        if (sa2 == null) {
            if (!this.f67142i.contains(reporterConfig.apiKey)) {
                this.f67138e.i();
            }
            Context context = this.f67134a;
            C5285zc c5285zc = new C5285zc(context, this.f67135b, reporterConfig, this.f67136c, new N9(context));
            c5285zc.f65400i = new C5035pb(this.f67137d, c5285zc);
            Pl pl2 = this.f67138e;
            Gh gh2 = c5285zc.f65393b;
            if (pl2 != null) {
                gh2.f65350b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c5285zc.k();
            this.f67140g.put(reporterConfig.apiKey, c5285zc);
            sa2 = c5285zc;
        }
        return sa2;
    }

    @NotNull
    public final C4916ki b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C4859ic b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C4924l0 c4924l0) {
        C4859ic c4859ic;
        c4859ic = this.f67143j;
        if (c4859ic != null) {
            C5135tc c5135tc = this.f67139f;
            c5135tc.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c5135tc.f67736f.f65350b.applyFromAnonymousConfig(appMetricaConfig);
        } else {
            this.f67141h.a(appMetricaConfig.apiKey);
            C5135tc c5135tc2 = this.f67139f;
            c5135tc2.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c5135tc2.f67736f.f65350b.applyFromAnonymousConfig(appMetricaConfig);
            c4859ic = new C4859ic(this.f67139f);
            c4859ic.f65400i = new C5035pb(this.f67137d, c4859ic);
            Pl pl2 = this.f67138e;
            Gh gh2 = c4859ic.f65393b;
            if (pl2 != null) {
                gh2.f65350b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c4859ic.a(appMetricaConfig, c4924l0);
            c4859ic.k();
            this.f67136c.f67958f.f66312c = new C4890ji(c4859ic);
            this.f67140g.put(appMetricaConfig.apiKey, c4859ic);
            this.f67143j = c4859ic;
        }
        return c4859ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C4859ic a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C4924l0 c4924l0) {
        C4859ic c4859ic;
        c4859ic = this.f67143j;
        if (c4859ic != null) {
            this.f67139f.a(appMetricaConfig, publicLogger);
            c4859ic.a(appMetricaConfig, c4924l0);
            C4696c4.l().getClass();
            this.f67140g.put(appMetricaConfig.apiKey, c4859ic);
        } else {
            this.f67141h.a(appMetricaConfig.apiKey);
            this.f67139f.a(appMetricaConfig, publicLogger);
            c4859ic = new C4859ic(this.f67139f);
            c4859ic.f65400i = new C5035pb(this.f67137d, c4859ic);
            Pl pl2 = this.f67138e;
            Gh gh2 = c4859ic.f65393b;
            if (pl2 != null) {
                gh2.f65350b.setUuid(pl2.g());
            } else {
                gh2.getClass();
            }
            c4859ic.a(appMetricaConfig, c4924l0);
            c4859ic.k();
            this.f67136c.f67958f.f66312c = new C4890ji(c4859ic);
            this.f67140g.put(appMetricaConfig.apiKey, c4859ic);
            C4696c4.l().getClass();
            this.f67143j = c4859ic;
        }
        return c4859ic;
    }
}
