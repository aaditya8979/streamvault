package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C3957c1;
import com.ironsource.C4228r4;
import com.ironsource.C4324wf;
import com.ironsource.O8;
import com.ironsource.Z7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A implements O8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractAdapter f32309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3957c1 f32310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f32312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f32315g = null;

    public A(C3957c1 c3957c1, AbstractAdapter abstractAdapter) {
        this.f32310b = c3957c1;
        this.f32309a = abstractAdapter;
        this.f32312d = c3957c1.c();
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + Z7.f30794r + c() + " : " + str, i10);
    }

    public void a(String str) {
        a(str, 0);
    }

    public void a(boolean z10) {
        this.f32311c = z10;
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f32310b.e();
    }

    public void b(String str) {
        a(str, 3);
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f32310b.f();
    }

    public void c(String str) {
        this.f32313e = d.b().c(str);
    }

    public abstract IronSource.a d();

    public Long e() {
        return this.f32315g;
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.f32310b.d();
    }

    public boolean h() {
        return this.f32311c;
    }

    public String i() {
        return this.f32310b.h().isMultipleInstances() ? this.f32310b.h().getProviderTypeForReflection() : this.f32310b.h().getProviderName();
    }

    public String j() {
        return this.f32310b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f32309a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f32309a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f32310b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f32310b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f32313e)) {
                map.put("dynamicDemandSource", this.f32313e);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th2);
        }
        return map;
    }

    public int n() {
        return this.f32314f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f32309a.isUsingActivityBeforeImpression(C4324wf.a(d()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th2.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f32310b.j();
    }

    public void q() {
        this.f32309a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f32310b.k();
    }
}
