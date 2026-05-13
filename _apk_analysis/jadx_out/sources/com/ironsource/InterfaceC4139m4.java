package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC4139m4 {

    /* JADX INFO: renamed from: com.ironsource.m4$a */
    public static final class a implements InterfaceC4139m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32288a;

        public a(boolean z10) {
            this.f32288a = z10;
        }

        @Override // com.ironsource.InterfaceC4139m4
        public void a() {
            A8.a(C4024fe.f31729x, new C4300v8().a(G5.f29410y, Boolean.valueOf(this.f32288a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$b */
    public static final class b implements InterfaceC4139m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f32290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC4262t4 f32291c;

        public b(boolean z10, long j10, @NotNull InterfaceC4262t4 interfaceC4262t4) {
            tn.p.k(interfaceC4262t4, "currentTimeProvider");
            this.f32289a = z10;
            this.f32290b = j10;
            this.f32291c = interfaceC4262t4;
        }

        @Override // com.ironsource.InterfaceC4139m4
        public void a() {
            C4300v8 c4300v8A = new C4300v8().a(G5.f29410y, Boolean.valueOf(this.f32289a));
            if (this.f32290b > 0) {
                c4300v8A.a(G5.B, Long.valueOf(this.f32291c.a() - this.f32290b));
            }
            A8.a(C4024fe.f31728w, c4300v8A.a());
        }

        @NotNull
        public final InterfaceC4262t4 b() {
            return this.f32291c;
        }
    }

    void a();
}
