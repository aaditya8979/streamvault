package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f29862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4032g4 f29863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4 f29864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4086j5 f29866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29869i = Mg.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f29870j;

    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public Mg(Context context, C4032g4 c4032g4, Z4 z42, int i10, C4086j5 c4086j5, String str) {
        a aVarH = h();
        this.f29870j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f29862b = context;
            this.f29863c = c4032g4;
            this.f29864d = z42;
            this.f29865e = i10;
            this.f29866f = c4086j5;
            this.f29867g = 0;
        }
        this.f29861a = str;
    }

    private a h() {
        this.f29868h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f29869i, "getInitialState mMaxAllowedTrials: " + this.f29868h);
        if (this.f29868h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.f29869i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.f29867g != this.f29868h) {
            this.f29870j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f29869i, "handleRecoveringEndedFailed | Reached max trials");
        this.f29870j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f29870j = a.RECOVERED;
    }

    public void a() {
        this.f29862b = null;
        this.f29863c = null;
        this.f29864d = null;
        this.f29866f = null;
    }

    public void a(boolean z10) {
        if (this.f29870j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }

    public boolean a(C4266t8.c cVar, C4266t8.b bVar) {
        Logger.i(this.f29869i, "shouldRecoverWebController: ");
        a aVar = this.f29870j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C4266t8.c.Native) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C4266t8.b.Loading || bVar == C4266t8.b.None) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f29862b == null || this.f29863c == null || this.f29864d == null) {
            Logger.i(this.f29869i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f29869i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.f29862b;
    }

    public String c() {
        return this.f29861a;
    }

    public C4032g4 d() {
        return this.f29863c;
    }

    public int e() {
        return this.f29865e;
    }

    public Z4 f() {
        return this.f29864d;
    }

    public C4086j5 g() {
        return this.f29866f;
    }

    public JSONObject i() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3978d4.i.A0, m());
            jSONObjectJsonObjectInit.put(C3978d4.i.B0, this.f29867g);
            jSONObjectJsonObjectInit.put(C3978d4.i.C0, this.f29868h);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    public boolean l() {
        return this.f29870j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f29870j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f29870j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f29867g++;
            Logger.i(this.f29869i, "recoveringStarted - trial number " + this.f29867g);
            this.f29870j = aVar2;
        }
    }
}
