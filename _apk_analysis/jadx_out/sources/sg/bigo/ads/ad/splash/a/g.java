package sg.bigo.ads.ad.splash.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.List;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b f81676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.a f81677c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.ad.splash.b f81682h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81675a = c.a.f81639a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81678d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81679e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81680f = false;

    public static class a implements sg.bigo.ads.ad.banner.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f81685a = 13;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f81686b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.ad.splash.b f81687c;

        public a(@NonNull sg.bigo.ads.ad.splash.b bVar) {
            this.f81687c = bVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            this.f81687c.c(this.f81686b);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
            this.f81687c.f81733z.a(iVar, this.f81685a, this.f81686b, dVar);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }
    }

    public g(@NonNull final sg.bigo.ads.ad.splash.b bVar, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar2) {
        int i10 = 0;
        int i11 = 1;
        this.f81681g = 0;
        this.f81682h = bVar;
        sg.bigo.ads.ad.b.b bVar3 = bVar.f81733z;
        boolean z10 = bVar3 instanceof sg.bigo.ads.ad.b.c;
        sg.bigo.ads.ad.interstitial.a.b bVar4 = new sg.bigo.ads.ad.interstitial.a.b(bVar3, lVar, bVar2, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).I : null, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).J : null);
        this.f81676b = bVar4;
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar4.f80340a, bVar3, lVar, bVar2, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).I : null, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).J : null);
        this.f81677c = aVar;
        if (this.f81676b.f80340a) {
            i10 = 1;
        } else if (aVar.f80272a) {
            i10 = 2;
        }
        this.f81681g = i10;
        bVar2.d(i10);
        if (!this.f81676b.f80340a && !(this.f81677c.f80273b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) {
            i11 = 2;
        }
        bVar2.e(i11);
        sg.bigo.ads.ad.interstitial.a.b bVar5 = this.f81676b;
        if (bVar5 != null) {
            bVar5.a(new a(bVar));
            this.f81676b.a(bVar.f80021b.f81865f);
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f81677c;
        if (aVar2 != null) {
            aVar2.a(new a(bVar));
            this.f81677c.a(new c.a() { // from class: sg.bigo.ads.ad.splash.a.g.1
                @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                    bVar.f81733z.a(iVar, 15, 9, dVar);
                }
            });
            this.f81677c.a(bVar.f80021b.f81865f);
        }
    }

    private boolean f() {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f81676b;
        if (bVar == null || !bVar.f80340a || !bVar.b()) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f81676b;
        return (bVar2.f80341b || bVar2.f80345f.f80285i == null) ? false : true;
    }

    private boolean g() {
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f81677c;
        return aVar != null && aVar.f80272a && aVar.b() && this.f81677c.a() != null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    public final void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f81676b;
        if (bVar != null) {
            bVar.a(runnable);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
        if (z10) {
            if (this.f81680f) {
                sg.bigo.ads.ad.interstitial.a.b bVar = this.f81676b;
                if (bVar != null) {
                    bVar.f80345f.c();
                    return;
                }
                return;
            }
            sg.bigo.ads.ad.interstitial.a.a aVar = this.f81677c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (this.f81680f) {
            sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f81676b;
            if (bVar2 != null) {
                bVar2.f80345f.d();
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f81677c;
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        this.f81675a = z10 ? c.a.f81640b : c.a.f81641c;
        if (z10) {
            if (this.f81679e == 2) {
                viewGroup.removeViewAt(1);
            }
            int i11 = 5;
            if (f()) {
                View view = this.f81676b.f80345f.f80285i;
                viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
                if (view != null) {
                    view.setTag(19);
                }
                this.f81676b.a(1);
                this.f81678d = true;
                this.f81680f = true;
            } else {
                View viewA = this.f81677c.a();
                viewGroup.addView(viewA, 1, new FrameLayout.LayoutParams(-1, -1));
                if (viewA != null) {
                    viewA.setTag(20);
                }
                this.f81677c.a(1);
                this.f81678d = true;
                i11 = 7;
            }
            int i12 = this.f81679e == 2 ? 9 : 8;
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f81682h.f81733z.f(), i11, i10);
            this.f81682h.f81733z.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i12, null);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f81675a = c.a.f81642d;
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f81676b;
        if (bVar != null) {
            bVar.e();
            this.f81676b = null;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f81677c;
        if (aVar != null) {
            aVar.e();
            this.f81677c = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f81675a;
    }

    public final boolean e() {
        return f() || g();
    }
}
