package oo;

import bo.a0;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final a a(@NotNull byte... bArr) {
        p.k(bArr, "bytes");
        return bArr.length == 0 ? a.f76505d.a() : a.f76505d.b(bArr);
    }

    @NotNull
    public static final String b(@NotNull a aVar) {
        p.k(aVar, "<this>");
        return a0.B(aVar.d());
    }

    public static final boolean c(@NotNull a aVar) {
        p.k(aVar, "<this>");
        return aVar.e() == 0;
    }
}
