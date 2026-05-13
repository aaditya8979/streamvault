package com.unity3d.ads.adplayer;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.p0;
import p000do.t;
import p000do.v;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Invocation.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Invocation {

    @NotNull
    private final t<r> _isHandled;

    @NotNull
    private final t<Object> completableDeferred;

    @NotNull
    private final String location;

    @NotNull
    private final Object[] parameters;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @d(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<hn.c<? super r>, Object> {
        public int label;

        public AnonymousClass2(hn.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@NotNull hn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // sn.l
        @Nullable
        public final Object invoke(@Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @d(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ l<hn.c<Object>, Object> $handler;
        public int label;
        public final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(l<? super hn.c<Object>, ? extends Object> lVar, Invocation invocation, hn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$handler = lVar;
            this.this$0 = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return new AnonymousClass3(this.$handler, this.this$0, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    l<hn.c<Object>, Object> lVar = this.$handler;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                this.this$0.completableDeferred.n(obj);
            } catch (Throwable th2) {
                this.this$0.completableDeferred.b(th2);
            }
            return r.f5635a;
        }
    }

    public Invocation(@NotNull String str, @NotNull Object[] objArr) {
        tn.p.k(str, "location");
        tn.p.k(objArr, "parameters");
        this.location = str;
        this.parameters = objArr;
        this._isHandled = v.c(null, 1, null);
        this.completableDeferred = v.c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, hn.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new AnonymousClass2(null);
        }
        return invocation.handle(lVar, cVar);
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Object getResult(@NotNull hn.c<Object> cVar) {
        return this.completableDeferred.N(cVar);
    }

    @Nullable
    public final Object handle(@NotNull l<? super hn.c<Object>, ? extends Object> lVar, @NotNull hn.c<? super r> cVar) {
        t<r> tVar = this._isHandled;
        r rVar = r.f5635a;
        tVar.n(rVar);
        i.d(kotlinx.coroutines.d.a(cVar.getContext()), null, null, new AnonymousClass3(lVar, this, null), 3, null);
        return rVar;
    }

    @NotNull
    public final p0<r> isHandled() {
        return this._isHandled;
    }
}
