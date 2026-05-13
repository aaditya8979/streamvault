package oo;

import com.ironsource.G5;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ByteStringJvmExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @NotNull
    public static final String a(@NotNull a aVar, @NotNull Charset charset) {
        p.k(aVar, "<this>");
        p.k(charset, G5.M);
        return new String(aVar.d(), charset);
    }
}
