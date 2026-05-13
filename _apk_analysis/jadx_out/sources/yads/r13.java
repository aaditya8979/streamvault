package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class r13 implements ss1 {
    public static final Parcelable.Creator<r13> CREATOR = new q13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94259c;

    public r13(int i10, float f10) {
        this.f94258b = f10;
        this.f94259c = i10;
    }

    public r13(Parcel parcel) {
        this.f94258b = parcel.readFloat();
        this.f94259c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r13.class != obj.getClass()) {
            return false;
        }
        r13 r13Var = (r13) obj;
        return this.f94258b == r13Var.f94258b && this.f94259c == r13Var.f94259c;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f94258b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f94259c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f94258b + ", svcTemporalLayerCount=" + this.f94259c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f94258b);
        parcel.writeInt(this.f94259c);
    }
}
