package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ee extends ea {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1958 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1959 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1960 = -7159607425052080275L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1961;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed[] f1962;

    public ee(ed edVar, String str, List<ed> list, List<ed> list2, dm dmVar) {
        super(str, list2, dmVar);
        this.f1961 = edVar;
        if (list != null) {
            ed[] edVarArr = new ed[list.size()];
            this.f1962 = edVarArr;
            list.toArray(edVarArr);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m6224(ed[] edVarArr, du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        int length = edVarArr.length;
        int i10 = 0;
        while (true) {
            if ((i10 < length ? (char) 19 : '_') != 19) {
                int i11 = f1958 + 5;
                f1959 = i11 % 128;
                int i12 = i11 % 2;
                return arrayList;
            }
            int i13 = f1959 + 17;
            f1958 = i13 % 128;
            int i14 = i13 % 2;
            arrayList.add((Class) edVarArr[i10].m6222(duVar, cqVar).m6165());
            i10++;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6225() {
        int i10 = f1958 + 11;
        f1959 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        if (this.f1962 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6226("蝑", TextUtils.getOffsetBefore("", 0) + 63179).intern());
        sb2.append(ed.m6220(this.f1962));
        sb2.append(m6226("蝓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30808).intern());
        String string = sb2.toString();
        int i11 = f1959 + 121;
        f1958 = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6226(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f1960);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f1958 + 65;
            f1959 = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (obj == null || ee.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ee eeVar = (ee) obj;
        ed edVar = this.f1961;
        if (edVar == null ? eeVar.f1961 != null : !edVar.equals(eeVar.f1961)) {
            return false;
        }
        ed[] edVarArr = this.f1962;
        if (edVarArr == null) {
            if ((eeVar.f1962 == null ? '-' : (char) 30) != '-') {
                return false;
            }
            int i12 = f1958 + 13;
            f1959 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f1959 + 81;
        f1958 = i14 % 128;
        int i15 = i14 % 2;
        ed[] edVarArr2 = eeVar.f1962;
        if (i15 != 0) {
            return edVarArr.equals(edVarArr2);
        }
        edVarArr.equals(edVarArr2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r0
      0x002f: PHI (r0v12 int) = (r0v6 int), (r0v14 int) binds: [B:15:0x002d, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[PHI: r0
      0x003b: PHI (r0v7 int) = (r0v6 int), (r0v14 int) binds: [B:15:0x002d, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ee.f1959
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1958 = r1
            int r0 = r0 % 2
            r1 = 76
            if (r0 != 0) goto L11
            r0 = 18
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 0
            if (r0 == r1) goto L20
            int r0 = super.hashCode()
            int r0 = r0 / 85
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r5.f1961
            if (r1 == 0) goto L2f
            goto L3b
        L20:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r5.f1961
            if (r1 == 0) goto L2c
            r1 = r2
            goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L3b
        L2f:
            int r1 = com.ironsource.adqualitysdk.sdk.i.ee.f1958
            int r1 = r1 + 103
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1959 = r3
            int r1 = r1 % 2
            r1 = r2
            goto L4b
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r5.f1961
            int r1 = r1.hashCode()
            int r3 = com.ironsource.adqualitysdk.sdk.i.ee.f1958
            int r3 = r3 + 59
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1959 = r4
            int r3 = r3 % 2
        L4b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ed[] r1 = r5.f1962
            if (r1 == 0) goto L61
            int r2 = r1.hashCode()
            int r1 = com.ironsource.adqualitysdk.sdk.i.ee.f1959
            int r1 = r1 + 77
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1958 = r3
        L5e:
            int r1 = r1 % 2
            goto L6a
        L61:
            int r1 = com.ironsource.adqualitysdk.sdk.i.ee.f1958
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1959 = r3
            goto L5e
        L6a:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ee.hashCode():int");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final String toString() {
        int i10 = f1958 + 89;
        f1959 = i10 % 128;
        int i11 = i10 % 2;
        String strMo6216 = mo6216(m6214());
        int i12 = f1959 + 47;
        f1958 = i12 % 128;
        if ((i12 % 2 == 0 ? 'C' : '2') != 'C') {
            return strMo6216;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea, com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        Method methodM6919;
        List<Object> listM6213 = m6213(duVar, cqVar);
        ed edVar = this.f1961;
        if ((edVar instanceof ek) && ((ek) edVar).m6239().equals(m6226("蜞ï裳ჭ飃", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34807).intern())) {
            return cqVar.m5764().m6412().m6413(m6215()).m6173(duVar, cqVar, listM6213).m6168(false);
        }
        Object objM6165 = this.f1961.m6222(duVar, cqVar).m6165();
        if (objM6165 instanceof cl) {
            return new dr(((cl) objM6165).mo4888(m6215(), listM6213, cqVar.m5760()));
        }
        if (objM6165 instanceof ci) {
            String strM6215 = m6215();
            cqVar.m5760();
            return new dr(((ci) objM6165).mo5621(cqVar, strM6215, listM6213, duVar));
        }
        if (objM6165 instanceof cq) {
            synchronized (objM6165) {
                cq cqVar2 = (cq) objM6165;
                ds dsVarM5763 = cqVar2.m5763(m6215());
                if (dsVarM5763 != null) {
                    return dsVarM5763.m6173(cqVar2.m5761(), cqVar2, listM6213).m6168(false);
                }
                String strM5759 = cqVar.m5759();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6226("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7411 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                sb2.append(m6215());
                co.m5699(strM5759, sb2.toString(), new NoSuchMethodException());
            }
        }
        try {
            ed[] edVarArr = this.f1962;
            if (edVarArr != null) {
                methodM6919 = kb.m6926(objM6165, m6215(), m6224(edVarArr, duVar, cqVar));
            } else {
                methodM6919 = kb.m6919(objM6165, m6215(), listM6213);
            }
            if (methodM6919 != null) {
                return new dr(methodM6919.invoke(objM6165, listM6213.toArray()));
            }
            listM6213.add(0, objM6165);
            db dbVarM5758 = cqVar.m5758();
            String strM62152 = m6215();
            cqVar.m5760();
            return new dr(dbVarM5758.mo5621(cqVar, strM62152, listM6213, duVar));
        } catch (IllegalAccessException e10) {
            String strM57592 = cqVar.m5759();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6226("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", TextUtils.lastIndexOf("", '0') + 7412).intern());
            sb3.append(this);
            co.m5699(strM57592, sb3.toString(), e10);
            return null;
        } catch (IllegalArgumentException e11) {
            String strM57593 = cqVar.m5759();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m6226("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7412 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb4.append(this);
            co.m5699(strM57593, sb4.toString(), e11);
            return null;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /* JADX INFO: renamed from: ﾇ */
    public final String mo6216(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1961);
        sb2.append(m6226("蝃", 26459 - (Process.myPid() >> 22)).intern());
        sb2.append(m6215());
        sb2.append(m6225());
        sb2.append(m6226("蝅", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32321).intern());
        sb2.append(ed.m6220(objArr));
        sb2.append(m6226("蝄", (-16727225) - Color.rgb(0, 0, 0)).intern());
        String string = sb2.toString();
        int i10 = f1959 + 49;
        f1958 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }
}
