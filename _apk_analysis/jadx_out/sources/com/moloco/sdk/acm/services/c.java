package com.moloco.sdk.acm.services;

import androidx.lifecycle.Lifecycle;
import bn.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.w0;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements com.moloco.sdk.acm.services.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f45884d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f45885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ApplicationLifecycleObserver f45886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public AtomicBoolean f45887c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.services.ApplicationLifecycleTrackerImpl$startObserving$2", f = "ApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45888a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f45888a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (c.this.f45887c.compareAndSet(false, true)) {
                e.f(e.f45892a, "ApplicationLifecycleTrackerServiceImpl", "Start observing application lifecycle events", false, 4, null);
                c.this.f45885a.addObserver(c.this.f45886b);
            }
            return r.f5635a;
        }
    }

    public c(@NotNull Lifecycle lifecycle, @NotNull ApplicationLifecycleObserver applicationLifecycleObserver) {
        tn.p.k(lifecycle, "lifecycle");
        tn.p.k(applicationLifecycleObserver, "bgListener");
        this.f45885a = lifecycle;
        this.f45886b = applicationLifecycleObserver;
        this.f45887c = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.acm.services.b
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(w0.c().M(), new b(null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }
}
