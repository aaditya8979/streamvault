package sg.bigo.ads.core.b;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.core.b.b.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b f83610i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.core.b.b.a f83611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f83612b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f83613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sg.bigo.ads.core.b.a.a f83614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f83615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.common.j f83616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.common.j f83617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f83618h;

    private b() {
    }

    public static b a() {
        return f83610i;
    }

    public final void a(String str, @NonNull Map<String, Object> map) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        if (!this.f83612b.get()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "please execute init first");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        sg.bigo.ads.core.b.a.a aVar = this.f83614d;
        if (aVar != null && aVar.f83608d) {
            if (this.f83613c == null) {
                this.f83613c = new j(this.f83615e, aVar, this.f83616f, this.f83617g, this.f83618h);
            }
            this.f83613c.a(str, jSONObject);
        } else {
            sg.bigo.ads.core.b.b.a aVar2 = this.f83611a;
            if (aVar2 != null) {
                aVar2.a(str, jSONObject);
            }
        }
    }
}
