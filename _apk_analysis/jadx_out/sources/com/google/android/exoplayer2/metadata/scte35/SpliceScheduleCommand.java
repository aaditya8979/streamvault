package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f21984b;

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
        public final int f21985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21986b;

        public b(int i10, long j10) {
            this.f21985a = i10;
            this.f21986b = j10;
        }

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f21985a);
            parcel.writeLong(this.f21986b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f21991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f21992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f21993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f21994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f21995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f21996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f21997k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f21987a = j10;
            this.f21988b = z10;
            this.f21989c = z11;
            this.f21990d = z12;
            this.f21992f = Collections.unmodifiableList(list);
            this.f21991e = j11;
            this.f21993g = z13;
            this.f21994h = j12;
            this.f21995i = i10;
            this.f21996j = i11;
            this.f21997k = i12;
        }

        public c(Parcel parcel) {
            this.f21987a = parcel.readLong();
            this.f21988b = parcel.readByte() == 1;
            this.f21989c = parcel.readByte() == 1;
            this.f21990d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f21992f = Collections.unmodifiableList(arrayList);
            this.f21991e = parcel.readLong();
            this.f21993g = parcel.readByte() == 1;
            this.f21994h = parcel.readLong();
            this.f21995i = parcel.readInt();
            this.f21996j = parcel.readInt();
            this.f21997k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(a0 a0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iD;
            boolean z12;
            boolean z13;
            long jF;
            long jF2 = a0Var.F();
            boolean z14 = (a0Var.D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iD = 0;
                z12 = false;
            } else {
                int iD2 = a0Var.D();
                boolean z15 = (iD2 & 128) != 0;
                boolean z16 = (iD2 & 64) != 0;
                boolean z17 = (iD2 & 32) != 0;
                long jF3 = z16 ? a0Var.F() : -9223372036854775807L;
                if (!z16) {
                    int iD3 = a0Var.D();
                    ArrayList arrayList3 = new ArrayList(iD3);
                    for (int i12 = 0; i12 < iD3; i12++) {
                        arrayList3.add(new b(a0Var.D(), a0Var.F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jD = a0Var.D();
                    boolean z18 = (128 & jD) != 0;
                    jF = ((((jD & 1) << 32) | a0Var.F()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jF = -9223372036854775807L;
                }
                int iJ = a0Var.J();
                int iD4 = a0Var.D();
                z12 = z16;
                iD = a0Var.D();
                j11 = jF;
                arrayList = arrayList2;
                long j12 = jF3;
                i10 = iJ;
                i11 = iD4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(jF2, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iD);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f21987a);
            parcel.writeByte(this.f21988b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21989c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21990d ? (byte) 1 : (byte) 0);
            int size = this.f21992f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f21992f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f21991e);
            parcel.writeByte(this.f21993g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f21994h);
            parcel.writeInt(this.f21995i);
            parcel.writeInt(this.f21996j);
            parcel.writeInt(this.f21997k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f21984b = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f21984b = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand b(a0 a0Var) {
        int iD = a0Var.D();
        ArrayList arrayList = new ArrayList(iD);
        for (int i10 = 0; i10 < iD; i10++) {
            arrayList.add(c.e(a0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f21984b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f21984b.get(i11).f(parcel);
        }
    }
}
