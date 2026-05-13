package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C3957c1;
import com.ironsource.C3966ca;
import com.ironsource.C4228r4;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractAdapter f32545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3957c1 f32546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f32547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f32548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f32549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f32552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<String> f32553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f32555k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f32556l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final IronSource.a f32557m;

    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C3957c1 c3957c1, AbstractAdapter abstractAdapter) {
        this.f32546b = c3957c1;
        this.f32557m = c3957c1.b();
        this.f32545a = abstractAdapter;
        JSONObject jSONObjectC = c3957c1.c();
        this.f32547c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
        }
        this.f32548d = a.NOT_LOADED;
        this.f32549e = null;
        this.f32551g = "";
        this.f32552h = null;
        this.f32553i = new ArrayList();
    }

    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f32555k) {
            aVar2 = this.f32548d;
            if (Arrays.asList(aVarArr).contains(this.f32548d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void a(String str) {
        this.f32551g = str;
    }

    public void a(List<String> list, String str, int i10, String str2, String str3) {
        Iterator it = ((List) C3966ca.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a(str3, str, com.ironsource.mediationsdk.d.b().a((String) it.next(), str, i10, str2, "", "", "", ""));
        }
    }

    public void a(TimerTask timerTask) {
        synchronized (this.f32556l) {
            p();
            Timer timer = new Timer();
            this.f32549e = timer;
            timer.schedule(timerTask, this.f32550f);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f32552h = jSONObject;
    }

    public void a(boolean z10) {
        try {
            this.f32547c.put("isOneFlow", z10);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }

    public boolean a(a aVar) {
        boolean z10;
        synchronized (this.f32555k) {
            z10 = this.f32548d == aVar;
        }
        return z10;
    }

    public boolean a(a aVar, a aVar2) {
        synchronized (this.f32555k) {
            if (this.f32548d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f32546b.f() + ": current state=" + this.f32548d + ", new state=" + aVar);
        synchronized (this.f32555k) {
            this.f32548d = aVar;
        }
    }

    public void b(String str) {
        this.f32554j = com.ironsource.mediationsdk.d.b().c(str);
    }

    public C3957c1 f() {
        return this.f32546b;
    }

    public String g() {
        return this.f32551g;
    }

    public String h() {
        return this.f32546b.f();
    }

    public int i() {
        return this.f32546b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f32545a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f32545a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f32546b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f32546b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f32546b.d()));
            if (!TextUtils.isEmpty(this.f32551g)) {
                map.put("auctionId", this.f32551g);
            }
            JSONObject jSONObject = this.f32552h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f32552h);
            }
            if (!TextUtils.isEmpty(this.f32554j)) {
                map.put("dynamicDemandSource", this.f32554j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e10);
        }
        return map;
    }

    String k() {
        a aVar = this.f32548d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f32546b.i();
    }

    public List<String> m() {
        return this.f32553i;
    }

    public boolean n() {
        return this.f32546b.j();
    }

    public boolean o() {
        return this.f32547c.optBoolean("isOneFlow", false);
    }

    public void p() {
        synchronized (this.f32556l) {
            Timer timer = this.f32549e;
            if (timer != null) {
                timer.cancel();
                this.f32549e = null;
            }
        }
    }
}
