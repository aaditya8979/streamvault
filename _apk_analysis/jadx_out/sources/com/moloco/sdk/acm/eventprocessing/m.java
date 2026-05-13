package com.moloco.sdk.acm.eventprocessing;

import bn.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.eventprocessing.b f45823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.h f45824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScheduledExecutorService f45825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f45826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ScheduledFuture<?> f45827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final mo.a f45828f;

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", l = {68}, m = "resetScheduleAndTriggerNewScheduledUpload")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f45830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f45831c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45833e;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45831c = obj;
            this.f45833e |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer$schedule$1$1", f = "RequestSchedulerTimer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45834a;

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
            return m.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f45834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            m.this.f45823a.a();
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", l = {68}, m = "scheduleUploadAndPurge")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f45837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f45838c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45840e;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45838c = obj;
            this.f45840e |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    public m(@NotNull com.moloco.sdk.acm.eventprocessing.b bVar, @NotNull com.moloco.sdk.acm.h hVar, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull l0 l0Var) {
        tn.p.k(bVar, "dbWorkRequest");
        tn.p.k(hVar, "opsConfig");
        tn.p.k(scheduledExecutorService, "scheduler");
        tn.p.k(l0Var, "coroutineScope");
        this.f45823a = bVar;
        this.f45824b = hVar;
        this.f45825c = scheduledExecutorService;
        this.f45826d = l0Var;
        this.f45828f = mo.g.b(false, 1, null);
    }

    public /* synthetic */ m(com.moloco.sdk.acm.eventprocessing.b bVar, com.moloco.sdk.acm.h hVar, ScheduledExecutorService scheduledExecutorService, l0 l0Var, int i10, tn.i iVar) {
        this(bVar, hVar, (i10 & 4) != 0 ? Executors.newSingleThreadScheduledExecutor() : scheduledExecutorService, l0Var);
    }

    public static final void d(m mVar) {
        p000do.i.d(mVar.f45826d, null, null, mVar.new b(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.m.a
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.m$a r0 = (com.moloco.sdk.acm.eventprocessing.m.a) r0
            int r1 = r0.f45833e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45833e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.m$a r0 = new com.moloco.sdk.acm.eventprocessing.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45831c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f45833e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f45830b
            mo.a r1 = (mo.a) r1
            java.lang.Object r0 = r0.f45829a
            com.moloco.sdk.acm.eventprocessing.m r0 = (com.moloco.sdk.acm.eventprocessing.m) r0
            kotlin.c.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.c.b(r6)
            mo.a r6 = r5.f45828f
            r0.f45829a = r5
            r0.f45830b = r6
            r0.f45833e = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            java.util.concurrent.ScheduledFuture<?> r6 = r0.f45827e     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L5a
            r2 = 0
            boolean r6 = r6.cancel(r2)     // Catch: java.lang.Throwable -> L63
            jn.a.a(r6)     // Catch: java.lang.Throwable -> L63
        L5a:
            r0.c()     // Catch: java.lang.Throwable -> L63
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L63
            r1.d(r4)
            return r6
        L63:
            r6 = move-exception
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.m.a(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.m.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.m$c r0 = (com.moloco.sdk.acm.eventprocessing.m.c) r0
            int r1 = r0.f45840e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45840e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.m$c r0 = new com.moloco.sdk.acm.eventprocessing.m$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45838c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f45840e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f45837b
            mo.a r1 = (mo.a) r1
            java.lang.Object r0 = r0.f45836a
            com.moloco.sdk.acm.eventprocessing.m r0 = (com.moloco.sdk.acm.eventprocessing.m) r0
            kotlin.c.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.c.b(r6)
            mo.a r6 = r5.f45828f
            r0.f45836a = r5
            r0.f45837b = r6
            r0.f45840e = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            r0.c()     // Catch: java.lang.Throwable -> L57
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L57
            r1.d(r4)
            return r6
        L57:
            r6 = move-exception
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.m.b(hn.c):java.lang.Object");
    }

    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.f45827e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f45827e = this.f45825c.scheduleWithFixedDelay(new Runnable() { // from class: com.moloco.sdk.acm.eventprocessing.h
                @Override // java.lang.Runnable
                public final void run() {
                    m.d(this.f45796b);
                }
            }, this.f45824b.e(), this.f45824b.e(), TimeUnit.SECONDS);
        }
    }
}
