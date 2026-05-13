package kotlin.uuid;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final void a(long j10, @NotNull byte[] bArr, int i10, int i11, int i12) {
        p.k(bArr, "dst");
        b.h(j10, bArr, i10, i11, i12);
    }

    @NotNull
    public static final Object b(@NotNull Uuid uuid) {
        p.k(uuid, CommonUrlParts.UUID);
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final void c(@NotNull byte[] bArr, int i10, long j10) {
        p.k(bArr, "<this>");
        b.i(bArr, i10, j10);
    }

    @NotNull
    public static final Uuid d(@NotNull String str) {
        p.k(str, "hexString");
        return b.k(str);
    }

    @NotNull
    public static final Uuid e(@NotNull String str) {
        p.k(str, "hexDashString");
        return b.l(str);
    }
}
