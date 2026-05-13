package io.ktor.utils.io.jvm.javaio;

import hn.c;
import io.ktor.utils.io.a;
import java.io.OutputStream;

/* JADX INFO: compiled from: Writing.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WritingKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:29:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:28:0x0078). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.utils.io.a r18, @org.jetbrains.annotations.NotNull java.io.OutputStream r19, long r20, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Long> r22) throws java.io.IOException {
        /*
            r0 = r20
            r2 = r22
            boolean r3 = r2 instanceof io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1
            if (r3 == 0) goto L17
            r3 = r2
            io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 r3 = (io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.label = r4
            goto L1c
        L17:
            io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 r3 = new io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = in.a.g()
            int r5 = r3.label
            r6 = 0
            r7 = 0
            r9 = 1
            if (r5 == 0) goto L42
            if (r5 != r9) goto L3a
            long r0 = r3.J$0
            java.lang.Object r5 = r3.L$1
            java.io.OutputStream r5 = (java.io.OutputStream) r5
            java.lang.Object r7 = r3.L$0
            io.ktor.utils.io.a r7 = (io.ktor.utils.io.a) r7
            kotlin.c.b(r2)
            goto L78
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            kotlin.c.b(r2)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L4b
            r2 = r9
            goto L4c
        L4b:
            r2 = r6
        L4c:
            if (r2 == 0) goto La1
            r0 = r18
            r1 = r19
        L52:
            boolean r2 = r0.h()
            if (r2 != 0) goto L9c
            no.r r2 = r0.f()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L7e
            r2 = 0
            r3.L$0 = r0
            r3.L$1 = r1
            r3.J$0 = r7
            r3.label = r9
            java.lang.Object r2 = io.ktor.utils.io.a.b.a(r0, r6, r3, r9, r2)
            if (r2 != r4) goto L72
            return r4
        L72:
            r5 = r1
            r16 = r7
            r7 = r0
            r0 = r16
        L78:
            r16 = r0
            r1 = r5
            r0 = r7
            r7 = r16
        L7e:
            no.r r2 = r0.f()
            no.a r2 = r2.getBuffer()
            long r10 = r2.n()
            long r7 = r7 + r10
            no.r r2 = r0.f()
            no.a r10 = r2.getBuffer()
            r12 = 0
            r14 = 2
            r15 = 0
            r11 = r1
            no.b.b(r10, r11, r12, r14, r15)
            goto L52
        L9c:
            java.lang.Long r0 = jn.a.e(r7)
            return r0
        La1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Limit shouldn't be negative: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.WritingKt.a(io.ktor.utils.io.a, java.io.OutputStream, long, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object b(a aVar, OutputStream outputStream, long j10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return a(aVar, outputStream, j10, cVar);
    }
}
