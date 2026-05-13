package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<z2> CREATOR = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97360d;

    public z2(String str, String str2, String str3) {
        this.f97358b = str;
        this.f97359c = str2;
        this.f97360d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f97358b);
        parcel.writeString(this.f97359c);
        parcel.writeString(this.f97360d);
    }
}
