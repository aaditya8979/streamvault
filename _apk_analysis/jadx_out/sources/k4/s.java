package k4;

import androidx.annotation.Nullable;
import com.ironsource.C3978d4;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f72919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f72920b;

        public a(t tVar) {
            this(tVar, tVar);
        }

        public a(t tVar, t tVar2) {
            this.f72919a = (t) a6.a.e(tVar);
            this.f72920b = (t) a6.a.e(tVar2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72919a.equals(aVar.f72919a) && this.f72920b.equals(aVar.f72920b);
        }

        public int hashCode() {
            return (this.f72919a.hashCode() * 31) + this.f72920b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3978d4.j.f31383d);
            sb2.append(this.f72919a);
            if (this.f72919a.equals(this.f72920b)) {
                str = "";
            } else {
                str = ", " + this.f72920b;
            }
            sb2.append(str);
            sb2.append(C3978d4.j.f31385e);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f72921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f72922b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f72921a = j10;
            this.f72922b = new a(j11 == 0 ? t.f72923c : new t(0L, j11));
        }

        @Override // k4.s
        public long getDurationUs() {
            return this.f72921a;
        }

        @Override // k4.s
        public a getSeekPoints(long j10) {
            return this.f72922b;
        }

        @Override // k4.s
        public boolean isSeekable() {
            return false;
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
