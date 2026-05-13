package sg.bigo.ads.core.d.b;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.d.a.a;
import sg.bigo.ads.core.d.c.a;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.core.d.a.a f83717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.b f83718b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f83719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f83720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f83721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f83722f;

    public b(Context context, sg.bigo.ads.core.d.a.a aVar, j jVar, g gVar) {
        this.f83721e = context;
        this.f83719c = new c(aVar);
        this.f83717a = aVar;
        this.f83722f = jVar;
        this.f83720d = gVar;
    }

    public static /* synthetic */ void a(b bVar) {
        if (bVar.f83719c.b() >= bVar.f83717a.f83706a) {
            bVar.a();
        } else {
            bVar.b();
        }
    }

    public static a b(String str, Map<String, String> map) {
        return new a(str, map);
    }

    public final void a() {
        sg.bigo.ads.core.d.c.a.a(this.f83718b);
        this.f83718b = null;
        final List<sg.bigo.ads.common.g.b.b> listA = this.f83719c.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (sg.bigo.ads.common.g.b.b bVar : listA) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", bVar.f82129b);
                jSONObject.put("event_info", bVar.f82130c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap map = new HashMap();
        map.put("sdk_events", jSONArray);
        this.f83722f.a(map, new j.a() { // from class: sg.bigo.ads.core.d.b.b.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f83719c.a(listA, true);
                        b.this.f83719c.d();
                        b.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f83719c.a(listA, false);
                        b.this.b();
                    }
                });
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final Map<String, String> map) {
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                a.C1044a c1044a = b.this.f83717a.f83708c.get(str);
                boolean z10 = c1044a == null ? true : c1044a.f83711c;
                a.C1044a c1044a2 = b.this.f83717a.f83708c.get(str);
                long jCurrentTimeMillis = ((long) (c1044a2 == null ? 3600000 : c1044a2.f83712d)) + System.currentTimeMillis();
                a aVarB = b.b(str, map);
                b bVar = b.this;
                bVar.f83719c.a(aVarB.a(bVar.f83720d, jCurrentTimeMillis));
                if (z10) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendDefer -> eventId=" + str + ", events=" + map);
                    b.a(b.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendImmediately -> eventId=" + str + ", events=" + map);
                b.this.a();
            }
        });
    }

    public final void b() {
        if (this.f83718b != null) {
            return;
        }
        if (this.f83719c.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Stats", "no events waitting for sending");
        } else {
            this.f83718b = sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.common.aa.c.b(b.this.f83721e)) {
                        b.this.a();
                        return;
                    }
                    b bVar = b.this;
                    bVar.f83718b = null;
                    bVar.b();
                }
            }, this.f83717a.f83707b);
        }
    }
}
