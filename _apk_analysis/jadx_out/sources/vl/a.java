package vl;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.ktor.utils.io.jvm.javaio.RawSourceChannel;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.coroutines.d;
import no.g;
import org.jetbrains.annotations.NotNull;
import p000do.w0;
import tn.p;
import wl.f;

/* JADX INFO: compiled from: Reading.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    @NotNull
    public static final io.ktor.utils.io.a a(@NotNull InputStream inputStream, @NotNull d dVar, @NotNull f<ByteBuffer> fVar) {
        p.k(inputStream, "<this>");
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        p.k(fVar, "pool");
        return new RawSourceChannel(g.a(inputStream), dVar);
    }

    @NotNull
    public static final io.ktor.utils.io.a b(@NotNull InputStream inputStream, @NotNull d dVar, @NotNull f<byte[]> fVar) {
        p.k(inputStream, "<this>");
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        p.k(fVar, "pool");
        return new RawSourceChannel(g.a(inputStream), dVar);
    }

    public static /* synthetic */ io.ktor.utils.io.a c(InputStream inputStream, d dVar, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = w0.b();
        }
        if ((i10 & 2) != 0) {
            fVar = wl.a.a();
        }
        return b(inputStream, dVar, fVar);
    }
}
