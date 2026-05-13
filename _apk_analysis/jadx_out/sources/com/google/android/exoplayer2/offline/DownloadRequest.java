package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s7.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f22004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f22005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f22006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final byte[] f22007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f22008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f22009h;

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f22003b = (String) m0.j(parcel.readString());
        this.f22004c = Uri.parse((String) m0.j(parcel.readString()));
        this.f22005d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f22006e = Collections.unmodifiableList(arrayList);
        this.f22007f = parcel.createByteArray();
        this.f22008g = parcel.readString();
        this.f22009h = (byte[]) m0.j(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f22003b.equals(downloadRequest.f22003b) && this.f22004c.equals(downloadRequest.f22004c) && m0.c(this.f22005d, downloadRequest.f22005d) && this.f22006e.equals(downloadRequest.f22006e) && Arrays.equals(this.f22007f, downloadRequest.f22007f) && m0.c(this.f22008g, downloadRequest.f22008g) && Arrays.equals(this.f22009h, downloadRequest.f22009h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f22003b.hashCode() * 31 * 31) + this.f22004c.hashCode()) * 31;
        String str = this.f22005d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f22006e.hashCode()) * 31) + Arrays.hashCode(this.f22007f)) * 31;
        String str2 = this.f22008g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f22009h);
    }

    public String toString() {
        return this.f22005d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f22003b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22003b);
        parcel.writeString(this.f22004c.toString());
        parcel.writeString(this.f22005d);
        parcel.writeInt(this.f22006e.size());
        for (int i11 = 0; i11 < this.f22006e.size(); i11++) {
            parcel.writeParcelable(this.f22006e.get(i11), 0);
        }
        parcel.writeByteArray(this.f22007f);
        parcel.writeString(this.f22008g);
        parcel.writeByteArray(this.f22009h);
    }
}
