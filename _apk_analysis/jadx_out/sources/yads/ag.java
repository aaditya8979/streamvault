package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ag extends v21 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f87681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f87682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f87683f;

    public ag(Parcel parcel) {
        super("APIC");
        this.f87680c = (String) ib3.a((Object) parcel.readString());
        this.f87681d = parcel.readString();
        this.f87682e = parcel.readInt();
        this.f87683f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public ag(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f87680c = str;
        this.f87681d = str2;
        this.f87682e = i10;
        this.f87683f = bArr;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f87683f;
        int i10 = this.f87682e;
        if (im1Var.f90888j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f90889k, (Object) 3)) {
            im1Var.f90888j = (byte[]) bArr.clone();
            im1Var.f90889k = Integer.valueOf(i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ag.class != obj.getClass()) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f87682e == agVar.f87682e && ib3.a(this.f87680c, agVar.f87680c) && ib3.a(this.f87681d, agVar.f87681d) && Arrays.equals(this.f87683f, agVar.f87683f);
    }

    public final int hashCode() {
        int i10 = (this.f87682e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f87680c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87681d;
        return Arrays.hashCode(this.f87683f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": mimeType=" + this.f87680c + ", description=" + this.f87681d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f87680c);
        parcel.writeString(this.f87681d);
        parcel.writeInt(this.f87682e);
        parcel.writeByteArray(this.f87683f);
    }
}
