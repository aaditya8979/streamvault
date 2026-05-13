package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.a0;
import s7.m0;
import y7.c;

/* JADX INFO: loaded from: classes12.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f21899i;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f21892b = i10;
        this.f21893c = str;
        this.f21894d = str2;
        this.f21895e = i11;
        this.f21896f = i12;
        this.f21897g = i13;
        this.f21898h = i14;
        this.f21899i = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.f21892b = parcel.readInt();
        this.f21893c = (String) m0.j(parcel.readString());
        this.f21894d = (String) m0.j(parcel.readString());
        this.f21895e = parcel.readInt();
        this.f21896f = parcel.readInt();
        this.f21897g = parcel.readInt();
        this.f21898h = parcel.readInt();
        this.f21899i = (byte[]) m0.j(parcel.createByteArray());
    }

    public static PictureFrame b(a0 a0Var) {
        int iN = a0Var.n();
        String strB = a0Var.B(a0Var.n(), c.f87335a);
        String strA = a0Var.A(a0Var.n());
        int iN2 = a0Var.n();
        int iN3 = a0Var.n();
        int iN4 = a0Var.n();
        int iN5 = a0Var.n();
        int iN6 = a0Var.n();
        byte[] bArr = new byte[iN6];
        a0Var.j(bArr, 0, iN6);
        return new PictureFrame(iN, strB, strA, iN2, iN3, iN4, iN5, bArr);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void a(q.b bVar) {
        bVar.G(this.f21899i, this.f21892b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f21892b == pictureFrame.f21892b && this.f21893c.equals(pictureFrame.f21893c) && this.f21894d.equals(pictureFrame.f21894d) && this.f21895e == pictureFrame.f21895e && this.f21896f == pictureFrame.f21896f && this.f21897g == pictureFrame.f21897g && this.f21898h == pictureFrame.f21898h && Arrays.equals(this.f21899i, pictureFrame.f21899i);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21892b) * 31) + this.f21893c.hashCode()) * 31) + this.f21894d.hashCode()) * 31) + this.f21895e) * 31) + this.f21896f) * 31) + this.f21897g) * 31) + this.f21898h) * 31) + Arrays.hashCode(this.f21899i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f21893c + ", description=" + this.f21894d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21892b);
        parcel.writeString(this.f21893c);
        parcel.writeString(this.f21894d);
        parcel.writeInt(this.f21895e);
        parcel.writeInt(this.f21896f);
        parcel.writeInt(this.f21897g);
        parcel.writeInt(this.f21898h);
        parcel.writeByteArray(this.f21899i);
    }
}
