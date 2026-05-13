package io.ktor.http.cio;

import fo.o;
import gl.f;
import io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.io.IOException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.ProduceKt;
import oo.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.p;
import ul.h;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MultipartKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final oo.a f71186a = new oo.a(h.e("\r\n", null, 1, null), 0, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final oo.a f71187b = c.a(45, 45);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039 A[PHI: r6
      0x0039: PHI (r6v2 char) = (r6v0 char), (r6v3 char) binds: [B:25:0x0037, B:17:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(java.lang.CharSequence r12) {
        /*
            int r0 = r12.length()
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            if (r2 >= r0) goto L5b
            char r5 = r12.charAt(r2)
            r6 = 2
            r7 = 59
            r8 = 3
            r9 = 1
            if (r3 == 0) goto L54
            r10 = 44
            if (r3 == r9) goto L35
            r11 = 34
            if (r3 == r6) goto L2c
            r6 = 4
            if (r3 == r8) goto L25
            if (r3 == r6) goto L23
            goto L58
        L23:
            r3 = r8
            goto L58
        L25:
            if (r5 == r11) goto L56
            r7 = 92
            if (r5 == r7) goto L39
            goto L58
        L2c:
            if (r5 == r11) goto L23
            if (r5 == r10) goto L33
            if (r5 == r7) goto L56
            goto L58
        L33:
            r3 = r1
            goto L58
        L35:
            r8 = 61
            if (r5 != r8) goto L3b
        L39:
            r3 = r6
            goto L58
        L3b:
            if (r5 != r7) goto L3f
            r4 = r1
            goto L58
        L3f:
            if (r5 != r10) goto L42
            goto L33
        L42:
            r6 = 32
            if (r5 == r6) goto L58
            if (r4 != 0) goto L51
            java.lang.String r5 = "boundary="
            boolean r5 = bo.d0.W0(r12, r5, r2, r9)
            if (r5 == 0) goto L51
            return r2
        L51:
            int r4 = r4 + 1
            goto L58
        L54:
            if (r5 != r7) goto L58
        L56:
            r4 = r1
            r3 = r9
        L58:
            int r2 = r2 + 1
            goto L8
        L5b:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.g(java.lang.CharSequence):int");
    }

    @NotNull
    public static final byte[] h(@NotNull CharSequence charSequence) throws IOException {
        p.k(charSequence, "contentType");
        int iG = g(charSequence);
        if (iG == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        i(ref$IntRef, bArr, (byte) 13);
        i(ref$IntRef, bArr, (byte) 10);
        i(ref$IntRef, bArr, (byte) 45);
        i(ref$IntRef, bArr, (byte) 45);
        int length = charSequence.length();
        char c10 = 0;
        for (int i10 = iG + 9; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            int i11 = cCharAt & 65535;
            if ((65535 & i11) > 127) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to parse multipart: wrong boundary byte 0x");
                String string = Integer.toString(i11, bo.a.a(16));
                p.j(string, "toString(...)");
                sb2.append(string);
                sb2.append(" - should be 7bit character");
                throw new IOException(sb2.toString());
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    if (cCharAt == ' ' || cCharAt == ',' || cCharAt == ';') {
                        break;
                    }
                    i(ref$IntRef, bArr, (byte) i11);
                } else if (c10 == 2) {
                    if (cCharAt == '\"') {
                        break;
                    }
                    if (cCharAt != '\\') {
                        i(ref$IntRef, bArr, (byte) i11);
                    } else {
                        c10 = 3;
                    }
                } else if (c10 == 3) {
                    i(ref$IntRef, bArr, (byte) i11);
                    c10 = 2;
                }
            } else if (cCharAt == ' ') {
                continue;
            } else if (cCharAt == '\"') {
                c10 = 2;
            } else {
                if (cCharAt == ',' || cCharAt == ';') {
                    break;
                }
                i(ref$IntRef, bArr, (byte) i11);
                c10 = 1;
            }
        }
        int i12 = ref$IntRef.element;
        if (i12 != 4) {
            return cn.p.q(bArr, 0, i12);
        }
        throw new IOException("Empty multipart boundary is not allowed");
    }

    public static final void i(Ref$IntRef ref$IntRef, byte[] bArr, byte b10) throws IOException {
        int i10 = ref$IntRef.element;
        if (i10 >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        ref$IntRef.element = i10 + 1;
        bArr[i10] = b10;
    }

    @NotNull
    public static final o<b> j(@NotNull l0 l0Var, @NotNull io.ktor.utils.io.a aVar, @NotNull CharSequence charSequence, @Nullable Long l10, long j10) throws UnsupportedMediaTypeExceptionCIO {
        p.k(l0Var, "<this>");
        p.k(aVar, "input");
        p.k(charSequence, "contentType");
        if (f.c.f62525a.a(charSequence)) {
            return k(l0Var, new oo.a(h(charSequence), 0, 0, 6, null), aVar, l10, j10);
        }
        throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) charSequence));
    }

    public static final o<b> k(l0 l0Var, oo.a aVar, io.ktor.utils.io.a aVar2, Long l10, long j10) {
        return ProduceKt.h(l0Var, null, 0, new MultipartKt$parseMultipart$1(aVar2, aVar, j10, l10, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(oo.a r15, io.ktor.utils.io.a r16, sl.f r17, hl.a r18, long r19, hn.c<? super java.lang.Long> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.l(oo.a, io.ktor.utils.io.a, sl.f, hl.a, long, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(io.ktor.utils.io.a r8, hn.c<? super hl.a> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = (io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = new io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = in.a.g()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r4.L$0
            il.d r8 = (il.d) r8
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L54
        L2e:
            r9 = move-exception
            goto L65
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.c.b(r9)
            il.d r9 = new il.d
            r1 = 0
            r9.<init>(r1, r2, r1)
            r3 = 0
            r5 = 4
            r6 = 0
            r4.L$0 = r9     // Catch: java.lang.Throwable -> L61
            r4.label = r2     // Catch: java.lang.Throwable -> L61
            r1 = r8
            r2 = r9
            java.lang.Object r8 = io.ktor.http.cio.HttpParserKt.h(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L61
            if (r8 != r0) goto L51
            return r0
        L51:
            r7 = r9
            r9 = r8
            r8 = r7
        L54:
            hl.a r9 = (hl.a) r9     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L59
            return r9
        L59:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L61:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L65:
            r8.o()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.m(io.ktor.utils.io.a, hn.c):java.lang.Object");
    }

    public static final Object n(oo.a aVar, io.ktor.utils.io.a aVar2, sl.f fVar, long j10, hn.c<? super Long> cVar) {
        return ByteReadChannelOperationsKt.o(aVar2, aVar, fVar, j10, true, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(io.ktor.utils.io.a r4, oo.a r5, hn.c<? super java.lang.Long> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = (io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = new io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            oo.a r5 = (oo.a) r5
            kotlin.c.b(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.c.b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteReadChannelOperationsKt.v(r4, r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L52
            int r4 = r5.e()
            long r4 = (long) r4
            goto L54
        L52:
            r4 = 0
        L54:
            java.lang.Long r4 = jn.a.e(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.o(io.ktor.utils.io.a, oo.a, hn.c):java.lang.Object");
    }

    public static final Void p(long j10, long j11) throws IOException {
        throw new IOException("Multipart content length exceeds limit " + j10 + " > " + j11 + "; limit is defined using 'formFieldLimit' argument");
    }
}
