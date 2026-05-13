package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Pl implements Ql {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f65763k = Collections.unmodifiableMap(new Ml());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5241xi f65765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xl f65766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f65767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f65768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nl f65769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f65770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f65771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f65772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f65773j;

    public Pl(@NonNull Context context, C5241xi c5241xi, We we2, @NonNull Handler handler) {
        this(c5241xi, new Xl(context, we2), handler);
    }

    public Pl(C5241xi c5241xi, Xl xl2, Handler handler) {
        this.f65764a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f65770g = new Object();
        this.f65771h = new WeakHashMap();
        this.f65773j = false;
        this.f65765b = c5241xi;
        this.f65766c = xl2;
        this.f65767d = handler;
        this.f65769f = new Nl(this);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Xl xl2 = this.f65766c;
        P p10 = xl2.f66198j;
        IdentifiersResult identifiersResult = (IdentifiersResult) xl2.f66190b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) xl2.f66190b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) xl2.f66190b.get("appmetrica_yandex_adv_id");
        p10.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Xl xl2 = this.f65766c;
        synchronized (xl2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) xl2.f66190b.get(str);
                if (identifiersResult != null) {
                    map.put(str, xl2.f66191c.a(identifiersResult));
                }
            }
            xl2.f66200l.a(list, map);
            xl2.f66201m.a(list, map);
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Kl kl2;
        if (this.f65771h.containsKey(startupParamsCallback)) {
            List list = (List) this.f65771h.get(startupParamsCallback);
            if (this.f65766c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i10 = bundle.getInt("startup_error_key_code");
                    kl2 = Kl.UNKNOWN;
                    if (i10 == 1) {
                        kl2 = Kl.NETWORK;
                    } else if (i10 == 2) {
                        kl2 = Kl.PARSE;
                    }
                } else {
                    kl2 = null;
                }
                if (kl2 == null) {
                    if (this.f65766c.a()) {
                        kl2 = Kl.UNKNOWN;
                    } else {
                        PublicLogger publicLogger = this.f65768e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f65772i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f65763k, kl2, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f65771h.remove(startupParamsCallback);
            if (this.f65771h.isEmpty()) {
                C5024p0 c5024p0 = this.f65765b.f67956d;
                synchronized (c5024p0.f67482f) {
                    c5024p0.f67479c = false;
                    c5024p0.c();
                }
            }
        }
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f65771h.isEmpty()) {
            C5024p0 c5024p0 = this.f65765b.f67956d;
            synchronized (c5024p0.f67482f) {
                c5024p0.f67479c = true;
                c5024p0.b();
            }
        }
        this.f65771h.put(startupParamsCallback, list);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.f65770g) {
            Xl xl2 = this.f65766c;
            xl2.getClass();
            if (!mo.a((Map) map) && !mo.a(map, xl2.f66193e)) {
                xl2.f66193e = new HashMap(map);
                xl2.f66195g = true;
                xl2.c();
            }
            a(startupParamsCallback, list);
            if (this.f65766c.a((List) list)) {
                a(list, new Ol(this, startupParamsCallback), map, true);
            } else {
                a(new Bundle(), startupParamsCallback);
            }
        }
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f65768e = publicLogger;
    }

    public final void a(String str) {
        synchronized (this.f65770g) {
            this.f65765b.a(str);
        }
    }

    public final void a(List list, B6 b62, Map map, boolean z10) {
        C6 c62 = new C6(this.f65767d, b62);
        C5241xi c5241xi = this.f65765b;
        c5241xi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Ya(c62, list, map, z10));
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC5232x9.f67933a;
        N3 n32 = new N3("", "", 1536, 0, anonymousInstance);
        n32.f65800m = bundle;
        G4 g42 = c5241xi.f67953a;
        c5241xi.a(C5241xi.a(n32, g42), g42, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        synchronized (this.f65770g) {
            HashMap mapB = Gm.b(map);
            this.f65772i = mapB;
            this.f65765b.a(mapB);
            Xl xl2 = this.f65766c;
            xl2.getClass();
            if (!mo.a((Map) mapB) && !mo.a(mapB, xl2.f66193e)) {
                xl2.f66193e = new HashMap(mapB);
                xl2.f66195g = true;
                xl2.c();
            }
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f65766c.f66190b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f68099id;
        return !TextUtils.isEmpty(str) ? AbstractC4832hb.a(str) : this.f65772i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007f A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Pl.b(android.os.Bundle):void");
    }

    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.f65770g) {
            b(bundle);
            h();
            if (startupParamsCallback != null) {
                a(bundle, startupParamsCallback);
            }
        }
    }

    public final void b(@Nullable String str) {
        synchronized (this.f65770g) {
            this.f65765b.b(str);
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f65770g) {
            List list2 = this.f65766c.f66192d;
            if (mo.a((Collection) list)) {
                if (!mo.a((Collection) list2)) {
                    Xl xl2 = this.f65766c;
                    xl2.f66192d = null;
                    xl2.f66197i.a((List<String>) null);
                    this.f65765b.a((List) null);
                }
            } else if (mo.a(list, list2)) {
                this.f65765b.a(list2);
            } else {
                Xl xl3 = this.f65766c;
                xl3.f66192d = list;
                xl3.f66197i.a(list);
                this.f65765b.a(list);
            }
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final B6 c() {
        return this.f65769f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f65766c.f66190b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f68099id;
    }

    @NonNull
    public final Y9 e() {
        W9 w92;
        Xl xl2 = this.f65766c;
        T9 t92 = xl2.f66202n;
        U9 u92 = xl2.f66201m;
        synchronized (u92) {
            w92 = u92.f65990b;
        }
        t92.getClass();
        Boolean bool = w92.f66095a;
        return new Y9();
    }

    public final long f() {
        return this.f65766c.f66194f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f65766c.f66190b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f68099id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f65771h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f65766c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f65770g) {
            if (!this.f65773j || this.f65766c.b()) {
                this.f65773j = true;
                a(this.f65764a, this.f65769f, this.f65772i, false);
            }
        }
    }
}
