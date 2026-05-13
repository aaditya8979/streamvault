package i6;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b0 {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f63841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63843d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f63840a = i10;
            this.f63841b = bArr;
            this.f63842c = i11;
            this.f63843d = i12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f63840a == aVar.f63840a && this.f63842c == aVar.f63842c && this.f63843d == aVar.f63843d && Arrays.equals(this.f63841b, aVar.f63841b);
        }

        public int hashCode() {
            return (((((this.f63840a * 31) + Arrays.hashCode(this.f63841b)) * 31) + this.f63842c) * 31) + this.f63843d;
        }
    }

    void a(s7.a0 a0Var, int i10, int i11);

    void b(com.google.android.exoplayer2.m mVar);

    void c(long j10, int i10, int i11, int i12, @Nullable a aVar);

    int d(r7.f fVar, int i10, boolean z10, int i11) throws IOException;

    default void e(s7.a0 a0Var, int i10) {
        a(a0Var, i10, 0);
    }

    default int f(r7.f fVar, int i10, boolean z10) throws IOException {
        return d(fVar, i10, z10, 0);
    }
}
