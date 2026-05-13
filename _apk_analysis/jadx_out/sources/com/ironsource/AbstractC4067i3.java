package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4067i3 implements InterfaceC4198p7 {

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    public static final class a extends AbstractC4067i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f31915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b bVar) {
            super(null);
            tn.p.k(bVar, "firstReason");
            this.f31915a = bVar;
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f31915a;
            }
            return aVar.a(bVar);
        }

        @NotNull
        public final a a(@NotNull b bVar) {
            tn.p.k(bVar, "firstReason");
            return new a(bVar);
        }

        @NotNull
        public final b d() {
            return this.f31915a;
        }

        @NotNull
        public final b e() {
            return this.f31915a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && tn.p.f(this.f31915a, ((a) obj).f31915a);
        }

        public int hashCode() {
            return this.f31915a.hashCode();
        }

        @NotNull
        public String toString() {
            return "First(firstReason=" + this.f31915a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    public static abstract class b implements InterfaceC4198p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f31916a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$b, reason: collision with other inner class name */
        public static final class C0386b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0386b f31917a = new C0386b();

            private C0386b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f31918a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4198p7
        @NotNull
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0386b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    public static final class c extends AbstractC4067i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f31919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f31920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, @NotNull d dVar) {
            super(null);
            tn.p.k(dVar, "recurringReason");
            this.f31919a = j10;
            this.f31920b = dVar;
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f31919a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f31920b;
            }
            return cVar.a(j10, dVar);
        }

        @NotNull
        public final c a(long j10, @NotNull d dVar) {
            tn.p.k(dVar, "recurringReason");
            return new c(j10, dVar);
        }

        public final long d() {
            return this.f31919a;
        }

        @NotNull
        public final d e() {
            return this.f31920b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f31919a == cVar.f31919a && tn.p.f(this.f31920b, cVar.f31920b);
        }

        @NotNull
        public final d f() {
            return this.f31920b;
        }

        public final long g() {
            return this.f31919a;
        }

        public int hashCode() {
            return (Long.hashCode(this.f31919a) * 31) + this.f31920b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Recurring(reloadDuration=" + this.f31919a + ", recurringReason=" + this.f31920b + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    public static abstract class d implements InterfaceC4198p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$d$a */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f31921a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$b */
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f31922a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$c */
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f31923a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$d, reason: collision with other inner class name */
        public static final class C0387d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0387d f31924a = new C0387d();

            private C0387d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$e */
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f31925a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$f */
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f31926a;

            public f(long j10) {
                super(null);
                this.f31926a = j10;
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f31926a;
                }
                return fVar.a(j10);
            }

            @NotNull
            public final f a(long j10) {
                return new f(j10);
            }

            public final long c() {
                return this.f31926a;
            }

            public final long d() {
                return this.f31926a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f31926a == ((f) obj).f31926a;
            }

            public int hashCode() {
                return Long.hashCode(this.f31926a);
            }

            @NotNull
            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f31926a + ")";
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$g */
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f31927a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$h */
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f31928a = new h();

            private h() {
                super(null);
            }
        }

        private d() {
        }

        public /* synthetic */ d(tn.i iVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4198p7
        @NotNull
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0387d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }
    }

    private AbstractC4067i3() {
    }

    public /* synthetic */ AbstractC4067i3(tn.i iVar) {
        this();
    }

    @Override // com.ironsource.InterfaceC4198p7
    @NotNull
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }
}
