package zn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends j implements f<Long> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98371f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final l f98372g = new l(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public l(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (f() != lVar.f() || g() != lVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (f() ^ (f() >>> 32))) + (g() ^ (g() >>> 32)));
    }

    @Override // zn.f
    public boolean isEmpty() {
        return f() > g();
    }

    public boolean j(long j10) {
        return f() <= j10 && j10 <= g();
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(g());
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(f());
    }

    @NotNull
    public String toString() {
        return f() + ".." + g();
    }
}
