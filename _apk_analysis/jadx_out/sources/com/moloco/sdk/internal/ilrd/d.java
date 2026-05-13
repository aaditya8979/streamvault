package com.moloco.sdk.internal.ilrd;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.j;
import java.text.SimpleDateFormat;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.s0;
import sn.l;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f46174f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46175g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f46176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f46177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f46179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SimpleDateFormat f46180e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2", f = "IlrdScheduler.kt", l = {54}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46181a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f46183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<hn.c<? super r>, Object> f46184d;

        @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2$1", f = "IlrdScheduler.kt", l = {59}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46186b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<hn.c<? super r>, Object> f46187c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d dVar, l<? super hn.c<? super r>, ? extends Object> lVar, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f46186b = dVar;
                this.f46187c = lVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f46186b, this.f46187c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f46185a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + this.f46186b.f46178c + " invoked", null, false, 12, null);
                    l<hn.c<? super r>, Object> lVar = this.f46187c;
                    this.f46185a = 1;
                    if (lVar.invoke(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, l<? super hn.c<? super r>, ? extends Object> lVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f46183c = j10;
            this.f46184d = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return d.this.new b(this.f46183c, this.f46184d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46181a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                String str = d.this.f46180e.format(jn.a.e(d.this.f46177b.a() + co.b.q(this.f46183c)));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + d.this.f46178c + " scheduled at " + str, null, false, 12, null);
                long j10 = this.f46183c;
                this.f46181a = 1;
                if (s0.b(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            p000do.i.d(d.this.f46176a, null, null, new a(d.this, this.f46184d, null), 3, null);
            return r.f5635a;
        }
    }

    public d(@NotNull l0 l0Var, @NotNull j jVar, @NotNull String str) {
        tn.p.k(l0Var, "scope");
        tn.p.k(jVar, "timeProvider");
        tn.p.k(str, "name");
        this.f46176a = l0Var;
        this.f46177b = jVar;
        this.f46178c = str;
        this.f46180e = new SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void b(long j10, @NotNull l<? super hn.c<? super r>, ? extends Object> lVar) {
        tn.p.k(lVar, "task");
        kotlinx.coroutines.g gVar = this.f46179d;
        if (gVar != null) {
            c(gVar);
        }
        this.f46179d = p000do.i.d(this.f46176a, null, null, new b(j10, lVar, null), 3, null);
    }

    @VisibleForTesting
    public final void c(@NotNull kotlinx.coroutines.g gVar) {
        tn.p.k(gVar, "job");
        if (gVar.isActive()) {
            g.a.a(gVar, null, 1, null);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + this.f46178c + " cancelled", null, false, 12, null);
        }
    }
}
