package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.a;
import java.io.InputStream;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h;
import sl.c;
import tn.p;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BlockingKt {
    @NotNull
    public static final InputStream a(@NotNull final a aVar, @Nullable g gVar) {
        p.k(aVar, "<this>");
        return new InputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c.a(aVar);
            }

            public final void d() throws InterruptedException {
                h.b(null, new BlockingKt$toInputStream$1$blockingWait$1(aVar, null), 1, null);
            }

            @Override // java.io.InputStream
            public int read() throws InterruptedException {
                if (aVar.h()) {
                    return -1;
                }
                if (aVar.f().exhausted()) {
                    d();
                }
                if (aVar.h()) {
                    return -1;
                }
                return aVar.f().readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws InterruptedException {
                p.k(bArr, "b");
                if (aVar.h()) {
                    return -1;
                }
                if (aVar.f().exhausted()) {
                    d();
                }
                int iG0 = aVar.f().g0(bArr, i10, Math.min(ByteReadChannelOperationsKt.e(aVar), i11) + i10);
                return iG0 >= 0 ? iG0 : aVar.h() ? -1 : 0;
            }
        };
    }
}
