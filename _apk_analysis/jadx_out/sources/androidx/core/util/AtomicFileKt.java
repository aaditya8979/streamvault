package androidx.core.util;

import bn.r;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AtomicFileKt {
    @NotNull
    public static final byte[] readBytes(@NotNull android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @NotNull
    public static final String readText(@NotNull android.util.AtomicFile atomicFile, @NotNull Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(@NotNull android.util.AtomicFile atomicFile, @NotNull l<? super FileOutputStream, r> lVar) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            lVar.invoke(fileOutputStreamStartWrite);
            n.b(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
            n.a(1);
        } catch (Throwable th2) {
            n.b(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            n.a(1);
            throw th2;
        }
    }

    public static final void writeBytes(@NotNull android.util.AtomicFile atomicFile, @NotNull byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th2;
        }
    }

    public static final void writeText(@NotNull android.util.AtomicFile atomicFile, @NotNull String str, @NotNull Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        p.j(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = bo.c.f5639b;
        }
        writeText(atomicFile, str, charset);
    }
}
