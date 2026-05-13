package zn;

import cn.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes11.dex */
public class j implements Iterable<Long>, un.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f98363e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f98366d;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f98364b = j10;
        this.f98365c = ln.c.d(j10, j11, j12);
        this.f98366d = j12;
    }

    public final long f() {
        return this.f98364b;
    }

    public final long g() {
        return this.f98365c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l0 iterator() {
        return new k(this.f98364b, this.f98365c, this.f98366d);
    }
}
