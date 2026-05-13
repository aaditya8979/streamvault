package com.moloco.sdk.internal.services;

import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.internal.MolocoLogger;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class g implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f47411e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47412f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f47413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SingleObserverBackgroundThenForegroundAnalyticsListener f47414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f47415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47416d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @d(c = "com.moloco.sdk.internal.services.AnalyticsApplicationLifecycleTrackerImpl$startObserving$1", f = "AnalyticsApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47417a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return g.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47417a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            g.this.d();
            return bn.r.f5635a;
        }
    }

    @d(c = "com.moloco.sdk.internal.services.AnalyticsApplicationLifecycleTrackerImpl$trackNextBackgroundForeground$1", f = "AnalyticsApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47419a;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return g.this.new c(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47419a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Tracking next bg / fg of the application", false, 4, null);
            g.this.d();
            g.this.f47414b.a();
            return bn.r.f5635a;
        }
    }

    public g(@NotNull Lifecycle lifecycle, @NotNull SingleObserverBackgroundThenForegroundAnalyticsListener singleObserverBackgroundThenForegroundAnalyticsListener) {
        tn.p.k(lifecycle, "lifecycle");
        tn.p.k(singleObserverBackgroundThenForegroundAnalyticsListener, "fgBgListener");
        this.f47413a = lifecycle;
        this.f47414b = singleObserverBackgroundThenForegroundAnalyticsListener;
        this.f47415c = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().a());
    }

    @Override // com.moloco.sdk.internal.services.r
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Start observing application lifecycle events", false, 4, null);
        p000do.i.d(this.f47415c, null, null, new b(null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.r
    public void b() {
        p000do.i.d(this.f47415c, null, null, new c(null), 3, null);
    }

    @MainThread
    public final void d() {
        if (this.f47416d) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
        this.f47413a.addObserver(this.f47414b);
        this.f47416d = true;
    }
}
