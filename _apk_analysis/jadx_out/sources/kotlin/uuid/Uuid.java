package kotlin.uuid;

import bn.j;
import bn.m;
import bo.a0;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Uuid f73246b = new Uuid(0, 0);

    /* JADX INFO: compiled from: Uuid.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final Uuid a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new Uuid(j10, j11, null);
        }

        @NotNull
        public final Uuid b() {
            return Uuid.f73246b;
        }

        @NotNull
        public final Uuid c(@NotNull String str) {
            p.k(str, "uuidString");
            int length = str.length();
            if (length == 32) {
                return kotlin.uuid.a.d(str);
            }
            if (length == 36) {
                return kotlin.uuid.a.e(str);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + b.j(str, 64) + "\" of length " + str.length());
        }
    }

    public Uuid(long j10, long j11) {
        this.mostSignificantBits = j10;
        this.leastSignificantBits = j11;
    }

    public /* synthetic */ Uuid(long j10, long j11, i iVar) {
        this(j10, j11);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private final Object writeReplace() {
        return kotlin.uuid.a.b(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Uuid uuid) {
        p.k(uuid, "other");
        long j10 = this.mostSignificantBits;
        return j10 != uuid.mostSignificantBits ? Long.compare(m.b(j10) ^ Long.MIN_VALUE, m.b(uuid.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(m.b(this.leastSignificantBits) ^ Long.MIN_VALUE, m.b(uuid.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        kotlin.uuid.a.c(bArr, 0, this.mostSignificantBits);
        kotlin.uuid.a.c(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    @NotNull
    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 24, 2, 8);
        return a0.B(bArr);
    }

    @NotNull
    public final String toHexString() {
        byte[] bArr = new byte[32];
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 0, 0, 8);
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 16, 0, 8);
        return a0.B(bArr);
    }

    @NotNull
    public String toString() {
        return toHexDashString();
    }

    @NotNull
    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m7544toUByteArrayTcUX1vc() {
        return j.g(toByteArray());
    }
}
