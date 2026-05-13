package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f6 extends i5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f8283o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f8284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0148a f8287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f8288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f8291n;

    public class b extends i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f8292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final y2 f8294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f8295j;

        public class a extends i3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MaxAdFormat f8297b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f8298c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.InterfaceC0148a interfaceC0148a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0148a);
                this.f8297b = maxAdFormat;
                this.f8298c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8292g;
                com.applovin.impl.sdk.o unused = b.this.f8507c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f8507c.a(b.this.f8506b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f8297b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f8294i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f8293h >= b.this.f8295j.size() - 1) {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f8505a.q0().a((i5) new b(bVar2.f8293h + 1, b.this.f8295j), d6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8292g;
                com.applovin.impl.sdk.o unused = b.this.f8507c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f8507c.a(b.this.f8506b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f8297b.getLabel() + " ad unit " + this.f8298c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f8293h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f8295j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f8295j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        private b(int i10, List list) {
            super(f6.this.f8506b, f6.this.f8505a, f6.this.f8284g.b());
            this.f8292g = SystemClock.elapsedRealtime();
            this.f8293h = i10;
            this.f8294i = (y2) list.get(i10);
            this.f8295j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f6.this.f8291n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j10, y2Var.B(), maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.f8284g.b();
            MaxAdFormat maxAdFormatA = f6.this.f8284g.a();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Loading ad " + (this.f8293h + 1) + " of " + this.f8295j.size() + " from " + this.f8294i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f8288k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f8505a.u0();
            this.f8505a.a0().b(this.f8294i);
            this.f8505a.X().loadThirdPartyMediatedAd(strB, this.f8294i, activityU0, new a(f6.this.f8287j, maxAdFormatA, strB));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0148a interfaceC0148a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.f8284g = a3Var;
        this.f8285h = jSONObject;
        this.f8287j = interfaceC0148a;
        this.f8288k = new WeakReference(context);
        this.f8289l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f8286i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f8286i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f8291n = new ArrayList(this.f8286i.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f8291n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f8291n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f8284g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8290m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.d(this.f8506b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f8284g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f8285h, "waterfall_name", ""), JsonUtils.getString(this.f8285h, "waterfall_test_name", ""), jElapsedRealtime, this.f8291n, this.f8284g, JsonUtils.optList(JsonUtils.getJSONArray(this.f8285h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f8289l, JsonUtils.getString(this.f8285h, "event_id", "")));
        t2.a(this.f8287j, strB, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f8505a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8290m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.d(this.f8506b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + y2Var.c() + " for " + this.f8284g.a().getLabel() + " ad unit " + this.f8284g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f8291n, this.f8289l));
        t2.f(this.f8287j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f8505a.u0());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f8290m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f8285h.optBoolean("is_testing", false) && !this.f8505a.s0().c() && f8283o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.oa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9484b.e();
                }
            });
        }
        String strB = this.f8284g.b();
        MaxAdFormat maxAdFormatA = this.f8284g.a();
        if (this.f8286i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f8286i.size() + " ad(s)...");
            }
            this.f8505a.q0().a(new b(i10, this.f8286i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.k(this.f8506b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f8285h, this.f8505a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8285h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f8285h, strB, this.f8505a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.f8505a) && ((Boolean) this.f8505a.a(x4.A6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.pa
            @Override // java.lang.Runnable
            public final void run() {
                this.f9558b.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.f8505a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
