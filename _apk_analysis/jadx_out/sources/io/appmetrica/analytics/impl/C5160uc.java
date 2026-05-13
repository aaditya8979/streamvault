package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5160uc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f67777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xe f67778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67779c = "activation_unlock_event_sending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f67780d;

    public C5160uc(@NotNull Rg rg2, @NotNull C5028p4 c5028p4, @NotNull Xe xe2) {
        this.f67777a = rg2;
        this.f67778b = xe2;
        this.f67780d = new AtomicBoolean(xe2.a(false) || a(c5028p4));
    }

    public static boolean a(C5028p4 c5028p4) {
        String str = c5028p4.f67490a;
        return (str == null || tn.p.f(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }

    public final void a() {
        if (this.f67780d.compareAndSet(false, true)) {
            this.f67778b.b(true);
            a("timer");
        }
    }

    public final void a(String str) {
        try {
            Rj rj2 = AbstractC5043pj.f67535a;
            String str2 = this.f67779c;
            JSONObject jSONObjectPut = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            N9 n9I = C5009oa.I.i();
            Bundle applicationMetaData = n9I.f65635d.getApplicationMetaData(n9I.f65632a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C4994nk c4994nk = C5009oa.I.D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c4994nk.f67378a.currentTimeMillis() - c4994nk.f67379b, TimeUnit.MILLISECONDS)).toString();
            rj2.getClass();
            rj2.a(new Pj(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        String str;
        if (!this.f67780d.get() && (str = ((C4941lh) this.f67777a.a()).f67224m) != null && !tn.p.f(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f67780d.compareAndSet(false, true)) {
            this.f67778b.b(true);
            a("activation");
        }
        return this.f67780d.get();
    }
}
