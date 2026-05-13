package qo;

import bn.r;
import bo.a0;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        p.k(bArr, "<this>");
        if (i16 < 0 || i11 > bArr.length || i16 > i11) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i16 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i16];
        int i17 = 0;
        while (i16 < i11) {
            byte b10 = bArr[i16];
            if (b10 >= 0) {
                i12 = i17 + 1;
                cArr[i17] = (char) b10;
                i16++;
                while (i16 < i11) {
                    byte b11 = bArr[i16];
                    if (b11 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                r rVar = r.f5635a;
            } else {
                if ((b10 >> 5) == -2) {
                    int i18 = i16 + 1;
                    if (i11 <= i18) {
                        i12 = i17 + 1;
                        cArr[i17] = (char) 65533;
                    } else {
                        byte b12 = bArr[i18];
                        if ((b12 & 192) == 128) {
                            int i19 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i19 < 128) {
                                i12 = i17 + 1;
                                cArr[i17] = (char) 65533;
                            } else {
                                i12 = i17 + 1;
                                cArr[i17] = (char) i19;
                            }
                            r rVar2 = r.f5635a;
                            i13 = 2;
                        } else {
                            i12 = i17 + 1;
                            cArr[i17] = (char) 65533;
                        }
                    }
                    r rVar3 = r.f5635a;
                    i13 = 1;
                } else if ((b10 >> 4) == -2) {
                    int i20 = i16 + 2;
                    if (i11 <= i20) {
                        i12 = i17 + 1;
                        cArr[i17] = (char) 65533;
                        r rVar4 = r.f5635a;
                        int i21 = i16 + 1;
                        if (i11 > i21) {
                            if ((bArr[i21] & 192) == 128) {
                                i13 = 2;
                            }
                        }
                        i13 = 1;
                    } else {
                        byte b13 = bArr[i16 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i20];
                            if ((b14 & 192) == 128) {
                                int i22 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i22 < 2048) {
                                    i12 = i17 + 1;
                                    cArr[i17] = (char) 65533;
                                } else {
                                    if (55296 <= i22 && i22 < 57344) {
                                        i12 = i17 + 1;
                                        cArr[i17] = (char) 65533;
                                    } else {
                                        i12 = i17 + 1;
                                        cArr[i17] = (char) i22;
                                    }
                                }
                                r rVar5 = r.f5635a;
                                i13 = 3;
                            } else {
                                i12 = i17 + 1;
                                cArr[i17] = (char) 65533;
                                r rVar6 = r.f5635a;
                                i13 = 2;
                            }
                        } else {
                            i12 = i17 + 1;
                            cArr[i17] = (char) 65533;
                            r rVar7 = r.f5635a;
                            i13 = 1;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i23 = i16 + 3;
                        if (i11 <= i23) {
                            i14 = i17 + 1;
                            cArr[i17] = 65533;
                            r rVar8 = r.f5635a;
                            int i24 = i16 + 1;
                            if (i11 > i24) {
                                if ((bArr[i24] & 192) == 128) {
                                    int i25 = i16 + 2;
                                    if (i11 > i25) {
                                        if ((bArr[i25] & 192) == 128) {
                                            i15 = 3;
                                        }
                                    }
                                    i15 = 2;
                                }
                            }
                            i15 = 1;
                        } else {
                            byte b15 = bArr[i16 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i16 + 2];
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i23];
                                    if ((b17 & 192) == 128) {
                                        int i26 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i26 > 1114111) {
                                            i14 = i17 + 1;
                                            cArr[i17] = 65533;
                                        } else {
                                            if ((55296 <= i26 && i26 < 57344) || i26 < 65536 || i26 == 65533) {
                                                i14 = i17 + 1;
                                                cArr[i17] = 65533;
                                            } else {
                                                int i27 = i17 + 1;
                                                cArr[i17] = (char) ((i26 >>> 10) + 55232);
                                                char c10 = (char) ((i26 & 1023) + 56320);
                                                i14 = i27 + 1;
                                                cArr[i27] = c10;
                                            }
                                        }
                                        r rVar9 = r.f5635a;
                                        i15 = 4;
                                    } else {
                                        i14 = i17 + 1;
                                        cArr[i17] = 65533;
                                        r rVar10 = r.f5635a;
                                        i15 = 3;
                                    }
                                } else {
                                    i14 = i17 + 1;
                                    cArr[i17] = 65533;
                                    r rVar11 = r.f5635a;
                                    i15 = 2;
                                }
                            } else {
                                i14 = i17 + 1;
                                cArr[i17] = 65533;
                                r rVar12 = r.f5635a;
                                i15 = 1;
                            }
                        }
                        i16 += i15;
                    } else {
                        i14 = i17 + 1;
                        cArr[i17] = 65533;
                        i16++;
                    }
                    i17 = i14;
                }
                i16 += i13;
            }
            i17 = i12;
        }
        return a0.y(cArr, 0, i17);
    }

    public static /* synthetic */ String b(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return a(bArr, i10, i11);
    }
}
