package xo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import yo.h0;
import yo.r0;
import yo.s0;

/* JADX INFO: compiled from: JvmStreams.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g0 {
    public static final <T> T a(@NotNull a aVar, @NotNull so.c<? extends T> cVar, @NotNull InputStream inputStream) {
        tn.p.k(aVar, "<this>");
        tn.p.k(cVar, "deserializer");
        tn.p.k(inputStream, "stream");
        h0 h0Var = new h0(inputStream);
        try {
            return (T) r0.a(aVar, cVar, h0Var);
        } finally {
            h0Var.b();
        }
    }

    public static final <T> void b(@NotNull a aVar, @NotNull so.l<? super T> lVar, T t10, @NotNull OutputStream outputStream) throws IOException {
        tn.p.k(aVar, "<this>");
        tn.p.k(lVar, "serializer");
        tn.p.k(outputStream, "stream");
        s0 s0Var = new s0(outputStream);
        try {
            r0.b(aVar, s0Var, lVar, t10);
        } finally {
            s0Var.g();
        }
    }
}
