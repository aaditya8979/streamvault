package sg.bigo.ads.ad.interstitial.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.a.b.a;
import sg.bigo.ads.ad.interstitial.a.b.b;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements sg.bigo.ads.ad.interstitial.a.b.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f80272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.a.b.a f80273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.C0978a f80274c = new a.C0978a();

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a$a, reason: collision with other inner class name */
    public final class C0974a implements b.a {
        private C0974a() {
        }

        public /* synthetic */ C0974a(a aVar, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.f80274c.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            a.this.f80274c.a(bVar, 0, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            a.this.f80274c.a(bVar, 2, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            a.this.f80274c.a(bVar, 1, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final boolean c() {
            return true;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            a.this.f80274c.a(bVar, 5, j10);
        }
    }

    public final class b implements c.b {
        private b() {
        }

        public /* synthetic */ b(a aVar, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.f80274c.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            a.this.f80274c.a(bVar, 5, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10, @Nullable String str, int i10, @Nullable String str2) {
            a.this.f80274c.a(bVar, 3, j10, str, i10, str2, null);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10, @Nullable String str, int i10, @Nullable String str2, @Nullable String str3) {
            a.this.f80274c.a(bVar, 4, j10, str, i10, str2, str3);
        }
    }

    public a(boolean z10, @NonNull Ad ad2, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar) {
        a.C1046a c1046a;
        String str;
        sg.bigo.ads.core.f.a.a next;
        byte b10 = 0;
        if (!bVar.ar() && !lVar.t()) {
            str = "render companion disable due to slot switch off";
        } else if (z10) {
            str = "render companion disable due to playable";
        } else if (bVar.x() == 3 || bVar.x() == 4 || bVar.x() == 12 || bVar.x() == 20) {
            a.C1046a c1046aA = null;
            if (pVar != null) {
                Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
                a.C1046a c1046aA2 = null;
                while (it.hasNext() && ((next = it.next()) == null || (((c1046aA = sg.bigo.ads.core.f.a.a.a(next.f83874b)) == null || !c1046aA.a()) && ((c1046aA2 = next.a()) == null || !c1046aA2.a())))) {
                }
                c1046a = c1046aA2;
            } else {
                c1046a = null;
            }
            if (c1046aA != null && c1046aA.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "render companion init with image.");
                this.f80273b = new sg.bigo.ads.ad.interstitial.a.a.c(ad2, bVar, cVar, pVar, new b(this, b10));
            }
            if (this.f80273b == null && c1046a != null && c1046a.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "render companion init with html.");
                this.f80273b = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, cVar, pVar, c1046a, new C0974a(this, b10));
            }
            this.f80272a = this.f80273b != null;
            str = "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " isRenderable: " + this.f80272a;
        } else {
            str = "render companion disable due to invalid type";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", str);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f80272a && (aVar = this.f80273b) != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f80272a && (aVar = this.f80273b) != null) {
            aVar.a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f80272a && (aVar = this.f80273b) != null) {
            aVar.a(i10, i11);
        }
    }

    public final void a(h hVar) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar instanceof sg.bigo.ads.ad.interstitial.a.a.b) {
            ((sg.bigo.ads.ad.interstitial.a.a.b) aVar).f80283g = hVar;
        }
    }

    public final void a(c.a aVar) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar2 = this.f80273b;
        if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.c) {
            ((sg.bigo.ads.ad.interstitial.a.a.c) aVar2).f80310f = aVar;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "tyr to start preload end page resource.");
        if (!this.f80272a) {
            sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "end page resource is unavailable.");
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar != null) {
            return aVar.a(context);
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f80272a && (aVar = this.f80273b) != null) {
            return aVar.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f80273b;
        if (aVar != null) {
            aVar.f();
        }
    }
}
