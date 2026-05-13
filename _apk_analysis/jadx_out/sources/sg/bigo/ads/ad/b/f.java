package sg.bigo.ads.ad.b;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes6.dex */
public final class f<T extends Ad> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public T f79922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public Context f79923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.core.a.a f79924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f79925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public d.a<T> f79926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.core.g.c f79927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.a f79928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.d f79929h;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.f$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f79930a;

        public AnonymousClass1(int i10) {
            this.f79930a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f79930a;
            if (i10 != 0) {
                f fVar = f.this;
                fVar.f79926e.a(fVar.f79922a, 1006, i10, "Invalid VPAID media files.");
                return;
            }
            f.this.f79928g = new b.a() { // from class: sg.bigo.ads.ad.b.f.1.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i11) {
                    f fVar2 = f.this;
                    if (fVar2.f79925d == null) {
                        fVar2.f79926e.a(fVar2.f79922a, 1006, 10075, "VPAID video config is empty.");
                    } else {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.f.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(f.this.f79924c.x());
                                bVarB.f81834c = false;
                                f fVar3 = f.this;
                                p pVar = fVar3.f79925d;
                                int i12 = pVar.f83969x;
                                int i13 = pVar.f83968w;
                                f fVar4 = f.this;
                                fVar3.f79929h = new sg.bigo.ads.core.player.b.d(fVar4.f79923b, i12, i13, bVarB, fVar4.f79924c);
                                f fVar5 = f.this;
                                fVar5.f79929h.setOnEventListener(fVar5.f79927f);
                            }
                        });
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i11) {
                    f fVar2 = f.this;
                    fVar2.f79926e.a(fVar2.f79922a, 1006, i11, "Failed to download VPAID.");
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            f fVar2 = f.this;
            bVarA.a(fVar2.f79923b, fVar2.f79924c, fVar2.f79928g);
        }
    }

    public f(@NonNull Context context, sg.bigo.ads.core.g.c cVar, @NonNull sg.bigo.ads.core.a.a aVar, p pVar, @NonNull d.a<T> aVar2, @NonNull T t10) {
        this.f79923b = context;
        this.f79927f = cVar;
        this.f79924c = aVar;
        this.f79925d = pVar;
        this.f79926e = aVar2;
        this.f79922a = t10;
    }

    public final boolean a() {
        return this.f79924c.at() == 1;
    }
}
