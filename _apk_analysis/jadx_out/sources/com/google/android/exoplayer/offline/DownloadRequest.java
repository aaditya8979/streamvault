package com.google.android.exoplayer.offline;

import a6.k0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f20331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f20332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f20333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f20334g;

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
        this.f20329b = (String) k0.i(parcel.readString());
        this.f20330c = (String) k0.i(parcel.readString());
        this.f20331d = Uri.parse((String) k0.i(parcel.readString()));
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f20332e = Collections.unmodifiableList(arrayList);
        this.f20333f = parcel.readString();
        this.f20334g = (byte[]) k0.i(parcel.createByteArray());
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
        return this.f20329b.equals(downloadRequest.f20329b) && this.f20330c.equals(downloadRequest.f20330c) && this.f20331d.equals(downloadRequest.f20331d) && this.f20332e.equals(downloadRequest.f20332e) && k0.c(this.f20333f, downloadRequest.f20333f) && Arrays.equals(this.f20334g, downloadRequest.f20334g);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f20330c.hashCode() * 31) + this.f20329b.hashCode()) * 31) + this.f20330c.hashCode()) * 31) + this.f20331d.hashCode()) * 31) + this.f20332e.hashCode()) * 31;
        String str = this.f20333f;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20334g);
    }

    public String toString() {
        return this.f20330c + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f20329b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20329b);
        parcel.writeString(this.f20330c);
        parcel.writeString(this.f20331d.toString());
        parcel.writeInt(this.f20332e.size());
        for (int i11 = 0; i11 < this.f20332e.size(); i11++) {
            parcel.writeParcelable(this.f20332e.get(i11), 0);
        }
        parcel.writeString(this.f20333f);
        parcel.writeByteArray(this.f20334g);
    }
}
