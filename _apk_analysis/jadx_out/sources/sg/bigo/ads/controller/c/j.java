package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f83147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f83148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f83149d;

    public j(@NonNull JSONObject jSONObject) {
        this.f83146a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f83147b = jSONObject.optLong("video_impression_time", 0L);
        this.f83148c = jSONObject.optInt("image_impression_area_rate", 0);
        this.f83149d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int a() {
        return this.f83146a;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long b() {
        return this.f83147b;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int c() {
        return this.f83148c;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long d() {
        return this.f83149d;
    }
}
