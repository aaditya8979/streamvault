package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements sg.bigo.ads.api.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f81885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f81887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f81888d;

    public j(@NonNull JSONObject jSONObject) {
        this.f81885a = jSONObject.optInt("w");
        this.f81886b = jSONObject.optInt("h");
        this.f81887c = jSONObject.optString("url");
        this.f81888d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f81885a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.f81886b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.f81887c;
    }
}
