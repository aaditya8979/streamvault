package com.unity3d.ads.core.domain.events;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: EventObservers.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class EventObservers {

    @NotNull
    private final DiagnosticEventObserver diagnosticEventObserver;

    @NotNull
    private final OperativeEventObserver operativeEventObserver;

    @NotNull
    private final TransactionEventObserver transactionEventObserver;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: EventObservers.kt */
    @d(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(@NotNull OperativeEventObserver operativeEventObserver, @NotNull DiagnosticEventObserver diagnosticEventObserver, @NotNull TransactionEventObserver transactionEventObserver) {
        p.k(operativeEventObserver, "operativeEventObserver");
        p.k(diagnosticEventObserver, "diagnosticEventObserver");
        p.k(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    @NotNull
    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    @NotNull
    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    @NotNull
    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r0 = (com.unity3d.ads.core.domain.events.EventObservers) r0
            kotlin.c.b(r6)
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            kotlin.c.b(r6)
            goto L51
        L40:
            kotlin.c.b(r6)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r6 = r5.operativeEventObserver
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r6 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r0 = r2
        L5f:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r6 = r0.transactionEventObserver
            r6.invoke()
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(hn.c):java.lang.Object");
    }
}
