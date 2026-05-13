package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class xc3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xc3> CREATOR = new vc3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc3 f96711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f96712c;

    public xc3(wc3 wc3Var, float f10) {
        this.f96711b = wc3Var;
        this.f96712c = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        wc3 wc3Var = this.f96711b;
        parcel.writeInt(wc3Var != null ? wc3Var.ordinal() : -1);
        parcel.writeFloat(this.f96712c);
    }
}
