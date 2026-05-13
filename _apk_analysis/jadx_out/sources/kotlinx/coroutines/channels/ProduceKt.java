package kotlinx.coroutines.channels;

import bn.r;
import fo.g;
import fo.m;
import fo.o;
import hn.c;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.f0;
import p000do.k;
import p000do.l0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ProduceKt {

    /* JADX INFO: compiled from: Produce.kt */
    public static final class a implements l<Throwable, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k<r> f73310b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k<? super r> kVar) {
            this.f73310b = kVar;
        }

        public final void a(Throwable th2) {
            k<r> kVar = this.f73310b;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
            a(th2);
            return r.f5635a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull fo.m<?> r4, @org.jetbrains.annotations.NotNull sn.a<bn.r> r5, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            r5 = r4
            sn.a r5 = (sn.a) r5
            java.lang.Object r4 = r0.L$0
            fo.m r4 = (fo.m) r4
            kotlin.c.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.c.b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.g$b r2 = kotlinx.coroutines.g.H8
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L32
            hn.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.K()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.ProduceKt$a r2 = new kotlinx.coroutines.channels.ProduceKt$a     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.O(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.B()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = in.a.g()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            jn.f.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            bn.r r4 = bn.r.f5635a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.b(fo.m, sn.a, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(m mVar, sn.a aVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new sn.a() { // from class: fo.k
                @Override // sn.a
                public final Object invoke() {
                    return ProduceKt.d();
                }
            };
        }
        return b(mVar, aVar, cVar);
    }

    public static final r d() {
        return r.f5635a;
    }

    @NotNull
    public static final <E> o<E> e(@NotNull l0 l0Var, @NotNull d dVar, int i10, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable l<? super Throwable, r> lVar, @NotNull p<? super m<? super E>, ? super c<? super r>, ? extends Object> pVar) {
        fo.l lVar2 = new fo.l(f0.j(l0Var, dVar), g.b(i10, bufferOverflow, null, 4, null));
        if (lVar != null) {
            lVar2.f(lVar);
        }
        lVar2.i1(coroutineStart, lVar2, pVar);
        return lVar2;
    }

    @NotNull
    public static final <E> o<E> f(@NotNull l0 l0Var, @NotNull d dVar, int i10, @NotNull p<? super m<? super E>, ? super c<? super r>, ? extends Object> pVar) {
        return e(l0Var, dVar, i10, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ o g(l0 l0Var, d dVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return e(l0Var, dVar2, i12, bufferOverflow2, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ o h(l0 l0Var, d dVar, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return f(l0Var, dVar, i10, pVar);
    }
}
