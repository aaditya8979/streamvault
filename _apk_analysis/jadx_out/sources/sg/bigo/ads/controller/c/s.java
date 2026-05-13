package sg.bigo.ads.controller.c;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements n.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f83210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f83212c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f83213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f83214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f83215f;

    public s(@NonNull JSONObject jSONObject) {
        this.f83210a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f83211b = jSONObject.optInt("play_ad_threshold", 50);
        this.f83213d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f83214e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final long a() {
        return this.f83215f;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(long j10) {
        this.f83215f = j10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(boolean z10) {
        this.f83212c = z10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean b() {
        return this.f83210a;
    }

    @Override // sg.bigo.ads.api.core.n.d
    @IntRange(from = 1, to = 100)
    public final int c() {
        if (!this.f83210a) {
            return 100;
        }
        long j10 = this.f83215f;
        if (j10 <= this.f83213d) {
            return 100;
        }
        long j11 = this.f83214e;
        return j10 <= j11 ? this.f83211b : j10 < (3 * j11) / 2 ? (int) ((((long) this.f83211b) * j11) / j10) : (this.f83211b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean d() {
        return this.f83212c;
    }
}
