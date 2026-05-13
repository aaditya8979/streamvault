package b7;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import s7.a0;
import s7.j0;
import s7.z;
import v6.c;
import v6.e;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f5493a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f5494b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f5495c;

    @Override // v6.e
    public Metadata b(c cVar, ByteBuffer byteBuffer) {
        j0 j0Var = this.f5495c;
        if (j0Var == null || cVar.f85926j != j0Var.e()) {
            j0 j0Var2 = new j0(cVar.f21432f);
            this.f5495c = j0Var2;
            j0Var2.a(cVar.f21432f - cVar.f85926j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f5493a.N(bArrArray, iLimit);
        this.f5494b.o(bArrArray, iLimit);
        this.f5494b.r(39);
        long jH = (((long) this.f5494b.h(1)) << 32) | ((long) this.f5494b.h(32));
        this.f5494b.r(20);
        int iH = this.f5494b.h(12);
        int iH2 = this.f5494b.h(8);
        Metadata.Entry spliceNullCommand = null;
        this.f5493a.Q(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.b(this.f5493a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.b(this.f5493a);
        } else if (iH2 == 5) {
            spliceNullCommand = SpliceInsertCommand.b(this.f5493a, jH, this.f5495c);
        } else if (iH2 == 6) {
            spliceNullCommand = TimeSignalCommand.b(this.f5493a, jH, this.f5495c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
