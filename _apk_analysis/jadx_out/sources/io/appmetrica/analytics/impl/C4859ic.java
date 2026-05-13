package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4859ic extends J2 implements Ja {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Long f66980s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Fn f66981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5135tc f66982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C4884jc f66983r;

    public C4859ic(C5135tc c5135tc) {
        super(c5135tc.b(), c5135tc.i(), c5135tc.h(), c5135tc.d(), c5135tc.f(), c5135tc.j(), c5135tc.g(), c5135tc.c(), c5135tc.a(), c5135tc.e());
        this.f66981p = new Fn(new C4654ae("Referral url"));
        this.f66982q = c5135tc;
        this.f66983r = new C4884jc(this);
        l();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@Nullable Activity activity) {
        if (this.f66982q.f67739i.a(activity, EnumC5023p.RESUMED)) {
            this.f65394c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C4771f2 c4771f2 = this.f66982q.f67737g;
            synchronized (c4771f2) {
                for (C4745e2 c4745e2 : c4771f2.f66723a) {
                    if (c4745e2.f66647d) {
                        c4745e2.f66647d = false;
                        c4745e2.f66645b.remove(c4745e2.f66648e);
                        C4859ic c4859ic = c4745e2.f66644a.f66915a;
                        c4859ic.f65399h.f67955c.b(c4859ic.f65393b.f65349a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@Nullable Location location) {
        this.f65393b.f65350b.setManualLocation(location);
        this.f65394c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull AnrListener anrListener) {
        this.f66983r.a(anrListener);
    }

    public final void a(AppMetricaConfig appMetricaConfig, C4924l0 c4924l0) {
        if (c4924l0.f67174b) {
            clearAppEnvironment();
        }
        List<String> list = c4924l0.f67173a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f65393b.f65350b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE)).booleanValue();
        this.f65394c.info("native crash reporting enabled: %b", Boolean.valueOf(zBooleanValue));
        if (zBooleanValue) {
            Cd cd2 = this.f66982q.f67733c;
            Context context = this.f65392a;
            cd2.f65113d = new H0(this.f65393b.f65350b.getApiKey(), cd2.f65110a.f65118a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, cd2.f65110a.f65118a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), cd2.f65110a.f65118a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f65393b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            H0 h02 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = cd2.f65111b;
                I0 i02 = cd2.f65112c;
                H0 h03 = cd2.f65113d;
                if (h03 == null) {
                    tn.p.C("nativeCrashMetadata");
                } else {
                    h02 = h03;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h02)));
            }
        }
        C4884jc c4884jc = this.f66983r;
        synchronized (c4884jc) {
            Integer num = appMetricaConfig.anrMonitoringTimeout;
            c4884jc.f67029a = num != null ? num.intValue() : 5;
            Boolean bool = appMetricaConfig.anrMonitoring;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                c4884jc.f67030b.a(c4884jc.f67029a);
            } else {
                c4884jc.f67030b.b();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f65394c.info("External attribution received: %s", externalAttribution);
        C5241xi c5241xi = this.f65399h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(bytes, "", 42, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull Io io2) {
        PublicLogger publicLogger = this.f65394c;
        synchronized (io2) {
            io2.f65381b = publicLogger;
        }
        Iterator it = io2.f65380a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f65380a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull EnumC4973n enumC4973n) {
        if (enumC4973n == EnumC4973n.f67311b) {
            this.f65394c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f65394c.warning("Could not enable activity auto tracking. " + enumC4973n.f67315a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f65394c.info("Add auto collected data subscriber: %s", str);
        this.f65393b.f65350b.addAutoCollectedDataSubscriber(str);
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        super.a(str, str2);
        Cd cd2 = this.f66982q.f67733c;
        String strD = this.f65393b.d();
        H0 h02 = cd2.f65113d;
        if (h02 != null) {
            H0 h03 = new H0(h02.f65299a, h02.f65300b, h02.f65301c, h02.f65302d, h02.f65303e, strD);
            cd2.f65113d = h03;
            NativeCrashClientModule nativeCrashClientModule = cd2.f65111b;
            cd2.f65112c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull String str, boolean z10) {
        this.f65394c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z10));
        String strB = AbstractC4832hb.b(map);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(strB, "", 8208, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10) {
        this.f65393b.f65350b.setLocationTracking(z10);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10, boolean z11) {
        this.f65394c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z10));
        this.f65393b.f65350b.setAdvIdentifiersTracking(z10, z11);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(@Nullable Activity activity) {
        if (this.f66982q.f67739i.a(activity, EnumC5023p.PAUSED)) {
            this.f65394c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C4771f2 c4771f2 = this.f66982q.f67737g;
            synchronized (c4771f2) {
                for (C4745e2 c4745e2 : c4771f2.f66723a) {
                    if (!c4745e2.f66647d) {
                        c4745e2.f66647d = true;
                        c4745e2.f66645b.executeDelayed(c4745e2.f66648e, c4745e2.f66646c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c() {
        C4884jc c4884jc = this.f66983r;
        synchronized (c4884jc) {
            c4884jc.f67030b.a(c4884jc.f67029a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c(@NonNull String str) {
        this.f66981p.a(str);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC4832hb.b(map);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(strB, "", 8208, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final List<String> f() {
        return this.f65393b.f65349a.b();
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final void k() {
        super.k();
        C4696c4.l().m().c();
    }

    public final void l() {
        C5241xi c5241xi = this.f65399h;
        c5241xi.f67955c.a(this.f65393b.f65349a);
        C4771f2 c4771f2 = this.f66982q.f67737g;
        C4833hc c4833hc = new C4833hc(this);
        long jLongValue = f66980s.longValue();
        synchronized (c4771f2) {
            c4771f2.a(c4833hc, jLongValue);
        }
    }
}
