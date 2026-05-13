package sl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteChannelCtor.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    @NotNull
    public static final io.ktor.utils.io.a a(@NotNull no.r rVar) {
        tn.p.k(rVar, "source");
        return new q(rVar);
    }

    @NotNull
    public static final io.ktor.utils.io.a b(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "content");
        no.a aVar = new no.a();
        aVar.write(bArr, i10, i11 + i10);
        return a(aVar);
    }

    public static /* synthetic */ io.ktor.utils.io.a c(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return b(bArr, i10, i11);
    }
}
