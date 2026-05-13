package zn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i extends g implements f<Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98361f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final i f98362g = new i(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final i a() {
            return i.f98362g;
        }
    }

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // zn.g
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (f() != iVar.f() || g() != iVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // zn.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + g();
    }

    @Override // zn.g, zn.f
    public boolean isEmpty() {
        return f() > g();
    }

    public boolean m(int i10) {
        return f() <= i10 && i10 <= g();
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(g());
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(f());
    }

    @Override // zn.g
    @NotNull
    public String toString() {
        return f() + ".." + g();
    }
}
