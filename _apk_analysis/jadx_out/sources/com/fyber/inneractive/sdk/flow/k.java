package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f16412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f16413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f16414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f16415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.b f16416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.r0 f16417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f16418g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.timeouts.content.a f16421j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16419h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16420i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f16423l = new j(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f16422k = new d(this);

    public void a() {
        int i10;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f16420i - 1);
        int i11 = this.f16420i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f16421j;
        if (aVar != null) {
            if (aVar.f17055g) {
                i11 = aVar.f17049a - i11;
            }
            i10 = (aVar.f17050b * i11) + aVar.f17052d + (i11 == aVar.f17049a ? aVar.f17056h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f16416e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f16421j;
        InneractiveInfrastructureError inneractiveInfrastructureErrorD = this.f16420i <= (aVar2 != null ? aVar2.f17049a : 0) ? d() : new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        com.fyber.inneractive.sdk.util.r.f19555a.execute(new e(new f(this.f16413b, this.f16412a, e(), this.f16418g.b()), inneractiveInfrastructureErrorD));
        b(inneractiveInfrastructureErrorD);
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f16412a = inneractiveAdRequest;
        this.f16413b = eVar;
        this.f16415d = aVar;
        this.f16416e = bVar;
        this.f16422k = new d(this);
        this.f16418g = rVar;
        UnitDisplayType unitDisplayType = eVar.f19396p;
        this.f16421j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.f19387g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.K, eVar.D, IAConfigManager.O.f15966l, this.f16418g);
        if (this.f16412a == null) {
            this.f16417f = com.fyber.inneractive.sdk.config.a.a(eVar.f19395o);
        }
        try {
            i();
        } catch (Throwable th2) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th2, inneractiveAdRequest, eVar);
            this.f16422k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        int i10;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f16420i - 1);
        int i11 = this.f16420i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f16421j;
        if (aVar != null) {
            if (aVar.f17055g) {
                i11 = aVar.f17049a - i11;
            }
            i10 = (aVar.f17050b * i11) + aVar.f17052d + (i11 == aVar.f17049a ? aVar.f17056h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f16416e;
        if (bVar != null) {
            bVar.b();
        }
        i();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.f16422k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.f16296a;
        if (handler != null) {
            handler.removeCallbacks(dVar.f16299d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f16421j;
        boolean z10 = this.f16420i <= (aVar != null ? aVar.f17049a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z10));
        if (z10) {
            x xVar = this.f16414c;
            if (xVar != null) {
                xVar.destroy();
                this.f16414c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f16421j;
            int i10 = aVar2 != null ? aVar2.f17053e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i10));
            com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(this.f16423l, i10);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.f16415d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f16412a;
        com.fyber.inneractive.sdk.response.e eVar = this.f16413b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16418g;
        JSONArray jSONArrayB = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f17077b = tVar;
                wVar.f17076a = inneractiveAdRequest;
                wVar.f17079d = jSONArrayB;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i11 = 7; i11 >= 0 && i11 < 13 && i11 < stackTrace.length; i11++) {
                        sb2.append(stackTrace[i11].toString());
                        sb2.append(StringUtils.COMMA);
                    }
                    Log.d("stack trace:", sb2.toString());
                    string = sb2.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", string2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "message", string2);
                }
                try {
                    jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, string);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", UnifiedMediationParams.KEY_DESCRIPTION, string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                wVar.f17081f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.f16414c, eVar, jSONArrayB);
        }
        cancel();
    }

    public void c() {
        g();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.f16413b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.f19387g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public abstract String e();

    public final com.fyber.inneractive.sdk.config.s0 f() {
        InneractiveAdRequest inneractiveAdRequest = this.f16412a;
        return inneractiveAdRequest == null ? this.f16417f : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public final void g() {
        String str;
        this.f16422k.a();
        InneractiveAdRequest inneractiveAdRequest = this.f16412a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f16650b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.f16413b;
            if (eVar == null || (str = eVar.B) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.f16798d.a(str).i();
        x xVar = this.f16414c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f16415d;
        if (aVar != null) {
            aVar.a(this.f16412a);
        }
    }

    public abstract void h();

    public final void i() {
        int i10;
        int i11 = this.f16420i;
        this.f16420i = i11 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f16421j;
        if (aVar != null) {
            if (aVar.f17055g) {
                i11 = aVar.f17049a - i11;
            }
            i10 = (aVar.f17050b * i11) + aVar.f17052d + (i11 == aVar.f17049a ? aVar.f17056h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(i10), Integer.valueOf(this.f16420i - 1));
        d dVar = this.f16422k;
        if (dVar.f16296a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f16296a = new Handler(handlerThread.getLooper());
        }
        dVar.f16296a.postDelayed(dVar.f16299d, i10);
        h();
    }
}
