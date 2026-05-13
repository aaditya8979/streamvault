package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.adm.y f16972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f16974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f16976u;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        super(vVar, g0.f16977c.a(), rVar);
        this.f16973r = 0;
        this.f17048o = true;
        this.f16971p = str;
        this.f16972q = yVar;
        this.f16974s = eVar;
        this.f16975t = rVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String strName = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = strName.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.f19396p) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f15828a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.n1.a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.O.f15966l;
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        this.f16976u = TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, jVar, str2);
    }

    public f1(f1 f1Var) {
        super(f1Var);
        this.f16973r = 0;
        this.f17048o = true;
        this.f16971p = f1Var.f16971p;
        this.f16972q = f1Var.f16972q;
        this.f16974s = f1Var.f16974s;
        this.f16975t = f1Var.f16975t;
        this.f16976u = f1Var.f16976u;
        this.f16973r = f1Var.f16973r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(this.f16973r), Integer.valueOf(p().f17001a), Integer.valueOf(p().f17002b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0, t1 {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f16990c;
            if (inputStream != null) {
                d(System.currentTimeMillis());
                StringBuffer stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(System.currentTimeMillis());
                String string = stringBufferB.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f16972q.f15828a;
                int iA = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.f16972q;
                yVar.f15830c = string;
                com.fyber.inneractive.sdk.response.e eVarA = a(iA, null, yVar, null);
                eVarA.f19388h = string;
                o0Var.f17012a = eVarA;
            }
            return o0Var;
        } catch (b e10) {
            e = e10;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16971p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            b(System.currentTimeMillis());
            throw new n0(e11.getMessage(), e11);
        } catch (SocketTimeoutException e12) {
            e = e12;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16971p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (UnknownHostException e13) {
            e = e13;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16971p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (Exception e14) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse adm network request url: %s msg: %s", this.f16971p, e14.getMessage());
            throw new n0(e14);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.a(this), Integer.valueOf(this.f16973r));
        l0 l0Var = IAConfigManager.O.f15973s;
        this.f17034a = true;
        f1 f1Var = new f1(this);
        if ((l0Var instanceof l0) && l0Var.c(f1Var)) {
            return;
        }
        IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.a(this), Integer.valueOf(this.f16973r));
        a((Object) null, new Exception("Bidding ad request passed allowed time"), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j10) {
        super.d(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.f16976u.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int iQ = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f16976u;
        return ((aVar.c() + aVar.f17054f) * this.f16973r) + iQ;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.f16975t;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f16976u;
        return new l1(aVar.f17058i, aVar.f17057h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f16971p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f16976u.f17054f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f17034a) {
            return false;
        }
        int i10 = this.f16973r + 1;
        this.f16973r = i10;
        if (i10 > this.f16976u.b()) {
            IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f16973r - 1), Integer.valueOf(this.f16976u.b()), this.f17040g);
            return false;
        }
        IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f16973r - 1), Integer.valueOf(this.f16976u.b()), this.f17040g);
        this.f16976u.a(this.f16973r);
        return true;
    }
}
