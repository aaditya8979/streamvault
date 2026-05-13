package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5241xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G4 f67953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tn f67954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5291zi f67955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5024p0 f67956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ql f67957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Zj f67958f;

    public C5241xi(C5024p0 c5024p0, Tn tn2, G4 g42, Zj zj2) {
        this(c5024p0, tn2, g42, zj2, new C5291zi(c5024p0, zj2));
    }

    public C5241xi(C5024p0 c5024p0, Tn tn2, G4 g42, Zj zj2, C5291zi c5291zi) {
        this.f67956d = c5024p0;
        this.f67953a = g42;
        this.f67954b = tn2;
        this.f67958f = zj2;
        this.f67955c = c5291zi;
    }

    public static Q5 a(Q5 q52, Gh gh2) {
        if (AbstractC5232x9.f67933a.contains(Integer.valueOf(q52.f65791d))) {
            q52.f65790c = gh2.d();
        }
        return q52;
    }

    public final C5215wh a(Rn rn2, Gh gh2) {
        String str;
        this.f67956d.b();
        Tn tn2 = this.f67954b;
        tn2.getClass();
        Hn hn2 = rn2.f65845a;
        String str2 = hn2 == null ? "" : (String) WrapUtils.getOrDefault(hn2.f65340a, "");
        byte[] bArrFromModel = tn2.f65955a.fromModel(rn2);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey());
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(bArrFromModel, str2, 5891, orCreatePublicLogger);
        n32.f65790c = gh2.d();
        HashMap map = n32.f65616q;
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        return new C5215wh(n32, true, 1, map, new Gh(cf2, counterConfiguration, e82, str));
    }

    public final void a(Pl pl2) {
        this.f67957e = pl2;
        this.f67953a.f65350b.setUuid(pl2.g());
    }

    public final void a(Q5 q52, Gh gh2, int i10, Map map) {
        String str;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        this.f67956d.b();
        if (!mo.a(map)) {
            q52.setValue(AbstractC4832hb.b(map));
            a(q52, gh2);
        }
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        a(new C5215wh(q52, false, i10, null, new Gh(cf2, counterConfiguration, e82, str)));
    }

    public final void a(C5215wh c5215wh) {
        Gh gh2 = c5215wh.f67906e;
        Ql ql2 = this.f67957e;
        if (ql2 != null) {
            gh2.f65350b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        this.f67955c.a(c5215wh);
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (mo.a(bool)) {
            this.f67953a.f65350b.setLocationTracking(bool.booleanValue());
        }
        if (mo.a(bool2)) {
            this.f67953a.f65350b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (mo.a(bool3)) {
            this.f67953a.f65350b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        Q5 q5A = Q5.a();
        G4 g42 = this.f67953a;
        a(a(q5A, g42), g42, 1, (Map) null);
    }

    public final void a(String str) {
        Cf cf2 = this.f67953a.f65349a;
        synchronized (cf2) {
            cf2.f65118a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final void a(HashMap map) {
        Cf cf2 = this.f67953a.f65349a;
        synchronized (cf2) {
            cf2.f65118a.put("PROCESS_CFG_CLIDS", AbstractC4832hb.b(map));
        }
    }

    public final void a(List list) {
        Cf cf2 = this.f67953a.f65349a;
        synchronized (cf2) {
            cf2.f65118a.put("PROCESS_CFG_CUSTOM_HOSTS", mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void b(String str) {
        Cf cf2 = this.f67953a.f65349a;
        synchronized (cf2) {
            cf2.f65118a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }
}
