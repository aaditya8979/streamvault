package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Xi extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5163uf f66180b;

    public Xi(@NonNull Y4 y42) {
        this(y42, C5009oa.k().t());
    }

    public Xi(Y4 y42, C5163uf c5163uf) {
        super(y42);
        this.f66180b = c5163uf;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(q52.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f66180b.b(C5088rf.a(jSONObjectOptJSONObject));
        return false;
    }
}
