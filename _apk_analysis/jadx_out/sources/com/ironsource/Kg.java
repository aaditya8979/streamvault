package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface Kg {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0365a f29736a = new C0365a(null);

        /* JADX INFO: renamed from: com.ironsource.Kg$a$a, reason: collision with other inner class name */
        public static final class C0365a {
            private C0365a() {
            }

            public /* synthetic */ C0365a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Kg a(boolean z10, @NotNull Dg dg2) {
                tn.p.k(dg2, "waterfallOperations");
                return z10 ? new Ig(dg2) : new Hg(dg2);
            }
        }
    }

    void a();

    void a(@NotNull A a10);

    @NotNull
    Ed b();

    @Nullable
    default A c() {
        return null;
    }
}
