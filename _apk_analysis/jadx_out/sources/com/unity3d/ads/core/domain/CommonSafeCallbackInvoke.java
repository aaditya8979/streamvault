package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.services.core.misc.Utilities;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: CommonSafeCallbackInvoke.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {

    @NotNull
    private final h0 mainDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonSafeCallbackInvoke.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ sn.a<r> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sn.a<r> aVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$block = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$block, cVar);
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
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            final sn.a<r> aVar = this.$block;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
            return r.f5635a;
        }
    }

    public CommonSafeCallbackInvoke(@NotNull h0 h0Var) {
        tn.p.k(h0Var, "mainDispatcher");
        this.mainDispatcher = h0Var;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(@NotNull sn.a<r> aVar) {
        tn.p.k(aVar, "block");
        i.d(kotlinx.coroutines.d.a(this.mainDispatcher), null, null, new AnonymousClass1(aVar, null), 3, null);
    }
}
