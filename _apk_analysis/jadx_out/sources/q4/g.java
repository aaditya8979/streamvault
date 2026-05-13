package q4;

import a6.t;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.ApicFrame;
import com.google.android.exoplayer.metadata.id3.CommentFrame;
import com.google.android.exoplayer.metadata.id3.Id3Frame;
import com.google.android.exoplayer.metadata.id3.InternalFrame;
import com.google.android.exoplayer.metadata.id3.TextInformationFrame;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f77741a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static Format a(int i10, Format format, @Nullable Metadata metadata, @Nullable Metadata metadata2, k4.o oVar) {
        if (i10 == 1) {
            if (oVar.a()) {
                format = format.h(oVar.f72901a, oVar.f72902b);
            }
            return metadata != null ? format.l(metadata) : format;
        }
        if (i10 != 2 || metadata2 == null) {
            return format;
        }
        for (int i11 = 0; i11 < metadata2.e(); i11++) {
            Metadata.Entry entryD = metadata2.d(i11);
            if (entryD instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryD;
                if ("com.android.capture.fps".equals(mdtaMetadataEntry.f20147b)) {
                    format = format.l(new Metadata(mdtaMetadataEntry));
                }
            }
        }
        return format;
    }

    @Nullable
    public static CommentFrame b(int i10, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            String strT = tVar.t(iJ - 16);
            return new CommentFrame("und", strT, strT);
        }
        a6.m.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static ApicFrame c(t tVar) {
        int iJ = tVar.j();
        if (tVar.j() != 1684108385) {
            a6.m.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(tVar.j());
        String str = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
        if (str == null) {
            a6.m.h("MetadataUtil", "Unrecognized cover art flags: " + iB);
            return null;
        }
        tVar.M(4);
        int i10 = iJ - 16;
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry d(t tVar) {
        int iC = tVar.c() + tVar.j();
        int iJ = tVar.j();
        int i10 = (iJ >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iJ;
                if (i11 == 6516084) {
                    return b(iJ, tVar);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return i(iJ, "TIT2", tVar);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return i(iJ, "TCOM", tVar);
                }
                if (i11 == 6578553) {
                    return i(iJ, "TDRC", tVar);
                }
                if (i11 == 4280916) {
                    return i(iJ, "TPE1", tVar);
                }
                if (i11 == 7630703) {
                    return i(iJ, "TSSE", tVar);
                }
                if (i11 == 6384738) {
                    return i(iJ, "TALB", tVar);
                }
                if (i11 == 7108978) {
                    return i(iJ, "USLT", tVar);
                }
                if (i11 == 6776174) {
                    return i(iJ, "TCON", tVar);
                }
                if (i11 == 6779504) {
                    return i(iJ, "TIT1", tVar);
                }
            } else {
                if (iJ == 1735291493) {
                    return h(tVar);
                }
                if (iJ == 1684632427) {
                    return e(iJ, "TPOS", tVar);
                }
                if (iJ == 1953655662) {
                    return e(iJ, "TRCK", tVar);
                }
                if (iJ == 1953329263) {
                    return j(iJ, "TBPM", tVar, true, false);
                }
                if (iJ == 1668311404) {
                    return j(iJ, "TCMP", tVar, true, true);
                }
                if (iJ == 1668249202) {
                    return c(tVar);
                }
                if (iJ == 1631670868) {
                    return i(iJ, "TPE2", tVar);
                }
                if (iJ == 1936682605) {
                    return i(iJ, "TSOT", tVar);
                }
                if (iJ == 1936679276) {
                    return i(iJ, "TSO2", tVar);
                }
                if (iJ == 1936679282) {
                    return i(iJ, "TSOA", tVar);
                }
                if (iJ == 1936679265) {
                    return i(iJ, "TSOP", tVar);
                }
                if (iJ == 1936679791) {
                    return i(iJ, "TSOC", tVar);
                }
                if (iJ == 1920233063) {
                    return j(iJ, "ITUNESADVISORY", tVar, false, false);
                }
                if (iJ == 1885823344) {
                    return j(iJ, "ITUNESGAPLESS", tVar, false, true);
                }
                if (iJ == 1936683886) {
                    return i(iJ, "TVSHOWSORT", tVar);
                }
                if (iJ == 1953919848) {
                    return i(iJ, "TVSHOW", tVar);
                }
                if (iJ == 757935405) {
                    return f(tVar, iC);
                }
            }
            a6.m.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iJ));
            return null;
        } finally {
            tVar.L(iC);
        }
    }

    @Nullable
    public static TextInformationFrame e(int i10, String str, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385 && iJ >= 22) {
            tVar.M(10);
            int iE = tVar.E();
            if (iE > 0) {
                String str2 = "" + iE;
                int iE2 = tVar.E();
                if (iE2 > 0) {
                    str2 = str2 + "/" + iE2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        a6.m.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static Id3Frame f(t tVar, int i10) {
        int i11 = -1;
        int i12 = -1;
        String strT = null;
        String strT2 = null;
        while (tVar.c() < i10) {
            int iC = tVar.c();
            int iJ = tVar.j();
            int iJ2 = tVar.j();
            tVar.M(4);
            if (iJ2 == 1835360622) {
                strT = tVar.t(iJ - 12);
            } else if (iJ2 == 1851878757) {
                strT2 = tVar.t(iJ - 12);
            } else {
                if (iJ2 == 1684108385) {
                    i11 = iC;
                    i12 = iJ;
                }
                tVar.M(iJ - 12);
            }
        }
        if (strT == null || strT2 == null || i11 == -1) {
            return null;
        }
        tVar.L(i11);
        tVar.M(16);
        return new InternalFrame(strT, strT2, tVar.t(i12 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry g(t tVar, int i10, String str) {
        while (true) {
            int iC = tVar.c();
            if (iC >= i10) {
                return null;
            }
            int iJ = tVar.j();
            if (tVar.j() == 1684108385) {
                int iJ2 = tVar.j();
                int iJ3 = tVar.j();
                int i11 = iJ - 16;
                byte[] bArr = new byte[i11];
                tVar.h(bArr, 0, i11);
                return new MdtaMetadataEntry(str, bArr, iJ3, iJ2);
            }
            tVar.L(iC + iJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer.metadata.id3.TextInformationFrame h(a6.t r3) {
        /*
            int r3 = k(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = q4.g.f77741a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            a6.m.h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.g.h(a6.t):com.google.android.exoplayer.metadata.id3.TextInformationFrame");
    }

    @Nullable
    public static TextInformationFrame i(int i10, String str, t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            return new TextInformationFrame(str, null, tVar.t(iJ - 16));
        }
        a6.m.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    @Nullable
    public static Id3Frame j(int i10, String str, t tVar, boolean z10, boolean z11) {
        int iK = k(tVar);
        if (z11) {
            iK = Math.min(1, iK);
        }
        if (iK >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(iK)) : new CommentFrame("und", str, Integer.toString(iK));
        }
        a6.m.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    public static int k(t tVar) {
        tVar.M(4);
        if (tVar.j() == 1684108385) {
            tVar.M(8);
            return tVar.y();
        }
        a6.m.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
