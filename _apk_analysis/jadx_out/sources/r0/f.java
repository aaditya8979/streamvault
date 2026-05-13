package r0;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.e;
import r0.r;

/* JADX INFO: compiled from: CastControlImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e.a f78520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e.c f78521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e.b f78522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78523d;

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class a implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f78525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.a<?, ?, ?> f78526c;

        public a(o oVar, qr.a<?, ?, ?> aVar) {
            this.f78525b = oVar;
            this.f78526c = aVar;
        }

        @Override // r0.r
        public void a(String str) {
            if (f.this.d()) {
                return;
            }
            this.f78525b.a(this.f78526c);
        }

        @Override // r0.r
        public void b(String str) {
            if (f.this.d()) {
                return;
            }
            this.f78525b.c(this.f78526c);
        }

        @Override // r0.r
        public void c(String str, ds.b<?> bVar) {
            tn.p.k(bVar, "event");
            if (f.this.d()) {
                return;
            }
            this.f78525b.b(bVar);
        }

        @Override // r0.r
        public void d(String str) {
            if (f.this.d()) {
                return;
            }
            this.f78525b.a(this.f78526c);
        }
    }

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class b implements r {
        @Override // r0.r
        public void a(String str) {
            r.a.c(this, str);
        }

        @Override // r0.r
        public void b(String str) {
            r.a.b(this, str);
        }

        @Override // r0.r
        public void c(String str, ds.b<?> bVar) {
            r.a.d(this, str, bVar);
        }

        @Override // r0.r
        public void d(String str) {
            r.a.a(this, str);
        }
    }

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class c implements r {
        @Override // r0.r
        public void a(String str) {
            r.a.c(this, str);
        }

        @Override // r0.r
        public void b(String str) {
            r.a.b(this, str);
        }

        @Override // r0.r
        public void c(String str, ds.b<?> bVar) {
            r.a.d(this, str, bVar);
        }

        @Override // r0.r
        public void d(String str) {
            r.a.a(this, str);
        }
    }

    public f(@NotNull hr.b bVar, @NotNull qr.a<?, ?, ?> aVar, @NotNull o oVar) {
        tn.p.k(bVar, "controlPoint");
        tn.p.k(aVar, C3978d4.i.G);
        tn.p.k(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q0.a aVar2 = q0.a.f77565b;
        e.a aVar3 = new e.a(bVar, aVar.j(aVar2.l()));
        this.f78520a = aVar3;
        aVar3.q(new a(oVar, aVar), new bs.a());
        e.c cVar = new e.c(bVar, aVar.j(aVar2.n()));
        this.f78521b = cVar;
        cVar.q(new b(), new hs.i());
        e.b bVar2 = new e.b(bVar, aVar.j(aVar2.m()));
        this.f78522c = bVar2;
        bVar2.q(new c(), new bs.a());
    }

    @Override // r0.b
    public void a(@NotNull String str, @Nullable p<bn.r> pVar) {
        tn.p.k(str, "speed");
        this.f78520a.a(str, pVar);
    }

    @Override // r0.b
    public void b(@Nullable p<bn.r> pVar) {
        this.f78520a.b(pVar);
    }

    @Override // r0.b
    public void c(@NotNull String str, @NotNull String str2, @Nullable p<bn.r> pVar) {
        tn.p.k(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        tn.p.k(str2, "title");
        this.f78520a.c(str, str2, pVar);
    }

    public final boolean d() {
        return this.f78523d;
    }

    public final void e(boolean z10) {
        this.f78523d = z10;
    }
}
