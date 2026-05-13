package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorMath.java */
/* JADX INFO: loaded from: classes9.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f35848b = Arrays.asList("mathabs", "mathCeil", "mathFloor", "mathRound", "mathPow", "mathSqrt", "mathAtan2", "randomNumber");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f35849a;

    public k(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f35849a = cVar;
    }

    private Object a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? Double.valueOf(d10) : d10 == Math.floor(d10) ? Integer.valueOf((int) d10) : Double.valueOf(b(d10));
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:116)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014a A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0157 A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r12, java.lang.Object r13, java.util.List<java.lang.Object> r14) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.k.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f35848b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
