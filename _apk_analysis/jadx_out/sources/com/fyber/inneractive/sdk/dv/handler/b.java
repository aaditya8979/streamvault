package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f16189a;

    public b(c cVar) {
        this.f16189a = cVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        c cVar = this.f16189a;
        e eVar = cVar.f16191b;
        if (eVar.f16195b) {
            return;
        }
        AdFormat adFormat = cVar.f16190a;
        IAlog.a("Firing Event 1000 - Fetch error DV - msg  " + str, new Object[0]);
        w wVar = new w(t.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        wVar.f17081f.put(new x().a(str, "message").a(e.b(), "version").a(adFormat.name(), "adFormat").a(Integer.valueOf(eVar.f16197d), "success_count").f17083a);
        wVar.a((String) null);
        this.f16189a.f16191b.f16195b = true;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        IAlog.a("DVHanlder - %s - put query: %s", this.f16189a.f16190a.toString(), queryInfo.getQuery());
        synchronized (this.f16189a.f16191b.f16196c) {
            c cVar = this.f16189a;
            e eVar = cVar.f16191b;
            eVar.f16197d++;
            eVar.f16194a.put(cVar.f16190a, queryInfo);
        }
    }
}
