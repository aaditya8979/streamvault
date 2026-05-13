package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f46930c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ortb.a f46931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n0 f46932b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {33, 46}, m = "parse")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46935c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46937e;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46935c = obj;
            this.f46937e |= Integer.MIN_VALUE;
            return o.this.c(null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {71}, m = "parseBidResponse")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46939b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46941d;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46939b = obj;
            this.f46941d |= Integer.MIN_VALUE;
            return o.this.d(null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {58}, m = "processBidResponse$moloco_sdk_release")
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46943b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46945d;

        public d(hn.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46943b = obj;
            this.f46945d |= Integer.MIN_VALUE;
            return o.this.b(null, this);
        }
    }

    public o(@NotNull com.moloco.sdk.internal.ortb.a aVar, @NotNull n0 n0Var) {
        tn.p.k(aVar, "bidResponseParser");
        tn.p.k(n0Var, "bidProcessor");
        this.f46931a = aVar;
        this.f46932b = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.o.d
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.o$d r0 = (com.moloco.sdk.internal.publisher.o.d) r0
            int r1 = r0.f46945d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46945d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.o$d r0 = new com.moloco.sdk.internal.publisher.o$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46943b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46945d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f46942a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.c.b(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.c.b(r9)
            com.moloco.sdk.internal.publisher.n0 r9 = r7.f46932b
            r0.f46942a = r8
            r0.f46945d = r3
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L58
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "Found no pre-preprocessor for the current mediation. Returning the original bid response."
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            return r9
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.b(java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.ortb.model.C4381e, com.moloco.sdk.internal.c0>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.o.b
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.o$b r0 = (com.moloco.sdk.internal.publisher.o.b) r0
            int r1 = r0.f46937e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46937e = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.o$b r0 = new com.moloco.sdk.internal.publisher.o$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f46935c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46937e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r14)
            goto L9a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.Object r12 = r0.f46934b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f46933a
            com.moloco.sdk.internal.publisher.o r13 = (com.moloco.sdk.internal.publisher.o) r13
            kotlin.c.b(r14)
            goto L6c
        L40:
            kotlin.c.b(r14)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "parse() called with bidResponseJson: "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r7 = r14.toString()
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r6 = "BidLoader"
            com.moloco.sdk.internal.MolocoLogger.debug$default(r5, r6, r7, r8, r9, r10)
            r0.f46933a = r11
            r0.f46934b = r12
            r0.f46937e = r4
            java.lang.Object r14 = r11.b(r13, r0)
            if (r14 != r1) goto L6b
            return r1
        L6b:
            r13 = r11
        L6c:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L7e
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r13 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.o r14 = com.moloco.sdk.internal.o.f46249b
            com.moloco.sdk.internal.c0 r12 = com.moloco.sdk.internal.d0.a(r12, r13, r14)
            com.moloco.sdk.internal.g0$a r13 = new com.moloco.sdk.internal.g0$a
            r13.<init>(r12)
            return r13
        L7e:
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r7 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            java.lang.String r5 = "BidLoader"
            java.lang.String r6 = "Processed the bidResponse, proceeding with parsing it."
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            r0.f46933a = r2
            r0.f46934b = r2
            r0.f46937e = r3
            java.lang.Object r14 = r13.d(r14, r12, r0)
            if (r14 != r1) goto L9a
            return r1
        L9a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.c(java.lang.String, java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.ortb.model.C4381e, com.moloco.sdk.internal.c0>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.internal.publisher.o.c
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.internal.publisher.o$c r0 = (com.moloco.sdk.internal.publisher.o.c) r0
            int r1 = r0.f46941d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46941d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.o$c r0 = new com.moloco.sdk.internal.publisher.o$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f46939b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46941d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f46938a
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            kotlin.c.b(r10)
            goto L46
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.c.b(r10)
            com.moloco.sdk.internal.ortb.a r10 = r7.f46931a
            r0.f46938a = r9
            r0.f46941d = r3
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L46
            return r1
        L46:
            com.moloco.sdk.internal.g0 r10 = (com.moloco.sdk.internal.g0) r10
            boolean r8 = r10 instanceof com.moloco.sdk.internal.g0.a
            if (r8 == 0) goto L70
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.g0$a r10 = (com.moloco.sdk.internal.g0.a) r10
            java.lang.Object r8 = r10.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "parseBidResponse failed to parse BID json string."
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r8 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.o r10 = com.moloco.sdk.internal.o.f46250c
            com.moloco.sdk.internal.c0 r8 = com.moloco.sdk.internal.d0.a(r9, r8, r10)
            com.moloco.sdk.internal.g0$a r9 = new com.moloco.sdk.internal.g0$a
            r9.<init>(r8)
            goto L94
        L70:
            boolean r8 = r10 instanceof com.moloco.sdk.internal.g0.b
            if (r8 == 0) goto L95
            com.moloco.sdk.internal.g0$b r9 = new com.moloco.sdk.internal.g0$b
            com.moloco.sdk.internal.g0$b r10 = (com.moloco.sdk.internal.g0.b) r10
            java.lang.Object r8 = r10.a()
            com.moloco.sdk.internal.ortb.model.g r8 = (com.moloco.sdk.internal.ortb.model.g) r8
            java.util.List r8 = r8.c()
            r10 = 0
            java.lang.Object r8 = r8.get(r10)
            com.moloco.sdk.internal.ortb.model.B r8 = (com.moloco.sdk.internal.ortb.model.B) r8
            java.util.List r8 = r8.c()
            java.lang.Object r8 = r8.get(r10)
            r9.<init>(r8)
        L94:
            return r9
        L95:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.d(java.lang.String, java.lang.String, hn.c):java.lang.Object");
    }
}
