package zn;

import cn.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes11.dex */
public class a implements Iterable<Character>, un.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C1120a f98341e = new C1120a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f98342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f98343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98344d;

    /* JADX INFO: renamed from: zn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class C1120a {
        public C1120a() {
        }

        public /* synthetic */ C1120a(tn.i iVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f98342b = c10;
        this.f98343c = (char) ln.c.c(c10, c11, i10);
        this.f98344d = i10;
    }

    public final char f() {
        return this.f98342b;
    }

    public final char g() {
        return this.f98343c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public u iterator() {
        return new b(this.f98342b, this.f98343c, this.f98344d);
    }
}
