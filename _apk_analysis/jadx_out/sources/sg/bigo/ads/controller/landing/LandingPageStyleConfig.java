package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i10) {
            return new LandingPageStyleConfig[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f83422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<? extends d> f83423g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.f83423g = (Class) parcel.readSerializable();
        this.f83419c = parcel.readInt();
        this.f83417a = parcel.readInt();
        this.f83418b = parcel.readInt();
        this.f83420d = parcel.readInt();
        this.f83421e = parcel.readInt();
        this.f83422f = parcel.readFloat();
    }

    public LandingPageStyleConfig(Class<? extends d> cls, int i10, int i11, int i12, int i13, int i14, float f10) {
        this.f83423g = cls;
        this.f83419c = i10;
        this.f83417a = i11;
        this.f83418b = i12;
        this.f83420d = i13;
        this.f83421e = i14;
        this.f83422f = f10;
    }

    public final boolean a() {
        return this.f83423g != null && this.f83420d > 0;
    }

    public final boolean b() {
        int i10 = this.f83417a;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f83423g);
        parcel.writeInt(this.f83419c);
        parcel.writeInt(this.f83417a);
        parcel.writeInt(this.f83418b);
        parcel.writeInt(this.f83420d);
        parcel.writeInt(this.f83421e);
        parcel.writeFloat(this.f83422f);
    }
}
