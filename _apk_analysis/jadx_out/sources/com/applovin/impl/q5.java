package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f9660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f9661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d6.b f9662i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f9661h != null) {
                q5.this.f9661h.onPostbackSuccess(q5.this.f9660g.f());
            }
        }
    }

    public class b extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f9664m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f9664m = q5.this.f9660g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f9664m);
            }
            if (q5.this.f9661h != null) {
                q5.this.f9661h.onPostbackFailure(this.f9664m, i10);
            }
            if (q5.this.f9660g.t()) {
                this.f8505a.t().a(q5.this.f9660g.s(), this.f9664m, i10, obj, str2, false);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f8505a.c(x4.f10746i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f8505a);
                                r0.b(jSONObject, this.f8505a);
                                r0.a(jSONObject, this.f8505a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f9661h != null) {
                q5.this.f9661h.onPostbackSuccess(this.f9664m);
            }
            if (q5.this.f9660g.t()) {
                this.f8505a.t().a(q5.this.f9660g.s(), this.f9664m, i10, obj, null, true);
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f9660g = eVar;
        this.f9661h = appLovinPostbackListener;
        this.f9662i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f9660g, b());
        bVar.a(this.f9662i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f9660g.f())) {
            if (this.f9660g.u()) {
                b().x0().a(this.f9660g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.d(this.f8506b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f9661h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f9660g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
