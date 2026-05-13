package com.google.android.exoplayer.extractor.mp4;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20150e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f20147b = (String) k0.i(parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.f20148c = bArr;
        parcel.readByteArray(bArr);
        this.f20149d = parcel.readInt();
        this.f20150e = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f20147b = str;
        this.f20148c = bArr;
        this.f20149d = i10;
        this.f20150e = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f20147b.equals(mdtaMetadataEntry.f20147b) && Arrays.equals(this.f20148c, mdtaMetadataEntry.f20148c) && this.f20149d == mdtaMetadataEntry.f20149d && this.f20150e == mdtaMetadataEntry.f20150e;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20147b.hashCode()) * 31) + Arrays.hashCode(this.f20148c)) * 31) + this.f20149d) * 31) + this.f20150e;
    }

    public String toString() {
        return "mdta: key=" + this.f20147b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20147b);
        parcel.writeInt(this.f20148c.length);
        parcel.writeByteArray(this.f20148c);
        parcel.writeInt(this.f20149d);
        parcel.writeInt(this.f20150e);
    }
}
