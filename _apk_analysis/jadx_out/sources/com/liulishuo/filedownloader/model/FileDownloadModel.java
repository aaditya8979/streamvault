package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import ia.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class FileDownloadModel implements Parcelable {
    public static final Parcelable.Creator<FileDownloadModel> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f34701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f34702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f34703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f34707m;

    public class a implements Parcelable.Creator<FileDownloadModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel[] newArray(int i10) {
            return new FileDownloadModel[i10];
        }
    }

    public FileDownloadModel() {
        this.f34702h = new AtomicLong();
        this.f34701g = new AtomicInteger();
    }

    public FileDownloadModel(Parcel parcel) {
        this.f34696b = parcel.readInt();
        this.f34697c = parcel.readString();
        this.f34698d = parcel.readString();
        this.f34699e = parcel.readByte() != 0;
        this.f34700f = parcel.readString();
        this.f34701g = new AtomicInteger(parcel.readByte());
        this.f34702h = new AtomicLong(parcel.readLong());
        this.f34703i = parcel.readLong();
        this.f34704j = parcel.readString();
        this.f34705k = parcel.readString();
        this.f34706l = parcel.readInt();
        this.f34707m = parcel.readByte() != 0;
    }

    public void A(byte b10) {
        this.f34701g.set(b10);
    }

    public void B(long j10) {
        this.f34707m = j10 > 2147483647L;
        this.f34703i = j10;
    }

    public void C(String str) {
        this.f34697c = str;
    }

    public ContentValues D() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(g()));
        contentValues.put("url", n());
        contentValues.put("path", h());
        contentValues.put("status", Byte.valueOf(j()));
        contentValues.put("sofar", Long.valueOf(i()));
        contentValues.put(C3978d4.i.f31347l, Long.valueOf(m()));
        contentValues.put("errMsg", e());
        contentValues.put(DownloadModel.ETAG, d());
        contentValues.put("connectionCount", Integer.valueOf(c()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(r()));
        if (r() && f() != null) {
            contentValues.put("filename", f());
        }
        return contentValues;
    }

    public int c() {
        return this.f34706l;
    }

    public String d() {
        return this.f34705k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f34704j;
    }

    public String f() {
        return this.f34700f;
    }

    public int g() {
        return this.f34696b;
    }

    public String h() {
        return this.f34698d;
    }

    public long i() {
        return this.f34702h.get();
    }

    public byte j() {
        return (byte) this.f34701g.get();
    }

    public String k() {
        return f.B(h(), r(), f());
    }

    public String l() {
        if (k() == null) {
            return null;
        }
        return f.C(k());
    }

    public long m() {
        return this.f34703i;
    }

    public String n() {
        return this.f34697c;
    }

    public void o(long j10) {
        this.f34702h.addAndGet(j10);
    }

    public boolean p() {
        return this.f34703i == -1;
    }

    public boolean q() {
        return this.f34707m;
    }

    public boolean r() {
        return this.f34699e;
    }

    public void s() {
        this.f34706l = 1;
    }

    public void t(int i10) {
        this.f34706l = i10;
    }

    public String toString() {
        return f.o("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.f34696b), this.f34697c, this.f34698d, Integer.valueOf(this.f34701g.get()), this.f34702h, Long.valueOf(this.f34703i), this.f34705k, super.toString());
    }

    public void u(String str) {
        this.f34705k = str;
    }

    public void v(String str) {
        this.f34704j = str;
    }

    public void w(String str) {
        this.f34700f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f34696b);
        parcel.writeString(this.f34697c);
        parcel.writeString(this.f34698d);
        parcel.writeByte(this.f34699e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f34700f);
        parcel.writeByte((byte) this.f34701g.get());
        parcel.writeLong(this.f34702h.get());
        parcel.writeLong(this.f34703i);
        parcel.writeString(this.f34704j);
        parcel.writeString(this.f34705k);
        parcel.writeInt(this.f34706l);
        parcel.writeByte(this.f34707m ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f34696b = i10;
    }

    public void y(String str, boolean z10) {
        this.f34698d = str;
        this.f34699e = z10;
    }

    public void z(long j10) {
        this.f34702h.set(j10);
    }
}
