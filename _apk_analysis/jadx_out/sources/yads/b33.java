package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class b33 extends fz2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f87893r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f87894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c33 f87895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f87896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f87897p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f87898q = -3.4028235E38f;

    public b33(List list) {
        if (list == null || list.isEmpty()) {
            this.f87894m = false;
            this.f87895n = null;
            return;
        }
        this.f87894m = true;
        String strA = ib3.a((byte[]) list.get(0));
        ni.a(strA.startsWith("Format:"));
        this.f87895n = (c33) ni.a(c33.a(strA));
        a(new jb2((byte[]) list.get(1)));
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long a(String str) {
        Matcher matcher = f87893r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = ib3.f90737a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0128 A[SYNTHETIC] */
    @Override // yads.fz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.r43 a(byte[] r39, int r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.b33.a(byte[], int, boolean):yads.r43");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x031d, code lost:
    
        r28.f87896o = r3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0216 A[Catch: RuntimeException -> 0x02ee, TryCatch #3 {RuntimeException -> 0x02ee, blocks: (B:108:0x01dc, B:110:0x01ea, B:111:0x01f0, B:117:0x0212, B:119:0x0216, B:121:0x0225, B:123:0x0229, B:125:0x0238, B:127:0x023c, B:128:0x0242, B:134:0x0264, B:136:0x026a, B:140:0x027b, B:142:0x027f, B:146:0x0290, B:148:0x0294, B:152:0x02a5, B:154:0x02a9, B:158:0x02ba, B:160:0x02be, B:161:0x02c4, B:169:0x02e8, B:167:0x02d5, B:132:0x0249, B:115:0x01ff), top: B:194:0x01dc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0229 A[Catch: RuntimeException -> 0x02ee, TryCatch #3 {RuntimeException -> 0x02ee, blocks: (B:108:0x01dc, B:110:0x01ea, B:111:0x01f0, B:117:0x0212, B:119:0x0216, B:121:0x0225, B:123:0x0229, B:125:0x0238, B:127:0x023c, B:128:0x0242, B:134:0x0264, B:136:0x026a, B:140:0x027b, B:142:0x027f, B:146:0x0290, B:148:0x0294, B:152:0x02a5, B:154:0x02a9, B:158:0x02ba, B:160:0x02be, B:161:0x02c4, B:169:0x02e8, B:167:0x02d5, B:132:0x0249, B:115:0x01ff), top: B:194:0x01dc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c A[Catch: RuntimeException -> 0x02ee, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x02ee, blocks: (B:108:0x01dc, B:110:0x01ea, B:111:0x01f0, B:117:0x0212, B:119:0x0216, B:121:0x0225, B:123:0x0229, B:125:0x0238, B:127:0x023c, B:128:0x0242, B:134:0x0264, B:136:0x026a, B:140:0x027b, B:142:0x027f, B:146:0x0290, B:148:0x0294, B:152:0x02a5, B:154:0x02a9, B:158:0x02ba, B:160:0x02be, B:161:0x02c4, B:169:0x02e8, B:167:0x02d5, B:132:0x0249, B:115:0x01ff), top: B:194:0x01dc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02be A[Catch: RuntimeException -> 0x02ee, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x02ee, blocks: (B:108:0x01dc, B:110:0x01ea, B:111:0x01f0, B:117:0x0212, B:119:0x0216, B:121:0x0225, B:123:0x0229, B:125:0x0238, B:127:0x023c, B:128:0x0242, B:134:0x0264, B:136:0x026a, B:140:0x027b, B:142:0x027f, B:146:0x0290, B:148:0x0294, B:152:0x02a5, B:154:0x02a9, B:158:0x02ba, B:160:0x02be, B:161:0x02c4, B:169:0x02e8, B:167:0x02d5, B:132:0x0249, B:115:0x01ff), top: B:194:0x01dc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.jb2 r29) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.b33.a(yads.jb2):void");
    }
}
