package yads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class kl extends n53 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f91624e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f91625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91627d;

    public kl(m73 m73Var) {
        super(m73Var);
    }

    public final boolean a(long j10, jb2 jb2Var) throws ob2 {
        if (this.f91627d == 2) {
            int i10 = jb2Var.f91149c - jb2Var.f91148b;
            this.f92746a.a(i10, jb2Var);
            this.f92746a.a(j10, 1, i10, 0, null);
            return true;
        }
        int iM = jb2Var.m();
        if (iM != 0 || this.f91626c) {
            if (this.f91627d == 10 && iM != 1) {
                return false;
            }
            int i11 = jb2Var.f91149c - jb2Var.f91148b;
            this.f92746a.a(i11, jb2Var);
            this.f92746a.a(j10, 1, i11, 0, null);
            return true;
        }
        int i12 = jb2Var.f91149c - jb2Var.f91148b;
        byte[] bArr = new byte[i12];
        jb2Var.a(bArr, 0, i12);
        a aVarA = b.a(new ib2(i12, bArr), false);
        lx0 lx0Var = new lx0();
        lx0Var.f92148k = "audio/mp4a-latm";
        lx0Var.f92145h = aVarA.f87524c;
        lx0Var.f92161x = aVarA.f87523b;
        lx0Var.f92162y = aVarA.f87522a;
        lx0Var.f92150m = Collections.singletonList(bArr);
        this.f92746a.a(new mx0(lx0Var));
        this.f91626c = true;
        return false;
    }

    public final boolean a(jb2 jb2Var) throws m53 {
        if (this.f91625b) {
            jb2Var.e(jb2Var.f91148b + 1);
        } else {
            int iM = jb2Var.m();
            int i10 = (iM >> 4) & 15;
            this.f91627d = i10;
            if (i10 == 2) {
                int i11 = f91624e[(iM >> 2) & 3];
                lx0 lx0Var = new lx0();
                lx0Var.f92148k = "audio/mpeg";
                lx0Var.f92161x = 1;
                lx0Var.f92162y = i11;
                this.f92746a.a(new mx0(lx0Var));
                this.f91626c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                lx0 lx0Var2 = new lx0();
                lx0Var2.f92148k = str;
                lx0Var2.f92161x = 1;
                lx0Var2.f92162y = 8000;
                this.f92746a.a(new mx0(lx0Var2));
                this.f91626c = true;
            } else if (i10 != 10) {
                throw new m53("Audio format not supported: " + this.f91627d);
            }
            this.f91625b = true;
        }
        return true;
    }
}
