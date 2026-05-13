package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pair<String, Integer> f82956a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l.a f82957i;

    public e(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
        this.f82956a = null;
        this.f82957i = new l.a() { // from class: sg.bigo.ads.controller.a.b.e.1
            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                e.this.f82944h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f82956a, c.a(i12));
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                e.this.f82944h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f82956a, false);
            }
        };
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(Pair<String, Integer> pair) {
        if (pair == null) {
            return;
        }
        this.f82944h.set(true);
        this.f82956a = pair;
        sg.bigo.ads.controller.a.b bVar = this.f82938b;
        String str = (String) pair.first;
        l.a aVar = this.f82957i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l lVar = new l(bVar.f82892b, bVar, new l.a() { // from class: sg.bigo.ads.controller.a.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sg.bigo.ads.controller.a.a.c f82906a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l.a f82907b;

            public AnonymousClass3(sg.bigo.ads.controller.a.a.c cVar, l.a aVar2) {
                cVar = cVar;
                aVar = aVar2;
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str2, int i10, int i11, int i12, @NonNull String str3, @Nullable Map<String, Object> map) {
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i10, i11, i12, str3, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str2, int i10, String str3, @Nullable Map<String, Object> map) {
                cVar.f82854h = System.currentTimeMillis();
                b.this.f82891a.a(0L);
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i10, str3, map);
                }
            }
        });
        lVar.f83387i = str;
        lVar.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f82938b.f82891a.f82818g;
    }
}
