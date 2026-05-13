package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    public zzanf() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0378 A[Catch: zzamb -> 0x03cb, TryCatch #2 {zzamb -> 0x03cb, blocks: (B:167:0x02e0, B:169:0x02f9, B:172:0x030f, B:174:0x0315, B:176:0x031c, B:197:0x0352, B:202:0x037b, B:204:0x0382, B:198:0x0356, B:199:0x0373, B:200:0x0374, B:201:0x0378, B:205:0x038b, B:206:0x03a8, B:171:0x0302, B:207:0x03a9, B:208:0x03ca), top: B:228:0x02e0 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzani zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzani r18) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzani):com.google.android.gms.internal.ads.zzani");
    }

    private static zzani zze(@Nullable zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgql.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzand r14) throws com.google.android.gms.internal.ads.zzamb {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzg(java.lang.String, com.google.android.gms.internal.ads.zzand):long");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i10, i11), zzameVar, zzdrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x049a A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0491, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04f0 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0491, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0693 A[PHI: r14
      0x0693: PHI (r14v5 long) = (r14v4 long), (r14v7 long) binds: [B:352:0x067c, B:359:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06a8 A[Catch: zzamb -> 0x06ac, IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #2 {zzamb -> 0x06ac, blocks: (B:365:0x06a3, B:367:0x06a8), top: B:415:0x06a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0491, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzama zzb(byte[] r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzama");
    }
}
