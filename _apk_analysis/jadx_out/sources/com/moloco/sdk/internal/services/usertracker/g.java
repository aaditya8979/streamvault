package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f47549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.usertracker.b f47550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final mo.a f47551c;

    @jn.d(c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", f = "UserTrackerService.kt", l = {48, 33, 36}, m = "getIdentifier")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f47554c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47556e;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47554c = obj;
            this.f47556e |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    public g(@NotNull d dVar, @NotNull com.moloco.sdk.internal.services.usertracker.b bVar) {
        p.k(dVar, "idGenerator");
        p.k(bVar, "idRepository");
        this.f47549a = dVar;
        this.f47550b = bVar;
        this.f47551c = mo.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:34:0x0085, B:36:0x0089), top: B:47:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.usertracker.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.services.usertracker.g.b
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.services.usertracker.g$b r0 = (com.moloco.sdk.internal.services.usertracker.g.b) r0
            int r1 = r0.f47556e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47556e = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.usertracker.g$b r0 = new com.moloco.sdk.internal.services.usertracker.g$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f47554c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f47556e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f47553b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f47552a
            mo.a r0 = (mo.a) r0
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L39
            goto La0
        L39:
            r9 = move-exception
            goto La8
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L44:
            java.lang.Object r2 = r0.f47553b
            mo.a r2 = (mo.a) r2
            java.lang.Object r4 = r0.f47552a
            com.moloco.sdk.internal.services.usertracker.g r4 = (com.moloco.sdk.internal.services.usertracker.g) r4
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L50
            goto L85
        L50:
            r9 = move-exception
            goto La9
        L52:
            java.lang.Object r2 = r0.f47553b
            mo.a r2 = (mo.a) r2
            java.lang.Object r5 = r0.f47552a
            com.moloco.sdk.internal.services.usertracker.g r5 = (com.moloco.sdk.internal.services.usertracker.g) r5
            kotlin.c.b(r9)
            r9 = r2
            goto L72
        L5f:
            kotlin.c.b(r9)
            mo.a r9 = r8.f47551c
            r0.f47552a = r8
            r0.f47553b = r9
            r0.f47556e = r5
            java.lang.Object r2 = r9.c(r6, r0)
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r8
        L72:
            com.moloco.sdk.internal.services.usertracker.b r2 = r5.f47550b     // Catch: java.lang.Throwable -> La4
            r0.f47552a = r5     // Catch: java.lang.Throwable -> La4
            r0.f47553b = r9     // Catch: java.lang.Throwable -> La4
            r0.f47556e = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r2.b(r0)     // Catch: java.lang.Throwable -> La4
            if (r2 != r1) goto L81
            return r1
        L81:
            r4 = r5
            r7 = r2
            r2 = r9
            r9 = r7
        L85:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            com.moloco.sdk.internal.services.usertracker.d r9 = r4.f47549a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.a()     // Catch: java.lang.Throwable -> L50
            com.moloco.sdk.internal.services.usertracker.b r4 = r4.f47550b     // Catch: java.lang.Throwable -> L50
            r0.f47552a = r2     // Catch: java.lang.Throwable -> L50
            r0.f47553b = r9     // Catch: java.lang.Throwable -> L50
            r0.f47556e = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.a(r9, r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != r1) goto L9e
            return r1
        L9e:
            r1 = r9
            r0 = r2
        La0:
            r0.d(r6)
            return r1
        La4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        La8:
            r2 = r0
        La9:
            r2.d(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.usertracker.g.b(hn.c):java.lang.Object");
    }
}
