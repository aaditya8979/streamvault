package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f16486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f16487d;

    public n(p pVar, i iVar, String str, com.fyber.inneractive.sdk.util.g gVar) {
        this.f16487d = pVar;
        this.f16484a = iVar;
        this.f16485b = str;
        this.f16486c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f15909a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f16487d;
            i iVar = this.f16484a;
            String str = this.f16485b;
            com.fyber.inneractive.sdk.util.g gVar = this.f16486c;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f16491b, str);
            if (v.a(str)) {
                o oVar = new o(pVar, iVar, gVar);
                k kVar = ((j) pVar.f16492a).f16463b;
                if (kVar != null) {
                    kVar.a(str, true, gVar, oVar);
                    return;
                }
                return;
            }
            j jVar = (j) pVar.f16492a;
            i iVar2 = jVar.f16462a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.f16461d, gVar);
                return;
            }
            p pVar2 = jVar.f16464c;
            i iVar3 = jVar.f16462a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
