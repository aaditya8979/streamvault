package sg.bigo.ads.common.s;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f82380a = r.f82516c.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f82382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f82383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f82384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f82385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f82386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f82387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f82388i;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b10) {
        this.f82382c = false;
        this.f82381b = context;
        this.f82388i = 0L;
    }

    public a(@NonNull Context context, @NonNull Parcel parcel) {
        this.f82382c = false;
        this.f82381b = context;
        b(parcel);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.f82383d);
        parcel.writeDouble(this.f82384e);
        parcel.writeString(this.f82385f);
        parcel.writeString(this.f82386g);
        parcel.writeString(this.f82387h);
        parcel.writeLong(this.f82388i);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f82383d = parcel.readDouble();
        this.f82384e = parcel.readDouble();
        this.f82385f = parcel.readString();
        this.f82386g = parcel.readString();
        this.f82387h = parcel.readString();
        this.f82388i = parcel.readLong();
    }

    public final String toString() {
        return "{longitude=" + this.f82383d + ", latitude=" + this.f82384e + ", countryCode='" + this.f82385f + "', state='" + this.f82386g + "', city='" + this.f82387h + "', updateTime='" + this.f82388i + "'}";
    }
}
