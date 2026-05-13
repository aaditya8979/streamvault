package yads;

import androidx.compose.material.TextFieldImplKt;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class mt extends pt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f92557g = new jb2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ib2 f92558h = new ib2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f92559i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f92560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kt[] f92561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kt f92562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f92563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f92564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public lt f92565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f92566p;

    public mt(int i10, List list) {
        this.f92560j = i10 == -1 ? 1 : i10;
        if (list != null) {
            jx.a(list);
        }
        this.f92561k = new kt[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f92561k[i11] = new kt();
        }
        this.f92562l = this.f92561k[0];
    }

    @Override // yads.pt
    public final void a(nt ntVar) {
        ByteBuffer byteBuffer = ntVar.f94749d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        jb2 jb2Var = this.f92557g;
        int iLimit = byteBuffer.limit();
        jb2Var.f91147a = bArrArray;
        jb2Var.f91149c = iLimit;
        jb2Var.f91148b = 0;
        while (true) {
            jb2 jb2Var2 = this.f92557g;
            if (jb2Var2.f91149c - jb2Var2.f91148b < 3) {
                return;
            }
            int iM = jb2Var2.m();
            int i10 = iM & 3;
            boolean z10 = (iM & 4) == 4;
            byte bM = (byte) this.f92557g.m();
            byte bM2 = (byte) this.f92557g.m();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        g();
                        int i11 = (bM & 192) >> 6;
                        int i12 = this.f92559i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            for (int i13 = 0; i13 < 8; i13++) {
                                this.f92561k[i13].b();
                            }
                            ih1.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f92559i + " current=" + i11);
                        }
                        this.f92559i = i11;
                        int i14 = bM & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        lt ltVar = new lt(i11, i14);
                        this.f92565o = ltVar;
                        byte[] bArr = ltVar.f92086c;
                        ltVar.f92087d = 1;
                        bArr[0] = bM2;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalArgumentException();
                        }
                        lt ltVar2 = this.f92565o;
                        if (ltVar2 == null) {
                            ih1.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ltVar2.f92086c;
                            int i15 = ltVar2.f92087d;
                            bArr2[i15] = bM;
                            ltVar2.f92087d = i15 + 2;
                            bArr2[i15 + 1] = bM2;
                        }
                    }
                    lt ltVar3 = this.f92565o;
                    if (ltVar3.f92087d == (ltVar3.f92085b * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f92563m;
        this.f92564n = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f92563m != this.f92564n;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f92563m = null;
        this.f92564n = null;
        this.f92566p = 0;
        this.f92562l = this.f92561k[0];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f92561k[i10].b();
        }
        this.f92565o = null;
    }

    public final void g() {
        boolean z10;
        int i10;
        char c10;
        lt ltVar = this.f92565o;
        if (ltVar == null) {
            return;
        }
        int i11 = 2;
        if (ltVar.f92087d != (ltVar.f92085b * 2) - 1) {
            ih1.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f92565o.f92085b * 2) - 1) + ", but current index is " + this.f92565o.f92087d + " (sequence number " + this.f92565o.f92084a + ");");
        }
        ib2 ib2Var = this.f92558h;
        lt ltVar2 = this.f92565o;
        ib2Var.a(ltVar2.f92087d, ltVar2.f92086c);
        boolean z11 = false;
        while (true) {
            if (this.f92558h.b() > 0) {
                int i12 = 3;
                int iA = this.f92558h.a(3);
                int iA2 = this.f92558h.a(5);
                int i13 = 7;
                if (iA == 7) {
                    this.f92558h.c(i11);
                    iA = this.f92558h.a(6);
                    if (iA < 7) {
                        kf1.a("Invalid extended service number: ", iA, "Cea708Decoder");
                    }
                }
                if (iA2 == 0) {
                    if (iA != 0) {
                        ih1.d("Cea708Decoder", "serviceNumber is non-zero (" + iA + ") when blockSize is 0");
                    }
                } else if (iA != this.f92560j) {
                    this.f92558h.d(iA2);
                } else {
                    int iD = (iA2 * 8) + this.f92558h.d();
                    while (this.f92558h.d() < iD) {
                        int iA3 = this.f92558h.a(8);
                        if (iA3 == 16) {
                            z10 = true;
                            int iA4 = this.f92558h.a(8);
                            if (iA4 <= 31) {
                                i13 = 7;
                                if (iA4 > 7) {
                                    if (iA4 <= 15) {
                                        this.f92558h.c(8);
                                    } else if (iA4 <= 23) {
                                        this.f92558h.c(16);
                                    } else if (iA4 <= 31) {
                                        this.f92558h.c(24);
                                    }
                                }
                            } else {
                                i13 = 7;
                                if (iA4 <= 127) {
                                    if (iA4 == 32) {
                                        this.f92562l.a(' ');
                                    } else if (iA4 == 33) {
                                        this.f92562l.a((char) 160);
                                    } else if (iA4 == 37) {
                                        this.f92562l.a((char) 8230);
                                    } else if (iA4 == 42) {
                                        this.f92562l.a((char) 352);
                                    } else if (iA4 == 44) {
                                        this.f92562l.a((char) 338);
                                    } else if (iA4 == 63) {
                                        this.f92562l.a((char) 376);
                                    } else if (iA4 == 57) {
                                        this.f92562l.a((char) 8482);
                                    } else if (iA4 == 58) {
                                        this.f92562l.a((char) 353);
                                    } else if (iA4 == 60) {
                                        this.f92562l.a((char) 339);
                                    } else if (iA4 != 61) {
                                        switch (iA4) {
                                            case 48:
                                                this.f92562l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f92562l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f92562l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f92562l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f92562l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f92562l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iA4) {
                                                    case 118:
                                                        this.f92562l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f92562l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f92562l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f92562l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f92562l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f92562l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f92562l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f92562l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f92562l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f92562l.a((char) 9484);
                                                        break;
                                                    default:
                                                        kf1.a("Invalid G2 character: ", iA4, "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f92562l.a((char) 8480);
                                    }
                                    i10 = 2;
                                    c10 = 6;
                                    z11 = z10;
                                } else if (iA4 > 159) {
                                    i10 = 2;
                                    c10 = 6;
                                    if (iA4 <= 255) {
                                        if (iA4 == 160) {
                                            this.f92562l.a((char) 13252);
                                        } else {
                                            kf1.a("Invalid G3 character: ", iA4, "Cea708Decoder");
                                            this.f92562l.a('_');
                                        }
                                        z11 = z10;
                                    } else {
                                        kf1.a("Invalid extended command: ", iA4, "Cea708Decoder");
                                    }
                                } else if (iA4 <= 135) {
                                    this.f92558h.c(32);
                                } else if (iA4 <= 143) {
                                    this.f92558h.c(40);
                                } else if (iA4 <= 159) {
                                    i10 = 2;
                                    this.f92558h.c(2);
                                    c10 = 6;
                                    this.f92558h.c(this.f92558h.a(6) * 8);
                                }
                            }
                            i10 = 2;
                            c10 = 6;
                        } else if (iA3 <= 31) {
                            if (iA3 != 0) {
                                if (iA3 == i12) {
                                    this.f92563m = h();
                                } else if (iA3 != 8) {
                                    switch (iA3) {
                                        case 12:
                                            for (int i14 = 0; i14 < 8; i14++) {
                                                this.f92561k[i14].b();
                                            }
                                            break;
                                        case 13:
                                            this.f92562l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iA3 >= 17 && iA3 <= 23) {
                                                kf1.a("Currently unsupported COMMAND_EXT1 Command: ", iA3, "Cea708Decoder");
                                                this.f92558h.c(8);
                                            } else if (iA3 < 24 || iA3 > 31) {
                                                kf1.a("Invalid C0 command: ", iA3, "Cea708Decoder");
                                            } else {
                                                kf1.a("Currently unsupported COMMAND_P16 Command: ", iA3, "Cea708Decoder");
                                                this.f92558h.c(16);
                                            }
                                            break;
                                    }
                                } else {
                                    kt ktVar = this.f92562l;
                                    int length = ktVar.f91720b.length();
                                    if (length > 0) {
                                        ktVar.f91720b.delete(length - 1, length);
                                    }
                                }
                            }
                            i10 = i11;
                            z10 = true;
                            c10 = 6;
                        } else {
                            if (iA3 > 127) {
                                if (iA3 <= 159) {
                                    switch (iA3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i15 = iA3 - 128;
                                            if (this.f92566p != i15) {
                                                this.f92566p = i15;
                                                this.f92562l = this.f92561k[i15];
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (this.f92558h.e()) {
                                                    kt ktVar2 = this.f92561k[8 - i16];
                                                    ktVar2.f91719a.clear();
                                                    ktVar2.f91720b.clear();
                                                    ktVar2.f91734p = -1;
                                                    ktVar2.f91735q = -1;
                                                    ktVar2.f91736r = -1;
                                                    ktVar2.f91738t = -1;
                                                    ktVar2.f91740v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (this.f92558h.e()) {
                                                    this.f92561k[8 - i17].f91722d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (this.f92558h.e()) {
                                                    this.f92561k[8 - i18].f91722d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (this.f92558h.e()) {
                                                    this.f92561k[8 - i19].f91722d = !r1.f91722d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (this.f92558h.e()) {
                                                    this.f92561k[8 - i20].b();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            this.f92558h.c(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            for (int i21 = 0; i21 < 8; i21++) {
                                                this.f92561k[i21].b();
                                            }
                                            z10 = true;
                                            break;
                                        case 144:
                                            if (this.f92562l.f91721c) {
                                                this.f92558h.a(4);
                                                this.f92558h.a(2);
                                                this.f92558h.a(2);
                                                boolean zE = this.f92558h.e();
                                                boolean zE2 = this.f92558h.e();
                                                i12 = 3;
                                                this.f92558h.a(3);
                                                this.f92558h.a(3);
                                                this.f92562l.a(zE, zE2);
                                                z10 = true;
                                            } else {
                                                this.f92558h.c(16);
                                                z10 = true;
                                                i12 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.f92562l.f91721c) {
                                                int iA5 = kt.a(this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2));
                                                int iA6 = kt.a(this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2));
                                                this.f92558h.c(2);
                                                kt.a(this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2), 0);
                                                this.f92562l.a(iA5, iA6);
                                            } else {
                                                this.f92558h.c(24);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (this.f92562l.f91721c) {
                                                this.f92558h.c(4);
                                                int iA7 = this.f92558h.a(4);
                                                this.f92558h.c(2);
                                                this.f92558h.a(6);
                                                kt ktVar3 = this.f92562l;
                                                if (ktVar3.f91740v != iA7) {
                                                    ktVar3.a('\n');
                                                }
                                                ktVar3.f91740v = iA7;
                                            } else {
                                                this.f92558h.c(16);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case TextFieldImplKt.AnimationDuration /* 150 */:
                                        default:
                                            z10 = true;
                                            kf1.a("Invalid C1 command: ", iA3, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f92562l.f91721c) {
                                                int iA8 = kt.a(this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2));
                                                this.f92558h.a(2);
                                                kt.a(this.f92558h.a(2), this.f92558h.a(2), this.f92558h.a(2), 0);
                                                this.f92558h.e();
                                                this.f92558h.e();
                                                this.f92558h.a(2);
                                                this.f92558h.a(2);
                                                int iA9 = this.f92558h.a(2);
                                                this.f92558h.c(8);
                                                kt ktVar4 = this.f92562l;
                                                ktVar4.f91733o = iA8;
                                                ktVar4.f91730l = iA9;
                                            } else {
                                                this.f92558h.c(32);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i22 = iA3 - 152;
                                            kt ktVar5 = this.f92561k[i22];
                                            this.f92558h.c(i11);
                                            boolean zE3 = this.f92558h.e();
                                            boolean zE4 = this.f92558h.e();
                                            this.f92558h.e();
                                            int iA10 = this.f92558h.a(i12);
                                            boolean zE5 = this.f92558h.e();
                                            int iA11 = this.f92558h.a(i13);
                                            int iA12 = this.f92558h.a(8);
                                            int iA13 = this.f92558h.a(4);
                                            int iA14 = this.f92558h.a(4);
                                            this.f92558h.c(i11);
                                            this.f92558h.a(6);
                                            this.f92558h.c(i11);
                                            int iA15 = this.f92558h.a(3);
                                            int iA16 = this.f92558h.a(3);
                                            ktVar5.f91721c = true;
                                            ktVar5.f91722d = zE3;
                                            ktVar5.f91729k = zE4;
                                            ktVar5.f91723e = iA10;
                                            ktVar5.f91724f = zE5;
                                            ktVar5.f91725g = iA11;
                                            ktVar5.f91726h = iA12;
                                            ktVar5.f91727i = iA13;
                                            int i23 = iA14 + 1;
                                            if (ktVar5.f91728j != i23) {
                                                ktVar5.f91728j = i23;
                                                while (true) {
                                                    if ((zE4 && ktVar5.f91719a.size() >= ktVar5.f91728j) || ktVar5.f91719a.size() >= 15) {
                                                        ktVar5.f91719a.remove(0);
                                                    }
                                                }
                                            }
                                            if (iA15 != 0 && ktVar5.f91731m != iA15) {
                                                ktVar5.f91731m = iA15;
                                                int i24 = iA15 - 1;
                                                int i25 = kt.C[i24];
                                                boolean z12 = kt.B[i24];
                                                int i26 = kt.f91718z[i24];
                                                int i27 = kt.A[i24];
                                                int i28 = kt.f91717y[i24];
                                                ktVar5.f91733o = i25;
                                                ktVar5.f91730l = i28;
                                            }
                                            if (iA16 != 0 && ktVar5.f91732n != iA16) {
                                                ktVar5.f91732n = iA16;
                                                int i29 = iA16 - 1;
                                                int i30 = kt.E[i29];
                                                int i31 = kt.D[i29];
                                                ktVar5.a(false, false);
                                                ktVar5.a(kt.f91715w, kt.F[i29]);
                                            }
                                            if (this.f92566p != i22) {
                                                this.f92566p = i22;
                                                this.f92562l = this.f92561k[i22];
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                    }
                                    c10 = 6;
                                    z11 = z10;
                                } else {
                                    z10 = true;
                                    if (iA3 <= 255) {
                                        this.f92562l.a((char) (iA3 & 255));
                                    } else {
                                        kf1.a("Invalid base command: ", iA3, "Cea708Decoder");
                                        i13 = 7;
                                        i10 = 2;
                                        c10 = 6;
                                    }
                                }
                                i13 = 7;
                                i10 = 2;
                                c10 = 6;
                                z11 = z10;
                            } else if (iA3 == 127) {
                                this.f92562l.a((char) 9835);
                            } else {
                                this.f92562l.a((char) (iA3 & 255));
                            }
                            i10 = i11;
                            z10 = true;
                            c10 = 6;
                            z11 = z10;
                        }
                        i11 = i10;
                    }
                }
            }
        }
        if (z11) {
            this.f92563m = h();
        }
        this.f92565o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h() {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mt.h():java.util.List");
    }
}
