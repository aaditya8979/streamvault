package y9;

import android.app.Application;
import ga.c;

/* JADX INFO: compiled from: FileDownloader.java */
/* JADX INFO: loaded from: classes9.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f87464c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f87465d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f87466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f87467b;

    /* JADX INFO: compiled from: FileDownloader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f87468a = new r();
    }

    public static r c() {
        return a.f87468a;
    }

    public static c.a g(Application application) {
        ia.c.b(application.getApplicationContext());
        c.a aVar = new c.a();
        ba.a.j().o(aVar);
        return aVar;
    }

    public void a(e eVar) {
        f.e().a("event.service.connect.changed", eVar);
    }

    public y9.a b(String str) {
        return new c(str);
    }

    public void bindService() {
        if (f()) {
            return;
        }
        n.b().o(ia.c.a());
    }

    public void bindService(Runnable runnable) {
        if (f()) {
            runnable.run();
        } else {
            n.b().n(ia.c.a(), runnable);
        }
    }

    public w d() {
        if (this.f87467b == null) {
            synchronized (f87465d) {
                if (this.f87467b == null) {
                    a0 a0Var = new a0();
                    this.f87467b = a0Var;
                    a(a0Var);
                }
            }
        }
        return this.f87467b;
    }

    public x e() {
        if (this.f87466a == null) {
            synchronized (f87464c) {
                if (this.f87466a == null) {
                    this.f87466a = new d0();
                }
            }
        }
        return this.f87466a;
    }

    public boolean f() {
        return n.b().isConnected();
    }

    public void h(boolean z10) {
        n.b().r(z10);
    }
}
