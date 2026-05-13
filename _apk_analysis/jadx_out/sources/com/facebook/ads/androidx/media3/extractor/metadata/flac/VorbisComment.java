package com.facebook.ads.androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC14702c;
import com.facebook.ads.redexgen.core.AbstractC15184a;
import com.facebook.ads.redexgen.core.C3206or;
import com.facebook.ads.redexgen.core.HR;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static byte[] A02;
    public static final Parcelable.Creator<VorbisComment> CREATOR;
    public final String A00;
    public final String A01;

    static {
        A01();
        CREATOR = new HR();
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = (String) AbstractC15184a.A0f(parcel.readString());
        this.A01 = (String) AbstractC15184a.A0f(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, 17, 4, 125, 103};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC14702c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C3206or A9T() {
        return AbstractC14702c.A00(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.A00.equals(vorbisComment.A00) && this.A01.equals(vorbisComment.A01);
    }

    public final int hashCode() {
        return (((17 * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(1, 4, 91) + this.A00 + A00(0, 1, 86) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
