package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mg implements ss1 {
    public static final Parcelable.Creator<mg> CREATOR = new lg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92353c;

    public mg(int i10, String str) {
        this.f92352b = i10;
        this.f92353c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.f92352b + ",url=" + this.f92353c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f92353c);
        parcel.writeInt(this.f92352b);
    }
}
