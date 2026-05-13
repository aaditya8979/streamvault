package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f20286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f20287g;

    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f20283c = i10;
        this.f20284d = i11;
        this.f20285e = i12;
        this.f20286f = iArr;
        this.f20287g = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f20283c = parcel.readInt();
        this.f20284d = parcel.readInt();
        this.f20285e = parcel.readInt();
        this.f20286f = (int[]) k0.i(parcel.createIntArray());
        this.f20287g = (int[]) k0.i(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f20283c == mlltFrame.f20283c && this.f20284d == mlltFrame.f20284d && this.f20285e == mlltFrame.f20285e && Arrays.equals(this.f20286f, mlltFrame.f20286f) && Arrays.equals(this.f20287g, mlltFrame.f20287g);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20283c) * 31) + this.f20284d) * 31) + this.f20285e) * 31) + Arrays.hashCode(this.f20286f)) * 31) + Arrays.hashCode(this.f20287g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20283c);
        parcel.writeInt(this.f20284d);
        parcel.writeInt(this.f20285e);
        parcel.writeIntArray(this.f20286f);
        parcel.writeIntArray(this.f20287g);
    }
}
