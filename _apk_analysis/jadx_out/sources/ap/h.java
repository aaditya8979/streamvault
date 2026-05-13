package ap;

import bp.t1;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5246a;

    public h(c cVar) {
        this.f5246a = cVar;
    }

    @Override // bp.t1
    public final void a() {
        c cVar = this.f5246a;
        if (cVar.I) {
            return;
        }
        cVar.v("load ad time out!");
        this.f5246a.J = true;
    }
}
