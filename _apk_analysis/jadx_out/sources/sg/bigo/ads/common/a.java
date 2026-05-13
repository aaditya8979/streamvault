package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f81938a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f81939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f81941d;

    private a() {
        this.f81939b = "";
        this.f81940c = true;
    }

    public a(@NonNull Parcel parcel) {
        b(parcel);
    }

    public a(@NonNull String str, boolean z10) {
        this.f81939b = str;
        this.f81940c = z10;
        this.f81941d = r.b();
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f81939b);
        parcel.writeInt(this.f81940c ? 1 : 0);
        parcel.writeLong(this.f81941d);
    }

    public final boolean a() {
        return Math.abs(r.b() - this.f81941d) > r.f82517d.a(1);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f81939b = parcel.readString();
        this.f81940c = parcel.readInt() != 0;
        this.f81941d = parcel.readLong();
    }

    public final String toString() {
        return "{advertisingId='" + this.f81939b + "', isLimitAdTrackingEnabled=" + this.f81940c + ", lastUpdateTime=" + this.f81941d + '}';
    }
}
