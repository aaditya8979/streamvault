package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.a.b;
import sg.bigo.ads.controller.a.b.d;

/* JADX INFO: loaded from: classes7.dex */
public interface f extends c {

    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a f82962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a.b f82963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f82964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.api.a.h f82965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f82966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f82967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f82968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private j f82969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f82970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f82971j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f82972k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f82973l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g f82974m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f82975n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final AtomicBoolean f82976o = new AtomicBoolean(false);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final AtomicBoolean f82977p = new AtomicBoolean(false);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f82978q = new Runnable() { // from class: sg.bigo.ads.controller.a.f.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] run timeout task");
                a.this.b();
            }
        };

        public a(@NonNull sg.bigo.ads.controller.a.a aVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar, @NonNull String str, String str2) {
            sg.bigo.ads.controller.a.a.b bVar;
            this.f82975n = null;
            boolean z10 = false;
            this.f82962a = aVar;
            this.f82964c = gVar;
            this.f82965d = hVar;
            this.f82966e = str;
            this.f82975n = str2;
            str.hashCode();
            if (str.equals("/Ad/GetSDKConfig")) {
                z10 = true;
                bVar = aVar.f82818g;
            } else {
                bVar = !str.equals("/Ad/ReportUniBaina") ? aVar.f82820i : aVar.f82819h;
            }
            this.f82963b = bVar;
            this.f82970i = z10;
        }

        @Override // sg.bigo.ads.common.u.a
        public final String a() {
            g gVar;
            g gVar2;
            String str = this.f82975n;
            if (str != null) {
                return sg.bigo.ads.b.a(str, this.f82966e);
            }
            if (q.a((CharSequence) this.f82967f)) {
                String strV = this.f82964c.v();
                e eVarA = this.f82963b.a(strV, this.f82965d.s());
                sg.bigo.ads.controller.a.a aVar = this.f82962a;
                this.f82971j = aVar.f82815a;
                this.f82972k = aVar.f82816e;
                this.f82973l = aVar.f82817f;
                this.f82968g = eVarA.f82959a;
                this.f82969h = this.f82963b.f82831a;
                d.a.f82955a.a(this.f82966e, this.f82968g, this.f82969h);
                this.f82967f = sg.bigo.ads.b.a(this.f82968g.c() ? this.f82968g.b() : this.f82968g.a(), this.f82966e);
                if (eVarA.f82961c && (gVar2 = this.f82974m) != null) {
                    gVar2.a(this.f82966e);
                }
                if (eVarA.f82960b && (gVar = this.f82974m) != null) {
                    gVar.a(strV, this.f82970i);
                }
            }
            return this.f82967f;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(long j10) {
            if (this.f82977p.compareAndSet(false, true)) {
                sg.bigo.ads.common.n.d.a(3, this.f82978q, j10);
            }
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(g gVar) {
            this.f82974m = gVar;
        }

        @Override // sg.bigo.ads.common.u.a
        public final void b() {
            g gVar;
            boolean zEquals = false;
            if (!this.f82976o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f82978q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail, url is " + this.f82967f);
            sg.bigo.ads.controller.a.a.b bVar = this.f82963b;
            b.C1034b c1034b = bVar.f82832b;
            if (c1034b != null && (zEquals = TextUtils.equals(strD, c1034b.a()))) {
                bVar.f82833c++;
            }
            if (zEquals && (gVar = this.f82974m) != null) {
                gVar.a(this.f82966e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final void c() {
            g gVar;
            boolean z10 = false;
            if (!this.f82976o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f82978q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success, url is " + this.f82967f);
            sg.bigo.ads.controller.a.a.b bVar = this.f82963b;
            b.C1034b c1034b = bVar.f82832b;
            if (c1034b != null) {
                boolean z11 = TextUtils.equals(strD, c1034b.a()) && bVar.f82833c > 0;
                if (z11) {
                    bVar.f82833c = 0;
                }
                z10 = z11;
            }
            if (z10 && (gVar = this.f82974m) != null) {
                gVar.a(this.f82966e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final String d() {
            j jVar = this.f82968g;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.common.u.a
        public final boolean e() {
            j jVar = this.f82968g;
            return jVar != null && jVar.c();
        }

        @Override // sg.bigo.ads.common.u.a
        public final String f() {
            j jVar = this.f82969h;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.controller.a.c
        @Nullable
        public final j g() {
            return this.f82968g;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final boolean h() {
            return this.f82972k;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final String i() {
            return this.f82973l;
        }
    }
}
