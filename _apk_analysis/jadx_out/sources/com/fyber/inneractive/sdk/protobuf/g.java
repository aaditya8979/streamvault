package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, f fVar) {
        if ((i10 >>> 3) == 0) {
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return e(bArr, i11, fVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return d(bArr, i11, fVar) + fVar.f19129a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = d(bArr, i11, fVar);
            i15 = fVar.f19129a;
            if (i15 == i14) {
                break;
            }
            i11 = a(i15, bArr, i11, i12, fVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new n1("Failed to parse the message.");
        }
        return i11;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, k1 k1Var, f fVar) throws n1 {
        int iD = d(bArr, i11, fVar);
        int i13 = fVar.f19129a;
        if (i13 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            k1Var.add("");
        } else {
            k1Var.add(new String(bArr, iD, i13, l1.f19181a));
            iD += i13;
        }
        while (iD < i12) {
            int iA = iD + 1;
            byte b10 = bArr[iD];
            if (b10 >= 0) {
                fVar.f19129a = b10;
            } else {
                iA = a(b10, bArr, iA, fVar);
            }
            if (i10 != fVar.f19129a) {
                break;
            }
            iD = iA + 1;
            byte b11 = bArr[iA];
            if (b11 >= 0) {
                fVar.f19129a = b11;
            } else {
                iD = a(b11, bArr, iD, fVar);
            }
            int i14 = fVar.f19129a;
            if (i14 < 0) {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 == 0) {
                k1Var.add("");
            } else {
                k1Var.add(new String(bArr, iD, i14, l1.f19181a));
                iD += i14;
            }
        }
        return iD;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, n3 n3Var, f fVar) {
        if ((i10 >>> 3) == 0) {
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iE = e(bArr, i11, fVar);
            n3Var.a(i10, Long.valueOf(fVar.f19130b));
            return iE;
        }
        if (i13 == 1) {
            n3Var.a(i10, Long.valueOf(b(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iD = d(bArr, i11, fVar);
            int i14 = fVar.f19129a;
            if (i14 < 0) {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iD) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                n3Var.a(i10, s.f19223b);
            } else {
                s.a(iD, iD + i14, bArr.length);
                n3Var.a(i10, new q(s.f19224c.a(bArr, iD, i14)));
            }
            return iD + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new n1("Protocol message contained an invalid tag (zero).");
            }
            n3Var.a(i10, Integer.valueOf(a(i11, bArr)));
            return i11 + 4;
        }
        n3 n3Var2 = new n3();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iD2 = d(bArr, i11, fVar);
            int i17 = fVar.f19129a;
            if (i17 == i15) {
                i16 = i17;
                i11 = iD2;
                break;
            }
            i16 = i17;
            i11 = a(i17, bArr, iD2, i12, n3Var2, fVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw new n1("Failed to parse the message.");
        }
        n3Var.a(i10, n3Var2);
        return i11;
    }

    public static int a(int i10, byte[] bArr, int i11, f fVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            fVar.f19129a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            fVar.f19129a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            fVar.f19129a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            fVar.f19129a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                fVar.f19129a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int a(t2 t2Var, byte[] bArr, int i10, int i11, int i12, f fVar) {
        i2 i2Var = (i2) t2Var;
        Object objA = i2Var.a();
        int iA = i2Var.a(objA, bArr, i10, i11, i12, fVar);
        i2Var.c(objA);
        fVar.f19131c = objA;
        return iA;
    }

    public static int a(t2 t2Var, byte[] bArr, int i10, int i11, f fVar) {
        int iA = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iA = a(i12, bArr, iA, fVar);
            i12 = fVar.f19129a;
        }
        int i13 = iA;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        Object objA = t2Var.a();
        int i14 = i12 + i13;
        t2Var.a(objA, bArr, i13, i14, fVar);
        t2Var.c(objA);
        fVar.f19131c = objA;
        return i14;
    }

    public static int a(byte[] bArr, int i10, f fVar) {
        int iD = d(bArr, i10, fVar);
        int i11 = fVar.f19129a;
        if (i11 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iD) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            fVar.f19131c = s.f19223b;
            return iD;
        }
        int i12 = iD + i11;
        s.a(iD, i12, bArr.length);
        fVar.f19131c = new q(s.f19224c.a(bArr, iD, i11));
        return i12;
    }

    public static int a(byte[] bArr, int i10, k1 k1Var, f fVar) {
        a1 a1Var = (a1) k1Var;
        int iD = d(bArr, i10, fVar);
        int i11 = fVar.f19129a + iD;
        while (iD < i11) {
            int i12 = iD + 1;
            byte b10 = bArr[iD];
            if (b10 >= 0) {
                fVar.f19129a = b10;
                iD = i12;
            } else {
                iD = a(b10, bArr, i12, fVar);
            }
            a1Var.c(fVar.f19129a);
        }
        if (iD == i11) {
            return iD;
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, k1 k1Var, f fVar) throws n1 {
        int iD = d(bArr, i11, fVar);
        int i13 = fVar.f19129a;
        if (i13 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            k1Var.add("");
        } else {
            int i14 = iD + i13;
            if (!d4.f19118a.b(bArr, iD, i14)) {
                throw new n1("Protocol message had invalid UTF-8.");
            }
            k1Var.add(new String(bArr, iD, i13, l1.f19181a));
            iD = i14;
        }
        while (iD < i12) {
            int iA = iD + 1;
            byte b10 = bArr[iD];
            if (b10 >= 0) {
                fVar.f19129a = b10;
            } else {
                iA = a(b10, bArr, iA, fVar);
            }
            if (i10 != fVar.f19129a) {
                break;
            }
            iD = iA + 1;
            byte b11 = bArr[iA];
            if (b11 >= 0) {
                fVar.f19129a = b11;
            } else {
                iD = a(b11, bArr, iD, fVar);
            }
            int i15 = fVar.f19129a;
            if (i15 < 0) {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 == 0) {
                k1Var.add("");
            } else {
                int i16 = iD + i15;
                if (!d4.f19118a.b(bArr, iD, i16)) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                k1Var.add(new String(bArr, iD, i15, l1.f19181a));
                iD = i16;
            }
        }
        return iD;
    }

    public static int b(byte[] bArr, int i10, f fVar) {
        int iD = d(bArr, i10, fVar);
        int i11 = fVar.f19129a;
        if (i11 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            fVar.f19131c = "";
            return iD;
        }
        fVar.f19131c = new String(bArr, iD, i11, l1.f19181a);
        return iD + i11;
    }

    public static long b(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, k1 k1Var, f fVar) {
        a1 a1Var = (a1) k1Var;
        int iD = d(bArr, i11, fVar);
        a1Var.c(fVar.f19129a);
        while (iD < i12) {
            int iA = iD + 1;
            byte b10 = bArr[iD];
            if (b10 >= 0) {
                fVar.f19129a = b10;
            } else {
                iA = a(b10, bArr, iA, fVar);
            }
            if (i10 != fVar.f19129a) {
                break;
            }
            iD = iA + 1;
            byte b11 = bArr[iA];
            if (b11 >= 0) {
                fVar.f19129a = b11;
            } else {
                iD = a(b11, bArr, iD, fVar);
            }
            a1Var.c(fVar.f19129a);
        }
        return iD;
    }

    public static int c(byte[] bArr, int i10, f fVar) throws n1 {
        int iD = d(bArr, i10, fVar);
        int i11 = fVar.f19129a;
        if (i11 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            fVar.f19131c = "";
            return iD;
        }
        fVar.f19131c = d4.f19118a.a(bArr, iD, i11);
        return iD + i11;
    }

    public static int d(byte[] bArr, int i10, f fVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return a(b10, bArr, i11, fVar);
        }
        fVar.f19129a = b10;
        return i11;
    }

    public static int e(byte[] bArr, int i10, f fVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            fVar.f19130b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        fVar.f19130b = j11;
        return i12;
    }
}
