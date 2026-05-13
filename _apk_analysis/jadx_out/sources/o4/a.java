package o4;

import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import k4.h;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f76035a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f76036b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f76037c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o4.b f76038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f76041g;

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76043b;

        public b(int i10, long j10) {
            this.f76042a = i10;
            this.f76043b = j10;
        }
    }

    @Override // o4.c
    public boolean a(h hVar) throws InterruptedException, IOException {
        a6.a.e(this.f76038d);
        while (true) {
            if (!this.f76036b.isEmpty() && hVar.getPosition() >= this.f76036b.peek().f76043b) {
                this.f76038d.endMasterElement(this.f76036b.pop().f76042a);
                return true;
            }
            if (this.f76039e == 0) {
                long jD = this.f76037c.d(hVar, true, false, 4);
                if (jD == -2) {
                    jD = c(hVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f76040f = (int) jD;
                this.f76039e = 1;
            }
            if (this.f76039e == 1) {
                this.f76041g = this.f76037c.d(hVar, false, true, 8);
                this.f76039e = 2;
            }
            int elementType = this.f76038d.getElementType(this.f76040f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = hVar.getPosition();
                    this.f76036b.push(new b(this.f76040f, this.f76041g + position));
                    this.f76038d.startMasterElement(this.f76040f, position, this.f76041g);
                    this.f76039e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f76041g;
                    if (j10 <= 8) {
                        this.f76038d.integerElement(this.f76040f, e(hVar, (int) j10));
                        this.f76039e = 0;
                        return true;
                    }
                    throw new ParserException("Invalid integer size: " + this.f76041g);
                }
                if (elementType == 3) {
                    long j11 = this.f76041g;
                    if (j11 <= 2147483647L) {
                        this.f76038d.stringElement(this.f76040f, f(hVar, (int) j11));
                        this.f76039e = 0;
                        return true;
                    }
                    throw new ParserException("String element size: " + this.f76041g);
                }
                if (elementType == 4) {
                    this.f76038d.a(this.f76040f, (int) this.f76041g, hVar);
                    this.f76039e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw new ParserException("Invalid element type " + elementType);
                }
                long j12 = this.f76041g;
                if (j12 == 4 || j12 == 8) {
                    this.f76038d.floatElement(this.f76040f, d(hVar, (int) j12));
                    this.f76039e = 0;
                    return true;
                }
                throw new ParserException("Invalid float size: " + this.f76041g);
            }
            hVar.skipFully((int) this.f76041g);
            this.f76039e = 0;
        }
    }

    @Override // o4.c
    public void b(o4.b bVar) {
        this.f76038d = bVar;
    }

    public final long c(h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        while (true) {
            hVar.peekFully(this.f76035a, 0, 4);
            int iC = g.c(this.f76035a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f76035a, iC, false);
                if (this.f76038d.isLevel1Element(iA)) {
                    hVar.skipFully(iC);
                    return iA;
                }
            }
            hVar.skipFully(1);
        }
    }

    public final double d(h hVar, int i10) throws InterruptedException, IOException {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(hVar, i10));
    }

    public final long e(h hVar, int i10) throws InterruptedException, IOException {
        hVar.readFully(this.f76035a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f76035a[i11] & 255));
        }
        return j10;
    }

    public final String f(h hVar, int i10) throws InterruptedException, IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        hVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // o4.c
    public void reset() {
        this.f76039e = 0;
        this.f76036b.clear();
        this.f76037c.e();
    }
}
