package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private C3980d6 f30352a;

    public final class a extends Qe {
        public a() {
        }

        @Override // com.ironsource.Qe, java.lang.Runnable
        public void run() {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            try {
                jSONObjectB.put("duration", a());
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C3987dd.P.a(new C5(D5.APP_ENTER_BACKGROUND, jSONObjectB));
        }
    }

    public final void a(@NotNull InterfaceC4180o7 interfaceC4180o7) {
        tn.p.k(interfaceC4180o7, "applicationLifecycleService");
        this.f30352a = new C3980d6(interfaceC4180o7, new a());
    }
}
