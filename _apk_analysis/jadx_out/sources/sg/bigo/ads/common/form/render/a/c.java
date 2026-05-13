package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.form.render.c;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements a.InterfaceC1015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public Context f82061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f82062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f82063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.c[] f82064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f82065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PrivacyCheckBox f82066f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.a f82068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private Map<String, String> f82069i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<a> f82067g = new ArrayList();

    public c(@NonNull e eVar, @Nullable Map<String, Object> map, @NonNull Context context, c.a aVar) {
        this.f82061a = context;
        this.f82063c = eVar;
        this.f82062b = map;
        this.f82064d = eVar.m();
        this.f82068h = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f82069i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.common.form.render.a.a.InterfaceC1015a
    public final void a(String str, String str2) {
        this.f82069i.put(str, str2);
        c.a aVar = this.f82068h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean b() {
        PrivacyCheckBox privacyCheckBox = this.f82066f;
        return privacyCheckBox != null && privacyCheckBox.f82596a;
    }
}
