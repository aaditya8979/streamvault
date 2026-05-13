package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f21941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f21942g;

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
        this.f21938c = i10;
        this.f21939d = i11;
        this.f21940e = i12;
        this.f21941f = iArr;
        this.f21942g = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f21938c = parcel.readInt();
        this.f21939d = parcel.readInt();
        this.f21940e = parcel.readInt();
        this.f21941f = (int[]) m0.j(parcel.createIntArray());
        this.f21942g = (int[]) m0.j(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f21938c == mlltFrame.f21938c && this.f21939d == mlltFrame.f21939d && this.f21940e == mlltFrame.f21940e && Arrays.equals(this.f21941f, mlltFrame.f21941f) && Arrays.equals(this.f21942g, mlltFrame.f21942g);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21938c) * 31) + this.f21939d) * 31) + this.f21940e) * 31) + Arrays.hashCode(this.f21941f)) * 31) + Arrays.hashCode(this.f21942g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21938c);
        parcel.writeInt(this.f21939d);
        parcel.writeInt(this.f21940e);
        parcel.writeIntArray(this.f21941f);
        parcel.writeIntArray(this.f21942g);
    }
}
