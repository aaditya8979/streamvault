package com.unity3d.ads.core.utils;

import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.j2;
import p000do.l0;
import p000do.s0;
import p000do.w;
import sn.a;
import sn.p;

/* JADX INFO: compiled from: CommonCoroutineTimer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {

    @NotNull
    private final h0 dispatcher;

    @NotNull
    private final w job;

    @NotNull
    private final l0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCoroutineTimer.kt */
    @d(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ a<r> $action;
        public final /* synthetic */ long $delayStartMillis;
        public final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, a<r> aVar, long j11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$delayStartMillis = j10;
            this.$action = aVar;
            this.$repeatMillis = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            l0 l0Var;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0Var = (l0) this.L$0;
                long j10 = this.$delayStartMillis;
                this.L$0 = l0Var;
                this.label = 1;
                if (s0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l0Var = (l0) this.L$0;
                kotlin.c.b(obj);
            }
            while (kotlinx.coroutines.d.h(l0Var)) {
                this.$action.invoke();
                long j11 = this.$repeatMillis;
                this.L$0 = l0Var;
                this.label = 2;
                if (s0.a(j11, this) == objG) {
                    return objG;
                }
            }
            return r.f5635a;
        }
    }

    public CommonCoroutineTimer(@NotNull h0 h0Var) {
        tn.p.k(h0Var, "dispatcher");
        this.dispatcher = h0Var;
        w wVarB = j2.b(null, 1, null);
        this.job = wVarB;
        this.scope = kotlinx.coroutines.d.a(h0Var.plus(wVarB));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    @NotNull
    public g start(long j10, long j11, @NotNull a<r> aVar) {
        tn.p.k(aVar, "action");
        return i.d(this.scope, this.dispatcher, null, new AnonymousClass1(j10, aVar, j11, null), 2, null);
    }
}
