package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import go.u;
import go.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting(otherwise = 2)
public final class h implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final t f50626b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C f50629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f50630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f50631g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f50627c = "LinearGoNextActionImpl";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f50628d = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.l<d.a> f50632h = v.a(d.a.c.f50486a);

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1", f = "LinearGoNextAction.kt", l = {126}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50633a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1$1", f = "LinearGoNextAction.kt", l = {}, m = "invokeSuspend")
        public static final class C0685a extends SuspendLambda implements p<bn.k, hn.c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f50636b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f50637c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0685a(h hVar, hn.c<? super C0685a> cVar) {
                super(2, cVar);
                this.f50637c = hVar;
            }

            public final Object a(int i10, hn.c<? super r> cVar) {
                return ((C0685a) create(bn.k.a(i10), cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                C0685a c0685a = new C0685a(this.f50637c, cVar);
                c0685a.f50636b = ((bn.k) obj).f();
                return c0685a;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(bn.k kVar, hn.c<? super r> cVar) {
                return a(kVar.f(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50635a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                int i10 = this.f50636b;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, this.f50637c.f50627c, "Updating countdown to " + ((Object) bn.k.e(i10)), null, false, 12, null);
                this.f50637c.f50631g = i10;
                MolocoLogger.info$default(molocoLogger, this.f50637c.f50627c, "Propagating state: " + k.h(i10), null, false, 12, null);
                this.f50637c.l().setValue(k.h(i10));
                return r.f5635a;
            }
        }

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return h.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u<bn.k> uVarB;
            Object objG = in.a.g();
            int i10 = this.f50633a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (h.this.f50629e == null) {
                    h.this.f50629e = new C(h.this.f50631g, h.this.f50628d, null);
                } else {
                    C c10 = h.this.f50629e;
                    if (c10 != null) {
                        c10.c(h.this.f50631g);
                    }
                }
                C c11 = h.this.f50629e;
                if (c11 != null && (uVarB = c11.b()) != null) {
                    C0685a c0685a = new C0685a(h.this, null);
                    this.f50633a = 1;
                    if (go.f.l(uVarB, c0685a, this) == objG) {
                        return objG;
                    }
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

    public h(@Nullable t tVar) {
        this.f50626b = tVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j
    public void I() {
        l().setValue(d.a.c.f50486a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j
    public void a(int i10, int i11) {
        double d10 = (((double) i10) / ((double) i11)) * ((double) 100);
        if (i10 >= i11) {
            l().setValue(d.a.C0683a.f50484a);
            return;
        }
        if (this.f50626b == null) {
            l().setValue(d.a.c.f50486a);
            return;
        }
        if (this.f50630f == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, this.f50627c, "Starting timer", null, false, 12, null);
            t tVar = this.f50626b;
            if (tVar instanceof t.a) {
                MolocoLogger.info$default(molocoLogger, this.f50627c, "Offset Percents detected", null, false, 12, null);
                b(((long) k.f(new zn.i((int) d10, ((t.a) this.f50626b).a()), i11)) & 4294967295L);
            } else {
                if (!(tVar instanceof t.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(molocoLogger, this.f50627c, "Offset Millis detected", null, false, 12, null);
                b(k.g(((t.b) this.f50626b).a()));
            }
        }
    }

    public final void b(long j10) {
        if (k.i(this.f50630f)) {
            this.f50631g = bn.k.b((int) j10);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50627c, "Start timer for duration: " + j10 + " seconds", null, false, 12, null);
            this.f50630f = p000do.i.d(this.f50628d, null, null, new a(null), 3, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public go.l<d.a> l() {
        return this.f50632h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j
    public void pause() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50627c, "Canceling timer", null, false, 12, null);
        kotlinx.coroutines.g gVar = this.f50630f;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j
    public void s() {
        if (Integer.compare(this.f50631g ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0) {
            b(((long) this.f50631g) & 4294967295L);
        }
    }
}
