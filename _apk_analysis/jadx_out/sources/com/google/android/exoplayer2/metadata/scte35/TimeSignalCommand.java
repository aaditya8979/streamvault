package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import s7.a0;
import s7.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21999c;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public TimeSignalCommand(long j10, long j11) {
        this.f21998b = j10;
        this.f21999c = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public static TimeSignalCommand b(a0 a0Var, long j10, j0 j0Var) {
        long jC = c(a0Var, j10);
        return new TimeSignalCommand(jC, j0Var.b(jC));
    }

    public static long c(a0 a0Var, long j10) {
        long jD = a0Var.D();
        if ((128 & jD) != 0) {
            return 8589934591L & ((((jD & 1) << 32) | a0Var.F()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21998b);
        parcel.writeLong(this.f21999c);
    }
}
