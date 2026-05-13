package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
final class a implements sg.bigo.ads.api.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f82995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f82998g;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f82992a);
        parcel.writeString(this.f82993b);
        parcel.writeString(this.f82994c);
        parcel.writeString(this.f82995d);
        parcel.writeString(this.f82996e);
        parcel.writeString(this.f82997f);
        parcel.writeString(this.f82998g);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f82992a = parcel.readLong();
        this.f82993b = parcel.readString();
        this.f82994c = parcel.readString();
        this.f82995d = parcel.readString();
        this.f82996e = parcel.readString();
        this.f82997f = parcel.readString();
        this.f82998g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        return "{expressId=" + this.f82992a + ", name='" + this.f82993b + "', url='" + this.f82994c + "', md5='" + this.f82995d + "', style='" + this.f82996e + "', adTypes='" + this.f82997f + "', fileId='" + this.f82998g + "'}";
    }
}
