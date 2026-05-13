package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class AL<K, V> extends AbstractC3077mj<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC3077mj<Object, Object> A04 = new AL(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;

    @CheckForNull
    public final transient Object A02;

    public AL(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.A02 = obj;
        this.A00 = objArr;
        this.A01 = i10;
    }

    public static <K, V> AL<K, V> A00(int i10, Object[] objArr, C3075mh<K, V> c3075mh) {
        Object obj;
        if (i10 == 0) {
            return (AL) A04;
        }
        if (i10 == 1) {
            AbstractC3018ll.A03(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new AL<>(null, objArr, 1);
        }
        AbstractC2871jA.A01(i10, objArr.length >> 1);
        Object objA02 = A02(objArr, i10, AbstractC1672Al.A03(i10), 0);
        if (objA02 instanceof Object[]) {
            Object[] objArr2 = (Object[]) objA02;
            C3074mg c3074mg = (C3074mg) objArr2[2];
            if (c3075mh == null) {
                throw c3074mg.A02();
            }
            c3075mh.A01 = c3074mg;
            obj = objArr2[0];
            i10 = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, i10 * 2);
        } else {
            obj = objA02;
        }
        return new AL<>(obj, objArr, i10);
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object obj, @CheckForNull Object[] objArr, int i10, int i11, Object obj2) {
        int i12;
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            if (!Objects.requireNonNull(objArr[i11]).equals(obj2)) {
                return null;
            }
            Object obj3 = objArr[i11 ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj3);
            }
        } else {
            if (obj == null) {
                return null;
            }
            if (obj instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int iA00 = AbstractC3062mU.A00(obj2.hashCode());
                    while (true) {
                        int i13 = iA00 & length;
                        byte b10 = bArr[i13];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        i12 = b10 & 255;
                        if (i12 == 255) {
                            return null;
                        }
                        boolean zEquals = obj2.equals(objArr[i12]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i13 + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i13 + 1;
                        }
                    }
                    Object obj4 = objArr[i12 ^ 1];
                    if (A03[1].length() != 20) {
                        return obj4;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj4;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int iA002 = AbstractC3062mU.A00(obj2.hashCode());
                while (true) {
                    int i14 = iA002 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    iA002 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int iA003 = AbstractC3062mU.A00(obj2.hashCode());
                while (true) {
                    int i16 = iA003 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    iA003 = i16 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] objArr, int i10, int i11, int i12) {
        if (i10 == 1) {
            AbstractC3018ll.A03(Objects.requireNonNull(objArr[i12]), Objects.requireNonNull(objArr[i12 ^ 1]));
            return null;
        }
        int i13 = i11 - 1;
        C3074mg c3074mg = null;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object objRequireNonNull = Objects.requireNonNull(objArr[i17]);
                Object objRequireNonNull2 = Objects.requireNonNull(objArr[i17 ^ 1]);
                AbstractC3018ll.A03(objRequireNonNull, objRequireNonNull2);
                int iA00 = AbstractC3062mU.A00(objRequireNonNull.hashCode());
                while (true) {
                    int i19 = iA00 & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = objRequireNonNull;
                            objArr[i18 ^ 1] = objRequireNonNull2;
                        }
                        i15++;
                    } else {
                        if (objRequireNonNull.equals(objArr[i20])) {
                            c3074mg = new C3074mg(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArr[i20 ^ 1]));
                            objArr[i20 ^ 1] = objRequireNonNull2;
                            break;
                        }
                        iA00 = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c3074mg};
        }
        if (i11 > 32768) {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i21 = 0;
            int i22 = 0;
            while (i22 < i10) {
                int i23 = (i22 * 2) + i12;
                int i24 = (i21 * 2) + i12;
                Object objRequireNonNull3 = Objects.requireNonNull(objArr[i23]);
                Object objRequireNonNull4 = Objects.requireNonNull(objArr[i23 ^ 1]);
                AbstractC3018ll.A03(objRequireNonNull3, objRequireNonNull4);
                int iA002 = AbstractC3062mU.A00(objRequireNonNull3.hashCode());
                while (true) {
                    int i25 = iA002 & i13;
                    int i26 = iArr[i25];
                    if (i26 == i14) {
                        iArr[i25] = i24;
                        if (i21 < i22) {
                            objArr[i24] = objRequireNonNull3;
                            objArr[i24 ^ 1] = objRequireNonNull4;
                        }
                        i21++;
                    } else {
                        if (objRequireNonNull3.equals(objArr[i26])) {
                            c3074mg = new C3074mg(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArr[i26 ^ 1]));
                            objArr[i26 ^ 1] = objRequireNonNull4;
                            break;
                        }
                        iA002 = i25 + 1;
                        i14 = -1;
                    }
                }
                i22++;
                i14 = -1;
            }
            return i21 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i21), c3074mg};
        }
        short[] sArr = new short[i11];
        Arrays.fill(sArr, (short) -1);
        int i27 = 0;
        for (int i28 = 0; i28 < i10; i28++) {
            int i29 = (i28 * 2) + i12;
            int i30 = (i27 * 2) + i12;
            Object objRequireNonNull5 = Objects.requireNonNull(objArr[i29]);
            Object objRequireNonNull6 = Objects.requireNonNull(objArr[i29 ^ 1]);
            AbstractC3018ll.A03(objRequireNonNull5, objRequireNonNull6);
            int iA003 = AbstractC3062mU.A00(objRequireNonNull5.hashCode());
            while (true) {
                int i31 = iA003 & i13;
                int i32 = sArr[i31] & 65535;
                if (i32 == 65535) {
                    sArr[i31] = (short) i30;
                    if (i27 < i28) {
                        objArr[i30] = objRequireNonNull5;
                        objArr[i30 ^ 1] = objRequireNonNull6;
                    }
                    i27++;
                } else {
                    boolean zEquals = objRequireNonNull5.equals(objArr[i32]);
                    if (A03[5].charAt(16) != 'P') {
                        throw new RuntimeException();
                    }
                    A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                    if (zEquals) {
                        c3074mg = new C3074mg(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArr[i32 ^ 1]));
                        objArr[i32 ^ 1] = objRequireNonNull6;
                        break;
                    }
                    iA003 = i31 + 1;
                }
            }
        }
        return i27 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i27), c3074mg};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3077mj
    public final AbstractC3068ma<V> A0A() {
        return new C1X(this.A00, 1, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3077mj
    public final AbstractC1672Al<Map.Entry<K, V>> A0D() {
        return new C1Z(this, this.A00, 0, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3077mj
    public final AbstractC1672Al<K> A0E() {
        final C1X c1x = new C1X(this.A00, 0, this.A01);
        return new AbstractC1672Al<K>(this, c1x) { // from class: com.facebook.ads.redexgen.X.1Y
            public final transient AbstractC1673Am<K> A00;
            public final transient AbstractC3077mj<K, ?> A01;

            {
                this.A01 = this;
                this.A00 = c1x;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final int A0I(Object[] objArr, int i10) {
                return A0J().A0I(objArr, i10);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1672Al, com.facebook.ads.redexgen.core.AbstractC3068ma
            public final AbstractC1673Am<K> A0J() {
                return this.A00;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final boolean A0K() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: A0N */
            public final AbstractC3240pg<K> iterator() {
                return A0J().iterator();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                return this.A01.get(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3077mj
    public final boolean A0F() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3077mj, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v10 = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
