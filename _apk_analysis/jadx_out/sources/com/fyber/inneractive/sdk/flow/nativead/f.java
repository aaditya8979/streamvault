package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f16435m = IAlog.a(f.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f16436n = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f16439c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f16441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f16442f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f16444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f16447k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f16437a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f16438b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16440d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f16443g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f16448l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f16445i = rVar;
        this.f16447k = jVar;
        this.f16444h = inneractiveAdRequest;
        this.f16439c = iVar;
        this.f16442f = dVar;
        this.f16446j = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.f.a():void");
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f16435m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (c cVar : this.f16437a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f16443g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f16442f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f16413b, dVar.f16412a, "send_failed_native_creatives", dVar.f16418g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }
}
