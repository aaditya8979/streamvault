package okio;

import bo.c;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class _JvmPlatformKt {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String str) {
        p.k(str, "<this>");
        byte[] bytes = str.getBytes(c.f5639b);
        p.j(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] bArr) {
        p.k(bArr, "<this>");
        return new String(bArr, c.f5639b);
    }

    public static final <T> T withLock(@NotNull ReentrantLock reentrantLock, @NotNull a<? extends T> aVar) {
        p.k(reentrantLock, "<this>");
        p.k(aVar, "action");
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            n.b(1);
            reentrantLock.unlock();
            n.a(1);
        }
    }
}
