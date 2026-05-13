package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f82850d = r.f82516c.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f82851e = r.f82515b.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f82852f = r.f82514a.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f82855i;

    public c(@NonNull String str) {
        super(str, "");
        this.f82855i = f82850d;
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.f82855i);
        parcel.writeLong(this.f82853g);
        parcel.writeLong(this.f82854h);
    }

    @Override // sg.bigo.ads.controller.a.a.b
    public final void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        super.a(jSONObject, z10, str, i10);
        this.f82855i = Math.max(jSONObject.optLong("interval", f82850d / 1000) * 1000, f82852f);
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        super.b(parcel);
        this.f82855i = n.a(parcel, f82850d);
        this.f82853g = n.a(parcel, 0L);
        this.f82854h = n.a(parcel, 0L);
    }

    public final boolean b() {
        long j10 = this.f82853g;
        long j11 = this.f82854h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j10 > j11 ? Math.abs(jCurrentTimeMillis - this.f82853g) > f82851e : Math.abs(jCurrentTimeMillis - this.f82854h) > this.f82855i;
    }
}
