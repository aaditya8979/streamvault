package com.moloco.sdk.internal.ortb;

import bn.r;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.ortb.model.g;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.moloco.sdk.internal.ortb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xo.a f46255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.scheduling.a f46256b;

    @jn.d(c = "com.moloco.sdk.internal.ortb.BidResponseParserImpl$invoke$2", f = "BidResponseParser.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super g0<g, Exception>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46257a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f46259c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<g, Exception>> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new a(this.f46259c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            try {
                xo.a aVar = b.this.f46255a;
                String str = this.f46259c;
                aVar.a();
                return new g0.b(e.a((g) aVar.c(g.Companion.serializer(), str)));
            } catch (Exception e10) {
                return new g0.a(e10);
            }
        }
    }

    public b(@NotNull xo.a aVar) {
        tn.p.k(aVar, "json");
        this.f46255a = aVar;
        this.f46256b = com.moloco.sdk.internal.scheduling.c.a();
    }

    @Override // com.moloco.sdk.internal.ortb.a
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super g0<g, Exception>> cVar) {
        return p000do.g.g(this.f46256b.getIo(), new a(str, null), cVar);
    }
}
