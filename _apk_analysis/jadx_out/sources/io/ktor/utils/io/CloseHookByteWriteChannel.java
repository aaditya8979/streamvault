package io.ktor.utils.io;

import bn.r;
import hn.c;
import no.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl.f;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CloseHookByteWriteChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CloseHookByteWriteChannel implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f71259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<c<? super r>, Object> f71260c;

    /* JADX WARN: Multi-variable type inference failed */
    public CloseHookByteWriteChannel(@NotNull f fVar, @NotNull l<? super c<? super r>, ? extends Object> lVar) {
        p.k(fVar, "delegate");
        p.k(lVar, "onClose");
        this.f71259b = fVar;
        this.f71260c = lVar;
    }

    @Override // sl.f
    public void a(@Nullable Throwable th2) {
        this.f71259b.a(th2);
    }

    @Override // sl.f
    @Nullable
    public Throwable b() {
        return this.f71259b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sl.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.c.b(r6)
            goto L46
        L38:
            kotlin.c.b(r6)
            sl.f r6 = r5.f71259b
            r0.label = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            sn.l<hn.c<? super bn.r>, java.lang.Object> r6 = r5.f71260c
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CloseHookByteWriteChannel.c(hn.c):java.lang.Object");
    }

    @Override // sl.f
    @Nullable
    public Object d(@NotNull c<? super r> cVar) {
        return this.f71259b.d(cVar);
    }

    @Override // sl.f
    @NotNull
    public q e() {
        return this.f71259b.e();
    }
}
