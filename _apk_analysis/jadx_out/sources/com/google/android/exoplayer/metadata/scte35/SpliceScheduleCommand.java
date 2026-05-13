package com.google.android.exoplayer.metadata.scte35;

import a6.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f20313b;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20315b;

        public b(int i10, long j10) {
            this.f20314a = i10;
            this.f20315b = j10;
        }

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f20314a);
            parcel.writeLong(this.f20315b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f20319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f20320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f20321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f20322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f20323h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f20324i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20325j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20326k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f20316a = j10;
            this.f20317b = z10;
            this.f20318c = z11;
            this.f20319d = z12;
            this.f20321f = Collections.unmodifiableList(list);
            this.f20320e = j11;
            this.f20322g = z13;
            this.f20323h = j12;
            this.f20324i = i10;
            this.f20325j = i11;
            this.f20326k = i12;
        }

        public c(Parcel parcel) {
            this.f20316a = parcel.readLong();
            this.f20317b = parcel.readByte() == 1;
            this.f20318c = parcel.readByte() == 1;
            this.f20319d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f20321f = Collections.unmodifiableList(arrayList);
            this.f20320e = parcel.readLong();
            this.f20322g = parcel.readByte() == 1;
            this.f20323h = parcel.readLong();
            this.f20324i = parcel.readInt();
            this.f20325j = parcel.readInt();
            this.f20326k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(t tVar) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iY;
            boolean z12;
            boolean z13;
            long jA;
            long jA2 = tVar.A();
            boolean z14 = (tVar.y() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iY = 0;
                z12 = false;
            } else {
                int iY2 = tVar.y();
                boolean z15 = (iY2 & 128) != 0;
                boolean z16 = (iY2 & 64) != 0;
                boolean z17 = (iY2 & 32) != 0;
                long jA3 = z16 ? tVar.A() : -9223372036854775807L;
                if (!z16) {
                    int iY3 = tVar.y();
                    ArrayList arrayList3 = new ArrayList(iY3);
                    for (int i12 = 0; i12 < iY3; i12++) {
                        arrayList3.add(new b(tVar.y(), tVar.A(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jY = tVar.y();
                    boolean z18 = (128 & jY) != 0;
                    jA = ((((jY & 1) << 32) | tVar.A()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jA = -9223372036854775807L;
                }
                int iE = tVar.E();
                int iY4 = tVar.y();
                z12 = z16;
                iY = tVar.y();
                j11 = jA;
                arrayList = arrayList2;
                long j12 = jA3;
                i10 = iE;
                i11 = iY4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(jA2, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iY);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f20316a);
            parcel.writeByte(this.f20317b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20318c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20319d ? (byte) 1 : (byte) 0);
            int size = this.f20321f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f20321f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f20320e);
            parcel.writeByte(this.f20322g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f20323h);
            parcel.writeInt(this.f20324i);
            parcel.writeInt(this.f20325j);
            parcel.writeInt(this.f20326k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f20313b = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f20313b = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand b(t tVar) {
        int iY = tVar.y();
        ArrayList arrayList = new ArrayList(iY);
        for (int i10 = 0; i10 < iY; i10++) {
            arrayList.add(c.e(tVar));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f20313b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f20313b.get(i11).f(parcel);
        }
    }
}
