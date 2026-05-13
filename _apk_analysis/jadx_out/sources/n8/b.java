package n8;

/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f75260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f75261d;

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f75260c = (short) i10;
        this.f75261d = (short) i11;
    }

    @Override // n8.g
    public void c(o8.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f75261d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.c(31, 5);
                short s11 = this.f75261d;
                if (s11 > 62) {
                    aVar.c(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.c(Math.min((int) s11, 31), 5);
                } else {
                    aVar.c(s11 - 31, 5);
                }
            }
            aVar.c(bArr[this.f75260c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f75260c);
        sb2.append("::");
        sb2.append((this.f75260c + this.f75261d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
