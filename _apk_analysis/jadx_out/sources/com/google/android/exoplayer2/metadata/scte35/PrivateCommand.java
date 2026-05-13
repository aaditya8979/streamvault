package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import s7.a0;
import s7.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21967d;

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
        this.f21965b = j11;
        this.f21966c = j10;
        this.f21967d = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f21965b = parcel.readLong();
        this.f21966c = parcel.readLong();
        this.f21967d = (byte[]) m0.j(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand b(a0 a0Var, int i10, long j10) {
        long jF = a0Var.F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new PrivateCommand(jF, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21965b);
        parcel.writeLong(this.f21966c);
        parcel.writeByteArray(this.f21967d);
    }
}
