package q4;

import a6.t;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: compiled from: PsshAtomUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f77768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f77770c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f77768a = uuid;
            this.f77769b = i10;
            this.f77770c = bArr;
        }
    }

    public static byte[] a(UUID uuid, @Nullable byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    public static a c(byte[] bArr) {
        t tVar = new t(bArr);
        if (tVar.d() < 32) {
            return null;
        }
        tVar.L(0);
        if (tVar.j() != tVar.a() + 4 || tVar.j() != 1886614376) {
            return null;
        }
        int iC = q4.a.c(tVar.j());
        if (iC > 1) {
            a6.m.h("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(tVar.r(), tVar.r());
        if (iC == 1) {
            tVar.M(tVar.C() * 16);
        }
        int iC2 = tVar.C();
        if (iC2 != tVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iC2];
        tVar.h(bArr2, 0, iC2);
        return new a(uuid, iC, bArr2);
    }

    @Nullable
    public static UUID d(byte[] bArr) {
        a aVarC = c(bArr);
        if (aVarC == null) {
            return null;
        }
        return aVarC.f77768a;
    }
}
