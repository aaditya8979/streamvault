package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f81136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f81137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f81139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<a> f81141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f81143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet<String> f81144i = new HashSet<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81151b;

        private a(String str) {
            this.f81150a = str;
            this.f81151b = 0;
        }

        public /* synthetic */ a(String str, byte b10) {
            this(str);
        }
    }

    private b(@NonNull sg.bigo.ads.ad.b.b bVar, m mVar, d dVar, int i10, c cVar, boolean z10, boolean z11, List<a> list) {
        this.f81143h = bVar;
        this.f81136a = mVar;
        this.f81137b = dVar;
        this.f81139d = cVar;
        this.f81138c = z10;
        this.f81140e = z11;
        this.f81141f = list;
        this.f81142g = i10;
    }

    @Nullable
    public static b a(sg.bigo.ads.ad.b.b bVar, m mVar) {
        if (bVar == null || mVar == null) {
            return null;
        }
        switch (mVar.a("endpage.ad_component_layout")) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return a(bVar, mVar, mVar.a("endpage.multi_img_load"), d.a(mVar.a("endpage.multi_img")), c.a(mVar.a("endpage.multi_render_way")), true, true);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[PHI: r4
      0x000b: PHI (r4v12 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v3 java.util.ArrayList), (r4v0 java.util.ArrayList) binds: [B:40:0x00ae, B:42:0x00b2, B:4:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static sg.bigo.ads.ad.interstitial.multi_img.b a(@androidx.annotation.NonNull sg.bigo.ads.ad.b.b r10, @androidx.annotation.NonNull sg.bigo.ads.api.a.m r11, int r12, sg.bigo.ads.ad.interstitial.multi_img.d r13, sg.bigo.ads.ad.interstitial.multi_img.c r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.b.a(sg.bigo.ads.ad.b.b, sg.bigo.ads.api.a.m, int, sg.bigo.ads.ad.interstitial.multi_img.d, sg.bigo.ads.ad.interstitial.multi_img.c, boolean, boolean):sg.bigo.ads.ad.interstitial.multi_img.b");
    }

    @Nullable
    public static b b(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        d dVar;
        c cVar;
        int iA;
        if (bVar == null || mVar == null) {
            return null;
        }
        int iA2 = mVar.a("video_play_page.multi_img_load");
        switch (mVar.a("video_play_page.ad_component_layout")) {
            case 13:
            case 18:
                dVar = d.TILE;
                cVar = c.FILL_MATCH_SELF;
                iA = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                d dVarA = d.a(mVar.a("video_play_page.multi_img"));
                c cVarA = c.a(mVar.a("video_play_page.multi_render_way"));
                iA = mVar.a("video_play_page.multi_method");
                dVar = dVarA;
                cVar = cVarA;
                break;
            default:
                return null;
        }
        return a(bVar, mVar, iA2, dVar, cVar, iA == 1, false);
    }

    public static b c(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        return a(bVar, mVar, mVar.a("video_play_page.multi_img_load", 1), d.a(mVar.a("video_play_page.multi_img")), c.FILL_MATCH_SELF, true, false);
    }

    @NonNull
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (k.a((Collection) this.f81141f)) {
            return arrayList;
        }
        Iterator<a> it = this.f81141f.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f81150a);
        }
        return arrayList;
    }

    public final void a(final int i10, final int i11) {
        String str = i10 + "_" + i11;
        if (this.f81144i.contains(str)) {
            return;
        }
        this.f81144i.add(str);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.1
            /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.b] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                int i13;
                int i14;
                String[] strArrE;
                int length = 0;
                if (k.a((Collection) b.this.f81141f)) {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                } else {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    for (a aVar : b.this.f81141f) {
                        String str2 = aVar.f81150a;
                        if (!sg.bigo.ads.common.p.e.a(b.this.f81143h.f80021b.f81864e, str2)) {
                            if (!h.a.f82370a.a(str2)) {
                                int i18 = aVar.f81151b;
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        i17++;
                                    }
                                }
                            }
                            i15++;
                        }
                        i16++;
                    }
                    i12 = i15;
                    i13 = i16;
                    i14 = i17;
                }
                ?? F = b.this.f81143h.f();
                int i19 = i10;
                int i20 = i11;
                b.d popPage = b.this.f81143h.getPopPage();
                if (popPage != null && (strArrE = popPage.e()) != null) {
                    length = strArrE.length;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) F, i19, i20, length, i12, i13, i14);
            }
        });
    }

    public final void a(String str, int i10) {
        if (k.a((Collection) this.f81141f) || q.a((CharSequence) str)) {
            return;
        }
        for (a aVar : this.f81141f) {
            if (str.equalsIgnoreCase(aVar.f81150a)) {
                aVar.f81151b = i10;
                return;
            }
        }
    }

    public final void b() {
        if (k.a((Collection) this.f81141f)) {
            return;
        }
        for (final a aVar : this.f81141f) {
            String str = aVar.f81150a;
            if (!sg.bigo.ads.common.p.e.a(this.f81143h.f80021b.f81864e, str)) {
                if (h.a.f82370a.a(str)) {
                    return;
                }
                sg.bigo.ads.ad.b.b bVar = this.f81143h;
                sg.bigo.ads.common.p.e.a(bVar.f80021b.f81864e, str, ((sg.bigo.ads.core.a.a) bVar.f()).al(), new g() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str2, String str3) {
                        aVar.f81151b = 2;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        aVar.f81151b = 1;
                    }
                });
            }
        }
    }
}
