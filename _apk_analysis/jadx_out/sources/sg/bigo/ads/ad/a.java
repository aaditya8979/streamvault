package sg.bigo.ads.ad;

import android.content.Context;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.ad.a$a, reason: collision with other inner class name */
    public static class C0958a implements AdBid {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f79805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.api.core.b f79806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.core.e.a.b f79807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f79808d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f79809e = false;

        public C0958a(f fVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.core.e.a.b bVar2) {
            this.f79805a = fVar;
            this.f79806b = bVar;
            this.f79807c = bVar2;
        }

        @Override // sg.bigo.ads.api.AdBid
        public final double getPrice() {
            return this.f79806b.ai();
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyLoss(Double d10, String str, int i10) {
            if (this.f79809e) {
                return;
            }
            this.f79809e = true;
            if (d10 != null) {
                this.f79807c.b("first_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f79807c.b("first_bidder", str);
            }
            this.f79807c.b("loss_reason", String.valueOf(i10));
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f83766a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f83767b = false;

                public AnonymousClass4(Context context) {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, this.f83767b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f79806b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str, i10);
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyWin(Double d10, String str) {
            if (this.f79808d) {
                return;
            }
            this.f79808d = true;
            if (d10 != null) {
                this.f79807c.b("sec_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f79807c.b("sec_bidder", str);
            }
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f83763a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f83764b = false;

                public AnonymousClass3(Context context) {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, this.f83764b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f79806b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str);
            f fVar = this.f79805a;
            sg.bigo.ads.core.b.b.a().a("win", sg.bigo.ads.core.b.a.a("win", fVar.f81861b, fVar.f81862c, fVar.f81860a, Integer.valueOf(this.f79806b.aj()), d10 == null ? null : String.valueOf(d10), str, null));
        }
    }
}
