package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17825a = z.a("vide");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17826b = z.a("soun");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17827c = z.a("text");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17828d = z.a("sbtl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17829e = z.a("subt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17830f = z.a("clcp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17831g = z.a("cenc");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17832h = z.a("meta");

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        int i10 = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = nVar.j();
            i10 = (i10 << 7) | (iJ & 127);
        }
        return i10;
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, f fVar, int i12) {
        int i13 = nVar.f18795b;
        while (true) {
            if (i13 - i10 >= i11) {
                return 0;
            }
            nVar.e(i13);
            int iB = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i14 = i13 + 8;
                Pair pairCreate = null;
                boolean z10 = false;
                Integer numValueOf = null;
                t tVar = null;
                while (i14 - i13 < iB) {
                    nVar.e(i14);
                    int iB2 = nVar.b();
                    int iB3 = nVar.b();
                    if (iB3 == c.f17756c0) {
                        numValueOf = Integer.valueOf(nVar.b());
                    } else if (iB3 == c.X) {
                        nVar.e(nVar.f18795b + 4);
                        z10 = nVar.b() == f17831g;
                    } else if (iB3 == c.Y) {
                        int i15 = i14 + 8;
                        while (true) {
                            if (i15 - i14 >= iB2) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i15);
                            int iB4 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.f18795b + 6);
                                nVar.j();
                                int iJ = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(iJ, bArr);
                                break;
                            }
                            i15 += iB4;
                        }
                    }
                    i14 += iB2;
                }
                if (z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(numValueOf != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, tVar);
                }
                if (pairCreate != null) {
                    fVar.f17813a[i12] = (t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i13 += iB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(int r3, com.fyber.inneractive.sdk.player.exoplayer2.util.n r4) {
        /*
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f18795b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.f18795b
            int r3 = r3 + 2
            r4.e(r3)
            int r3 = r4.j()
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L25
            int r0 = r4.f18795b
            int r0 = r0 + 2
            r4.e(r0)
        L25:
            r0 = r3 & 64
            if (r0 == 0) goto L33
            int r0 = r4.o()
            int r1 = r4.f18795b
            int r1 = r1 + r0
            r4.e(r1)
        L33:
            r0 = 32
            r3 = r3 & r0
            if (r3 == 0) goto L3f
            int r3 = r4.f18795b
            int r3 = r3 + 2
            r4.e(r3)
        L3f:
            int r3 = r4.f18795b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.j()
            r1 = 0
            if (r3 == r0) goto L93
            r0 = 33
            if (r3 == r0) goto L90
            r0 = 35
            if (r3 == r0) goto L8d
            r0 = 64
            if (r3 == r0) goto L8a
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L83
            r0 = 165(0xa5, float:2.31E-43)
            if (r3 == r0) goto L80
            r0 = 166(0xa6, float:2.33E-43)
            if (r3 == r0) goto L7d
            switch(r3) {
                case 102: goto L8a;
                case 103: goto L8a;
                case 104: goto L8a;
                default: goto L6b;
            }
        L6b:
            switch(r3) {
                case 169: goto L76;
                case 170: goto L6f;
                case 171: goto L6f;
                case 172: goto L76;
                default: goto L6e;
            }
        L6e:
            goto L95
        L6f:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L76:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L7d:
            java.lang.String r1 = "audio/eac3"
            goto L95
        L80:
            java.lang.String r1 = "audio/ac3"
            goto L95
        L83:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L8a:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L95
        L8d:
            java.lang.String r1 = "video/hevc"
            goto L95
        L90:
            java.lang.String r1 = "video/avc"
            goto L95
        L93:
            java.lang.String r1 = "video/mp4v-es"
        L95:
            int r3 = r4.f18795b
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f18795b
            int r3 = r3 + 1
            r4.e(r3)
            int r3 = a(r4)
            byte[] r0 = new byte[r3]
            r2 = 0
            r4.a(r0, r2, r3)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n):android.util.Pair");
    }

    public static s a(a aVar, b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        long jK;
        b bVar2;
        long j11;
        s sVar;
        Pair pairCreate;
        b bVarC;
        Pair pair;
        int i10;
        long j12;
        int i11;
        int i12;
        boolean z11;
        String str;
        List list;
        int i13;
        int iRound;
        int iIntValue;
        int i14;
        String str2;
        String str3;
        String str4;
        long j13;
        List listSingletonList;
        a aVarB = aVar.b(c.F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = aVarB.c(c.T).P0;
        nVar.e(16);
        int iB = nVar.b();
        int i15 = iB == f17826b ? 1 : iB == f17825a ? 2 : (iB == f17827c || iB == f17828d || iB == f17829e || iB == f17830f) ? 3 : iB == f17832h ? 4 : -1;
        if (i15 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(c.P).P0;
        nVar2.e(8);
        int iB2 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.f18795b + (iB2 == 0 ? 8 : 16));
        int iB3 = nVar2.b();
        nVar2.e(nVar2.f18795b + 4);
        int i16 = nVar2.f18795b;
        int i17 = iB2 == 0 ? 4 : 8;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                nVar2.e(nVar2.f18795b + i17);
                break;
            }
            if (nVar2.f18794a[i16 + i18] != -1) {
                jK = iB2 == 0 ? nVar2.k() : nVar2.n();
                if (jK == 0) {
                    break;
                }
            } else {
                i18++;
            }
        }
        jK = -9223372036854775807L;
        nVar2.e(nVar2.f18795b + 16);
        int iB4 = nVar2.b();
        int iB5 = nVar2.b();
        nVar2.e(nVar2.f18795b + 4);
        int iB6 = nVar2.b();
        int iB7 = nVar2.b();
        int i19 = (iB4 == 0 && iB5 == 65536 && iB6 == -65536 && iB7 == 0) ? 90 : (iB4 == 0 && iB5 == -65536 && iB6 == 65536 && iB7 == 0) ? 270 : (iB4 == -65536 && iB5 == 0 && iB6 == 0 && iB7 == -65536) ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : 0;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = jK;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar2.P0;
        nVar3.e(8);
        int iB8 = nVar3.b();
        int i20 = c.f17753b;
        nVar3.e(nVar3.f18795b + (((iB8 >> 24) & 255) == 0 ? 8 : 16));
        long jK2 = nVar3.k();
        long jA = j11 != -9223372036854775807L ? z.a(j11, 1000000L, jK2) : -9223372036854775807L;
        a aVarB2 = aVarB.b(c.G).b(c.H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVarB.c(c.S).P0;
        nVar4.e(8);
        int iB9 = (nVar4.b() >> 24) & 255;
        nVar4.e(nVar4.f18795b + (iB9 == 0 ? 8 : 16));
        long jK3 = nVar4.k();
        nVar4.e(nVar4.f18795b + (iB9 == 0 ? 4 : 8));
        int iO = nVar4.o();
        Pair pairCreate2 = Pair.create(Long.valueOf(jK3), "" + ((char) (((iO >> 10) & 31) + 96)) + ((char) (((iO >> 5) & 31) + 96)) + ((char) ((iO & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = aVarB2.c(c.U).P0;
        String str5 = (String) pairCreate2.second;
        nVar5.e(12);
        int iB10 = nVar5.b();
        f fVar = new f(iB10);
        int i21 = 0;
        while (i21 < iB10) {
            int i22 = nVar5.f18795b;
            int iB11 = nVar5.b();
            String str6 = "childAtomSize should be positive";
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB11 > 0, "childAtomSize should be positive");
            int iB12 = nVar5.b();
            int i23 = iB10;
            if (iB12 == c.f17755c || iB12 == c.f17757d || iB12 == c.f17752a0 || iB12 == c.f17774l0 || iB12 == c.f17759e || iB12 == c.f17761f || iB12 == c.f17763g || iB12 == c.K0 || iB12 == c.L0) {
                pair = pairCreate2;
                String str7 = "childAtomSize should be positive";
                i10 = i19;
                j12 = jK2;
                i11 = i15;
                nVar5.e(i22 + 16);
                nVar5.e(nVar5.f18795b + 16);
                int iO2 = nVar5.o();
                int iO3 = nVar5.o();
                nVar5.e(nVar5.f18795b + 50);
                int i24 = nVar5.f18795b;
                if (iB12 == c.f17752a0) {
                    i12 = iB11;
                    iB12 = a(nVar5, i22, i12, fVar, i21);
                    nVar5.e(i24);
                } else {
                    i12 = iB11;
                }
                float fM = 1.0f;
                int i25 = -1;
                boolean z12 = false;
                String str8 = null;
                List listSingletonList2 = null;
                byte[] bArrCopyOfRange = null;
                while (i24 - i22 < i12) {
                    nVar5.e(i24);
                    int i26 = nVar5.f18795b;
                    int iB13 = nVar5.b();
                    if (iB13 == 0 && nVar5.f18795b - i22 == i12) {
                        break;
                    }
                    if (iB13 > 0) {
                        str = str7;
                        z11 = true;
                    } else {
                        z11 = false;
                        str = str7;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z11, str);
                    int iB14 = nVar5.b();
                    if (iB14 == c.I) {
                        if (str8 != null) {
                            throw new IllegalStateException();
                        }
                        nVar5.e(i26 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                        list = aVarA.f18852a;
                        fVar.f17815c = aVarA.f18853b;
                        if (!z12) {
                            fM = aVarA.f18856e;
                        }
                        str8 = "video/avc";
                    } else if (iB14 != c.J) {
                        if (iB14 == c.M0) {
                            if (str8 != null) {
                                throw new IllegalStateException();
                            }
                            str8 = iB12 == c.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        } else if (iB14 == c.f17765h) {
                            if (str8 != null) {
                                throw new IllegalStateException();
                            }
                            str8 = "video/3gpp";
                        } else if (iB14 == c.K) {
                            if (str8 != null) {
                                throw new IllegalStateException();
                            }
                            Pair pairA = a(i26, nVar5);
                            str8 = (String) pairA.first;
                            listSingletonList2 = Collections.singletonList((byte[]) pairA.second);
                        } else if (iB14 == c.f17770j0) {
                            nVar5.e(i26 + 8);
                            fM = nVar5.m() / nVar5.m();
                            z12 = true;
                        } else {
                            if (iB14 == c.I0) {
                                int i27 = i26 + 8;
                                while (i27 - i26 < iB13) {
                                    nVar5.e(i27);
                                    int iB15 = nVar5.b();
                                    boolean z13 = z12;
                                    if (nVar5.b() == c.J0) {
                                        bArrCopyOfRange = Arrays.copyOfRange(nVar5.f18794a, i27, iB15 + i27);
                                        z12 = z13;
                                    } else {
                                        i27 += iB15;
                                        z12 = z13;
                                    }
                                }
                                bArrCopyOfRange = null;
                            } else {
                                boolean z14 = z12;
                                if (iB14 == c.H0) {
                                    int iJ = nVar5.j();
                                    nVar5.e(nVar5.f18795b + 3);
                                    if (iJ == 0) {
                                        int iJ2 = nVar5.j();
                                        if (iJ2 == 0) {
                                            i25 = 0;
                                        } else if (iJ2 == 1) {
                                            z12 = z14;
                                            i25 = 1;
                                        } else if (iJ2 == 2) {
                                            i25 = 2;
                                        } else if (iJ2 == 3) {
                                            i25 = 3;
                                        }
                                    }
                                }
                                z12 = z14;
                            }
                            i24 += iB13;
                            str7 = str;
                        }
                        i24 += iB13;
                        str7 = str;
                    } else {
                        if (str8 != null) {
                            throw new IllegalStateException();
                        }
                        nVar5.e(i26 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.d dVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                        list = dVarA.f18862a;
                        fVar.f17815c = dVarA.f18863b;
                        str8 = "video/hevc";
                    }
                    listSingletonList2 = list;
                    i24 += iB13;
                    str7 = str;
                }
                if (str8 != null) {
                    fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str8, -1, iO2, iO3, listSingletonList2, i10, fM, bArrCopyOfRange, i25, null, dVar);
                }
            } else if (iB12 == c.f17769j || iB12 == c.f17754b0 || iB12 == c.f17779o || iB12 == c.f17783q || iB12 == c.f17787s || iB12 == c.f17793v || iB12 == c.f17789t || iB12 == c.f17791u || iB12 == c.f17800y0 || iB12 == c.f17802z0 || iB12 == c.f17775m || iB12 == c.f17777n || iB12 == c.f17771k || iB12 == c.O0) {
                nVar5.e(i22 + 16);
                if (z10) {
                    int iO4 = nVar5.o();
                    nVar5.e(nVar5.f18795b + 6);
                    i13 = iO4;
                } else {
                    nVar5.e(nVar5.f18795b + 8);
                    i13 = 0;
                }
                j12 = jK2;
                if (i13 == 0 || i13 == 1) {
                    int iO5 = nVar5.o();
                    nVar5.e(nVar5.f18795b + 6);
                    byte[] bArr = nVar5.f18794a;
                    int i28 = nVar5.f18795b;
                    i11 = i15;
                    iRound = (bArr[i28 + 1] & 255) | ((bArr[i28] & 255) << 8);
                    nVar5.f18795b = i28 + 4;
                    if (i13 == 1) {
                        nVar5.e(i28 + 20);
                    }
                    iIntValue = iO5;
                } else if (i13 == 2) {
                    nVar5.e(nVar5.f18795b + 16);
                    iRound = (int) Math.round(Double.longBitsToDouble(nVar5.g()));
                    iIntValue = nVar5.m();
                    nVar5.e(nVar5.f18795b + 20);
                    i11 = i15;
                } else {
                    pair = pairCreate2;
                    i10 = i19;
                    i12 = iB11;
                    i11 = i15;
                }
                int i29 = nVar5.f18795b;
                if (iB12 == c.f17754b0) {
                    iB12 = a(nVar5, i22, iB11, fVar, i21);
                    nVar5.e(i29);
                }
                int i30 = iRound;
                String str9 = iB12 == c.f17779o ? "audio/ac3" : iB12 == c.f17783q ? "audio/eac3" : iB12 == c.f17787s ? "audio/vnd.dts" : (iB12 == c.f17789t || iB12 == c.f17791u) ? "audio/vnd.dts.hd" : iB12 == c.f17793v ? "audio/vnd.dts.hd;profile=lbr" : iB12 == c.f17800y0 ? "audio/3gpp" : iB12 == c.f17802z0 ? "audio/amr-wb" : (iB12 == c.f17775m || iB12 == c.f17777n) ? "audio/raw" : iB12 == c.f17771k ? "audio/mpeg" : iB12 == c.O0 ? "audio/alac" : null;
                pair = pairCreate2;
                int iIntValue2 = i30;
                byte[] bArr2 = null;
                while (i29 - i22 < iB11) {
                    nVar5.e(i29);
                    int iB16 = nVar5.b();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB16 > 0, str6);
                    int iB17 = nVar5.b();
                    int i31 = i19;
                    int i32 = c.K;
                    int i33 = iB11;
                    if (iB17 == i32 || (z10 && iB17 == c.f17773l)) {
                        if (iB17 != i32) {
                            i14 = nVar5.f18795b;
                            while (true) {
                                if (i14 - i29 >= iB16) {
                                    str2 = str6;
                                    i14 = -1;
                                    break;
                                }
                                nVar5.e(i14);
                                int iB18 = nVar5.b();
                                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB18 > 0, str6);
                                str2 = str6;
                                if (nVar5.b() == c.K) {
                                    break;
                                }
                                i14 += iB18;
                                str6 = str2;
                            }
                        } else {
                            str2 = str6;
                            i14 = i29;
                        }
                        if (i14 != -1) {
                            Pair pairA2 = a(i14, nVar5);
                            str9 = (String) pairA2.first;
                            bArr2 = (byte[]) pairA2.second;
                            if ("audio/mp4a-latm".equals(str9)) {
                                Pair pairA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr2);
                                iIntValue2 = ((Integer) pairA3.first).intValue();
                                iIntValue = ((Integer) pairA3.second).intValue();
                            }
                        }
                    } else {
                        if (iB17 == c.f17781p) {
                            nVar5.e(i29 + 8);
                            String string = Integer.toString(iB3);
                            int i34 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17241b[(nVar5.j() & 192) >> 6];
                            int iJ3 = nVar5.j();
                            int i35 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17243d[(iJ3 & 56) >> 3];
                            if ((iJ3 & 4) != 0) {
                                i35++;
                            }
                            fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string, "audio/ac3", -1, -1, i35, i34, null, dVar, str5);
                        } else if (iB17 == c.f17785r) {
                            nVar5.e(i29 + 8);
                            String string2 = Integer.toString(iB3);
                            nVar5.e(nVar5.f18795b + 2);
                            int i36 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17241b[(nVar5.j() & 192) >> 6];
                            int iJ4 = nVar5.j();
                            int i37 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17243d[(iJ4 & 14) >> 1];
                            if ((iJ4 & 1) != 0) {
                                i37++;
                            }
                            fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string2, "audio/eac3", -1, -1, i37, i36, null, dVar, str5);
                        } else if (iB17 == c.f17795w) {
                            fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str9, -1, -1, iIntValue, iIntValue2, null, dVar, str5);
                        } else if (iB17 == c.O0) {
                            byte[] bArr3 = new byte[iB16];
                            nVar5.e(i29);
                            nVar5.a(bArr3, 0, iB16);
                            bArr2 = bArr3;
                            str2 = str6;
                        }
                        str2 = str6;
                    }
                    i29 += iB16;
                    str6 = str2;
                    i19 = i31;
                    iB11 = i33;
                }
                i10 = i19;
                int i38 = iB11;
                if (fVar.f17814b == null && str9 != null) {
                    fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str9, -1, -1, iIntValue, iIntValue2, "audio/raw".equals(str9) ? 2 : -1, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), dVar, 0, str5, null);
                }
                i12 = i38;
            } else {
                int i39 = c.f17772k0;
                if (iB12 == i39 || iB12 == c.f17792u0 || iB12 == c.f17794v0 || iB12 == c.f17796w0 || iB12 == c.f17798x0) {
                    nVar5.e(i22 + 16);
                    if (iB12 == i39) {
                        j13 = Long.MAX_VALUE;
                        listSingletonList = null;
                        str4 = "application/ttml+xml";
                    } else if (iB12 == c.f17792u0) {
                        int i40 = iB11 - 16;
                        byte[] bArr4 = new byte[i40];
                        nVar5.a(bArr4, 0, i40);
                        listSingletonList = Collections.singletonList(bArr4);
                        j13 = Long.MAX_VALUE;
                        str4 = "application/x-quicktime-tx3g";
                    } else {
                        if (iB12 == c.f17794v0) {
                            str3 = "application/x-mp4-vtt";
                        } else if (iB12 == c.f17796w0) {
                            str4 = "application/ttml+xml";
                            j13 = 0;
                            listSingletonList = null;
                        } else {
                            if (iB12 != c.f17798x0) {
                                throw new IllegalStateException();
                            }
                            fVar.f17816d = 1;
                            str3 = "application/x-mp4-cea-608";
                        }
                        j13 = Long.MAX_VALUE;
                        listSingletonList = null;
                        str4 = str3;
                    }
                    fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str4, 0, str5, -1, dVar, j13, listSingletonList);
                } else if (iB12 == c.N0) {
                    fVar.f17814b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), "application/x-camera-motion", dVar);
                }
                pair = pairCreate2;
                i10 = i19;
                j12 = jK2;
                i12 = iB11;
                i11 = i15;
            }
            nVar5.e(i22 + i12);
            i21++;
            iB10 = i23;
            jK2 = j12;
            i15 = i11;
            pairCreate2 = pair;
            i19 = i10;
        }
        Pair pair2 = pairCreate2;
        long j14 = jK2;
        int i41 = i15;
        a aVarB3 = aVar.b(c.Q);
        if (aVarB3 == null || (bVarC = aVarB3.c(c.R)) == null) {
            sVar = null;
            pairCreate = Pair.create(null, null);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVarC.P0;
            nVar6.e(8);
            int iB19 = (nVar6.b() >> 24) & 255;
            int iM = nVar6.m();
            long[] jArr = new long[iM];
            long[] jArr2 = new long[iM];
            for (int i42 = 0; i42 < iM; i42++) {
                jArr[i42] = iB19 == 1 ? nVar6.n() : nVar6.k();
                jArr2[i42] = iB19 == 1 ? nVar6.g() : nVar6.b();
                byte[] bArr5 = nVar6.f18794a;
                int i43 = nVar6.f18795b;
                int i44 = (bArr5[i43] & 255) << 8;
                nVar6.f18795b = i43 + 2;
                if (((short) ((bArr5[i43 + 1] & 255) | i44)) != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                nVar6.e(i43 + 4);
            }
            pairCreate = Pair.create(jArr, jArr2);
            sVar = null;
        }
        return fVar.f17814b == null ? sVar : new s(iB3, i41, ((Long) pair2.first).longValue(), j14, jA, fVar.f17814b, fVar.f17816d, fVar.f17813a, fVar.f17815c, (long[]) pairCreate.first, (long[]) pairCreate.second);
    }
}
