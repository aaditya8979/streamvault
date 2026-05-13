package com.moloco.sdk.internal.scheduling;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l0 f47083a = kotlinx.coroutines.d.a(c.a().a());

    @jn.d(c = "com.moloco.sdk.internal.scheduling.RunOnMainDispatcherKt$runOnMainDispatcher$1", f = "RunOnMainDispatcher.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<r> f47085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sn.a<r> aVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47085b = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f47085b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f47085b.invoke();
            return r.f5635a;
        }
    }

    @NotNull
    public static final g a(@NotNull sn.a<r> aVar) {
        tn.p.k(aVar, "block");
        return i.d(f47083a, null, null, new a(aVar, null), 3, null);
    }
}
