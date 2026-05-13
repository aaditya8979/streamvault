package com.unity3d.ads.core.domain.events;

import bn.r;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import go.f;
import go.l;
import go.v;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.h0;
import p000do.i0;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: OperativeEventObserver.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OperativeEventObserver {

    @NotNull
    private final BackgroundWorker backgroundWorker;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final l<Boolean> isRunning;

    @NotNull
    private final OperativeEventRepository operativeEventRepository;

    @NotNull
    private final GetRequestPolicy operativeRequestPolicy;

    @NotNull
    private final l0 scope;

    @NotNull
    private final UniversalRequestDataSource universalRequestDataSource;

    @NotNull
    private final UniversalRequestEventSender universalRequestEventSender;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: OperativeEventObserver.kt */
    @d(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: OperativeEventObserver.kt */
        @d(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {44, 48, 53}, m = "invokeSuspend")
        public static final class C07082 extends SuspendLambda implements p<OperativeEventRequestOuterClass.OperativeEventRequest, c<? super r>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07082(OperativeEventObserver operativeEventObserver, c<? super C07082> cVar) {
                super(2, cVar);
                this.this$0 = operativeEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                C07082 c07082 = new C07082(this.this$0, cVar);
                c07082.L$0 = obj;
                return c07082;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, @Nullable c<? super r> cVar) {
                return ((C07082) create(operativeEventRequest, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|28|29)(2:8|9))(6:10|33|11|22|28|29))(1:13))(2:14|(1:16))|17|31|18|(1:20)(4:21|22|28|29)) */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
            
                r3 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
            
                return r0;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00e1 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 229
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C07082.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return OperativeEventObserver.this.new AnonymousClass2(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object value;
            Boolean bool;
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            l lVar = OperativeEventObserver.this.isRunning;
            do {
                value = lVar.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!lVar.b(value, jn.a.a(true)));
            if (bool.booleanValue()) {
                return r.f5635a;
            }
            f.D(f.G(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new C07082(OperativeEventObserver.this, null)), OperativeEventObserver.this.scope);
            return r.f5635a;
        }
    }

    public OperativeEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull h0 h0Var, @NotNull OperativeEventRepository operativeEventRepository, @NotNull UniversalRequestDataSource universalRequestDataSource, @NotNull BackgroundWorker backgroundWorker, @NotNull UniversalRequestEventSender universalRequestEventSender, @NotNull GetRequestPolicy getRequestPolicy) {
        tn.p.k(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        tn.p.k(h0Var, "defaultDispatcher");
        tn.p.k(operativeEventRepository, "operativeEventRepository");
        tn.p.k(universalRequestDataSource, "universalRequestDataSource");
        tn.p.k(backgroundWorker, "backgroundWorker");
        tn.p.k(universalRequestEventSender, "universalRequestEventSender");
        tn.p.k(getRequestPolicy, "operativeRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = getRequestPolicy;
        this.isRunning = v.a(Boolean.FALSE);
        this.scope = kotlinx.coroutines.d.a(h0Var.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(i0.D8)));
    }

    @Nullable
    public final Object invoke(@NotNull c<? super r> cVar) {
        Object objG = g.g(this.scope.getCoroutineContext(), new AnonymousClass2(null), cVar);
        return objG == a.g() ? objG : r.f5635a;
    }
}
