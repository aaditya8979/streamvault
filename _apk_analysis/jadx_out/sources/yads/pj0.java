package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pj0 implements Parcelable {
    public static final Parcelable.Creator<pj0> CREATOR = new oj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f93604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f93606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f93607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f93608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f93609h;

    public pj0(Parcel parcel) {
        this.f93603b = (String) ib3.a((Object) parcel.readString());
        this.f93604c = Uri.parse((String) ib3.a((Object) parcel.readString()));
        this.f93605d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((v33) parcel.readParcelable(v33.class.getClassLoader()));
        }
        this.f93606e = Collections.unmodifiableList(arrayList);
        this.f93607f = parcel.createByteArray();
        this.f93608g = parcel.readString();
        this.f93609h = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public pj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = ib3.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            ni.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f93603b = str;
        this.f93604c = uri;
        this.f93605d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f93606e = Collections.unmodifiableList(arrayList);
        this.f93607f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f93608g = str3;
        this.f93609h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : ib3.f90742f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return this.f93603b.equals(pj0Var.f93603b) && this.f93604c.equals(pj0Var.f93604c) && ib3.a(this.f93605d, pj0Var.f93605d) && this.f93606e.equals(pj0Var.f93606e) && Arrays.equals(this.f93607f, pj0Var.f93607f) && ib3.a(this.f93608g, pj0Var.f93608g) && Arrays.equals(this.f93609h, pj0Var.f93609h);
    }

    public final int hashCode() {
        int iHashCode = (this.f93604c.hashCode() + (this.f93603b.hashCode() * 961)) * 31;
        String str = this.f93605d;
        int iHashCode2 = (Arrays.hashCode(this.f93607f) + ((this.f93606e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f93608g;
        return Arrays.hashCode(this.f93609h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f93605d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f93603b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f93603b);
        parcel.writeString(this.f93604c.toString());
        parcel.writeString(this.f93605d);
        parcel.writeInt(this.f93606e.size());
        for (int i11 = 0; i11 < this.f93606e.size(); i11++) {
            parcel.writeParcelable((Parcelable) this.f93606e.get(i11), 0);
        }
        parcel.writeByteArray(this.f93607f);
        parcel.writeString(this.f93608g);
        parcel.writeByteArray(this.f93609h);
    }
}
