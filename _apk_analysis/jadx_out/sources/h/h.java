package h;

import bp.t1;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f62947a;

    public h(c cVar) {
        this.f62947a = cVar;
    }

    @Override // bp.t1
    public final void a() {
        c cVar = this.f62947a;
        if (cVar.I) {
            return;
        }
        cVar.v("load ad time out!");
        this.f62947a.J = true;
    }
}
