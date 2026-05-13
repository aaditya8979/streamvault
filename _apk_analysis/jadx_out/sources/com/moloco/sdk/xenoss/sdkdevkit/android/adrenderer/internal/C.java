package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.k;
import fo.m;
import go.e;
import go.f;
import jn.d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.a;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.l<go.u<k>> f47735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final go.u<k> f47736c;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", l = {122}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<m<? super k>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47738b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C$a$a, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1$1", f = "CountdownFlow.kt", l = {123}, m = "invokeSuspend")
        public static final class C0587a extends SuspendLambda implements sn.p<go.u<? extends k>, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f47741b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m<k> f47742c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C$a$a$a, reason: collision with other inner class name */
            public static final class C0588a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m<k> f47743b;

                /* JADX WARN: Multi-variable type inference failed */
                public C0588a(m<? super k> mVar) {
                    this.f47743b = mVar;
                }

                public final Object a(int i10, hn.c<? super bn.r> cVar) {
                    Object objI = this.f47743b.I(k.a(i10), cVar);
                    return objI == in.a.g() ? objI : bn.r.f5635a;
                }

                @Override // go.e
                public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                    return a(((k) obj).f(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0587a(m<? super k> mVar, hn.c<? super C0587a> cVar) {
                super(2, cVar);
                this.f47742c = mVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(go.u<k> uVar, hn.c<? super bn.r> cVar) {
                return ((C0587a) create(uVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                C0587a c0587a = new C0587a(this.f47742c, cVar);
                c0587a.f47741b = obj;
                return c0587a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47740a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.u uVar = (go.u) this.f47741b;
                    C0588a c0588a = new C0588a(this.f47742c);
                    this.f47740a = 1;
                    if (uVar.collect(c0588a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super k> mVar, hn.c<? super bn.r> cVar) {
            return ((a) create(mVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = C.this.new a(cVar);
            aVar.f47738b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47737a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                m mVar = (m) this.f47738b;
                go.l lVar = C.this.f47735b;
                C0587a c0587a = new C0587a(mVar, null);
                this.f47737a = 1;
                if (f.l(lVar, c0587a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    public C(int i10, p000do.l0 l0Var) {
        tn.p.k(l0Var, "scope");
        this.f47734a = l0Var;
        go.l<go.u<k>> lVarA = go.v.a(g.c(i10, l0Var, null, 4, null));
        this.f47735b = lVarA;
        this.f47736c = f.M(f.j(new a(null)), l0Var, a.C0862a.b(kotlinx.coroutines.flow.a.f73397a, 0L, 0L, 3, null), lVarA.getValue().getValue());
    }

    public /* synthetic */ C(int i10, p000do.l0 l0Var, i iVar) {
        this(i10, l0Var);
    }

    @NotNull
    public final go.u<k> b() {
        return this.f47736c;
    }

    public final void c(int i10) {
        this.f47735b.setValue(g.c(i10, this.f47734a, null, 4, null));
    }
}
