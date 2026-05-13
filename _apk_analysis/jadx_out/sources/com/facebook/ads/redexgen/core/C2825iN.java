package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2825iN implements MK, MP {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C2813iB A01;
    public InterfaceC1973Me A02;
    public C1974Mf A03;
    public InterfaceC2186Uo A04;
    public List<C2072Qc> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2529dL A0A;
    public final String A0B;

    static {
        A04();
        A0E = C2825iN.class.getSimpleName();
    }

    public C2825iN(C2529dL c2529dL) {
        this(c2529dL, new C2813iB());
    }

    public C2825iN(C2529dL c2529dL, C2813iB c2813iB) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c2813iB;
        this.A0A = c2529dL;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(bArrCopyOfRange);
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(118, 4, 76);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA022 = A02(102, 8, 100);
        if (map.containsKey(strA022)) {
            map2.put(strA022, map.get(strA022));
        }
        return map2;
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, ExifInterface.START_CODE, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, ExifInterface.START_CODE, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, 127, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, 63, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 58, 53, 32, 61, 34, 49, 12, 17, 30, 15, 12, 23, 16, 11, 100, 127, 120, 96, 100, 116, 88, 117, 33, 62, 50, 32};
    }

    private void A05(C2813iB c2813iB) {
        if (this.A06) {
            throw new IllegalStateException(A02(0, 27, 109));
        }
        this.A01 = c2813iB;
        List<C2813iB> listA0c = this.A01.A0c();
        if (listA0c != null && listA0c.size() > 0) {
            int size = listA0c.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                C2825iN c2825iN = new C2825iN(this.A0A);
                c2825iN.A05(listA0c.get(i10));
                arrayList.add(new C2072Qc(this.A0A, c2825iN, (TF) null, this.A04));
            }
            this.A05 = arrayList;
        }
        this.A06 = true;
        this.A07 = A07();
    }

    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C2826iO(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    private boolean A07() {
        return (!(this.A01.A0e() || TextUtils.isEmpty(this.A01.A0V())) || (!TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A8c() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA06 = this.A01.A06();
        if (iA06 < 0 || iA06 > 100) {
            return 0;
        }
        return iA06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C2813iB A0E() {
        return this.A01;
    }

    public final InterfaceC1973Me A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0Y();
    }

    public final List<C2072Qc> A0H() {
        if (A0R()) {
            return this.A05;
        }
        return null;
    }

    public final void A0I() {
        if (this.A09) {
            return;
        }
        String strA0Z = A0E().A0Z();
        if (strA0Z != null) {
            US usA0A = this.A0A.A0A();
            String[] strArr = A0D;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
            strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
            usA0A.AGF(strA0Z);
        }
        this.A09 = true;
    }

    public final void A0J() {
        if (this.A05 == null || this.A05.isEmpty()) {
            return;
        }
        Iterator<C2072Qc> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().unregisterView();
        }
    }

    public final void A0K(InterfaceC1973Me interfaceC1973Me) {
        this.A02 = interfaceC1973Me;
    }

    public final void A0L(C2529dL c2529dL, InterfaceC1973Me interfaceC1973Me, US us2, NU nu, InterfaceC2186Uo interfaceC2186Uo) {
        this.A02 = interfaceC1973Me;
        this.A04 = interfaceC2186Uo;
        JSONObject jSONObjectA03 = nu.A03();
        TF tfA01 = nu.A01();
        this.A00 = tfA01 != null ? tfA01.A06() : 200;
        A05(AbstractC1975Mg.A00(c2529dL, jSONObjectA03, AbstractC2238Wr.A02(jSONObjectA03, A02(94, 2, 10))));
        if (ML.A06(c2529dL, this, us2)) {
            c2529dL.A0F().A4u();
            interfaceC1973Me.AEK(this, V1.A00(AdErrorType.NO_FILL));
        } else {
            if (interfaceC1973Me != null) {
                interfaceC1973Me.AEH(this);
            }
            this.A03 = new C1974Mf(c2529dL, this.A0B, this, interfaceC1973Me);
            this.A03.A02();
        }
    }

    public final void A0M(Map<String, String> map) {
        if (A0R()) {
            if (U7.A20(this.A0A) && XQ.A03(map)) {
                Log.e(A0E, A02(27, 31, 90));
                return;
            }
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A01.A0e()) {
                map2.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
                map2.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
            }
            map2.put(A02(70, 10, 15), AdPlacementType.NATIVE.name());
            map2.put(A02(110, 8, 10), this.A0B);
            MH mhA00 = MI.A00(this.A0A, this.A0A.A0A(), this.A01.A7G(), this.A01.A0B(), map2, this.A01.A0C() != null ? this.A01.A0C().A21() : null);
            ME meA0G = ME.A09;
            if (mhA00 != null) {
                meA0G = mhA00.A0G(null);
            }
            if (meA0G != ME.A06) {
                WX.A04(this.A0A, A02(58, 12, 15));
                if (this.A02 != null) {
                    this.A02.AEG(this);
                }
            }
        }
    }

    public final void A0N(Map<String, String> map) {
        this.A0A.A0A().AAs(this.A01.A7G(), map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2825iN.A0O(java.util.Map):void");
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return U7.A1W(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return U7.A1W(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A01.A7G();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return A0E().A7h();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return A0E().A8C();
    }

    public AdPlacementType A8c() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        if (this.A03 != null) {
            C1974Mf c1974Mf = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            c1974Mf.A03();
        }
    }
}
