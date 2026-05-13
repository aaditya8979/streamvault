package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ut extends v21 {
    public static final Parcelable.Creator<ut> CREATOR = new tt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f95779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f95780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v21[] f95781h;

    public ut(Parcel parcel) {
        super("CHAP");
        this.f95776c = (String) ib3.a((Object) parcel.readString());
        this.f95777d = parcel.readInt();
        this.f95778e = parcel.readInt();
        this.f95779f = parcel.readLong();
        this.f95780g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f95781h = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f95781h[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    public ut(String str, int i10, int i11, long j10, long j11, v21[] v21VarArr) {
        super("CHAP");
        this.f95776c = str;
        this.f95777d = i10;
        this.f95778e = i11;
        this.f95779f = j10;
        this.f95780g = j11;
        this.f95781h = v21VarArr;
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut.class != obj.getClass()) {
            return false;
        }
        ut utVar = (ut) obj;
        return this.f95777d == utVar.f95777d && this.f95778e == utVar.f95778e && this.f95779f == utVar.f95779f && this.f95780g == utVar.f95780g && ib3.a(this.f95776c, utVar.f95776c) && Arrays.equals(this.f95781h, utVar.f95781h);
    }

    public final int hashCode() {
        int i10 = (((((((this.f95777d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f95778e) * 31) + ((int) this.f95779f)) * 31) + ((int) this.f95780g)) * 31;
        String str = this.f95776c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f95776c);
        parcel.writeInt(this.f95777d);
        parcel.writeInt(this.f95778e);
        parcel.writeLong(this.f95779f);
        parcel.writeLong(this.f95780g);
        parcel.writeInt(this.f95781h.length);
        for (v21 v21Var : this.f95781h) {
            parcel.writeParcelable(v21Var, 0);
        }
    }
}
