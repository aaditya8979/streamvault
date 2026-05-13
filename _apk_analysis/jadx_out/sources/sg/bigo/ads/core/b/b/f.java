package sg.bigo.ads.core.b.b;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.b.c.b;

/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f83643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.j f83644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f83646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.AbstractRunnableC1042b f83647e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f83648f;

    public interface a {
        void a();

        void b();
    }

    public f(g gVar, sg.bigo.ads.common.j jVar, a aVar, Context context, long j10) {
        this.f83648f = aVar;
        this.f83646d = context;
        this.f83645c = j10;
        this.f83643a = gVar;
        this.f83644b = jVar;
    }

    public void a() {
        if (this.f83643a.e()) {
            return;
        }
        d();
    }

    public final void b() {
        g gVar = this.f83643a;
        if (gVar == null) {
            sg.bigo.ads.common.t.a.b("Callback", "sendEventsRightNow but EventStorage null!!");
            return;
        }
        final List<sg.bigo.ads.common.g.b.a> listC = gVar.c();
        if (listC.isEmpty()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "sendEventsRightNow but event list is empty!!");
            return;
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listC.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f82123c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f83644b.a(map, new j.a() { // from class: sg.bigo.ads.core.b.b.f.1
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f83643a.a(listC, true);
                        f.this.f83643a.f();
                        f.this.a();
                        a aVar = f.this.f83648f;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f83643a.a(listC, false);
                        f.this.d();
                        a aVar = f.this.f83648f;
                        if (aVar != null) {
                            aVar.b();
                        }
                    }
                });
            }
        });
    }

    public final void c() {
        sg.bigo.ads.core.b.c.b.a(this.f83647e);
        this.f83647e = null;
    }

    public final void d() {
        if (this.f83647e != null) {
            return;
        }
        this.f83647e = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(f.this.f83646d)) {
                    f.this.b();
                } else {
                    f.this.c();
                    f.this.d();
                }
            }
        }, this.f83645c);
    }
}
