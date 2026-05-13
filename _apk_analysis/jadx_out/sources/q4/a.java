package q4;

import a6.t;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Atom.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77662a;

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Atom.java */
    public static final class C0930a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f77664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<C0930a> f77665d;

        public C0930a(int i10, long j10) {
            super(i10);
            this.f77663b = j10;
            this.f77664c = new ArrayList();
            this.f77665d = new ArrayList();
        }

        public void d(C0930a c0930a) {
            this.f77665d.add(c0930a);
        }

        public void e(b bVar) {
            this.f77664c.add(bVar);
        }

        @Nullable
        public C0930a f(int i10) {
            int size = this.f77665d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0930a c0930a = this.f77665d.get(i11);
                if (c0930a.f77662a == i10) {
                    return c0930a;
                }
            }
            return null;
        }

        @Nullable
        public b g(int i10) {
            int size = this.f77664c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f77664c.get(i11);
                if (bVar.f77662a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // q4.a
        public String toString() {
            return a.a(this.f77662a) + " leaves: " + Arrays.toString(this.f77664c.toArray()) + " containers: " + Arrays.toString(this.f77665d.toArray());
        }
    }

    /* JADX INFO: compiled from: Atom.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f77666b;

        public b(int i10, t tVar) {
            super(i10);
            this.f77666b = tVar;
        }
    }

    public a(int i10) {
        this.f77662a = i10;
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
        return a(this.f77662a);
    }
}
