package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import yads.ik1;
import yads.wk1;

/* JADX INFO: loaded from: classes12.dex */
public abstract class wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f96419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f96420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f96421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f96422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f96423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f96426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f96427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f96428j;

    static {
        xk1 xk1Var = pk2.f93623e;
        f96419a = Pattern.compile("^\\D?(\\d+)$");
        f96420b = new HashMap();
        f96421c = xk1Var.b();
        f96422d = xk1Var.c();
        f96423e = xk1Var.O();
        f96424f = xk1Var.q();
        f96425g = xk1Var.r();
        f96426h = xk1Var.a();
        f96427i = xk1Var.F();
        f96428j = -1;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f96428j == -1) {
            int iMax = 0;
            List listA = a("video/avc", false, false);
            ik1 ik1Var = listA.isEmpty() ? null : (ik1) listA.get(0);
            if (ik1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ik1Var.f90864d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ib3.f90737a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f96428j = iMax;
        }
        return f96428j;
    }

    public static /* synthetic */ int a(ik1 ik1Var) {
        String str = ik1Var.f90861a;
        xk1 xk1Var = pk2.f93623e;
        if (str.startsWith(xk1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (ib3.f90737a >= 26 || !str.equals(xk1Var.G())) ? 0 : -1;
    }

    public static /* synthetic */ int a(mx0 mx0Var, ik1 ik1Var) {
        try {
            return ik1Var.a(mx0Var) ? 1 : 0;
        } catch (rk1 unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(vk1 vk1Var, Object obj, Object obj2) {
        return vk1Var.a(obj2) - vk1Var.a(obj);
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] bArrDecode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = bo.c.f5639b;
            if (new String(bArrDecode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), bo.c.f5639b).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), bo.c.f5639b).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), bo.c.f5639b).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static String a(mx0 mx0Var) {
        Pair pairB;
        if ("audio/eac3-joc".equals(mx0Var.f92610m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(mx0Var.f92610m) || (pairB = b(mx0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static ArrayList a(p51 p51Var, final mx0 mx0Var) {
        ArrayList arrayList = new ArrayList(p51Var);
        a(arrayList, new vk1() { // from class: bt.wb
            @Override // yads.vk1
            public final int a(Object obj) {
                return wk1.a(mx0Var, (ik1) obj);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0183 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a A[Catch: Exception -> 0x01a8, TRY_ENTER, TryCatch #5 {Exception -> 0x01a8, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:81:0x0179, B:10:0x0032, B:13:0x003d, B:75:0x0152, B:78:0x015a, B:80:0x0160, B:82:0x0183, B:83:0x01a6), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(yads.qk1 r24, yads.sk1 r25) throws yads.rk1 {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wk1.a(yads.qk1, yads.sk1):java.util.ArrayList");
    }

    public static synchronized List a(String str, boolean z10, boolean z11) {
        qk1 qk1Var = new qk1(str, z10, z11);
        HashMap map = f96420b;
        List list = (List) map.get(qk1Var);
        if (list != null) {
            return list;
        }
        int i10 = ib3.f90737a;
        ArrayList arrayListA = a(qk1Var, i10 >= 21 ? new uk1(z10, z11) : new tk1());
        if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListA = a(qk1Var, new tk1());
            if (!arrayListA.isEmpty()) {
                ih1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((ik1) arrayListA.get(0)).f90861a);
            }
        }
        a(str, arrayListA);
        p51 p51VarA = p51.a((Collection) arrayListA);
        map.put(qk1Var, p51VarA);
        return p51VarA;
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (ib3.f90737a < 26) {
                String str2 = ib3.f90738b;
                xk1 xk1Var = pk2.f93623e;
                if (str2.equals(xk1Var.N()) && arrayList.size() == 1 && ((ik1) arrayList.get(0)).f90861a.equals(xk1Var.G())) {
                    arrayList.add(ik1.a(xk1Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new vk1() { // from class: bt.ub
                @Override // yads.vk1
                public final int a(Object obj) {
                    return wk1.a((ik1) obj);
                }
            });
        }
        int i10 = ib3.f90737a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((ik1) arrayList.get(0)).f90861a;
            xk1 xk1Var2 = pk2.f93623e;
            if (xk1Var2.I().equals(str3) || xk1Var2.H().equals(str3) || xk1Var2.J().equals(str3)) {
                a(arrayList, new vk1() { // from class: bt.vb
                    @Override // yads.vk1
                    public final int a(Object obj) {
                        return wk1.b((ik1) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (pk2.f93623e.M().equals(((ik1) arrayList.get(0)).f90861a)) {
            arrayList.add((ik1) arrayList.remove(0));
        }
    }

    public static void a(ArrayList arrayList, final vk1 vk1Var) {
        Collections.sort(arrayList, new Comparator() { // from class: bt.xb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wk1.a(vk1Var, obj, obj2);
            }
        });
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (ib3.f90737a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(ht1.c(str))) {
            return true;
        }
        String strA = ki.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        byte[] bArrDecode = Base64.decode("b214Lmdvb2dsZS4=", 0);
        Charset charset = bo.c.f5639b;
        if (strA.startsWith(new String(bArrDecode, charset)) || strA.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
            return true;
        }
        if ((strA.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && strA.contains(".sw.")) || strA.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) || strA.startsWith("c2.")) ? false : true;
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = ib3.f90737a;
        if (i10 < 21) {
            byte[] bArrDecode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = bo.c.f5639b;
            if (new String(bArrDecode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            byte[] bArrDecode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = bo.c.f5639b;
            if (new String(bArrDecode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = ib3.f90738b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(ib3.f90739c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = bo.c.f5639b;
            if (new String(bArrDecode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = ib3.f90738b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = bo.c.f5639b;
            if (new String(bArrDecode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = ib3.f90738b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            byte[] bArrDecode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = bo.c.f5639b;
            if ((new String(bArrDecode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(ib3.f90739c)) {
                String str9 = ib3.f90738b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            byte[] bArrDecode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = bo.c.f5639b;
            if (new String(bArrDecode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(ib3.f90739c)) {
                String str10 = ib3.f90738b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str11 = ib3.f90738b;
            byte[] bArrDecode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = bo.c.f5639b;
            if (str11.startsWith(new String(bArrDecode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), bo.c.f5639b).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(ik1 ik1Var) {
        return ik1Var.f90861a.startsWith(pk2.f93623e.K()) ? 1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0421 A[Catch: NumberFormatException -> 0x0431, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0431, blocks: (B:284:0x03c8, B:286:0x03da, B:298:0x03f8, B:314:0x0421), top: B:487:0x03c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(yads.mx0 r20) {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wk1.b(yads.mx0):android.util.Pair");
    }
}
