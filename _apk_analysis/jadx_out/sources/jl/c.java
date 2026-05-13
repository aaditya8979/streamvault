package jl;

import bn.r;
import gl.f;
import gl.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: OutgoingContent.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: OutgoingContent.kt */
    public static abstract class a extends c {
        public a() {
            super(null);
        }

        @NotNull
        public abstract byte[] d();
    }

    /* JADX INFO: compiled from: OutgoingContent.kt */
    public static abstract class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f72485a;

        @Override // jl.c
        @Nullable
        public Long a() {
            return this.f72485a.a();
        }

        @Override // jl.c
        @Nullable
        public f b() {
            return this.f72485a.b();
        }

        @Override // jl.c
        @NotNull
        public m c() {
            return this.f72485a.c();
        }

        @NotNull
        public final c d() {
            return this.f72485a;
        }
    }

    /* JADX INFO: renamed from: jl.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OutgoingContent.kt */
    public static abstract class AbstractC0854c extends c {
        public AbstractC0854c() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OutgoingContent.kt */
    public static abstract class d extends c {
        public d() {
            super(null);
        }

        @NotNull
        public abstract io.ktor.utils.io.a d();
    }

    /* JADX INFO: compiled from: OutgoingContent.kt */
    public static abstract class e extends c {
        public e() {
            super(null);
        }

        @Nullable
        public abstract Object d(@NotNull sl.f fVar, @NotNull hn.c<? super r> cVar);
    }

    public c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    @Nullable
    public Long a() {
        return null;
    }

    @Nullable
    public f b() {
        return null;
    }

    @NotNull
    public m c() {
        return m.f62560a.a();
    }
}
