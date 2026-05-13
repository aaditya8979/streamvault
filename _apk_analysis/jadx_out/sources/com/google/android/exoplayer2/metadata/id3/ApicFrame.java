package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f21912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21914f;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f21911c = (String) m0.j(parcel.readString());
        this.f21912d = parcel.readString();
        this.f21913e = parcel.readInt();
        this.f21914f = (byte[]) m0.j(parcel.createByteArray());
    }

    public ApicFrame(String str, @Nullable String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f21911c = str;
        this.f21912d = str2;
        this.f21913e = i10;
        this.f21914f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void a(q.b bVar) {
        bVar.G(this.f21914f, this.f21913e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f21913e == apicFrame.f21913e && m0.c(this.f21911c, apicFrame.f21911c) && m0.c(this.f21912d, apicFrame.f21912d) && Arrays.equals(this.f21914f, apicFrame.f21914f);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21913e) * 31;
        String str = this.f21911c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21912d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f21914f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f21934b + ": mimeType=" + this.f21911c + ", description=" + this.f21912d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21911c);
        parcel.writeString(this.f21912d);
        parcel.writeInt(this.f21913e);
        parcel.writeByteArray(this.f21914f);
    }
}
