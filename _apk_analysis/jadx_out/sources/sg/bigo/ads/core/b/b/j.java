package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.core.b.b.f;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f83658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f83659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f83660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f83661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f83662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.common.g f83663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f83664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f83665h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f83666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f.a f83667j;

    public j(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.j jVar2, sg.bigo.ads.common.g gVar) {
        f.a aVar2 = new f.a() { // from class: sg.bigo.ads.core.b.b.j.1
            @Override // sg.bigo.ads.core.b.b.f.a
            public final void a() {
                j.this.f83660c.f();
                j.this.f83662e.b();
            }

            @Override // sg.bigo.ads.core.b.b.f.a
            public final void b() {
                j.this.f83662e.d();
            }
        };
        this.f83667j = aVar2;
        this.f83666i = context;
        i iVar = new i(aVar);
        this.f83659b = iVar;
        e eVar = new e(aVar);
        this.f83660c = eVar;
        this.f83658a = aVar;
        this.f83663f = gVar;
        this.f83661d = new h(iVar, jVar2, aVar2, context, aVar.f83606b);
        this.f83662e = new d(eVar, jVar, context, aVar.f83606b);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.2
            @Override // java.lang.Runnable
            public final void run() {
                j.this.f83665h = sg.bigo.ads.common.x.a.j();
                j jVar3 = j.this;
                if (jVar3.f83665h == 0) {
                    jVar3.f83665h = System.currentTimeMillis();
                }
                j.this.f83664g = c.a();
                j.a(j.this);
            }
        });
    }

    public static /* synthetic */ void a(j jVar) {
        c cVar = jVar.f83664g;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jVar.f83665h;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = jVar.f83664g;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f83639a, cVar2.f83640b, cVar2.f83641c, cVar2.f83642d);
            jVar.f83665h = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            jVar.f83664g.c();
        }
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                String str2 = str;
                ("impression".equals(str2) || "clicked".equals(str2) ? j.this.f83660c : j.this.f83659b).a(aVar);
                j.a(j.this);
                c cVar = j.this.f83664g;
                if (cVar != null) {
                    cVar.a(str);
                }
                if (TextUtils.isEmpty(j.this.f83663f.P())) {
                    return;
                }
                j.this.f83662e.b();
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                int iD = j.this.f83659b.d();
                j jVar = j.this;
                if (iD >= jVar.f83658a.f83605a) {
                    jVar.f83661d.b();
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    return;
                }
                if (jVar.f83659b.e()) {
                    return;
                }
                j.this.f83661d.d();
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
            }
        });
    }
}
