package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4991nh extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5163uf f67369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f67370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f67371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f67372e;

    public C4991nh(@NonNull Y4 y42) {
        this(y42, y42.u(), C5009oa.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    public C4991nh(Y4 y42, yo yoVar, C5163uf c5163uf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(y42);
        this.f67370c = yoVar;
        this.f67369b = c5163uf;
        this.f67371d = safePackageManager;
        this.f67372e = systemTimeProvider;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        Y4 y42 = this.f65880a;
        if (this.f67370c.d()) {
            return false;
        }
        Q5 q5A = ((C4941lh) y42.f66224k.a()).f67216e ? Q5.a(q52, EnumC4703cb.EVENT_TYPE_APP_UPDATE) : Q5.a(q52, EnumC4703cb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f67371d.getInstallerPackageName(y42.f66214a, y42.f66215b.f65831a), ""));
            C5163uf c5163uf = this.f67369b;
            c5163uf.f65811h.a(c5163uf.f65804a);
            jSONObject.put("preloadInfo", ((C5088rf) c5163uf.c()).b());
        } catch (Throwable unused) {
        }
        q5A.setValue(jSONObject.toString());
        C4933l9 c4933l9 = y42.f66227n;
        c4933l9.a(q5A, Sk.a(c4933l9.f67197c.b(q5A), q5A.f65796i));
        yo yoVar = this.f67370c;
        synchronized (yoVar) {
            zo zoVar = yoVar.f68052a;
            zoVar.a(zoVar.a().put("init_event_done", true));
        }
        this.f67370c.a(this.f67372e.currentTimeMillis());
        return false;
    }
}
