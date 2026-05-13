package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f20289d;

    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f20288c = (String) k0.i(parcel.readString());
        this.f20289d = (byte[]) k0.i(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f20288c = str;
        this.f20289d = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return k0.c(this.f20288c, privFrame.f20288c) && Arrays.equals(this.f20289d, privFrame.f20289d);
    }

    public int hashCode() {
        String str = this.f20288c;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20289d);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": owner=" + this.f20288c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20288c);
        parcel.writeByteArray(this.f20289d);
    }
}
