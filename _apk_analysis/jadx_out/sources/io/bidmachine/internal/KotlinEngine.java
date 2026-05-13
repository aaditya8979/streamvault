package io.bidmachine.internal;

import bn.r;
import com.ironsource.C3978d4;
import hn.c;
import in.a;
import io.bidmachine.BidMachine;
import io.bidmachine.core.Logger;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.j2;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: compiled from: KotlinEngine.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/internal/KotlinEngine;", "", "Lbn/r;", C3978d4.a.f31210f, "Ldo/l0;", "scope", "Ldo/l0;", "<init>", "()V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class KotlinEngine {

    @NotNull
    public static final KotlinEngine INSTANCE = new KotlinEngine();

    @NotNull
    private static final l0 scope = d.a(j2.b(null, 1, null).plus(w0.a()));

    /* JADX INFO: renamed from: io.bidmachine.internal.KotlinEngine$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: KotlinEngine.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.internal.KotlinEngine$init$1", f = "KotlinEngine.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(cVar);
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
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            Logger.d(BidMachine.NAME, "Kotlin runtime version is " + KotlinVersion.CURRENT);
            return r.f5635a;
        }
    }

    private KotlinEngine() {
    }

    public static final void init() {
        Logger.d(BidMachine.NAME, "Init Kt");
        i.d(scope, null, null, new AnonymousClass1(null), 3, null);
    }
}
