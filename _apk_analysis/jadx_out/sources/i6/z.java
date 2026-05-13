package i6;

import androidx.annotation.Nullable;
import com.ironsource.C3978d4;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
public interface z {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f63945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f63946b;

        public a(a0 a0Var) {
            this(a0Var, a0Var);
        }

        public a(a0 a0Var, a0 a0Var2) {
            this.f63945a = (a0) s7.a.e(a0Var);
            this.f63946b = (a0) s7.a.e(a0Var2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f63945a.equals(aVar.f63945a) && this.f63946b.equals(aVar.f63946b);
        }

        public int hashCode() {
            return (this.f63945a.hashCode() * 31) + this.f63946b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3978d4.j.f31383d);
            sb2.append(this.f63945a);
            if (this.f63945a.equals(this.f63946b)) {
                str = "";
            } else {
                str = ", " + this.f63946b;
            }
            sb2.append(str);
            sb2.append(C3978d4.j.f31385e);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f63948b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f63947a = j10;
            this.f63948b = new a(j11 == 0 ? a0.f63837c : new a0(0L, j11));
        }

        @Override // i6.z
        public long getDurationUs() {
            return this.f63947a;
        }

        @Override // i6.z
        public a getSeekPoints(long j10) {
            return this.f63948b;
        }

        @Override // i6.z
        public boolean isSeekable() {
            return false;
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
