package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f16469h = IAlog.a(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f16470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f16471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f16472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f16473d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f16474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f16475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16476g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f16470a = fVar;
        this.f16471b = fVar2;
        this.f16474e = jVar;
        this.f16475f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        String message;
        if (this.f16473d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.f16473d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", f16469h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.f16471b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f16474e != null && this.f16475f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.f16474e;
            JSONArray jSONArrayB = this.f16475f.b();
            w wVar = new w(jVar);
            wVar.f17078c = uVar;
            wVar.f17076a = null;
            wVar.f17079d = jSONArrayB;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16476g;
            IAlog.a("%sMain image load took: " + jCurrentTimeMillis + " msec", IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f16470a.f19418d.f19412a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strB = com.fyber.inneractive.sdk.util.u.b(gVar.f16450b);
            try {
                jSONObject.put("mime", strB);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", strB);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            wVar.f17081f.put(jSONObject);
            wVar.a((String) null);
        }
        this.f16473d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.f16471b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.f16440d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f16473d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f16470a;
        if (fVar != null && (cVar = fVar.f19418d) != null && (str = cVar.f19412a) != null && !str.trim().isEmpty()) {
            this.f16476g = System.currentTimeMillis();
            this.f16473d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f16470a, this);
            IAConfigManager iAConfigManager = IAConfigManager.O;
            u0 u0Var = new u0(tVar, iAConfigManager.f15976v.f16067a, new com.fyber.inneractive.sdk.cache.d(this.f16470a.f19418d.f19412a));
            this.f16472c = u0Var;
            iAConfigManager.f15973s.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.f16473d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", f16469h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.f16471b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.f16472c;
        if (u0Var != null) {
            u0Var.c();
            this.f16472c = null;
        }
        this.f16474e = null;
        this.f16475f = null;
        this.f16470a = null;
        this.f16471b = null;
        this.f16473d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }
}
