package q6;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import i6.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s7.a0;

/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y7.n f77949d = y7.n.d(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y7.n f77950e = y7.n.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f77951a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77952b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77953c;

    /* JADX INFO: compiled from: SefReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77956c;

        public a(int i10, long j10, int i11) {
            this.f77954a = i10;
            this.f77955b = j10;
            this.f77956c = i11;
        }
    }

    public static int b(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    public static SlowMotionData f(a0 a0Var, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listF = f77950e.f(a0Var.A(i10));
        for (int i11 = 0; i11 < listF.size(); i11++) {
            List<String> listF2 = f77949d.f(listF.get(i11));
            if (listF2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listF2.get(0)), Long.parseLong(listF2.get(1)), 1 << (Integer.parseInt(listF2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.createForMalformedContainer(null, e10);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public final void a(i6.l lVar, y yVar) throws IOException {
        a0 a0Var = new a0(8);
        lVar.readFully(a0Var.d(), 0, 8);
        this.f77953c = a0Var.q() + 8;
        if (a0Var.n() != 1397048916) {
            yVar.f63944a = 0L;
        } else {
            yVar.f63944a = lVar.getPosition() - ((long) (this.f77953c - 12));
            this.f77952b = 2;
        }
    }

    public int c(i6.l lVar, y yVar, List<Metadata.Entry> list) throws IOException {
        int i10 = this.f77952b;
        long j10 = 0;
        if (i10 == 0) {
            long length = lVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            yVar.f63944a = j10;
            this.f77952b = 1;
        } else if (i10 == 1) {
            a(lVar, yVar);
        } else if (i10 == 2) {
            d(lVar, yVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(lVar, list);
            yVar.f63944a = 0L;
        }
        return 1;
    }

    public final void d(i6.l lVar, y yVar) throws IOException {
        long length = lVar.getLength();
        int i10 = (this.f77953c - 12) - 8;
        a0 a0Var = new a0(i10);
        lVar.readFully(a0Var.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            a0Var.Q(2);
            short s10 = a0Var.s();
            if (s10 == 2192 || s10 == 2816 || s10 == 2817 || s10 == 2819 || s10 == 2820) {
                this.f77951a.add(new a(s10, (length - ((long) this.f77953c)) - ((long) a0Var.q()), a0Var.q()));
            } else {
                a0Var.Q(8);
            }
        }
        if (this.f77951a.isEmpty()) {
            yVar.f63944a = 0L;
        } else {
            this.f77952b = 3;
            yVar.f63944a = this.f77951a.get(0).f77955b;
        }
    }

    public final void e(i6.l lVar, List<Metadata.Entry> list) throws IOException {
        long position = lVar.getPosition();
        int length = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) this.f77953c));
        a0 a0Var = new a0(length);
        lVar.readFully(a0Var.d(), 0, length);
        for (int i10 = 0; i10 < this.f77951a.size(); i10++) {
            a aVar = this.f77951a.get(i10);
            a0Var.P((int) (aVar.f77955b - position));
            a0Var.Q(4);
            int iQ = a0Var.q();
            int iB = b(a0Var.A(iQ));
            int i11 = aVar.f77956c - (iQ + 8);
            if (iB == 2192) {
                list.add(f(a0Var, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f77951a.clear();
        this.f77952b = 0;
    }
}
