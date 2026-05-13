package com.facebook.ads.androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.redexgen.core.AbstractC15184a;
import com.facebook.ads.redexgen.core.BV;
import com.facebook.ads.redexgen.core.C3M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DownloadRequest implements Parcelable {
    public static byte[] A07;
    public static final Parcelable.Creator<DownloadRequest> CREATOR;
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List<StreamKey> A04;
    public final byte[] A05;
    public final byte[] A06;

    static {
        A01();
        CREATOR = new BV();
    }

    public DownloadRequest(Parcel parcel) {
        this.A02 = (String) AbstractC15184a.A0f(parcel.readString());
        this.A00 = Uri.parse((String) AbstractC15184a.A0f(parcel.readString()));
        this.A03 = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.A04 = Collections.unmodifiableList(arrayList);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = (byte[]) AbstractC15184a.A0f(parcel.createByteArray());
    }

    public DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
        int iA0B = AbstractC15184a.A0B(uri, str2);
        if (iA0B == 0 || iA0B == 2 || iA0B == 1) {
            C3M.A09(str3 == null, A00(1, 38, 126) + iA0B);
        }
        this.A02 = str;
        this.A00 = uri;
        this.A03 = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.A04 = Collections.unmodifiableList(arrayList);
        this.A06 = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.A01 = str3;
        this.A05 = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : AbstractC15184a.A07;
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, BV bv) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-37, 36, 54, 52, 53, 48, 46, 4, 34, 36, 41, 38, 12, 38, 58, ExifInterface.MARKER_APP1, 46, 54, 52, 53, ExifInterface.MARKER_APP1, 35, 38, ExifInterface.MARKER_APP1, 47, 54, 45, 45, ExifInterface.MARKER_APP1, 39, 48, 51, ExifInterface.MARKER_APP1, 53, 58, 49, 38, -5, ExifInterface.MARKER_APP1};
    }

    public final DownloadRequest A02(DownloadRequest downloadRequest) {
        List listEmptyList;
        C3M.A07(this.A02.equals(downloadRequest.A02));
        if (this.A04.isEmpty() || downloadRequest.A04.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.A04);
            for (int i10 = 0; i10 < downloadRequest.A04.size(); i10++) {
                StreamKey streamKey = downloadRequest.A04.get(i10);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.A02, downloadRequest.A00, downloadRequest.A03, listEmptyList, downloadRequest.A06, downloadRequest.A01, downloadRequest.A05);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.A02.equals(downloadRequest.A02) && this.A00.equals(downloadRequest.A00) && AbstractC15184a.A1E(this.A03, downloadRequest.A03) && this.A04.equals(downloadRequest.A04) && Arrays.equals(this.A06, downloadRequest.A06) && AbstractC15184a.A1E(this.A01, downloadRequest.A01) && Arrays.equals(this.A05, downloadRequest.A05);
    }

    public final int hashCode() {
        return (((((((((((this.A02.hashCode() * 31 * 31) + this.A00.hashCode()) * 31) + (this.A03 != null ? this.A03.hashCode() : 0)) * 31) + this.A04.hashCode()) * 31) + Arrays.hashCode(this.A06)) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A05);
    }

    public final String toString() {
        return this.A03 + A00(0, 1, 94) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04.size());
        for (int i11 = 0; i11 < this.A04.size(); i11++) {
            parcel.writeParcelable(this.A04.get(i11), 0);
        }
        parcel.writeByteArray(this.A06);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A05);
    }
}
