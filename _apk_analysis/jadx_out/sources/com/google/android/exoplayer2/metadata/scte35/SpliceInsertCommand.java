package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.a0;
import s7.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f21975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f21977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f21979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f21980n;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21983c;

        public b(int i10, long j10, long j11) {
            this.f21981a = i10;
            this.f21982b = j10;
            this.f21983c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f21981a);
            parcel.writeLong(this.f21982b);
            parcel.writeLong(this.f21983c);
        }
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f21968b = j10;
        this.f21969c = z10;
        this.f21970d = z11;
        this.f21971e = z12;
        this.f21972f = z13;
        this.f21973g = j11;
        this.f21974h = j12;
        this.f21975i = Collections.unmodifiableList(list);
        this.f21976j = z14;
        this.f21977k = j13;
        this.f21978l = i10;
        this.f21979m = i11;
        this.f21980n = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f21968b = parcel.readLong();
        this.f21969c = parcel.readByte() == 1;
        this.f21970d = parcel.readByte() == 1;
        this.f21971e = parcel.readByte() == 1;
        this.f21972f = parcel.readByte() == 1;
        this.f21973g = parcel.readLong();
        this.f21974h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f21975i = Collections.unmodifiableList(arrayList);
        this.f21976j = parcel.readByte() == 1;
        this.f21977k = parcel.readLong();
        this.f21978l = parcel.readInt();
        this.f21979m = parcel.readInt();
        this.f21980n = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand b(a0 a0Var, long j10, j0 j0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iJ;
        int iD;
        int iD2;
        boolean z13;
        boolean z14;
        long jF;
        long jF2 = a0Var.F();
        boolean z15 = (a0Var.D() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            iJ = 0;
            iD = 0;
            iD2 = 0;
            z13 = false;
        } else {
            int iD3 = a0Var.D();
            boolean z16 = (iD3 & 128) != 0;
            boolean z17 = (iD3 & 64) != 0;
            boolean z18 = (iD3 & 32) != 0;
            boolean z19 = (iD3 & 16) != 0;
            long jC = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.c(a0Var, j10);
            if (!z17) {
                int iD4 = a0Var.D();
                ArrayList arrayList = new ArrayList(iD4);
                for (int i10 = 0; i10 < iD4; i10++) {
                    int iD5 = a0Var.D();
                    long jC2 = !z19 ? TimeSignalCommand.c(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iD5, jC2, j0Var.b(jC2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jD = a0Var.D();
                boolean z20 = (128 & jD) != 0;
                jF = ((((jD & 1) << 32) | a0Var.F()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jF = -9223372036854775807L;
            }
            iJ = a0Var.J();
            z13 = z17;
            iD = a0Var.D();
            iD2 = a0Var.D();
            list = listEmptyList;
            long j13 = jC;
            z12 = z14;
            j12 = jF;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new SpliceInsertCommand(jF2, z15, z10, z13, z11, j11, j0Var.b(j11), list, z12, j12, iJ, iD, iD2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21968b);
        parcel.writeByte(this.f21969c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21970d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21971e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21972f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21973g);
        parcel.writeLong(this.f21974h);
        int size = this.f21975i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f21975i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f21976j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21977k);
        parcel.writeInt(this.f21978l);
        parcel.writeInt(this.f21979m);
        parcel.writeInt(this.f21980n);
    }
}
