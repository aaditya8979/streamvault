package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.Z7;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements i0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f16398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f16399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f16400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f16401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f16402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f16403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f16404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f16405i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f16408l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16406j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16407k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f16409m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f16410n = new Object();

    public h0() {
        String string = UUID.randomUUID().toString();
        this.f16397a = string;
        this.f16403g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), string);
    }

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.f16401e;
        if (xVar2 != null) {
            if (xVar2.c() && (xVar = this.f16401e) != null && !xVar.f16699e) {
                String string = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", string);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.f16401e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.f16695a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar3.b();
                m mVar = this.f16404h;
                p pVar = this.f16408l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.f16509c : null;
                JSONArray jSONArrayB = (mVar == null || (rVar = mVar.f16509c) == null) ? rVar2 != null ? rVar2.b() : null : rVar.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f17077b = tVar;
                wVar.f17076a = inneractiveAdRequest;
                wVar.f17079d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(Z7.f30781e, string);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", Z7.f30781e, string);
                }
                wVar.f17081f.put(jSONObject);
                wVar.a((String) null);
            }
            this.f16401e.destroy();
            this.f16401e = null;
        }
        this.f16402f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f16095c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f16095c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f16080b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f16098f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f16098f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f16158j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.x r2 = r9.f16401e
            if (r2 == 0) goto L3e
            com.fyber.inneractive.sdk.response.e r2 = r2.f16696b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.f16397a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f19396p
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.c r11 = new com.fyber.inneractive.sdk.metrics.c
            com.fyber.inneractive.sdk.flow.x r1 = r9.f16401e
            if (r1 != 0) goto L4f
            goto L55
        L4f:
            com.fyber.inneractive.sdk.config.global.r r0 = r1.f16697c
            org.json.JSONArray r0 = r0.b()
        L55:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.f16405i = g0Var;
        requestAd(null);
    }

    public final void a(x xVar) {
        synchronized (this.f16410n) {
            p pVar = this.f16408l;
            if (pVar != null) {
                pVar.a(true);
                pVar.f16508b = null;
                this.f16408l = null;
            }
            m mVar = this.f16404h;
            if (mVar != null) {
                l lVar = mVar.f16429g;
                if (lVar != null) {
                    IAConfigManager.removeListener(lVar);
                }
                com.fyber.inneractive.sdk.network.m mVar2 = mVar.f16510d;
                if (mVar2 != null) {
                    mVar2.a();
                    mVar.f16510d = null;
                }
                mVar.a(true);
                mVar.f16508b = null;
                this.f16404h = null;
            }
            if (xVar != null) {
                xVar.destroy();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.f16403g.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f16403g)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f16403g.add(s0Var);
            if (this.f16401e != null) {
                for (s0 s0Var2 : this.f16403g) {
                    if (s0Var2.supports(this)) {
                        this.f16402f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.f16397a);
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.f19556b.post(new d0(this));
            return;
        }
        this.f16409m.set(true);
        Iterator it = this.f16403g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.f16403g.clear();
        a((x) null);
        this.f16398b = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.f16401e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f16399c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f16397a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.O.f15967m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.O.f15966l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.O.f15968n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f16399c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f16402f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isReady() {
        /*
            r13 = this;
            java.lang.String r0 = "Got exception adding param to json object: %s, %s"
            com.fyber.inneractive.sdk.flow.x r1 = r13.f16401e
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            com.fyber.inneractive.sdk.response.e r1 = r1.b()
            r3 = 1
            if (r1 == 0) goto L24
            com.fyber.inneractive.sdk.flow.x r1 = r13.f16401e
            com.fyber.inneractive.sdk.response.e r1 = r1.b()
            r1.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r1.f19381a
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto Lac
            com.fyber.inneractive.sdk.flow.x r4 = r13.f16401e
            if (r4 == 0) goto Lac
            com.fyber.inneractive.sdk.response.e r5 = r4.b()
            boolean r6 = r13.f16407k
            if (r6 != 0) goto Lac
            if (r5 == 0) goto Lac
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r5.f19383c
            long r7 = r7 - r9
            long r6 = r6.toMinutes(r7)
            long r8 = r5.f19382b
            long r6 = r6 - r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Firing Event 802 - AdExpired - time passed- "
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ", sessionTimeOut - "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.a(r10, r11)
            com.fyber.inneractive.sdk.network.w r10 = new com.fyber.inneractive.sdk.network.w
            com.fyber.inneractive.sdk.network.t r11 = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r12 = r4.f16695a
            com.fyber.inneractive.sdk.config.global.r r4 = r4.f16697c
            org.json.JSONArray r4 = r4.b()
            r10.<init>(r5)
            r10.f17077b = r11
            r10.f17076a = r12
            r10.f17079d = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "time_passed"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 2
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L85
            goto L8e
        L85:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r2] = r5
            r11[r3] = r6
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r11)
        L8e:
            java.lang.String r5 = "timeout"
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L98
            goto La1
        L98:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r5
            r7[r3] = r6
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r7)
        La1:
            org.json.JSONArray r0 = r10.f17081f
            r0.put(r4)
            r0 = 0
            r10.a(r0)
            r13.f16407k = r3
        Lac:
            if (r1 != 0) goto Lb7
            com.fyber.inneractive.sdk.flow.x r0 = r13.f16401e
            boolean r0 = r0.e()
            if (r0 == 0) goto Lb7
            r2 = r3
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.isReady():boolean");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.f16409m.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.f16401e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f16398b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f16398b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f16398b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f16397a).c();
        String str2 = this.f16397a;
        this.f16408l = new p(str2);
        if (this.f16400d == null) {
            this.f16400d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, rVarA, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f16755a) {
            Application application = com.fyber.inneractive.sdk.util.o.f19548a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, rVarA));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f16402f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f16402f.destroy();
                this.f16402f = null;
            }
            this.f16403g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f16398b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f16399c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f16398b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f16398b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.f16399c;
        String str = this.f16397a;
        inneractiveAdRequest2.f16650b = str;
        com.fyber.inneractive.sdk.metrics.d.f16798d.a(str).c();
        if (this.f16403g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.f16398b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.f16399c;
                }
                a(inneractiveAdRequest, null);
                this.f16398b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        IAConfigManager.b();
        m mVar = this.f16404h;
        if (mVar != null) {
            boolean z10 = inneractiveAdRequest != null || this.f16399c == null;
            l lVar = mVar.f16429g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.f16510d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.f16510d = null;
            }
            mVar.a(z10);
            mVar.f16508b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.f16399c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.f16399c = inneractiveAdRequest;
            x xVar = this.f16401e;
            if (xVar != null) {
                xVar.destroy();
                this.f16406j = true;
            }
            Iterator it = this.f16403g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f16399c.f16649a = false;
                    break;
                } else if (((s0) it.next()) instanceof InneractiveFullscreenUnitController) {
                    break;
                }
            }
        }
        this.f16404h = new m(this.f16397a);
        if (this.f16400d == null) {
            this.f16400d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f16404h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f16755a) {
            Application application = com.fyber.inneractive.sdk.util.o.f19548a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        m mVar3 = this.f16404h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.f16399c;
            mVar3.f16508b = this.f16400d;
            if (IAConfigManager.e()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.f16429g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f16398b = requestListener;
    }
}
