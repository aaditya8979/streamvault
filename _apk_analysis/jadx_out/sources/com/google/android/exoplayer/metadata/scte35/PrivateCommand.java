package com.google.android.exoplayer.metadata.scte35;

import a6.k0;
import a6.t;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f20296d;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f20294b = j11;
        this.f20295c = j10;
        this.f20296d = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f20294b = parcel.readLong();
        this.f20295c = parcel.readLong();
        this.f20296d = (byte[]) k0.i(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand b(t tVar, int i10, long j10) {
        long jA = tVar.A();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        return new PrivateCommand(jA, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20294b);
        parcel.writeLong(this.f20295c);
        parcel.writeByteArray(this.f20296d);
    }
}
