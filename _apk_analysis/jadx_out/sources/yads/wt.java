package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wt extends v21 {
    public static final Parcelable.Creator<wt> CREATOR = new vt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f96491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v21[] f96492g;

    public wt(Parcel parcel) {
        super("CTOC");
        this.f96488c = (String) ib3.a((Object) parcel.readString());
        this.f96489d = parcel.readByte() != 0;
        this.f96490e = parcel.readByte() != 0;
        this.f96491f = (String[]) ib3.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f96492g = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f96492g[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    public wt(String str, boolean z10, boolean z11, String[] strArr, v21[] v21VarArr) {
        super("CTOC");
        this.f96488c = str;
        this.f96489d = z10;
        this.f96490e = z11;
        this.f96491f = strArr;
        this.f96492g = v21VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wt.class != obj.getClass()) {
            return false;
        }
        wt wtVar = (wt) obj;
        return this.f96489d == wtVar.f96489d && this.f96490e == wtVar.f96490e && ib3.a(this.f96488c, wtVar.f96488c) && Arrays.equals(this.f96491f, wtVar.f96491f) && Arrays.equals(this.f96492g, wtVar.f96492g);
    }

    public final int hashCode() {
        int i10 = ((((this.f96489d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f96490e ? 1 : 0)) * 31;
        String str = this.f96488c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f96488c);
        parcel.writeByte(this.f96489d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f96490e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f96491f);
        parcel.writeInt(this.f96492g.length);
        for (v21 v21Var : this.f96492g) {
            parcel.writeParcelable(v21Var, 0);
        }
    }
}
