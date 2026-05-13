package zn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends zn.a implements f<Character> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98349f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f98350g = new c(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (f() != cVar.f() || g() != cVar.g()) {
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
        return (f() * 31) + g();
    }

    @Override // zn.f
    public boolean isEmpty() {
        return p.m(f(), g()) > 0;
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(g());
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(f());
    }

    @NotNull
    public String toString() {
        return f() + ".." + g();
    }
}
