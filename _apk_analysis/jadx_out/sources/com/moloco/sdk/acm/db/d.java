package com.moloco.sdk.acm.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import bn.r;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Dao
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: com.moloco.sdk.acm.db.d$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", l = {58, 62}, m = "deleteAndReturnDeletedEvents")
        public static final class C0551a extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f45758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f45759b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f45760c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f45761d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f45762e;

            public C0551a(hn.c<? super C0551a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f45761d = obj;
                this.f45762e |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a5). Please report as a decompilation issue!!! */
        @androidx.room.Transaction
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.db.d r9, @org.jetbrains.annotations.NotNull hn.c<? super java.util.List<com.moloco.sdk.acm.db.b>> r10) {
            /*
                boolean r0 = r10 instanceof com.moloco.sdk.acm.db.d.a.C0551a
                if (r0 == 0) goto L13
                r0 = r10
                com.moloco.sdk.acm.db.d$a$a r0 = (com.moloco.sdk.acm.db.d.a.C0551a) r0
                int r1 = r0.f45762e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f45762e = r1
                goto L18
            L13:
                com.moloco.sdk.acm.db.d$a$a r0 = new com.moloco.sdk.acm.db.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f45761d
                java.lang.Object r1 = in.a.g()
                int r2 = r0.f45762e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L49
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r9 = r0.f45758a
                java.util.List r9 = (java.util.List) r9
                kotlin.c.b(r10)
                goto L6c
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L38:
                java.lang.Object r9 = r0.f45760c
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r2 = r0.f45759b
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r5 = r0.f45758a
                com.moloco.sdk.acm.db.d r5 = (com.moloco.sdk.acm.db.d) r5
                kotlin.c.b(r10)
                r10 = r2
                goto La5
            L49:
                kotlin.c.b(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
            L51:
                java.util.List r2 = r9.b()
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L6d
                r0.f45758a = r10
                r2 = 0
                r0.f45759b = r2
                r0.f45760c = r2
                r0.f45762e = r3
                java.lang.Object r9 = r9.c(r0)
                if (r9 != r1) goto L6b
                return r1
            L6b:
                r9 = r10
            L6c:
                return r9
            L6d:
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = cn.x.x(r2, r6)
                r5.<init>(r6)
                java.util.Iterator r6 = r2.iterator()
            L7c:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L94
                java.lang.Object r7 = r6.next()
                com.moloco.sdk.acm.db.b r7 = (com.moloco.sdk.acm.db.b) r7
                long r7 = r7.c()
                java.lang.Long r7 = jn.a.e(r7)
                r5.add(r7)
                goto L7c
            L94:
                r0.f45758a = r9
                r0.f45759b = r10
                r0.f45760c = r2
                r0.f45762e = r4
                java.lang.Object r5 = r9.b(r5, r0)
                if (r5 != r1) goto La3
                return r1
            La3:
                r5 = r9
                r9 = r2
            La5:
                r10.addAll(r9)
                r9 = r5
                goto L51
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.db.d.a.a(com.moloco.sdk.acm.db.d, hn.c):java.lang.Object");
        }
    }

    @Insert(onConflict = 1)
    long a(@NotNull b bVar);

    @Transaction
    @Nullable
    Object a(@NotNull hn.c<? super List<b>> cVar);

    @Query("DELETE FROM events WHERE id IN (:ids)")
    @Nullable
    Object b(@NotNull List<Long> list, @NotNull hn.c<? super r> cVar);

    @Query("SELECT * FROM events LIMIT 900")
    @NotNull
    List<b> b();

    @Query("DELETE FROM sqlite_sequence WHERE name='events'")
    @Nullable
    Object c(@NotNull hn.c<? super r> cVar);
}
