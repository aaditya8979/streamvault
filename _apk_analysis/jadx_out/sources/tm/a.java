package tm;

import dm.c;
import dm.g;
import dm.o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import ms.b;
import xl.e;
import xl.h;
import xl.k;
import xl.r;
import xl.s;
import xl.t;
import xl.u;

/* JADX INFO: compiled from: RxJavaPlugins.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile g<? super Throwable> f85318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o<? super Runnable, ? extends Runnable> f85319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f85320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f85321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f85322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f85323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile o<? super s, ? extends s> f85324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile o<? super s, ? extends s> f85325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile o<? super e, ? extends e> f85326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile o<? super k, ? extends k> f85327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile o<? super rm.a, ? extends rm.a> f85328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile o<? super xl.g, ? extends xl.g> f85329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile o<? super t, ? extends t> f85330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile o<? super xl.a, ? extends xl.a> f85331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile c<? super e, ? super b, ? extends b> f85332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile c<? super xl.g, ? super h, ? extends h> f85333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c<? super k, ? super r, ? extends r> f85334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c<? super t, ? super u, ? extends u> f85335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c<? super xl.a, ? super xl.b, ? extends xl.b> f85336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile dm.e f85337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile boolean f85338u;

    public static void A(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static <T, U, R> R a(c<T, U, R> cVar, T t10, U u10) {
        try {
            return cVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static <T, R> R b(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static s c(o<? super Callable<s>, ? extends s> oVar, Callable<s> callable) {
        return (s) fm.a.e(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    public static s d(Callable<s> callable) {
        try {
            return (s) fm.a.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static s e(Callable<s> callable) {
        fm.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f85320c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s f(Callable<s> callable) {
        fm.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f85322e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s g(Callable<s> callable) {
        fm.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f85323f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s h(Callable<s> callable) {
        fm.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f85321d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f85338u;
    }

    public static <T> rm.a<T> k(rm.a<T> aVar) {
        o<? super rm.a, ? extends rm.a> oVar = f85328k;
        return oVar != null ? (rm.a) b(oVar, aVar) : aVar;
    }

    public static xl.a l(xl.a aVar) {
        o<? super xl.a, ? extends xl.a> oVar = f85331n;
        return oVar != null ? (xl.a) b(oVar, aVar) : aVar;
    }

    public static <T> e<T> m(e<T> eVar) {
        o<? super e, ? extends e> oVar = f85326i;
        return oVar != null ? (e) b(oVar, eVar) : eVar;
    }

    public static <T> xl.g<T> n(xl.g<T> gVar) {
        o<? super xl.g, ? extends xl.g> oVar = f85329l;
        return oVar != null ? (xl.g) b(oVar, gVar) : gVar;
    }

    public static <T> k<T> o(k<T> kVar) {
        o<? super k, ? extends k> oVar = f85327j;
        return oVar != null ? (k) b(oVar, kVar) : kVar;
    }

    public static <T> t<T> p(t<T> tVar) {
        o<? super t, ? extends t> oVar = f85330m;
        return oVar != null ? (t) b(oVar, tVar) : tVar;
    }

    public static boolean q() {
        dm.e eVar = f85337t;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static s r(s sVar) {
        o<? super s, ? extends s> oVar = f85324g;
        return oVar == null ? sVar : (s) b(oVar, sVar);
    }

    public static void s(Throwable th2) {
        g<? super Throwable> gVar = f85318a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                A(th3);
            }
        }
        th2.printStackTrace();
        A(th2);
    }

    public static s t(s sVar) {
        o<? super s, ? extends s> oVar = f85325h;
        return oVar == null ? sVar : (s) b(oVar, sVar);
    }

    public static Runnable u(Runnable runnable) {
        fm.a.e(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f85319b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    public static <T> b<? super T> v(e<T> eVar, b<? super T> bVar) {
        c<? super e, ? super b, ? extends b> cVar = f85332o;
        return cVar != null ? (b) a(cVar, eVar, bVar) : bVar;
    }

    public static xl.b w(xl.a aVar, xl.b bVar) {
        c<? super xl.a, ? super xl.b, ? extends xl.b> cVar = f85336s;
        return cVar != null ? (xl.b) a(cVar, aVar, bVar) : bVar;
    }

    public static <T> h<? super T> x(xl.g<T> gVar, h<? super T> hVar) {
        c<? super xl.g, ? super h, ? extends h> cVar = f85333p;
        return cVar != null ? (h) a(cVar, gVar, hVar) : hVar;
    }

    public static <T> r<? super T> y(k<T> kVar, r<? super T> rVar) {
        c<? super k, ? super r, ? extends r> cVar = f85334q;
        return cVar != null ? (r) a(cVar, kVar, rVar) : rVar;
    }

    public static <T> u<? super T> z(t<T> tVar, u<? super T> uVar) {
        c<? super t, ? super u, ? extends u> cVar = f85335r;
        return cVar != null ? (u) a(cVar, tVar, uVar) : uVar;
    }
}
