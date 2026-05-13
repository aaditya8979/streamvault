package com.google.android.exoplayer.metadata.scte35;

import a6.g0;
import a6.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f20304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f20308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20309n;

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
        public final int f20310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20312c;

        public b(int i10, long j10, long j11) {
            this.f20310a = i10;
            this.f20311b = j10;
            this.f20312c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f20310a);
            parcel.writeLong(this.f20311b);
            parcel.writeLong(this.f20312c);
        }
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f20297b = j10;
        this.f20298c = z10;
        this.f20299d = z11;
        this.f20300e = z12;
        this.f20301f = z13;
        this.f20302g = j11;
        this.f20303h = j12;
        this.f20304i = Collections.unmodifiableList(list);
        this.f20305j = z14;
        this.f20306k = j13;
        this.f20307l = i10;
        this.f20308m = i11;
        this.f20309n = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f20297b = parcel.readLong();
        this.f20298c = parcel.readByte() == 1;
        this.f20299d = parcel.readByte() == 1;
        this.f20300e = parcel.readByte() == 1;
        this.f20301f = parcel.readByte() == 1;
        this.f20302g = parcel.readLong();
        this.f20303h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f20304i = Collections.unmodifiableList(arrayList);
        this.f20305j = parcel.readByte() == 1;
        this.f20306k = parcel.readLong();
        this.f20307l = parcel.readInt();
        this.f20308m = parcel.readInt();
        this.f20309n = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand b(t tVar, long j10, g0 g0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iE;
        int iY;
        int iY2;
        boolean z13;
        boolean z14;
        long jA;
        long jA2 = tVar.A();
        boolean z15 = (tVar.y() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            iE = 0;
            iY = 0;
            iY2 = 0;
            z13 = false;
        } else {
            int iY3 = tVar.y();
            boolean z16 = (iY3 & 128) != 0;
            boolean z17 = (iY3 & 64) != 0;
            boolean z18 = (iY3 & 32) != 0;
            boolean z19 = (iY3 & 16) != 0;
            long jC = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.c(tVar, j10);
            if (!z17) {
                int iY4 = tVar.y();
                ArrayList arrayList = new ArrayList(iY4);
                for (int i10 = 0; i10 < iY4; i10++) {
                    int iY5 = tVar.y();
                    long jC2 = !z19 ? TimeSignalCommand.c(tVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(iY5, jC2, g0Var.b(jC2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jY = tVar.y();
                boolean z20 = (128 & jY) != 0;
                jA = ((((jY & 1) << 32) | tVar.A()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jA = -9223372036854775807L;
            }
            iE = tVar.E();
            z13 = z17;
            iY = tVar.y();
            iY2 = tVar.y();
            list = listEmptyList;
            long j13 = jC;
            z12 = z14;
            j12 = jA;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new SpliceInsertCommand(jA2, z15, z10, z13, z11, j11, g0Var.b(j11), list, z12, j12, iE, iY, iY2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20297b);
        parcel.writeByte(this.f20298c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20299d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20300e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20301f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20302g);
        parcel.writeLong(this.f20303h);
        int size = this.f20304i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f20304i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f20305j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20306k);
        parcel.writeInt(this.f20307l);
        parcel.writeInt(this.f20308m);
        parcel.writeInt(this.f20309n);
    }
}
