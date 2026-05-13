package io.ktor.utils.io;

import bn.r;
import hn.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.Ref$LongRef;
import tn.p;

/* JADX INFO: compiled from: ByteReadChannelOperations.jvm.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ByteReadChannelOperations_jvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00fa -> B:48:0x0101). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull io.ktor.utils.io.a r10, @org.jetbrains.annotations.NotNull final java.nio.channels.WritableByteChannel r11, final long r12, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Long> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.b(io.ktor.utils.io.a, java.nio.channels.WritableByteChannel, long, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(a aVar, WritableByteChannel writableByteChannel, long j10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return b(aVar, writableByteChannel, j10, cVar);
    }

    public static final r d(long j10, Ref$LongRef ref$LongRef, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) throws IOException {
        p.k(byteBuffer, "bb");
        long j11 = j10 - ref$LongRef.element;
        if (j11 < byteBuffer.remaining()) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + ((int) j11));
            while (byteBuffer.hasRemaining()) {
                writableByteChannel.write(byteBuffer);
            }
            byteBuffer.limit(iLimit);
            ref$LongRef.element += j11;
        } else {
            long jWrite = 0;
            while (byteBuffer.hasRemaining()) {
                jWrite += (long) writableByteChannel.write(byteBuffer);
            }
            ref$LongRef.element += jWrite;
        }
        return r.f5635a;
    }
}
