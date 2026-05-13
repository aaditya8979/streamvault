package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j1.b, j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IIgniteServiceAPI f16730b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f16741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k1.a f16742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f16743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f16744p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f16731c = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16733e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16734f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16735g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f16736h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16737i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16738j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16732d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f16743o = rVar;
        if (!TextUtils.isEmpty(this.f16740l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) rVar.a(com.fyber.inneractive.sdk.config.global.features.i.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolC = iVar.c("odt");
            this.f16733e = boolC != null ? boolC.booleanValue() : false;
            Boolean boolC2 = iVar.c("flow");
            this.f16734f = boolC2 != null ? boolC2.booleanValue() : false;
            Boolean boolC3 = iVar.c("updates");
            this.f16735g = boolC3 != null ? boolC3.booleanValue() : false;
            Context context = this.f16729a;
            if (context != null) {
                boolean z10 = this.f16733e;
                if (z10 || this.f16734f) {
                    if (this.f16744p == null) {
                        this.f16738j = false;
                        l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z10, this.f16734f, this.f16735g, this);
                        this.f16744p = lVar;
                        lVar.authenticate();
                    }
                    this.f16739k = TimeUnit.SECONDS.toMillis(IAConfigManager.O.f15977w.f16148a.f16144b.a("igniteInstallTimeOutInSeconds", 15, 1));
                }
            }
        }
    }

    public final void a(j jVar, String str) {
        if (this.f16737i) {
            return;
        }
        this.f16737i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.f17077b = tVar;
        wVar.f17076a = null;
        wVar.f17079d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put("error_code", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f17081f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(String str, g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.f16739k));
        d dVar = new d(this);
        this.f16741m = dVar;
        com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(dVar, this.f16739k);
        if (!n() || o() || this.f16730b == null) {
            for (r rVar : this.f16736h) {
                if (rVar != null) {
                    rVar.a((String) null, o() ? j.SESSION_EXPIRED.a() : j.NOT_CONNECTED.a(), (String) null);
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, str);
            jSONObject.put("data", jSONObject2);
            IIgniteServiceAPI iIgniteServiceAPI = this.f16730b;
            String string = jSONObject.toString();
            Bundle bundle = this.f16731c;
            Bundle bundle2 = new Bundle();
            i iVar = this.f16732d;
            c cVar = new c(this, gVar);
            iVar.getClass();
            iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.f16745a, cVar));
        } catch (Exception unused) {
            IAlog.a("Failed to install app", new Object[0]);
        }
    }

    public final void a(k1.a aVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new Object[0]);
        this.f16742n = aVar;
        l lVar = this.f16744p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void m() {
        d dVar = this.f16741m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar);
            this.f16741m = null;
        }
    }

    public final boolean n() {
        l lVar = this.f16744p;
        return lVar != null && lVar.isConnected() && this.f16744p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.f16744p;
        return lVar == null || lVar.f59542a.f();
    }

    @Override // j1.b
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.f16744p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // j1.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.f16744p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // j1.a
    public final void onIgniteServiceAuthenticated(String str) {
        this.f16731c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        k1.a aVar = this.f16742n;
        if (aVar != null) {
            aVar.a();
            this.f16742n = null;
        }
    }

    @Override // j1.a
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.f16730b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        k1.a aVar = this.f16742n;
        if (aVar != null) {
            aVar.a(str);
            this.f16742n = null;
        }
    }

    @Override // j1.a
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f16740l = componentName.getPackageName();
        this.f16730b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f16738j) {
            l lVar = this.f16744p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.f16738j = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.O.f15957c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f19548a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setSdkVersion(version);
            String str3 = this.f16740l;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f16740l) || (context = this.f16729a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.f16729a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f16740l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.f16729a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f19235b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.O.f15973s.a(new a1(new b(this), byteArray, this.f16743o));
        }
    }

    @Override // j1.a
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // j1.a
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f16734f || (lVar = this.f16744p) == null) {
            return;
        }
        lVar.destroy();
        this.f16744p = null;
    }
}
