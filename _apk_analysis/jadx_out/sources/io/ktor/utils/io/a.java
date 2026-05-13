package io.ktor.utils.io;

import hn.c;
import no.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteReadChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0847a f71266a = C0847a.f71267a;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteReadChannel.kt */
    public static final class C0847a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0847a f71267a = new C0847a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f71268b = new C0848a();

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteReadChannel.kt */
        public static final class C0848a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f71269b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final r f71270c = new no.a();

            @Override // io.ktor.utils.io.a, sl.f
            public void a(Throwable th2) {
            }

            @Override // io.ktor.utils.io.a, sl.f
            public Throwable b() {
                return this.f71269b;
            }

            @Override // io.ktor.utils.io.a
            public r f() {
                return this.f71270c;
            }

            @Override // io.ktor.utils.io.a
            public Object g(int i10, c<? super Boolean> cVar) {
                return jn.a.a(false);
            }

            @Override // io.ktor.utils.io.a
            public boolean h() {
                return true;
            }
        }

        @NotNull
        public final a a() {
            return f71268b;
        }
    }

    /* JADX INFO: compiled from: ByteReadChannel.kt */
    public static final class b {
        public static /* synthetic */ Object a(a aVar, int i10, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return aVar.g(i10, cVar);
        }
    }

    void a(@Nullable Throwable th2);

    @Nullable
    Throwable b();

    @NotNull
    r f();

    @Nullable
    Object g(int i10, @NotNull c<? super Boolean> cVar);

    boolean h();
}
