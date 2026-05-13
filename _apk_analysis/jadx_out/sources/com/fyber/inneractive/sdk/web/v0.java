package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f19710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f19711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f19713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f19717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f19718i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f19720k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f19722m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19724o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n0 f19725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f19726q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f19719j = "invalid_task_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19721l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19723n = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19727r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19728s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f19729t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f19730u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f19731v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19732w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19733x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19734y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f19735z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    public v0(w0 w0Var) {
        this.f19712c = w0Var.f19737a;
        this.f19713d = w0Var.f19738b;
        this.f19714e = w0Var.f19739c;
        this.f19722m = w0Var.f19740d;
        this.f19715f = w0Var.f19741e;
        this.f19716g = w0Var.f19742f;
        this.f19717h = w0Var.f19743g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        this.f19711b = hVar;
        hVar.f16736h.add(this);
        this.f19710a = new WebView(com.fyber.inneractive.sdk.util.o.f19548a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f19735z = true;
        if (this.f19719j.equals(str)) {
            this.f19711b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        if (this.f19719j.equals(str)) {
            if (i10 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d10)));
            } else {
                if (i10 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f19712c)) {
            return;
        }
        this.f19719j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.f19735z = false;
            if (this.f19719j.equals(str)) {
                this.f19711b.m();
                if (!this.f19731v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 == null || !(str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) && this.f19711b.n()) {
                if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                    this.f19711b.m();
                    d("onInstallationFailed();");
                }
            } else {
                if (this.f19729t.getAndIncrement() < 2) {
                    this.f19711b.a(new p0(this, str2, str3));
                    return;
                }
                this.f19711b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f19711b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f16744p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f16730b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f19711b;
                    if (!hVar2.f16737i && (vVar = this.f19717h) != null) {
                        hVar2.f16737i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f19713d;
            if (mVar != null) {
                this.f19717h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f19735z = false;
        this.A = true;
        if (this.f19719j.equals(str)) {
            this.f19711b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f19731v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f19729t.getAndIncrement() < 2) {
                    this.f19711b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f19711b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f16744p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f16730b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f19711b;
                    if (hVar2.f16737i || (vVar = this.f19717h) == null) {
                        return;
                    }
                    hVar2.f16737i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f19556b.post(new o0(this, str));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19720k = str;
        WebSettings settings = this.f19710a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f19710a.setInitialScale(1);
        this.f19710a.setBackgroundColor(-1);
        this.f19710a.setWebViewClient(this.E);
        WebView webView = this.f19710a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        DTExchangeNetworkBridge.onAddedJavascriptInterface(this.f19710a, new u0(this), "nativeInterface");
        DTExchangeNetworkBridge.webviewLoadUrl(this.f19710a, str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f19722m;
        if (rVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer numA = ((com.fyber.inneractive.sdk.config.global.features.q) rVar.a(com.fyber.inneractive.sdk.config.global.features.q.class)).a("load_timeout");
            int i10 = 10;
            int iIntValue = numA != null ? numA.intValue() : 10;
            if (iIntValue < 30 && iIntValue > 2) {
                i10 = iIntValue;
            }
            long millis = timeUnit.toMillis(i10);
            this.f19723n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.f19724o = System.currentTimeMillis();
        n0 n0Var = new n0(this);
        this.f19725p = n0Var;
        com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(n0Var, this.f19723n);
    }
}
