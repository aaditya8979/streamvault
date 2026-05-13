package ba;

import ga.c;
import ga.i;
import ia.c;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: CustomComponentHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ga.c f5512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.a f5513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.b f5514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.e f5515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aa.a f5516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d f5517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f5518g;

    /* JADX INFO: renamed from: ba.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomComponentHolder.java */
    public static final class C0122a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5519a = new a();
    }

    public static a j() {
        return C0122a.f5519a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:9:0x0034, B:11:0x003b, B:13:0x0042, B:15:0x0049, B:18:0x0056, B:21:0x0065, B:23:0x0070, B:17:0x0053), top: B:81:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(aa.a.InterfaceC0001a r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.n(aa.a$a):void");
    }

    public z9.b a(String str) throws IOException {
        return e().create(str);
    }

    public ha.a b(File file) throws IOException {
        return l().b(file);
    }

    public int c(int i10, String str, String str2, long j10) {
        return d().a(i10, str, str2, j10);
    }

    public final c.a d() {
        c.a aVar = this.f5513b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f5513b == null) {
                this.f5513b = g().a();
            }
        }
        return this.f5513b;
    }

    public final c.b e() {
        c.b bVar = this.f5514c;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.f5514c == null) {
                this.f5514c = g().b();
            }
        }
        return this.f5514c;
    }

    public aa.a f() {
        aa.a aVar = this.f5516e;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f5516e == null) {
                aa.a aVarC = g().c();
                this.f5516e = aVarC;
                n(aVarC.g());
            }
        }
        return this.f5516e;
    }

    public final ga.c g() {
        ga.c cVar = this.f5512a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            if (this.f5512a == null) {
                this.f5512a = new ga.c();
            }
        }
        return this.f5512a;
    }

    public i h() {
        i iVar = this.f5518g;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f5518g == null) {
                this.f5518g = g().j();
            }
        }
        return this.f5518g;
    }

    public c.d i() {
        c.d dVar = this.f5517f;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.f5517f == null) {
                this.f5517f = g().k();
            }
        }
        return this.f5517f;
    }

    public int k() {
        return g().n();
    }

    public final c.e l() {
        c.e eVar = this.f5515d;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.f5515d == null) {
                this.f5515d = g().l();
            }
        }
        return this.f5515d;
    }

    public boolean m() {
        return l().a();
    }

    public void o(c.a aVar) {
        synchronized (this) {
            this.f5512a = new ga.c(aVar);
            this.f5514c = null;
            this.f5515d = null;
            this.f5516e = null;
            this.f5517f = null;
        }
    }
}
