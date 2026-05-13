package q6;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;
import s7.a0;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: compiled from: PsshAtomUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f77946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f77948c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f77946a = uuid;
            this.f77947b = i10;
            this.f77948c = bArr;
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

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    @Nullable
    public static a d(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        if (a0Var.f() < 32) {
            return null;
        }
        a0Var.P(0);
        if (a0Var.n() != a0Var.a() + 4 || a0Var.n() != 1886614376) {
            return null;
        }
        int iC = q6.a.c(a0Var.n());
        if (iC > 1) {
            s7.q.i("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(a0Var.w(), a0Var.w());
        if (iC == 1) {
            a0Var.Q(a0Var.H() * 16);
        }
        int iH = a0Var.H();
        if (iH != a0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iH];
        a0Var.j(bArr2, 0, iH);
        return new a(uuid, iC, bArr2);
    }

    @Nullable
    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f77946a)) {
            return aVarD.f77948c;
        }
        s7.q.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f77946a + ".");
        return null;
    }

    @Nullable
    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f77946a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f77947b;
    }
}
