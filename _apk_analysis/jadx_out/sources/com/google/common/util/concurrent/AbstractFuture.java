package com.google.common.util.concurrent;

import c8.m;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import y7.l;
import y7.o;

/* JADX INFO: loaded from: classes6.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class AbstractFuture<V> extends d8.a implements c8.i<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f23448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c8.h f23449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f23450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f23451h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f23452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f23453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile k f23454d;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f23455b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f23456a;

        public Failure(Throwable th2) {
            this.f23456a = (Throwable) l.m(th2);
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2);

        public abstract d d(AbstractFuture<?> abstractFuture, d dVar);

        public abstract k e(AbstractFuture<?> abstractFuture, k kVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f23457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f23458d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f23460b;

        static {
            if (AbstractFuture.f23448e) {
                f23458d = null;
                f23457c = null;
            } else {
                f23458d = new c(false, null);
                f23457c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f23459a = z10;
            this.f23460b = th2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f23461d = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f23462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f23463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f23464c;

        public d() {
            this.f23462a = null;
            this.f23463b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.f23462a = runnable;
            this.f23463b = executor;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f23465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f23466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, k> f23467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, d> f23468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f23469e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f23465a = atomicReferenceFieldUpdater;
            this.f23466b = atomicReferenceFieldUpdater2;
            this.f23467c = atomicReferenceFieldUpdater3;
            this.f23468d = atomicReferenceFieldUpdater4;
            this.f23469e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return androidx.concurrent.futures.a.a(this.f23468d, abstractFuture, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f23469e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            return androidx.concurrent.futures.a.a(this.f23467c, abstractFuture, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            return this.f23468d.getAndSet(abstractFuture, dVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            return this.f23467c.getAndSet(abstractFuture, kVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            this.f23466b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            this.f23465a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractFuture<V> f23470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c8.i<? extends V> f23471c;

        public f(AbstractFuture<V> abstractFuture, c8.i<? extends V> iVar) {
            this.f23470b = abstractFuture;
            this.f23471c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23470b.f23452b != this) {
                return;
            }
            if (AbstractFuture.f23450g.b(this.f23470b, this, AbstractFuture.x(this.f23471c))) {
                AbstractFuture.u(this.f23470b, false);
            }
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f23453c != dVar) {
                    return false;
                }
                abstractFuture.f23453c = dVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f23452b != obj) {
                    return false;
                }
                abstractFuture.f23452b = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f23454d != kVar) {
                    return false;
                }
                abstractFuture.f23454d = kVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            synchronized (abstractFuture) {
                dVar2 = abstractFuture.f23453c;
                if (dVar2 != dVar) {
                    abstractFuture.f23453c = dVar;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            synchronized (abstractFuture) {
                kVar2 = abstractFuture.f23454d;
                if (kVar2 != kVar) {
                    abstractFuture.f23454d = kVar;
                }
            }
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            kVar.f23480b = kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            kVar.f23479a = thread;
        }
    }

    public interface h<V> extends c8.i<V> {
    }

    public static abstract class i<V> extends AbstractFuture<V> implements h<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, c8.i
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static final class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f23472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f23473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f23474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f23475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f23476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f23477f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f23474c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                f23473b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                f23475d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f23476e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f23477f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f23472a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        public j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return com.google.android.gms.internal.ads.i.a(f23472a, abstractFuture, f23473b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.i.a(f23472a, abstractFuture, f23475d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            return com.google.android.gms.internal.ads.i.a(f23472a, abstractFuture, f23474c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            do {
                dVar2 = abstractFuture.f23453c;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!a(abstractFuture, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            do {
                kVar2 = abstractFuture.f23454d;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!c(abstractFuture, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            f23472a.putObject(kVar, f23477f, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            f23472a.putObject(kVar, f23476e, thread);
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f23478c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f23479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile k f23480b;

        public k() {
            AbstractFuture.f23450g.g(this, Thread.currentThread());
        }

        public k(boolean z10) {
        }

        public void a(k kVar) {
            AbstractFuture.f23450g.f(this, kVar);
        }

        public void b() {
            Thread thread = this.f23479a;
            if (thread != null) {
                this.f23479a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        boolean z10;
        b gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.ironsource.mediationsdk.metadata.a.f32683h));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f23448e = z10;
        f23449f = new c8.h(AbstractFuture.class);
        ?? r12 = 0;
        r12 = 0;
        try {
            gVar = new j();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, k.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Error | Exception e11) {
                gVar = new g();
                r12 = e11;
            }
        }
        f23450g = gVar;
        if (r12 != 0) {
            c8.h hVar = f23449f;
            Logger loggerA = hVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            hVar.a().log(level, "SafeAtomicHelper is broken!", r12);
        }
        f23451h = new Object();
    }

    public static CancellationException r(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void u(AbstractFuture<?> abstractFuture, boolean z10) {
        d dVar = null;
        while (true) {
            abstractFuture.B();
            if (z10) {
                abstractFuture.z();
                z10 = false;
            }
            abstractFuture.n();
            d dVarS = abstractFuture.s(dVar);
            while (dVarS != null) {
                dVar = dVarS.f23464c;
                Runnable runnable = dVarS.f23462a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof f) {
                    f fVar = (f) runnable2;
                    abstractFuture = fVar.f23470b;
                    if (abstractFuture.f23452b == fVar) {
                        if (f23450g.b(abstractFuture, fVar, x(fVar.f23471c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVarS.f23463b;
                    Objects.requireNonNull(executor);
                    v(runnable2, executor);
                }
                dVarS = dVar;
            }
            return;
        }
    }

    public static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f23449f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object x(c8.i<?> iVar) {
        Throwable thA;
        if (iVar instanceof h) {
            Object cVar = ((AbstractFuture) iVar).f23452b;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f23459a) {
                    cVar = cVar2.f23460b != null ? new c(false, cVar2.f23460b) : c.f23458d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((iVar instanceof d8.a) && (thA = d8.b.a((d8.a) iVar)) != null) {
            return new Failure(thA);
        }
        boolean zIsCancelled = iVar.isCancelled();
        if ((!f23448e) && zIsCancelled) {
            c cVar3 = c.f23458d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objY = y(iVar);
            if (!zIsCancelled) {
                return objY == null ? f23451h : objY;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + iVar));
        } catch (Error e10) {
            e = e10;
            return new Failure(e);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + iVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new Failure(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + iVar, e12));
        } catch (Exception e13) {
            e = e13;
            return new Failure(e);
        }
    }

    public static <V> V y(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void B() {
        for (k kVarE = f23450g.e(this, k.f23478c); kVarE != null; kVarE = kVarE.f23480b) {
            kVarE.b();
        }
    }

    public final void C(k kVar) {
        kVar.f23479a = null;
        while (true) {
            k kVar2 = this.f23454d;
            if (kVar2 == k.f23478c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f23480b;
                if (kVar2.f23479a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f23480b = kVar4;
                    if (kVar3.f23479a == null) {
                        break;
                    }
                } else if (!f23450g.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean D(V v10) {
        if (v10 == null) {
            v10 = (V) f23451h;
        }
        if (!f23450g.b(this, null, v10)) {
            return false;
        }
        u(this, false);
        return true;
    }

    public boolean E(Throwable th2) {
        if (!f23450g.b(this, null, new Failure((Throwable) l.m(th2)))) {
            return false;
        }
        u(this, false);
        return true;
    }

    public boolean G(c8.i<? extends V> iVar) {
        Failure failure;
        l.m(iVar);
        Object obj = this.f23452b;
        if (obj == null) {
            if (iVar.isDone()) {
                if (!f23450g.b(this, null, x(iVar))) {
                    return false;
                }
                u(this, false);
                return true;
            }
            f fVar = new f(this, iVar);
            if (f23450g.b(this, null, fVar)) {
                try {
                    iVar.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f23455b;
                    }
                    f23450g.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f23452b;
        }
        if (obj instanceof c) {
            iVar.cancel(((c) obj).f23459a);
        }
        return false;
    }

    public final boolean H() {
        Object obj = this.f23452b;
        return (obj instanceof c) && ((c) obj).f23459a;
    }

    @Override // d8.a
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f23452b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f23456a;
        }
        return null;
    }

    @Override // c8.i
    public void addListener(Runnable runnable, Executor executor) {
        d dVar;
        l.n(runnable, "Runnable was null.");
        l.n(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f23453c) != d.f23461d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f23464c = dVar;
                if (f23450g.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f23453c;
                }
            } while (dVar != d.f23461d);
        }
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f23452b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f23448e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f23457c : c.f23458d;
            Objects.requireNonNull(cVar);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f23450g.b(abstractFuture, obj, cVar)) {
                u(abstractFuture, z10);
                if (!(obj instanceof f)) {
                    return true;
                }
                c8.i<? extends V> iVar = ((f) obj).f23471c;
                if (!(iVar instanceof h)) {
                    iVar.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) iVar;
                obj = abstractFuture.f23452b;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f23452b;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f23452b;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return w(obj2);
        }
        k kVar = this.f23454d;
        if (kVar != k.f23478c) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (f23450g.c(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            C(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f23452b;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return w(obj);
                }
                kVar = this.f23454d;
            } while (kVar != k.f23478c);
        }
        Object obj3 = this.f23452b;
        Objects.requireNonNull(obj3);
        return w(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23452b;
        if ((obj != null) && (!(obj instanceof f))) {
            return w(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f23454d;
            if (kVar != k.f23478c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f23450g.c(this, kVar, kVar2)) {
                        do {
                            m.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23452b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return w(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(kVar2);
                    } else {
                        kVar = this.f23454d;
                    }
                } while (kVar != k.f23478c);
            }
            Object obj3 = this.f23452b;
            Objects.requireNonNull(obj3);
            return w(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f23452b;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return w(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + Z7.f30794r + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + Z7.f30794r + lowerCase;
                if (z10) {
                    str3 = str3 + StringUtils.COMMA;
                }
                str2 = str3 + Z7.f30794r;
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f23452b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f23452b != null);
    }

    public final void l(StringBuilder sb2) {
        try {
            Object objY = y(this);
            sb2.append("SUCCESS, result=[");
            p(sb2, objY);
            sb2.append(C3978d4.j.f31385e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C3978d4.j.f31385e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    public final void m(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f23452b;
        if (obj instanceof f) {
            sb2.append(", setFuture=[");
            q(sb2, ((f) obj).f23471c);
            sb2.append(C3978d4.j.f31385e);
        } else {
            try {
                strA = o.a(A());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append(C3978d4.j.f31385e);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            l(sb2);
        }
    }

    public void n() {
    }

    public final void p(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void q(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    public final d s(d dVar) {
        d dVar2 = dVar;
        d dVarD = f23450g.d(this, d.f23461d);
        while (dVarD != null) {
            d dVar3 = dVarD.f23464c;
            dVarD.f23464c = dVar2;
            dVar2 = dVarD;
            dVarD = dVar3;
        }
        return dVar2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            l(sb2);
        } else {
            m(sb2);
        }
        sb2.append(C3978d4.j.f31385e);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V w(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw r("Task was cancelled.", ((c) obj).f23460b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f23456a);
        }
        return obj == f23451h ? (V) c8.l.b() : obj;
    }

    public void z() {
    }
}
