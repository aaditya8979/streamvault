package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.b.c.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.AbstractRunnableC1042b f83619a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b f83620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.common.g f83621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f83622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f83623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.j f83624f;

    public a(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.g gVar) {
        this.f83622d = context;
        this.f83620b = new b(aVar);
        this.f83623e = aVar;
        this.f83624f = jVar;
        this.f83621c = gVar;
    }

    public static /* synthetic */ void a(a aVar) {
        if (aVar.f83620b.b() >= aVar.f83623e.f83605a) {
            aVar.a();
        } else {
            if (aVar.f83620b.c()) {
                return;
            }
            aVar.b();
        }
    }

    public final void a() {
        sg.bigo.ads.core.b.c.b.a(this.f83619a);
        this.f83619a = null;
        final List<sg.bigo.ads.common.g.b.a> listA = this.f83620b.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listA.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f82123c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f83624f.a(map, new j.a() { // from class: sg.bigo.ads.core.b.b.a.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f83620b.a(listA, true);
                        a.this.f83620b.d();
                        if (a.this.f83620b.c()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f83620b.a(listA, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                a.this.f83620b.a(aVar);
                if (TextUtils.isEmpty(a.this.f83621c.P())) {
                    return;
                }
                if (("impression".equals(str) || "clicked".equals(str)) ? false : true) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.a(a.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                a.this.a();
            }
        });
    }

    public final void b() {
        if (this.f83619a != null) {
            return;
        }
        this.f83619a = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(a.this.f83622d)) {
                    a.this.a();
                    return;
                }
                a aVar = a.this;
                aVar.f83619a = null;
                aVar.b();
            }
        }, this.f83623e.f83606b);
    }
}
