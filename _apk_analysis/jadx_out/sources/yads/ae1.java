package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ae1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ae1> CREATOR = new zd1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87672d;

    public ae1(String str, String str2, boolean z10) {
        this.f87670b = str;
        this.f87671c = str2;
        this.f87672d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1)) {
            return false;
        }
        ae1 ae1Var = (ae1) obj;
        return tn.p.f(this.f87670b, ae1Var.f87670b) && tn.p.f(this.f87671c, ae1Var.f87671c) && this.f87672d == ae1Var.f87672d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87672d) + k4.a(this.f87671c, this.f87670b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.f87670b + ", url=" + this.f87671c + ", browserOptional=" + this.f87672d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f87670b);
        parcel.writeString(this.f87671c);
        parcel.writeInt(this.f87672d ? 1 : 0);
    }
}
