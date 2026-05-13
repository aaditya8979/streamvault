package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83209c;

    public r(@NonNull JSONObject jSONObject) {
        this.f83207a = jSONObject.optInt("w");
        this.f83208b = jSONObject.optInt("h");
        this.f83209c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int a() {
        return this.f83207a;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int b() {
        return this.f83208b;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final String c() {
        return this.f83209c;
    }
}
