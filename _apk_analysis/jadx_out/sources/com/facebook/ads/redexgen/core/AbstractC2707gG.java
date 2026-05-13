package com.facebook.ads.redexgen.core;

import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Arrays;
import java.util.Formattable;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2707gG {
    public static byte[] A00;
    public static String[] A01 = {"8Sd1qkECxTgChNdlguLEZkZWMegMfOE5", "eE6tYG5sq9M8IjBBtVPbkf6Vz6TlptaI", "QOK7QojphBw5FabNaFdniimN5leZGYDr", "7RC2mif7S53CKwDAOZDI7R724V8msIlw", "uAGCbL6a5SqKA6tsA4uR", "AhKYWwBlorMFpY7WjQZRM9a3PetGdW8", "8WuUCWPLRijzu2iy4u5OiIf4MXR0TAdJ", "jN3W5Bup4fcwVqh0edpT69G47IDoXIn2"};
    public static final Object[] A02;

    static {
        A0L();
        A02 = new Object[]{null};
    }

    public static int A00(String str) {
        return A0C(null, str, 0, null, null, null, null);
    }

    public static int A01(String str, int i10) {
        int length = str.length();
        boolean z10 = false;
        while (i10 < length) {
            if (str.charAt(i10) == '%' && A02(str, i10) == -100) {
                if (str.charAt(i10 + 1) != '%') {
                    return i10 + 2;
                }
                i10++;
                z10 = true;
            }
            i10++;
        }
        return z10 ? AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES : AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    }

    public static int A02(String str, int i10) {
        int i11 = i10 + 1;
        if (str.length() <= i11) {
            return -101;
        }
        char cCharAt = str.charAt(i11);
        if (cCharAt == 's' || cCharAt == 'd') {
            return -100;
        }
        if (A01[6].charAt(15) == 'n') {
            throw new RuntimeException();
        }
        A01[1] = "DuYzmbbLi8NR0v6nZg86VBAdA9cmFFLr";
        return cCharAt == '%' ? -100 : -101;
    }

    public static int A03(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        switch (i10) {
            case 0:
                return A00(str);
            case 1:
                return A04(str, obj);
            case 2:
                return A05(str, obj, obj2);
            case 3:
                return A06(str, obj, obj2, obj3);
            case 4:
                return A07(str, obj, obj2, obj3, obj4);
            default:
                return A08(str, objArr);
        }
    }

    public static int A04(@Nullable String str, Object obj) {
        return A0C(null, str, 1, obj, null, null, null);
    }

    public static int A05(@Nullable String str, @Nullable Object obj, Object obj2) {
        return A0C(null, str, 2, obj, obj2, null, null);
    }

    public static int A06(@Nullable String str, @Nullable Object obj, @Nullable Object obj2, Object obj3) {
        return A0C(null, str, 3, obj, obj2, obj3, null);
    }

    public static int A07(@Nullable String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4) {
        return A0C(null, str, 4, obj, obj2, obj3, obj4);
    }

    public static int A08(@Nullable String str, Object[] objArr) {
        return A0F(null, str, objArr);
    }

    public static int A09(@Nullable StringBuilder sb2, @Nullable Object obj) {
        int length = 0;
        if (obj != null) {
            boolean z10 = obj instanceof Integer;
            if (A01[1].charAt(0) != 'K') {
                A01[6] = "qj7fRfmIIB6kzsQFMAkTgCFneI3s8jGM";
                if (z10) {
                    if (sb2 == null) {
                        length = 0 + 11;
                    } else if (A01[6].charAt(15) != 'n') {
                        A01[6] = "O4ypdRTgmt7luw9ydfRW3B9AFY3tOHa9";
                        sb2.append(((Number) obj).intValue());
                    } else {
                        sb2.append(((Number) obj).intValue());
                    }
                } else if (!(obj instanceof Short)) {
                    boolean z11 = obj instanceof Byte;
                    if (A01[4].length() != 19) {
                        String[] strArr = A01;
                        strArr[3] = "csKQFPsvsd8Y7y0GZsslTGMfIZRxrswf";
                        strArr[2] = "wF53Kmv7ZDAYUPjR0E2wAbKHzATsDJ47";
                        if (z11) {
                            if (sb2 == null) {
                                length = 0 + 4;
                            } else {
                                sb2.append(((Number) obj).intValue());
                            }
                        } else {
                            if (!(obj instanceof Long)) {
                                if (sb2 == null) {
                                    return -1;
                                }
                                throw new AssertionError();
                            }
                            if (sb2 == null) {
                                length = 0 + 20;
                            } else {
                                sb2.append(((Long) obj).longValue());
                            }
                        }
                    }
                } else if (sb2 == null) {
                    length = 0 + 6;
                } else {
                    sb2.append(((Number) obj).intValue());
                }
            }
            throw new RuntimeException();
        }
        String strA0G = A0G(47, 4, 89);
        if (sb2 == null) {
            length = 0 + strA0G.length();
        } else {
            sb2.append(strA0G);
        }
        if (sb2 == null) {
            return length;
        }
        return -3;
    }

    public static int A0A(@Nullable StringBuilder sb2, @Nullable Object obj) {
        if (obj instanceof Formattable) {
            if (sb2 == null) {
                return -1;
            }
            throw new AssertionError();
        }
        String string = null;
        if (obj instanceof String) {
            string = (String) obj;
        } else if (obj != null) {
            string = obj.toString();
        }
        if (string == null) {
            string = A0G(47, 4, 89);
        }
        if (sb2 == null) {
            return string.length();
        }
        sb2.append(string);
        return -3;
    }

    public static int A0B(@Nullable StringBuilder sb2, String str, int i10, int i11, boolean z10) {
        int length = str.length();
        int i12 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                if (length <= i10 + 1 || str.charAt(i10 + 1) != '%') {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    if (A01[6].charAt(15) == 'n') {
                        throw new RuntimeException();
                    }
                    A01[1] = "fVpeC838v4d09FxkUxUgJ6CBFHJaQPQZ";
                    return -1;
                }
                i10++;
            }
            if (sb2 == null) {
                i12++;
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
        if (z10) {
            return i11 + i12;
        }
        return -3;
    }

    public static int A0C(@Nullable StringBuilder sb2, @Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, Object obj3, Object obj4) {
        int i11;
        int iA01 = 0;
        int i12 = 0;
        boolean z10 = sb2 == null;
        int i13 = i10 == 0 ? -1 : 0;
        if (A01[4].length() == 19) {
            throw new RuntimeException();
        }
        A01[7] = "8ynbtcYvJcGQo99l12TWemlAPLQxISIP";
        int i14 = i13;
        while (true) {
            if (i14 >= i10) {
                i11 = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
                break;
            }
            int iA0D = A0D(sb2, str, iA01, obj, obj2, obj3, obj4, i14);
            if (iA0D == -1) {
                return -1;
            }
            if (z10) {
                i12 += iA0D;
            }
            iA01 = A01(str, iA01);
            if (i14 == i13) {
                i11 = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
                if (iA01 == -200 && z10) {
                    return -2;
                }
            } else {
                i11 = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
            }
            if (iA01 < 0) {
                break;
            }
            i14++;
        }
        if (iA01 != i11 && iA01 != -201) {
            return A0B(sb2, str, iA01, i12, z10);
        }
        if (z10) {
            return i12;
        }
        return -3;
    }

    public static int A0D(@Nullable StringBuilder sb2, @Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, Object obj3, Object obj4, int i11) {
        switch (i11) {
            case -1:
                return A0E(sb2, str, i10, null, false);
            case 0:
                return A0E(sb2, str, i10, obj, true);
            case 1:
                return A0E(sb2, str, i10, obj2, true);
            case 2:
                int iA0E = A0E(sb2, str, i10, obj3, true);
                if (A01[1].charAt(0) == 'K') {
                    throw new RuntimeException();
                }
                A01[1] = "lLENtgmJN01kc6wViYFGzWwEkJhXf84x";
                return iA0E;
            case 3:
                return A0E(sb2, str, i10, obj4, true);
            default:
                throw new AssertionError();
        }
    }

    public static int A0E(@Nullable StringBuilder sb2, @Nullable String str, int i10, Object obj, boolean z10) {
        int iA09;
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                if (A02(str, i10) != -100) {
                    return -1;
                }
                char cCharAt2 = str.charAt(i10 + 1);
                if (!z10 && cCharAt2 != '%') {
                    return -1;
                }
                boolean z11 = true;
                if (cCharAt2 == 's') {
                    iA09 = A0A(sb2, obj);
                } else if (cCharAt2 == 'd') {
                    iA09 = A09(sb2, obj);
                } else if (cCharAt2 == '%') {
                    z11 = false;
                    if (sb2 != null) {
                        sb2.append('%');
                    }
                    iA09 = 1;
                    i10++;
                } else {
                    iA09 = -1;
                }
                if (iA09 == -1) {
                    return -1;
                }
                if (sb2 == null) {
                    i11 += iA09;
                }
                if (z11) {
                    break;
                }
            } else if (sb2 == null) {
                i11++;
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
        if (sb2 == null) {
            return i11;
        }
        return -3;
    }

    public static int A0F(@Nullable StringBuilder sb2, @Nullable String str, Object... objArr) {
        int iA01 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = sb2 == null;
        boolean z11 = false;
        if (objArr == null || objArr.length == 0) {
            objArr = A02;
            if (A01[0].charAt(8) == 'g') {
                throw new RuntimeException();
            }
            A01[4] = "FyR6wqN";
            z11 = true;
        }
        boolean z12 = false;
        int length = objArr.length;
        while (true) {
            if (i11 < length) {
                int iA0E = A0E(sb2, str, iA01, objArr[i11], !z11);
                if (iA0E != -1) {
                    if (z10) {
                        i10 += iA0E;
                    }
                    iA01 = A01(str, iA01);
                    if (iA01 == -200) {
                        break;
                    }
                    if (iA01 == -201) {
                        z12 = true;
                        break;
                    }
                    z12 = true;
                    i11++;
                } else {
                    return -1;
                }
            } else {
                break;
            }
        }
        if (z10 && !z12) {
            return -2;
        }
        if (iA01 != -200 && iA01 != -201) {
            return A0B(sb2, str, iA01, i10, z10);
        }
        if (z10) {
            return i10;
        }
        return -3;
    }

    public static String A0G(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[6].charAt(15) == 'n') {
                throw new RuntimeException();
            }
            A01[1] = "skGE7NcFmlK9UGwd3HQe5P1GOhX2S0Sv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
            i13++;
        }
    }

    public static String A0H(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        switch (i10) {
            case 0:
                return A0K(str, new Object[0]);
            case 1:
                return A0K(str, obj);
            case 2:
                return A0K(str, obj, obj2);
            case 3:
                Object[] objArr2 = {obj, obj2, obj3};
                if (A01[6].charAt(15) == 'n') {
                    throw new RuntimeException();
                }
                A01[0] = "XCWvLacnK9ECASwOW0Hv8sDP0GvXvxfm";
                return A0K(str, objArr2);
            case 4:
                return A0K(str, obj, obj2, obj3, obj4);
            default:
                return A0K(str, objArr);
        }
    }

    public static String A0I(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        int iA03 = A03(str, i10, obj, obj2, obj3, obj4, objArr);
        if (iA03 == -1) {
            return A0H(str, i10, obj, obj2, obj3, obj4, objArr);
        }
        if (iA03 == -2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(iA03);
        if (i10 == -1) {
            A0F(sb2, str, objArr);
        } else {
            A0C(sb2, str, i10, obj, obj2, obj3, obj4);
        }
        return sb2.toString();
    }

    public static String A0J(@Nullable String str, Object obj) {
        return A0I(str, 1, obj, null, null, null, null);
    }

    public static String A0K(@Nullable String str, Object... objArr) {
        try {
            return String.format(null, str, (Object[]) AbstractC2716gP.A00(objArr, A0G(2, 45, 124)));
        } catch (MissingFormatArgumentException | UnknownFormatConversionException e10) {
            throw new RuntimeException(e10.getMessage() + A0G(0, 2, 67) + str);
        }
    }

    public static void A0L() {
        A00 = new byte[]{-117, 113, -35, -14, -7, -1, -10, -18, -86, -8, -7, -2, -86, -20, -17, -86, -8, -1, -10, -10, -86, -1, -8, -18, -17, -4, -86, -8, -7, -4, -9, -21, -10, -86, -19, -13, -4, -19, -1, -9, -3, -2, -21, -8, -19, -17, -3, -43, -36, -45, -45};
    }
}
