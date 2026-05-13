package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.controller.b.d f83403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg.bigo.ads.common.g f83404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.api.b f83405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sg.bigo.ads.api.a.l f83406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> f83407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83408f;

    public c(sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        this.f83403a = dVar;
        this.f83404b = gVar;
        this.f83405c = bVar;
        this.f83406d = lVar;
        this.f83407e = eVar;
        bVar.a(gVar.Q(), gVar.R(), gVar.S());
        this.f83408f = sg.bigo.ads.common.y.a.a();
    }

    private void a(int i10, int i11, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar = this.f83407e;
        if (eVar != null) {
            eVar.a(this.f83408f, i10, i11, str, this.f83406d);
        }
    }

    @Override // sg.bigo.ads.controller.g.i
    public final int a() {
        return this.f83408f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // sg.bigo.ads.controller.g.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.g.c.b():void");
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.b k() {
        return this.f83405c;
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.a.l l() {
        return this.f83406d;
    }
}
