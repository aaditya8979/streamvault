package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C2852iq extends C1966Lx {
    public static byte[] A00;
    public static String[] A01 = {"OfRtwvXctRBBw9gKY8TWbFYEyrfTWUJ5", "O6KpU7VzQb47vbeRDg05X09dlcjSdrsx", "cGvb3Ixjw9glBryIXlKjYbTfS5Fhfs8X", "N3q9w52q7yAs4MQ92KFgaGGqaH957eGg", "tjYOyBogfVGQWArOceKhNo0cgBZwypsu", "xmSgRcjNSrQyzCd8Uu5cYZa5hRrGr9a8", "10tums6VyruOnAjrgpE7eJ8", "dQkd96lx4iAtJg2k9NqdAtWwc5SxpqrB"};
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;

    static {
        A08();
        A02 = Pattern.compile(A07(8, 29, 103), 32);
        A03 = Pattern.compile(A07(37, 29, 118), 32);
        A04 = Pattern.compile(A07(66, 30, 91), 32);
    }

    public C2852iq(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[PHI: r8
      0x00aa: PHI (r8v2 long) = (r8v0 long), (r8v3 long) binds: [B:30:0x00d7, B:25:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C2852iq A01(java.io.File r14, long r15, long r17, com.facebook.ads.redexgen.core.M6 r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2852iq.A01(java.io.File, long, long, com.facebook.ads.redexgen.X.M6):com.facebook.ads.redexgen.X.iq");
    }

    public static C2852iq A02(File file, long j10, M6 m62) {
        return A01(file, j10, -9223372036854775807L, m62);
    }

    public static C2852iq A03(String str, long j10) {
        return new C2852iq(str, j10, -1L, -9223372036854775807L, null);
    }

    public static C2852iq A04(String str, long j10, long j11) {
        return new C2852iq(str, j10, j11, -9223372036854775807L, null);
    }

    public static File A05(File file, int i10, long j10, long j11) {
        StringBuilder sbAppend = new StringBuilder().append(i10);
        String strA07 = A07(0, 1, 16);
        return new File(file, sbAppend.append(strA07).append(j10).append(strA07).append(j11).append(A07(1, 7, 86)).toString());
    }

    public static File A06(File file, M6 m62) {
        String strA0l = null;
        String name = file.getName();
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            strA0l = AbstractC15184a.A0l((String) C3M.A01(matcher.group(1)));
        } else {
            matcher = A02.matcher(name);
            if (matcher.matches()) {
                Object objA01 = C3M.A01(matcher.group(1));
                String[] strArr = A01;
                if (strArr[0].charAt(16) == strArr[2].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "SH9gvm8hJK4XlSeUgFI9DN0CGl9RiOAn";
                strArr2[2] = "6Y4JW5a7TLCjGmr1nVotQhjybpiv9cHJ";
                strA0l = (String) objA01;
            }
        }
        if (strA0l == null) {
            return null;
        }
        File fileA05 = A05((File) C3M.A02(file.getParentFile()), m62.A0B(strA0l), Long.parseLong((String) C3M.A01(matcher.group(2))), Long.parseLong((String) C3M.A01(matcher.group(3))));
        if (file.renameTo(fileA05)) {
            return fileA05;
        }
        return null;
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{93, -93, -21, -88, -93, -38, -19, -28, -28, -82, -76, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -4, -73, -30, -76, -21, -2, -11, -86, -13, -67, -61, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, 11, -57, -15, -61, -6, 13, 4, -71, -40, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -16, -83, -42, -88, -33, -14, -23, -98};
    }

    public final C2852iq A09(File file, long j10) {
        C3M.A08(this.A05);
        return new C2852iq(this.A04, this.A02, this.A01, j10, file);
    }
}
