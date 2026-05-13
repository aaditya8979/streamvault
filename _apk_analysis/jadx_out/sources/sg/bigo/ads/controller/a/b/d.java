package sg.bigo.ads.controller.a.b;

import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.a.j;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.controller.a.b f82947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f82948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.controller.b.d f82949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f82950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.controller.e.e f82951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f82952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f82953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f82954h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f82955a = new d();
    }

    public final void a(String str, j jVar, j jVar2) {
        c cVar;
        if (str == null || jVar == null || jVar2 == null) {
            return;
        }
        if (!(i.f81802a.x() && i.f81802a.y() > 0 && i.f81802a.z() > 0 && i.f81802a.A() > 0) || this.f82947a == null) {
            return;
        }
        if (str.equals("/Ad/GetSDKConfig")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f82952f == null) {
                this.f82952f = new e(this.f82947a, this.f82948b, this.f82949c, this.f82950d);
            }
            cVar = this.f82952f;
        } else {
            if (!str.equals("/Ad/ReportUniBaina")) {
                if (jVar.d() != 1) {
                    if (this.f82954h == null) {
                        this.f82954h = new sg.bigo.ads.controller.a.b.a(this.f82947a, this.f82948b, this.f82949c, this.f82950d);
                    }
                    c cVar2 = this.f82954h;
                    ((sg.bigo.ads.controller.a.b.a) cVar2).f82932a = this.f82951e;
                    cVar2.c();
                    return;
                }
                return;
            }
            if (jVar.d() == 1) {
                return;
            }
            if (this.f82953g == null) {
                this.f82953g = new b(this.f82947a, this.f82948b, this.f82949c, this.f82950d);
            }
            cVar = this.f82953g;
        }
        cVar.c();
    }

    public final void a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar, sg.bigo.ads.controller.e.e eVar) {
        this.f82947a = bVar;
        this.f82948b = gVar;
        this.f82949c = dVar;
        this.f82950d = hVar;
        this.f82951e = eVar;
    }
}
