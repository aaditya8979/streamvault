package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3589mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3440gi f27631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f27636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f27637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27638h;

    public C3589mi(C3440gi c3440gi) {
        tn.p.k(c3440gi, "renderViewMetaData");
        this.f27631a = c3440gi;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class);
        C3564li c3564li = c3440gi.f27240k;
        this.f27636f = new AtomicInteger(c3564li != null ? c3564li.f27575a : telemetryConfig.getMaxTemplateEvents());
        this.f27637g = new AtomicBoolean(false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        if (tn.p.f(this.f27631a.f27241l, "default")) {
            return str;
        }
        switch (str.hashCode()) {
            case -1395724590:
                return !str.equals("PageStarted") ? str : "CompanionWebViewPageStarted";
            case -81019210:
                return !str.equals("FireAdFailed") ? str : "CompanionFireAdFailed";
            case 147127306:
                return !str.equals("FireAdReady") ? str : "CompanionFireAdReady";
            case 260281564:
                return !str.equals("WebViewLoadCalled") ? str : "CompanionWebViewLoadCalled";
            case 520950289:
                return !str.equals("WebViewLoadFinished") ? str : "CompanionWebViewLoadFinished";
            case 570988141:
                return !str.equals("RenderProcessResponsive") ? str : "RenderProcessResponsive";
            case 1001819046:
                return !str.equals("RenderProcessUnResponsive") ? str : "CompanionRenderProcessUnResponsive";
            default:
                return str;
        }
    }

    public final Map a() {
        String str = this.f27631a.f27241l;
        if (str == null) {
            str = "";
        }
        Map mapO = kotlin.collections.a.o(bn.h.a("trigger", str), bn.h.a("plType", String.valueOf(this.f27631a.f27230a.f28306f)), bn.h.a("plId", String.valueOf(this.f27631a.f27230a.f28301a)), bn.h.a("adType", String.valueOf(this.f27631a.f27230a.f28305e)), bn.h.a("markupType", this.f27631a.f27231b), bn.h.a("networkType", C3850x5.m()), bn.h.a("retryCount", String.valueOf(this.f27631a.f27234e)), bn.h.a("creativeType", this.f27631a.f27235f), bn.h.a("adPosition", String.valueOf(this.f27631a.f27238i)), bn.h.a("isRewarded", String.valueOf(this.f27631a.f27237h)), bn.h.a("impressionId", this.f27631a.f27232c));
        if (this.f27631a.f27233d.length() > 0) {
            mapO.put("metadataBlob", this.f27631a.f27233d);
        }
        return mapO;
    }

    public final void a(int i10) {
        short s10;
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "im_telemetry_prefs");
            String str = A1.f25131c;
            if (str == null) {
                str = "unknown";
            }
            tn.p.k("last_app_version", "key");
            if (tn.p.f(eaA.f25373a.getString("last_app_version", null), str)) {
                return;
            }
            Map mapA = a();
            switch (i10) {
                case 8800:
                    s10 = 2365;
                    break;
                case 8801:
                default:
                    s10 = (short) i10;
                    break;
                case 8802:
                    s10 = 2366;
                    break;
                case 8803:
                    s10 = 2367;
                    break;
                case 8804:
                    s10 = 2368;
                    break;
            }
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            Wj wj2 = Wj.f26549a;
            Wj.b("VideoPlayerNotSupported", mapA, EnumC3287ak.f26805a);
            eaA.a("last_app_version", str, false);
        }
    }

    public final void a(String str, String str2) {
        tn.p.k(str, "eventType");
        if (this.f27637g.get()) {
            return;
        }
        if (this.f27636f.decrementAndGet() <= 0) {
            this.f27637g.set(true);
            Map mapA = a();
            long j10 = this.f27633c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            Wj wj2 = Wj.f26549a;
            Wj.b("TemplateEventDropped", mapA, EnumC3287ak.f26805a);
            return;
        }
        if (str2 != null) {
            try {
            } catch (JSONException e10) {
                Log.e(Wj.f26550b, "Error parsing JSON: " + e10);
            }
            if (new JSONObject(str2).length() == 0) {
                str2 = null;
            }
        }
        String str3 = this.f27631a.f27241l;
        if (str3 == null) {
            str3 = "";
        }
        Map mapO = kotlin.collections.a.o(bn.h.a("trigger", str3), bn.h.a("plType", String.valueOf(this.f27631a.f27230a.f28306f)), bn.h.a("impressionId", this.f27631a.f27232c), bn.h.a("markupType", this.f27631a.f27231b), bn.h.a("networkType", C3850x5.m()));
        if (str2 != null) {
            mapO.put("payload", str2);
        }
        if (this.f27631a.f27233d.length() > 0) {
            mapO.put("metadataBlob", this.f27631a.f27233d);
        }
        Wj.b(str, mapO, EnumC3287ak.f26806b);
    }

    public final void a(boolean z10, short s10) {
        String strA = a("WebViewRenderProcessGoneEvent");
        String str = this.f27631a.f27241l;
        if (str == null) {
            str = "";
        }
        Pair pairA = bn.h.a("trigger", str);
        long j10 = this.f27633c;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        Map mapO = kotlin.collections.a.o(pairA, bn.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10)), bn.h.a("source", "render_view_" + this.f27631a.f27230a.f28305e), bn.h.a("isCrashed", Boolean.valueOf(z10)), bn.h.a("creativeId", this.f27631a.f27236g), bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
        Wj wj2 = Wj.f26549a;
        Wj.b(strA, mapO, EnumC3287ak.f26805a);
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f27633c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (tn.p.f(strA, "CompanionWebViewLoadCalled")) {
            long j10 = this.f27632b;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        } else {
            C3672q1 c3672q1 = this.f27631a.f27239j;
            if (c3672q1 != null) {
                long j11 = c3672q1.f27925a.f28015c;
                p000do.l0 l0Var2 = AbstractC3492il.f27361a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j11));
            }
        }
        mapA.put("creativeId", this.f27631a.f27236g);
        Wj wj2 = Wj.f26549a;
        Wj.b(strA, mapA, EnumC3287ak.f26805a);
    }
}
