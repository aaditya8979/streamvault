package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20278f;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f20275c = (String) k0.i(parcel.readString());
        this.f20276d = (String) k0.i(parcel.readString());
        this.f20277e = (String) k0.i(parcel.readString());
        this.f20278f = (byte[]) k0.i(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f20275c = str;
        this.f20276d = str2;
        this.f20277e = str3;
        this.f20278f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return k0.c(this.f20275c, geobFrame.f20275c) && k0.c(this.f20276d, geobFrame.f20276d) && k0.c(this.f20277e, geobFrame.f20277e) && Arrays.equals(this.f20278f, geobFrame.f20278f);
    }

    public int hashCode() {
        String str = this.f20275c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20276d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20277e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20278f);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": mimeType=" + this.f20275c + ", filename=" + this.f20276d + ", description=" + this.f20277e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20275c);
        parcel.writeString(this.f20276d);
        parcel.writeString(this.f20277e);
        parcel.writeByteArray(this.f20278f);
    }
}
