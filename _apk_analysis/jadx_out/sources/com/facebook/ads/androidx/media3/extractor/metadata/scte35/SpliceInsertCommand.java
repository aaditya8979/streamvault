package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1859Hu;
import com.facebook.ads.redexgen.core.C1860Hv;
import com.facebook.ads.redexgen.core.C4J;
import com.facebook.ads.redexgen.core.C4R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"2fVUWVW5Hj7LHoGITBtqA0sUitS4PTb4", "Q8qvKmypWvqXriKcaeBTncTBfq8seygK", "PB3TBbluvnbAoPy", "V5r7AKyrTxu4nkwu31wVya7iCL5S2t7X", "ptiIvLXZk7optwegrSJTcSLpf9JtKnje", "Im1w1jT", "8VlbtMqcAJkMoCkUmgZltZaiEM6o3", "PsL5EDhhHapqBInAVo5dkvRq7GvOLwYr"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1859Hu();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C1860Hv> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<C1860Hv> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.A06 = j10;
        this.A0B = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0C = z13;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z14;
        this.A03 = j13;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C1860Hv.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1859Hu c1859Hu) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C4J c4j, long j10, C4R c4r) {
        long jA0Q = c4j.A0Q();
        boolean z10 = (c4j.A0I() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        if (A0D[6].length() == 19) {
            throw new RuntimeException();
        }
        A0D[4] = "mssbEGkdhdKHHgY1hMK2RaJspuJCG0bt";
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z14 = false;
        long jA0Q2 = -9223372036854775807L;
        if (!z10) {
            int iA0I3 = c4j.A0I();
            z11 = (iA0I3 & 128) != 0;
            z12 = (iA0I3 & 64) != 0;
            boolean z15 = (iA0I3 & 32) != 0;
            z13 = (iA0I3 & 16) != 0;
            if (z12 && !z13) {
                jA00 = TimeSignalCommand.A00(c4j, j10);
            }
            if (!z12) {
                int iA0I4 = c4j.A0I();
                listEmptyList = new ArrayList(iA0I4);
                for (int i10 = 0; i10 < iA0I4; i10++) {
                    int iA0I5 = c4j.A0I();
                    long jA002 = -9223372036854775807L;
                    if (!z13) {
                        jA002 = TimeSignalCommand.A00(c4j, j10);
                    }
                    listEmptyList.add(new C1860Hv(iA0I5, jA002, c4r.A06(jA002), null));
                }
            }
            if (z15) {
                long jA0I = c4j.A0I();
                z14 = (jA0I & 128) != 0;
                jA0Q2 = (1000 * (((jA0I & 1) << 32) | c4j.A0Q())) / 90;
            }
            iA0M = c4j.A0M();
            iA0I = c4j.A0I();
            iA0I2 = c4j.A0I();
        }
        return new SpliceInsertCommand(jA0Q, z10, z11, z12, z13, jA00, c4r.A06(jA00), listEmptyList, z14, jA0Q2, iA0M, iA0I, iA0I2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.A07.get(i11).A01(parcel);
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "b82jUGYrdOItwNOnrxCotui81UmrwpK";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
