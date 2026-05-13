package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f16489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f16490c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.f16490c = pVar;
        this.f16488a = iVar;
        this.f16489b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f15909a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f16490c;
            i iVar = this.f16488a;
            String str = bVar.f15912d;
            com.fyber.inneractive.sdk.util.g gVar = this.f16489b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f16491b, str);
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
