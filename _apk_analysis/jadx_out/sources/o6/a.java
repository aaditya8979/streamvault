package o6;

import com.google.android.exoplayer2.ParserException;
import i6.l;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f76196a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f76197b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f76198c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o6.b f76199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f76202g;

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76204b;

        public b(int i10, long j10) {
            this.f76203a = i10;
            this.f76204b = j10;
        }
    }

    public static String f(l lVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        lVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // o6.c
    public boolean a(l lVar) throws IOException {
        s7.a.i(this.f76199d);
        while (true) {
            b bVarPeek = this.f76197b.peek();
            if (bVarPeek != null && lVar.getPosition() >= bVarPeek.f76204b) {
                this.f76199d.endMasterElement(this.f76197b.pop().f76203a);
                return true;
            }
            if (this.f76200e == 0) {
                long jD = this.f76198c.d(lVar, true, false, 4);
                if (jD == -2) {
                    jD = c(lVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f76201f = (int) jD;
                this.f76200e = 1;
            }
            if (this.f76200e == 1) {
                this.f76202g = this.f76198c.d(lVar, false, true, 8);
                this.f76200e = 2;
            }
            int elementType = this.f76199d.getElementType(this.f76201f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = lVar.getPosition();
                    this.f76197b.push(new b(this.f76201f, this.f76202g + position));
                    this.f76199d.startMasterElement(this.f76201f, position, this.f76202g);
                    this.f76200e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f76202g;
                    if (j10 <= 8) {
                        this.f76199d.integerElement(this.f76201f, e(lVar, (int) j10));
                        this.f76200e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f76202g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f76202g;
                    if (j11 <= 2147483647L) {
                        this.f76199d.stringElement(this.f76201f, f(lVar, (int) j11));
                        this.f76200e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.f76202g, null);
                }
                if (elementType == 4) {
                    this.f76199d.a(this.f76201f, (int) this.f76202g, lVar);
                    this.f76200e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j12 = this.f76202g;
                if (j12 == 4 || j12 == 8) {
                    this.f76199d.floatElement(this.f76201f, d(lVar, (int) j12));
                    this.f76200e = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.f76202g, null);
            }
            lVar.skipFully((int) this.f76202g);
            this.f76200e = 0;
        }
    }

    @Override // o6.c
    public void b(o6.b bVar) {
        this.f76199d = bVar;
    }

    public final long c(l lVar) throws IOException {
        lVar.resetPeekPosition();
        while (true) {
            lVar.peekFully(this.f76196a, 0, 4);
            int iC = g.c(this.f76196a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f76196a, iC, false);
                if (this.f76199d.isLevel1Element(iA)) {
                    lVar.skipFully(iC);
                    return iA;
                }
            }
            lVar.skipFully(1);
        }
    }

    public final double d(l lVar, int i10) throws IOException {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(lVar, i10));
    }

    public final long e(l lVar, int i10) throws IOException {
        lVar.readFully(this.f76196a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f76196a[i11] & 255));
        }
        return j10;
    }

    @Override // o6.c
    public void reset() {
        this.f76200e = 0;
        this.f76197b.clear();
        this.f76198c.e();
    }
}
