package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17606a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17607b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17608c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17609d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17610e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f17611f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f17612g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f17613h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f17614i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f17615j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f17616k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f17617l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f17618m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f17619n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f17620o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f17621p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f17622q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f17623r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f17624s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f17625t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f17626u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f17627v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f r45, java.lang.String r46) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b");
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d b(f fVar, String str) throws r {
        String str2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 2;
        String str3 = null;
        long j10 = 0;
        int i12 = 0;
        int i13 = 1;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        c cVar = null;
        String strA = null;
        String strB = null;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = false;
        int i18 = 0;
        int i19 = 0;
        boolean zEquals = false;
        int i20 = 1;
        while (true) {
            long j17 = -1;
            while (fVar.a()) {
                if (fVar.a()) {
                    str2 = fVar.f17605c;
                    fVar.f17605c = str3;
                } else {
                    str2 = str3;
                }
                if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String strB2 = b(str2, f17612g);
                    if ("VOD".equals(strB2)) {
                        i14 = i13;
                    } else if ("EVENT".equals(strB2)) {
                        i14 = i11;
                    }
                } else if (str2.startsWith("#EXT-X-START")) {
                    j11 = (long) (Double.parseDouble(b(str2, f17615j)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-MAP")) {
                    String strB3 = b(str2, f17619n);
                    String strA2 = a(str2, f17617l);
                    if (strA2 != null) {
                        String[] strArrSplit = strA2.split("@");
                        j17 = Long.parseLong(strArrSplit[i12]);
                        if (strArrSplit.length > i13) {
                            j14 = Long.parseLong(strArrSplit[i13]);
                        }
                    }
                    cVar = new c(strB3, 0L, -1, -9223372036854775807L, false, null, null, j14, j17);
                    j14 = j10;
                    str3 = null;
                } else {
                    if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j12 = 1000000 * ((long) Integer.parseInt(b(str2, f17610e)));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i18 = Integer.parseInt(b(str2, f17613h));
                        i17 = i18;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i20 = Integer.parseInt(b(str2, f17611f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j16 = (long) (Double.parseDouble(b(str2, f17614i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f17618m));
                        if (zEquals) {
                            strB = b(str2, f17619n);
                            strA = a(str2, f17620o);
                        } else {
                            str3 = null;
                            strA = null;
                            strB = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit2 = b(str2, f17616k).split("@");
                        j17 = Long.parseLong(strArrSplit2[i12]);
                        if (strArrSplit2.length > i13) {
                            j14 = Long.parseLong(strArrSplit2[i13]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i16 = Integer.parseInt(str2.substring(str2.indexOf(58) + i13));
                        i15 = i13;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i19++;
                    } else if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j13 == j10) {
                            String strSubstring = str2.substring(str2.indexOf(58) + i13);
                            Matcher matcher = z.f18827f.matcher(strSubstring);
                            if (!matcher.matches()) {
                                throw new r("Invalid date/time format: " + strSubstring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i10 = i12;
                            } else {
                                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i10 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i13)), Integer.parseInt(matcher.group(i11)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i10 != 0) {
                                timeInMillis -= (long) (i10 * 60000);
                            }
                            int i21 = com.fyber.inneractive.sdk.player.exoplayer2.b.f17363a;
                            j13 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j15;
                        }
                    } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                        arrayList2.add(str2);
                    } else if (!str2.startsWith("#")) {
                        String hexString = !zEquals ? null : strA != null ? strA : Integer.toHexString(i18);
                        int i22 = i18 + 1;
                        if (j17 == -1) {
                            j14 = 0;
                        }
                        arrayList.add(new c(str2, j16, i19, j15, zEquals, strB, hexString, j14, j17));
                        j15 += j16;
                        if (j17 != -1) {
                            j14 += j17;
                        }
                        i18 = i22;
                        j17 = -1;
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                        j16 = 0;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        i11 = 2;
                        str3 = null;
                        j10 = 0;
                        i12 = 0;
                        i13 = 1;
                        z10 = true;
                    }
                    str3 = null;
                }
                i11 = 2;
                str3 = null;
                j10 = 0;
                i12 = 0;
                i13 = 1;
            }
            return new d(i14, str, j11, j13, i15, i16, i17, i20, j12, z10, j13 != 0, cVar, arrayList, arrayList2);
        }
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:33:0x006b, B:34:0x0072, B:12:0x002e, B:14:0x0034, B:17:0x003d, B:19:0x0045, B:22:0x0052, B:24:0x0058, B:28:0x005f, B:29:0x0064, B:35:0x0073, B:37:0x0079, B:40:0x0084, B:42:0x008c, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2), top: B:69:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r8) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }
}
