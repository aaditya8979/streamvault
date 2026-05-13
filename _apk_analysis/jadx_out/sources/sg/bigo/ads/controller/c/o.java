package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f83191h;

    public o(@NonNull JSONObject jSONObject) {
        this.f83184a = jSONObject.optString("imageurl");
        this.f83185b = jSONObject.optString("clickurl");
        this.f83186c = jSONObject.optString("longlegaltext");
        this.f83187d = jSONObject.optString("ad_info");
        this.f83188e = jSONObject.optString("ad_link");
        this.f83189f = jSONObject.optInt("percent");
        this.f83190g = jSONObject.optString("rec_rule");
        this.f83191h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String a() {
        return this.f83184a;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String b() {
        return this.f83185b;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String c() {
        return this.f83186c;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String d() {
        return this.f83187d;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String e() {
        return this.f83188e;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final int f() {
        return this.f83189f;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String g() {
        return this.f83190g;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String h() {
        return this.f83191h;
    }
}
