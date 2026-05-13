package com.google.android.exoplayer.metadata.emsg;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Format f20229h = Format.t(null, "application/id3", Long.MAX_VALUE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Format f20230i = Format.t(null, "application/x-scte35", Long.MAX_VALUE);
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(Parcel parcel) {
        this.f20231b = (String) k0.i(parcel.readString());
        this.f20232c = (String) k0.i(parcel.readString());
        this.f20233d = parcel.readLong();
        this.f20234e = parcel.readLong();
        this.f20235f = (byte[]) k0.i(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f20231b = str;
        this.f20232c = str2;
        this.f20233d = j10;
        this.f20234e = j11;
        this.f20235f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f20233d == eventMessage.f20233d && this.f20234e == eventMessage.f20234e && k0.c(this.f20231b, eventMessage.f20231b) && k0.c(this.f20232c, eventMessage.f20232c) && Arrays.equals(this.f20235f, eventMessage.f20235f);
    }

    @Override // com.google.android.exoplayer.metadata.Metadata.Entry
    @Nullable
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f20235f;
        }
        return null;
    }

    @Override // com.google.android.exoplayer.metadata.Metadata.Entry
    @Nullable
    public Format getWrappedMetadataFormat() {
        String str = this.f20231b;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f20230i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f20229h;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f20236g == 0) {
            String str = this.f20231b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20232c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f20233d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f20234e;
            this.f20236g = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f20235f);
        }
        return this.f20236g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f20231b + ", id=" + this.f20234e + ", durationMs=" + this.f20233d + ", value=" + this.f20232c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20231b);
        parcel.writeString(this.f20232c);
        parcel.writeLong(this.f20233d);
        parcel.writeLong(this.f20234e);
        parcel.writeByteArray(this.f20235f);
    }
}
