package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83174c;

    public m(@NonNull JSONObject jSONObject) {
        this.f83172a = jSONObject.optString("vendor_url");
        this.f83173b = jSONObject.optString("vendor_key");
        this.f83174c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String a() {
        return this.f83172a;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String b() {
        return this.f83173b;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String c() {
        return this.f83174c;
    }
}
