package vm;

import java.util.concurrent.Callable;
import xl.s;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f86113a = tm.a.h(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f86114b = tm.a.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f86115c = tm.a.f(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f86116d = pm.g.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f86117e = tm.a.g(new f());

    /* JADX INFO: renamed from: vm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Schedulers.java */
    public static final class C1082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f86118a = new pm.a();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class b implements Callable<s> {
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return C1082a.f86118a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class c implements Callable<s> {
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return d.f86119a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f86119a = new pm.c();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f86120a = new pm.d();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class f implements Callable<s> {
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return e.f86120a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f86121a = new io.reactivex.internal.schedulers.b();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class h implements Callable<s> {
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return g.f86121a;
        }
    }

    public static s a() {
        return tm.a.r(f86114b);
    }

    public static s b() {
        return tm.a.t(f86115c);
    }

    public static s c() {
        return f86116d;
    }
}
