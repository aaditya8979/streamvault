package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.h;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83141c;

    public h(@NonNull JSONObject jSONObject) {
        this.f83139a = jSONObject.optInt("w");
        this.f83140b = jSONObject.optInt("h");
        this.f83141c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int a() {
        return this.f83139a;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int b() {
        return this.f83140b;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final String c() {
        return this.f83141c;
    }
}
