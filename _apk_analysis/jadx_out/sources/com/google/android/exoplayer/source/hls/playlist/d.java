package com.google.android.exoplayer.source.hls.playlist;

import a6.k0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer.source.hls.playlist.b;
import com.google.android.exoplayer.upstream.g;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import e4.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q4.j;

/* JADX INFO: compiled from: HlsPlaylistParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements g.a<k5.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f20619b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20620c = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20621d = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f20622e = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f20623f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f20624g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f20625h = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f20626i = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f20627j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f20628k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f20629l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f20630m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f20631n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f20632o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f20633p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f20634q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f20635r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f20636s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f20637t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f20638u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f20639v = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f20640w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f20641x = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f20642y = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f20643z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern A = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern F = b("AUTOSELECT");
    public static final Pattern G = b("DEFAULT");
    public static final Pattern H = b("FORCED");
    public static final Pattern I = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: compiled from: HlsPlaylistParser.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f20645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<String> f20646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f20647c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f20646b = queue;
            this.f20645a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f20647c != null) {
                return true;
            }
            if (!this.f20646b.isEmpty()) {
                this.f20647c = (String) a6.a.e(this.f20646b.poll());
                return true;
            }
            do {
                String line = this.f20645a.readLine();
                this.f20647c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f20647c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f20647c;
            this.f20647c = null;
            return str;
        }
    }

    public d() {
        this(b.f20573n);
    }

    public d(b bVar) {
        this.f20644a = bVar;
    }

    public static boolean a(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iV = v(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iV != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iV = bufferedReader.read();
        }
        return k0.g0(v(bufferedReader, false, iV));
    }

    public static Pattern b(String str) {
        return Pattern.compile(str + "=(NO" + ImpressionLog.Q + "YES)");
    }

    @Nullable
    public static b.C0291b c(ArrayList<b.C0291b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0291b c0291b = arrayList.get(i10);
            if (str.equals(c0291b.f20591d)) {
                return c0291b;
            }
        }
        return null;
    }

    @Nullable
    public static b.C0291b d(ArrayList<b.C0291b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0291b c0291b = arrayList.get(i10);
            if (str.equals(c0291b.f20592e)) {
                return c0291b;
            }
        }
        return null;
    }

    @Nullable
    public static b.C0291b e(ArrayList<b.C0291b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b.C0291b c0291b = arrayList.get(i10);
            if (str.equals(c0291b.f20590c)) {
                return c0291b;
            }
        }
        return null;
    }

    public static double g(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(t(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    public static DrmInitData.SchemeData h(String str, String str2, Map<String, String> map) throws ParserException {
        String strP = p(str, f20640w, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strT = t(str, f20641x, map);
            return new DrmInitData.SchemeData(k.f60170d, "video/mp4", Base64.decode(strT.substring(strT.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(k.f60170d, "hls", k0.c0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strP)) {
            return null;
        }
        String strT2 = t(str, f20641x, map);
        byte[] bArrDecode = Base64.decode(strT2.substring(strT2.indexOf(44)), 0);
        UUID uuid = k.f60171e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", j.a(uuid, bArrDecode));
    }

    public static String i(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int j(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(t(str, pattern, Collections.emptyMap()));
    }

    public static long k(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(t(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer.source.hls.playlist.b l(com.google.android.exoplayer.source.hls.playlist.d.a r40, java.lang.String r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.source.hls.playlist.d.l(com.google.android.exoplayer.source.hls.playlist.d$a, java.lang.String):com.google.android.exoplayer.source.hls.playlist.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf A[PHI: r12
      0x01bf: PHI (r12v8 java.lang.String) = (r12v6 java.lang.String), (r12v2 java.lang.String) binds: [B:71:0x01cf, B:65:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v10 */
    /* JADX WARN: Type inference failed for: r45v11 */
    /* JADX WARN: Type inference failed for: r45v12 */
    /* JADX WARN: Type inference failed for: r45v13 */
    /* JADX WARN: Type inference failed for: r45v14 */
    /* JADX WARN: Type inference failed for: r45v15 */
    /* JADX WARN: Type inference failed for: r45v16 */
    /* JADX WARN: Type inference failed for: r45v17 */
    /* JADX WARN: Type inference failed for: r45v18 */
    /* JADX WARN: Type inference failed for: r45v19 */
    /* JADX WARN: Type inference failed for: r45v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v20 */
    /* JADX WARN: Type inference failed for: r45v21 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r45v4 */
    /* JADX WARN: Type inference failed for: r45v5 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r45v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer.source.hls.playlist.c m(com.google.android.exoplayer.source.hls.playlist.b r64, com.google.android.exoplayer.source.hls.playlist.d.a r65, java.lang.String r66) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.source.hls.playlist.d.m(com.google.android.exoplayer.source.hls.playlist.b, com.google.android.exoplayer.source.hls.playlist.d$a, java.lang.String):com.google.android.exoplayer.source.hls.playlist.c");
    }

    public static boolean n(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z10;
    }

    public static int o(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : i10;
    }

    public static String p(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : u(str2, map);
    }

    @Nullable
    public static String q(String str, Pattern pattern, Map<String, String> map) {
        return p(str, pattern, null, map);
    }

    public static int r(String str, Map<String, String> map) {
        String strQ = q(str, D, map);
        if (TextUtils.isEmpty(strQ)) {
            return 0;
        }
        String[] strArrD0 = k0.D0(strQ, StringUtils.COMMA);
        int i10 = k0.s(strArrD0, "public.accessibility.describes-video") ? 512 : 0;
        if (k0.s(strArrD0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (k0.s(strArrD0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return k0.s(strArrD0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int s(String str) {
        boolean zN = n(str, G, false);
        ?? r02 = zN;
        if (n(str, H, false)) {
            r02 = (zN ? 1 : 0) | 2;
        }
        return n(str, F, false) ? r02 | 4 : r02;
    }

    public static String t(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strQ = q(str, pattern, map);
        if (strQ != null) {
            return strQ;
        }
        throw new ParserException("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String u(String str, Map<String, String> map) {
        Matcher matcher = K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int v(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !k0.g0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    @Override // com.google.android.exoplayer.upstream.g.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k5.d parse(Uri uri, InputStream inputStream) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    k0.n(bufferedReader);
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return l(new a(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return m(this.f20644a, new a(arrayDeque, bufferedReader), uri.toString());
        } finally {
            k0.n(bufferedReader);
        }
    }
}
