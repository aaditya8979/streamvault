package q6;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import i6.v;
import s7.a0;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f77915a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    public static CommentFrame a(int i10, a0 a0Var) {
        int iN = a0Var.n();
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            String strY = a0Var.y(iN - 16);
            return new CommentFrame("und", strY, strY);
        }
        s7.q.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static ApicFrame b(a0 a0Var) {
        int iN = a0Var.n();
        if (a0Var.n() != 1684108385) {
            s7.q.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(a0Var.n());
        String str = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
        if (str == null) {
            s7.q.i("MetadataUtil", "Unrecognized cover art flags: " + iB);
            return null;
        }
        a0Var.Q(4);
        int i10 = iN - 16;
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry c(a0 a0Var) {
        int iE = a0Var.e() + a0Var.n();
        int iN = a0Var.n();
        int i10 = (iN >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iN;
                if (i11 == 6516084) {
                    return a(iN, a0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return h(iN, "TIT2", a0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return h(iN, "TCOM", a0Var);
                }
                if (i11 == 6578553) {
                    return h(iN, "TDRC", a0Var);
                }
                if (i11 == 4280916) {
                    return h(iN, "TPE1", a0Var);
                }
                if (i11 == 7630703) {
                    return h(iN, "TSSE", a0Var);
                }
                if (i11 == 6384738) {
                    return h(iN, "TALB", a0Var);
                }
                if (i11 == 7108978) {
                    return h(iN, "USLT", a0Var);
                }
                if (i11 == 6776174) {
                    return h(iN, "TCON", a0Var);
                }
                if (i11 == 6779504) {
                    return h(iN, "TIT1", a0Var);
                }
            } else {
                if (iN == 1735291493) {
                    return g(a0Var);
                }
                if (iN == 1684632427) {
                    return d(iN, "TPOS", a0Var);
                }
                if (iN == 1953655662) {
                    return d(iN, "TRCK", a0Var);
                }
                if (iN == 1953329263) {
                    return i(iN, "TBPM", a0Var, true, false);
                }
                if (iN == 1668311404) {
                    return i(iN, "TCMP", a0Var, true, true);
                }
                if (iN == 1668249202) {
                    return b(a0Var);
                }
                if (iN == 1631670868) {
                    return h(iN, "TPE2", a0Var);
                }
                if (iN == 1936682605) {
                    return h(iN, "TSOT", a0Var);
                }
                if (iN == 1936679276) {
                    return h(iN, "TSO2", a0Var);
                }
                if (iN == 1936679282) {
                    return h(iN, "TSOA", a0Var);
                }
                if (iN == 1936679265) {
                    return h(iN, "TSOP", a0Var);
                }
                if (iN == 1936679791) {
                    return h(iN, "TSOC", a0Var);
                }
                if (iN == 1920233063) {
                    return i(iN, "ITUNESADVISORY", a0Var, false, false);
                }
                if (iN == 1885823344) {
                    return i(iN, "ITUNESGAPLESS", a0Var, false, true);
                }
                if (iN == 1936683886) {
                    return h(iN, "TVSHOWSORT", a0Var);
                }
                if (iN == 1953919848) {
                    return h(iN, "TVSHOW", a0Var);
                }
                if (iN == 757935405) {
                    return e(a0Var, iE);
                }
            }
            s7.q.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iN));
            return null;
        } finally {
            a0Var.P(iE);
        }
    }

    @Nullable
    public static TextInformationFrame d(int i10, String str, a0 a0Var) {
        int iN = a0Var.n();
        if (a0Var.n() == 1684108385 && iN >= 22) {
            a0Var.Q(10);
            int iJ = a0Var.J();
            if (iJ > 0) {
                String str2 = "" + iJ;
                int iJ2 = a0Var.J();
                if (iJ2 > 0) {
                    str2 = str2 + "/" + iJ2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        s7.q.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static Id3Frame e(a0 a0Var, int i10) {
        int i11 = -1;
        int i12 = -1;
        String strY = null;
        String strY2 = null;
        while (a0Var.e() < i10) {
            int iE = a0Var.e();
            int iN = a0Var.n();
            int iN2 = a0Var.n();
            a0Var.Q(4);
            if (iN2 == 1835360622) {
                strY = a0Var.y(iN - 12);
            } else if (iN2 == 1851878757) {
                strY2 = a0Var.y(iN - 12);
            } else {
                if (iN2 == 1684108385) {
                    i11 = iE;
                    i12 = iN;
                }
                a0Var.Q(iN - 12);
            }
        }
        if (strY == null || strY2 == null || i11 == -1) {
            return null;
        }
        a0Var.P(i11);
        a0Var.Q(16);
        return new InternalFrame(strY, strY2, a0Var.y(i12 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry f(a0 a0Var, int i10, String str) {
        while (true) {
            int iE = a0Var.e();
            if (iE >= i10) {
                return null;
            }
            int iN = a0Var.n();
            if (a0Var.n() == 1684108385) {
                int iN2 = a0Var.n();
                int iN3 = a0Var.n();
                int i11 = iN - 16;
                byte[] bArr = new byte[i11];
                a0Var.j(bArr, 0, i11);
                return new MdtaMetadataEntry(str, bArr, iN3, iN2);
            }
            a0Var.P(iE + iN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame g(s7.a0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = q6.h.f77915a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            s7.q.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.h.g(s7.a0):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @Nullable
    public static TextInformationFrame h(int i10, String str, a0 a0Var) {
        int iN = a0Var.n();
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            return new TextInformationFrame(str, null, a0Var.y(iN - 16));
        }
        s7.q.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static Id3Frame i(int i10, String str, a0 a0Var, boolean z10, boolean z11) {
        int iJ = j(a0Var);
        if (z11) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(iJ)) : new CommentFrame("und", str, Integer.toString(iJ));
        }
        s7.q.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    public static int j(a0 a0Var) {
        a0Var.Q(4);
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            return a0Var.D();
        }
        s7.q.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, v vVar, m.b bVar) {
        if (i10 == 1 && vVar.a()) {
            bVar.N(vVar.f63937a).O(vVar.f63938b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r6, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r7, com.google.android.exoplayer2.m.b r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
        /*
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.f()
            if (r5 >= r6) goto L3c
            com.google.android.exoplayer2.metadata.Metadata$Entry r6 = r7.e(r5)
            boolean r3 = r6 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r6 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.f21949b
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.c(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.f()
            if (r5 <= 0) goto L52
            r8.X(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.h.l(int, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.m$b, com.google.android.exoplayer2.metadata.Metadata[]):void");
    }
}
