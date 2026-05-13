package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n23 extends j23 {
    public static final Parcelable.Creator<n23> CREATOR = new l23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f92718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f92720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f92721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f92722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f92723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f92724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f92725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f92726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f92727n;

    public n23(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f92715b = j10;
        this.f92716c = z10;
        this.f92717d = z11;
        this.f92718e = z12;
        this.f92719f = z13;
        this.f92720g = j11;
        this.f92721h = j12;
        this.f92722i = Collections.unmodifiableList(list);
        this.f92723j = z14;
        this.f92724k = j13;
        this.f92725l = i10;
        this.f92726m = i11;
        this.f92727n = i12;
    }

    public n23(Parcel parcel) {
        this.f92715b = parcel.readLong();
        this.f92716c = parcel.readByte() == 1;
        this.f92717d = parcel.readByte() == 1;
        this.f92718e = parcel.readByte() == 1;
        this.f92719f = parcel.readByte() == 1;
        this.f92720g = parcel.readLong();
        this.f92721h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(m23.a(parcel));
        }
        this.f92722i = Collections.unmodifiableList(arrayList);
        this.f92723j = parcel.readByte() == 1;
        this.f92724k = parcel.readLong();
        this.f92725l = parcel.readInt();
        this.f92726m = parcel.readInt();
        this.f92727n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f92715b);
        parcel.writeByte(this.f92716c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f92717d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f92718e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f92719f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f92720g);
        parcel.writeLong(this.f92721h);
        int size = this.f92722i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            m23 m23Var = (m23) this.f92722i.get(i11);
            parcel.writeInt(m23Var.f92230a);
            parcel.writeLong(m23Var.f92231b);
            parcel.writeLong(m23Var.f92232c);
        }
        parcel.writeByte(this.f92723j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f92724k);
        parcel.writeInt(this.f92725l);
        parcel.writeInt(this.f92726m);
        parcel.writeInt(this.f92727n);
    }
}
