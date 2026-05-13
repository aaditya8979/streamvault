package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83145d;

    public i(@NonNull JSONObject jSONObject) {
        this.f83142a = jSONObject.optInt("w");
        this.f83143b = jSONObject.optInt("h");
        this.f83144c = jSONObject.optString("url");
        this.f83145d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int a() {
        return this.f83142a;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int b() {
        return this.f83143b;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final String c() {
        return this.f83144c;
    }
}
