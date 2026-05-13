package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f21884h = new m.b().e0("application/id3").E();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f21885i = new m.b().e0("application/x-scte35").E();
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
        this.f21886b = (String) m0.j(parcel.readString());
        this.f21887c = (String) m0.j(parcel.readString());
        this.f21888d = parcel.readLong();
        this.f21889e = parcel.readLong();
        this.f21890f = (byte[]) m0.j(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f21886b = str;
        this.f21887c = str2;
        this.f21888d = j10;
        this.f21889e = j11;
        this.f21890f = bArr;
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
        return this.f21888d == eventMessage.f21888d && this.f21889e == eventMessage.f21889e && m0.c(this.f21886b, eventMessage.f21886b) && m0.c(this.f21887c, eventMessage.f21887c) && Arrays.equals(this.f21890f, eventMessage.f21890f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f21890f;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public m getWrappedMetadataFormat() {
        String str = this.f21886b;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f21885i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f21884h;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f21891g == 0) {
            String str = this.f21886b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21887c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f21888d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f21889e;
            this.f21891g = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f21890f);
        }
        return this.f21891g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f21886b + ", id=" + this.f21889e + ", durationMs=" + this.f21888d + ", value=" + this.f21887c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21886b);
        parcel.writeString(this.f21887c);
        parcel.writeLong(this.f21888d);
        parcel.writeLong(this.f21889e);
        parcel.writeByteArray(this.f21890f);
    }
}
