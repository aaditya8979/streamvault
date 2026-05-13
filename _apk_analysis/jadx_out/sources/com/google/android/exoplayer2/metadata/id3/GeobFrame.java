package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21933f;

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
        this.f21930c = (String) m0.j(parcel.readString());
        this.f21931d = (String) m0.j(parcel.readString());
        this.f21932e = (String) m0.j(parcel.readString());
        this.f21933f = (byte[]) m0.j(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f21930c = str;
        this.f21931d = str2;
        this.f21932e = str3;
        this.f21933f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return m0.c(this.f21930c, geobFrame.f21930c) && m0.c(this.f21931d, geobFrame.f21931d) && m0.c(this.f21932e, geobFrame.f21932e) && Arrays.equals(this.f21933f, geobFrame.f21933f);
    }

    public int hashCode() {
        String str = this.f21930c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21931d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21932e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f21933f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f21934b + ": mimeType=" + this.f21930c + ", filename=" + this.f21931d + ", description=" + this.f21932e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21930c);
        parcel.writeString(this.f21931d);
        parcel.writeString(this.f21932e);
        parcel.writeByteArray(this.f21933f);
    }
}
