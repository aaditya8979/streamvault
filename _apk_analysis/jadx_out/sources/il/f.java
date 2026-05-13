package il;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CharArrayPool.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wl.f<char[]> f64312a;

    /* JADX INFO: compiled from: CharArrayPool.kt */
    public static final class a extends wl.e<char[]> {
        @Override // wl.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public char[] E() {
            return new char[2048];
        }
    }

    /* JADX INFO: compiled from: CharArrayPool.kt */
    public static final class b extends wl.d<char[]> {
        public b() {
            super(4096);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public char[] h() {
            return new char[2048];
        }
    }

    static {
        f64312a = e.a() ? new a() : new b();
    }

    @NotNull
    public static final wl.f<char[]> a() {
        return f64312a;
    }
}
