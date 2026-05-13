package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pd3 {
    public static od3 a(String str) {
        Integer numR;
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (str.charAt(i10) == '-') {
                    str = str.substring(0, i10);
                    tn.p.j(str, "substring(...)");
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        List listT0 = bo.d0.T0(str, new char[]{'.'}, false, 0, 6, null);
        String str2 = (String) cn.f0.w0(listT0, 0);
        if (str2 == null || (numR = bo.z.r(str2)) == null) {
            return null;
        }
        int iIntValue = numR.intValue();
        Integer numR2 = bo.z.r((String) (1 <= cn.w.o(listT0) ? listT0.get(1) : "0"));
        if (numR2 == null) {
            return null;
        }
        int iIntValue2 = numR2.intValue();
        Integer numR3 = bo.z.r((String) (2 <= cn.w.o(listT0) ? listT0.get(2) : "0"));
        if (numR3 != null) {
            return new od3(iIntValue, iIntValue2, numR3.intValue());
        }
        return null;
    }
}
