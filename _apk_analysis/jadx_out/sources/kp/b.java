package kp;

import fp.k;
import fp.l;

/* JADX INFO: compiled from: DanmakusRetainer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f73496a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f73497b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f73498c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f73499d = null;

    /* JADX INFO: renamed from: kp.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class C0865b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f73500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public gp.e f73501e;

        /* JADX INFO: renamed from: kp.b$b$a */
        /* JADX INFO: compiled from: DanmakusRetainer.java */
        public class a extends k.b<fp.c, f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l f73502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f73503b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public fp.c f73504c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public fp.c f73505d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public fp.c f73506e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f73507f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f73508g;

            public a() {
            }

            @Override // fp.k.b
            public void c() {
                this.f73503b = 0;
                this.f73505d = null;
                this.f73504c = null;
                this.f73507f = false;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                if (C0865b.this.f73511b) {
                    return 1;
                }
                this.f73503b++;
                if (cVar == this.f73506e) {
                    this.f73504c = null;
                    this.f73507f = false;
                    return 1;
                }
                if (this.f73505d == null) {
                    this.f73505d = cVar;
                    if (cVar.d() != this.f73502a.getHeight()) {
                        return 1;
                    }
                }
                if (this.f73508g < this.f73502a.k()) {
                    this.f73504c = null;
                    return 1;
                }
                l lVar = this.f73502a;
                fp.c cVar2 = this.f73506e;
                boolean zH = lp.a.h(lVar, cVar, cVar2, cVar2.f(), this.f73506e.k().f61800a);
                this.f73507f = zH;
                if (zH) {
                    this.f73508g = (cVar.l() - this.f73502a.getMargin()) - this.f73506e.f61789p;
                    return 0;
                }
                this.f73504c = cVar;
                return 1;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public f d() {
                f fVar = new f();
                fVar.f73524a = this.f73503b;
                fVar.f73526c = this.f73505d;
                fVar.f73529f = this.f73504c;
                fVar.f73532i = this.f73507f;
                return fVar;
            }
        }

        public C0865b() {
            super();
            this.f73500d = new a();
            this.f73501e = new gp.e(2);
        }

        @Override // kp.b.c, kp.b.e
        public void a(fp.c cVar, l lVar, g gVar) {
            boolean z10;
            boolean z11;
            fp.c cVar2;
            fp.c cVar3;
            int i10;
            if (cVar.r()) {
                return;
            }
            boolean zU = cVar.u();
            float fL = zU ? cVar.l() : -1.0f;
            int i11 = 1;
            boolean z12 = false;
            boolean z13 = (zU || this.f73501e.isEmpty()) ? false : true;
            if (fL < lVar.k()) {
                fL = lVar.getHeight() - cVar.f61789p;
            }
            fp.c cVar4 = null;
            if (zU) {
                i11 = 0;
            } else {
                this.f73511b = false;
                a aVar = this.f73500d;
                aVar.f73508g = fL;
                aVar.f73502a = lVar;
                aVar.f73506e = cVar;
                this.f73501e.d(aVar);
                f fVarD = this.f73500d.d();
                float f10 = this.f73500d.f73508g;
                if (fVarD != null) {
                    int i12 = fVarD.f73524a;
                    fp.c cVar5 = fVarD.f73526c;
                    fp.c cVar6 = fVarD.f73529f;
                    boolean z14 = fVarD.f73531h;
                    i10 = i12;
                    z11 = fVarD.f73532i;
                    cVar2 = cVar5;
                    cVar3 = cVar6;
                    z10 = z14;
                } else {
                    z10 = zU;
                    z11 = z13;
                    cVar2 = null;
                    cVar3 = null;
                    i10 = 0;
                }
                boolean zB = b(false, cVar, lVar, f10, cVar2, null);
                if (zB) {
                    fL = lVar.getHeight() - cVar.f61789p;
                    z12 = zB;
                    z13 = true;
                } else {
                    boolean z15 = f10 >= ((float) lVar.k()) ? false : z11;
                    if (cVar3 != null) {
                        z12 = zB;
                        z13 = z15;
                        zU = z10;
                        cVar4 = cVar3;
                        i11 = i10 - 1;
                        fL = f10;
                    } else {
                        z12 = zB;
                        z13 = z15;
                        fL = f10;
                        i11 = i10;
                    }
                }
                zU = z10;
                cVar4 = cVar3;
            }
            if (gVar == null || !gVar.a(cVar, fL, i11, z13)) {
                if (z12) {
                    clear();
                }
                cVar.x(lVar, cVar.g(), fL);
                if (zU) {
                    return;
                }
                this.f73501e.a(cVar4);
                this.f73501e.c(cVar);
            }
        }

        @Override // kp.b.d, kp.b.c
        public boolean b(boolean z10, fp.c cVar, l lVar, float f10, fp.c cVar2, fp.c cVar3) {
            if (f10 >= lVar.k()) {
                return (cVar2 == null || cVar2.d() == ((float) lVar.getHeight())) ? false : true;
            }
            return true;
        }

        @Override // kp.b.c, kp.b.e
        public void clear() {
            this.f73511b = true;
            this.f73501e.clear();
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public gp.e f73510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f73511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f73512c;

        /* JADX INFO: compiled from: DanmakusRetainer.java */
        public class a extends k.b<fp.c, f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l f73513a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f73514b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public fp.c f73515c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public fp.c f73516d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public fp.c f73517e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public fp.c f73518f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public fp.c f73519g = null;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f73520h = false;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f73521i = false;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f73522j = false;

            public a() {
            }

            @Override // fp.k.b
            public void c() {
                this.f73514b = 0;
                this.f73518f = null;
                this.f73517e = null;
                this.f73516d = null;
                this.f73515c = null;
                this.f73522j = false;
                this.f73521i = false;
                this.f73520h = false;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                if (c.this.f73511b) {
                    return 1;
                }
                this.f73514b++;
                fp.c cVar2 = this.f73519g;
                if (cVar == cVar2) {
                    this.f73515c = cVar;
                    this.f73517e = null;
                    this.f73521i = true;
                    this.f73522j = false;
                    return 1;
                }
                if (this.f73516d == null) {
                    this.f73516d = cVar;
                }
                if (cVar2.f61789p + cVar.l() > this.f73513a.getHeight()) {
                    this.f73520h = true;
                    return 1;
                }
                fp.c cVar3 = this.f73518f;
                if (cVar3 == null || cVar3.i() >= cVar.i()) {
                    this.f73518f = cVar;
                }
                l lVar = this.f73513a;
                fp.c cVar4 = this.f73519g;
                boolean zH = lp.a.h(lVar, cVar, cVar4, cVar4.f(), this.f73519g.k().f61800a);
                this.f73522j = zH;
                if (zH) {
                    this.f73517e = cVar;
                    return 0;
                }
                this.f73515c = cVar;
                return 1;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public f d() {
                f fVar = new f();
                fVar.f73524a = this.f73514b;
                fVar.f73526c = this.f73516d;
                fVar.f73525b = this.f73515c;
                fVar.f73527d = this.f73517e;
                fVar.f73528e = this.f73518f;
                fVar.f73530g = this.f73520h;
                fVar.f73531h = this.f73521i;
                fVar.f73532i = this.f73522j;
                return fVar;
            }
        }

        public c() {
            this.f73510a = new gp.e(1);
            this.f73511b = false;
            this.f73512c = new a();
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
        @Override // kp.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(fp.c r20, fp.l r21, kp.b.g r22) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kp.b.c.a(fp.c, fp.l, kp.b$g):void");
        }

        public boolean b(boolean z10, fp.c cVar, l lVar, float f10, fp.c cVar2, fp.c cVar3) {
            if (f10 >= lVar.k()) {
                return (cVar2 != null && cVar2.l() > 0.0f) || f10 + cVar.f61789p > ((float) lVar.getHeight());
            }
            return true;
        }

        @Override // kp.b.e
        public void clear() {
            this.f73511b = true;
            this.f73510a.clear();
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class d extends c {
        public d() {
            super();
        }

        @Override // kp.b.c
        public boolean b(boolean z10, fp.c cVar, l lVar, float f10, fp.c cVar2, fp.c cVar3) {
            return f10 + cVar.f61789p > ((float) lVar.getHeight());
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public interface e {
        void a(fp.c cVar, l lVar, g gVar);

        void clear();
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fp.c f73525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public fp.c f73526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public fp.c f73527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public fp.c f73528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public fp.c f73529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f73530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f73531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f73532i;

        public f() {
            this.f73524a = 0;
            this.f73525b = null;
            this.f73526c = null;
            this.f73527d = null;
            this.f73528e = null;
            this.f73529f = null;
            this.f73530g = false;
            this.f73531h = false;
            this.f73532i = false;
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public interface g {
        boolean a(fp.c cVar, float f10, int i10, boolean z10);
    }

    public b(boolean z10) {
        a(z10);
    }

    public void a(boolean z10) {
        this.f73496a = z10 ? new C0865b() : new c();
        this.f73497b = z10 ? new C0865b() : new c();
        if (this.f73498c == null) {
            this.f73498c = new d();
        }
        if (this.f73499d == null) {
            this.f73499d = new C0865b();
        }
    }

    public void b() {
        e eVar = this.f73496a;
        if (eVar != null) {
            eVar.clear();
        }
        e eVar2 = this.f73497b;
        if (eVar2 != null) {
            eVar2.clear();
        }
        e eVar3 = this.f73498c;
        if (eVar3 != null) {
            eVar3.clear();
        }
        e eVar4 = this.f73499d;
        if (eVar4 != null) {
            eVar4.clear();
        }
    }

    public void c(fp.c cVar, l lVar, g gVar) {
        int type = cVar.getType();
        if (type == 1) {
            this.f73496a.a(cVar, lVar, gVar);
            return;
        }
        if (type == 4) {
            this.f73499d.a(cVar, lVar, gVar);
            return;
        }
        if (type == 5) {
            this.f73498c.a(cVar, lVar, gVar);
        } else if (type == 6) {
            this.f73497b.a(cVar, lVar, gVar);
        } else {
            if (type != 7) {
                return;
            }
            cVar.x(lVar, 0.0f, 0.0f);
        }
    }

    public void d() {
        b();
    }
}
