package jp;

import fp.c;
import fp.e;
import fp.j;
import fp.k;
import fp.l;

/* JADX INFO: compiled from: IRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: jp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IRenderer.java */
    public interface InterfaceC0855a {
        void a(c cVar);
    }

    /* JADX INFO: compiled from: IRenderer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f72512a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f72514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f72515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f72516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f72519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f72520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f72521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f72522k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f72523l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f72524m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f72525n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f72526o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f72527p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f72528q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f72529r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f72530s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f72532u;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f72513b = new e();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public k f72531t = new gp.e(4);

        public int a(int i10, int i11) {
            if (i10 == 1) {
                int i12 = this.f72517f + i11;
                this.f72517f = i12;
                return i12;
            }
            if (i10 == 4) {
                int i13 = this.f72520i + i11;
                this.f72520i = i13;
                return i13;
            }
            if (i10 == 5) {
                int i14 = this.f72519h + i11;
                this.f72519h = i14;
                return i14;
            }
            if (i10 == 6) {
                int i15 = this.f72518g + i11;
                this.f72518g = i15;
                return i15;
            }
            if (i10 != 7) {
                return 0;
            }
            int i16 = this.f72521j + i11;
            this.f72521j = i16;
            return i16;
        }

        public int b(int i10) {
            int i11 = this.f72522k + i10;
            this.f72522k = i11;
            return i11;
        }

        public void c(c cVar) {
            if (this.f72532u) {
                return;
            }
            this.f72531t.c(cVar);
        }

        public void d() {
            this.f72523l = this.f72522k;
            this.f72522k = 0;
            this.f72521j = 0;
            this.f72520i = 0;
            this.f72519h = 0;
            this.f72518g = 0;
            this.f72517f = 0;
            this.f72524m = 0L;
            this.f72526o = 0L;
            this.f72525n = 0L;
            this.f72528q = 0L;
            this.f72527p = false;
            synchronized (this) {
                this.f72531t.clear();
            }
        }

        public void e(b bVar) {
            if (bVar == null) {
                return;
            }
            this.f72523l = bVar.f72523l;
            this.f72517f = bVar.f72517f;
            this.f72518g = bVar.f72518g;
            this.f72519h = bVar.f72519h;
            this.f72520i = bVar.f72520i;
            this.f72521j = bVar.f72521j;
            this.f72522k = bVar.f72522k;
            this.f72524m = bVar.f72524m;
            this.f72525n = bVar.f72525n;
            this.f72526o = bVar.f72526o;
            this.f72527p = bVar.f72527p;
            this.f72528q = bVar.f72528q;
            this.f72529r = bVar.f72529r;
            this.f72530s = bVar.f72530s;
        }
    }

    void a(boolean z10);

    void b(l lVar, k kVar, long j10, b bVar);

    void c(InterfaceC0855a interfaceC0855a);

    void clear();

    void d(boolean z10);

    void e();

    void f(j jVar);

    void release();
}
