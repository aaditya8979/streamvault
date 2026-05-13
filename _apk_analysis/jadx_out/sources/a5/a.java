package a5;

import a6.g0;
import a6.s;
import a6.t;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import w4.c;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements w4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3505a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3506b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f3507c;

    @Override // w4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(cVar.f63711c);
        g0 g0Var = this.f3507c;
        if (g0Var == null || cVar.f86324h != g0Var.e()) {
            g0 g0Var2 = new g0(cVar.f63713e);
            this.f3507c = g0Var2;
            g0Var2.a(cVar.f63713e - cVar.f86324h);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f3505a.J(bArrArray, iLimit);
        this.f3506b.n(bArrArray, iLimit);
        this.f3506b.q(39);
        long jH = (((long) this.f3506b.h(1)) << 32) | ((long) this.f3506b.h(32));
        this.f3506b.q(20);
        int iH = this.f3506b.h(12);
        int iH2 = this.f3506b.h(8);
        Metadata.Entry spliceNullCommand = null;
        this.f3505a.M(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.b(this.f3505a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.b(this.f3505a);
        } else if (iH2 == 5) {
            spliceNullCommand = SpliceInsertCommand.b(this.f3505a, jH, this.f3507c);
        } else if (iH2 == 6) {
            spliceNullCommand = TimeSignalCommand.b(this.f3505a, jH, this.f3507c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
