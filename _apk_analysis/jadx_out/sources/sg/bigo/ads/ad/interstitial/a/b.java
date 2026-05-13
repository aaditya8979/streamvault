package sg.bigo.ads.ad.interstitial.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.a.b.a;
import sg.bigo.ads.ad.interstitial.a.b.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f80342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0977b f80343d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.a.a.b f80345f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80341b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a.C0978a f80344e = new a.C0978a();

    public final class a implements b.a {
        private a() {
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a() {
            Runnable runnable = b.this.f80342c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            b.this.f80344e.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f80344e.a(bVar, 0, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b() {
            InterfaceC0977b interfaceC0977b = b.this.f80343d;
            if (interfaceC0977b != null) {
                interfaceC0977b.a();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f80344e.a(bVar, 2, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f80344e.a(bVar, 1, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final boolean c() {
            return false;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f80344e.a(bVar, 5, j10);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0977b {
        void a();
    }

    public b(@NonNull Ad ad2, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable c cVar, @Nullable p pVar) {
        sg.bigo.ads.core.f.a.a next;
        byte b10 = 0;
        a.C1046a c1046aA = null;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
            while (it.hasNext() && ((next = it.next()) == null || (c1046aA = next.a()) == null || !c1046aA.a())) {
            }
        }
        a.C1046a c1046a = c1046aA;
        boolean zS = lVar.s();
        boolean zAc = bVar.ac();
        boolean z10 = c1046a != null && c1046a.a();
        int iX = bVar.x();
        boolean z11 = (zS || bVar.ar()) && zAc && z10 && (iX == 3 || iX == 4 || iX == 12 || iX == 20);
        this.f80340a = z11;
        if (z11) {
            this.f80345f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, cVar, pVar, c1046a, new a(this, b10));
        } else {
            this.f80345f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, null, null, null, null);
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z11);
    }

    public b(@NonNull Ad ad2, @NonNull l lVar, @NonNull a.C1046a c1046a, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable c cVar, @Nullable p pVar) {
        byte b10 = 0;
        boolean z10 = bVar.x() == 3 || bVar.x() == 4 || bVar.x() == 20;
        this.f80340a = z10;
        if (z10) {
            this.f80345f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, cVar, pVar, c1046a, new a(this, b10));
        } else {
            this.f80345f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, null, null, null, null);
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f80345f.f80285i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            this.f80341b = true;
        }
        this.f80345f.a(i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        this.f80345f.a(i10, i11);
    }

    public final void a(Runnable runnable) {
        if (this.f80342c == runnable) {
            this.f80342c = null;
        }
    }

    public final void a(h hVar) {
        this.f80345f.f80283g = hVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        if (this.f80340a) {
            return this.f80345f.a(context);
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f80340a) {
            return this.f80345f.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        this.f80345f.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        this.f80345f.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        this.f80345f.e();
        this.f80343d = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        this.f80345f.f();
    }
}
