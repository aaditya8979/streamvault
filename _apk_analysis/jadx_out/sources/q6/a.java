package q6;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s7.a0;

/* JADX INFO: compiled from: Atom.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77829a;

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Atom.java */
    public static final class C0933a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f77831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<C0933a> f77832d;

        public C0933a(int i10, long j10) {
            super(i10);
            this.f77830b = j10;
            this.f77831c = new ArrayList();
            this.f77832d = new ArrayList();
        }

        public void d(C0933a c0933a) {
            this.f77832d.add(c0933a);
        }

        public void e(b bVar) {
            this.f77831c.add(bVar);
        }

        @Nullable
        public C0933a f(int i10) {
            int size = this.f77832d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0933a c0933a = this.f77832d.get(i11);
                if (c0933a.f77829a == i10) {
                    return c0933a;
                }
            }
            return null;
        }

        @Nullable
        public b g(int i10) {
            int size = this.f77831c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f77831c.get(i11);
                if (bVar.f77829a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // q6.a
        public String toString() {
            return a.a(this.f77829a) + " leaves: " + Arrays.toString(this.f77831c.toArray()) + " containers: " + Arrays.toString(this.f77832d.toArray());
        }
    }

    /* JADX INFO: compiled from: Atom.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f77833b;

        public b(int i10, a0 a0Var) {
            super(i10);
            this.f77833b = a0Var;
        }
    }

    public a(int i10) {
        this.f77829a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f77829a);
    }
}
