package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f18989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f18990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f18991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f18992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f18993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18994g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f18995h;

    public t(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, t0 t0Var, s sVar) {
        this.f18989b = inneractiveAdRequest;
        this.f18990c = gVar;
        this.f18991d = sVar;
        this.f18995h = t0Var.f16697c;
        this.f18988a = new b(t0Var);
    }

    public final void a() {
        a aVar = this.f18993f;
        if (aVar == null) {
            this.f18991d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.r rVar = this.f18992e;
        n nVar = (n) aVar;
        nVar.f18923l = this;
        if (rVar != null) {
            String str = rVar.f16892g;
            nVar.f18925n = rVar;
            nVar.f18922k++;
            nVar.f18919h = false;
            nVar.f18921j = false;
            IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
            if (nVar.f18920i) {
                return;
            }
            nVar.f18912a.a(str, nVar.f18924m);
        }
    }

    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2;
        InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.network.t tVar2;
        if (jSONObject != null || inneractiveVideoError == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            ((n) this.f18993f).b(inneractiveVideoError, jSONObject2);
        }
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i10 = r.f18987a[playerError.ordinal()];
            if (i10 == 1) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest = this.f18989b;
            com.fyber.inneractive.sdk.response.g gVar = this.f18990c;
            JSONArray jSONArrayB = this.f18995h.b();
            w wVar = new w(gVar);
            wVar.f17077b = tVar2;
            wVar.f17076a = inneractiveAdRequest;
            wVar.f17079d = jSONArrayB;
            if (jSONObject2 != null) {
                try {
                    wVar.f17081f.put(new JSONObject(jSONObject2.toString()));
                } catch (Exception unused) {
                }
            }
            wVar.a((String) null);
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            com.fyber.inneractive.sdk.network.t tVar3 = com.fyber.inneractive.sdk.network.t.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f18989b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.f18990c;
            JSONArray jSONArrayB2 = this.f18995h.b();
            w wVar2 = new w(gVar2);
            wVar2.f17077b = tVar3;
            wVar2.f17076a = inneractiveAdRequest2;
            wVar2.f17079d = jSONArrayB2;
            wVar2.a((String) null);
        }
        if (inneractiveVideoError != null) {
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            if (z10) {
                inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z10) {
            return;
        }
        this.f18992e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.f18990c;
        if (gVar3 != null && (bVar = gVar3.O) != null) {
            this.f18992e = (com.fyber.inneractive.sdk.model.vast.r) bVar.f16824d.poll();
        }
        if (this.f18992e != null) {
            if (this.f18994g) {
                return;
            }
            try {
                this.f18993f = this.f18988a.a();
            } catch (Throwable th2) {
                this.f18991d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
            }
            a();
            return;
        }
        InneractiveVideoError.Error playerError2 = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
        int i11 = r.f18987a[playerError2.ordinal()];
        if (i11 == 1) {
            tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
        } else if (i11 == 2) {
            tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        } else if (i11 == 3) {
            tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        } else if (i11 == 4) {
            tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        } else if (i11 != 5) {
            IAlog.a("IAReportError, Does not know player error " + playerError2.getErrorString(), new Object[0]);
            tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
        } else {
            tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f18989b;
        com.fyber.inneractive.sdk.response.g gVar4 = this.f18990c;
        JSONArray jSONArrayB3 = this.f18995h.b();
        w wVar3 = new w(gVar4);
        wVar3.f17077b = tVar;
        wVar3.f17076a = inneractiveAdRequest3;
        wVar3.f17079d = jSONArrayB3;
        wVar3.a((String) null);
        s sVar = this.f18991d;
        if (sVar != null) {
            if (inneractiveVideoError != null) {
                sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, iVar, inneractiveVideoError.getCause()));
            } else {
                sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL));
            }
        }
    }

    public final void a(String str, String... strArr) {
        a aVar = this.f18993f;
        if (aVar != null) {
            n nVar = (n) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                nVar.f18976r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    nVar.a(nVar.f18974p, VideoClickOrigin.InvalidOrigin, x.a(str2));
                }
            }
        }
    }
}
