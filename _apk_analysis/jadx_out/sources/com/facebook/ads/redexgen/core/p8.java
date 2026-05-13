package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public abstract class p8 {
    public static byte[] A00;
    public static String[] A01 = {"YRWMBYiInjfQquDkxRxaATvpWTtljPJC", "ofzRm5oD0ZehPjXAXsE4VN9RCemE2t7K", "rA3SUki7nKpweXyrpjsgW", "Q8xFqD15qZ9htNy6CShIJMvcdmz5frjW", "47AxPgGepX47UnNHLVE8SY2HaawvPhh1", "ilOqevOSCglGHIOxiwAEAySXTzWlxd7f", "WuOUZ6PVGszUBtiCu1AXLxWGhthYizTs", "WIuZhNvv8KxyFIlYsT8aGBLDwb7Qt6lT"};
    public static final Object[] A02;

    static {
        A01();
        A02 = new Object[0];
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 96, 99, 99, 106, 108, 123, 102, 96, 97, 26, 22, 9, 0, 54, 31, 81, 87, 87, 87, 80, 123, 96, 121, 121, 53, 118, 116, 123, 123, 122, 97, 53, 119, 112, 53, 118, 116, 102, 97, 53, 97, 122, 53, 123, 122, 123, 56, 123, 96, 121, 121, 53, 97, 108, 101, 112, 53, 126, 122, 97, 121, 124, 123, 59, 84, 103, 103, 116, 108, 41, 126, 122, 97, 121, 124, 123, 59, 84, 123, 108, ExifInterface.START_CODE, 43};
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] A02(Collection<?> collection) {
        C3220p6.A09(collection, A00(0, 10, 17));
        int size = collection.size();
        if (size == 0) {
            return A02;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return A02;
        }
        Object[] objArrCopyOf = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            int length = objArrCopyOf.length;
            String strA00 = A00(10, 11, 103);
            if (i11 >= length) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A01;
                if (strArr[3].charAt(14) == strArr[1].charAt(14)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "EScuV0zxhuEvZysc5helwPhrpqvjjBl6";
                strArr2[4] = "HbMMbmPQRBR0PjZnzsYHyu73qTDtUO0T";
                if (!zHasNext) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                C3220p6.A08(objArrCopyOf, strA00);
                i10 = i11;
            } else {
                if (!it.hasNext()) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                    C3220p6.A08(objArrCopyOf2, strA00);
                    return objArrCopyOf2;
                }
                i10 = i11;
            }
        }
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] A03(Collection<?> collection, Object[] objArr) {
        Object[] objArrCopyOf;
        C3220p6.A09(collection, A00(0, 10, 17));
        if (objArr == null) {
            throw new NullPointerException();
        }
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                int length = objArr.length;
                String[] strArr = A01;
                if (strArr[3].charAt(14) != strArr[1].charAt(14)) {
                    String[] strArr2 = A01;
                    strArr2[6] = "lrytJuFjMaT6Yp6XeApmWusax7Y4JpNy";
                    strArr2[4] = "gD4OyNyezD5obJmFstdRZH3h61osYZaN";
                    if (size <= length) {
                        objArrCopyOf = objArr;
                    } else {
                        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        C3220p6.A07(objNewInstance, A00(21, 62, 11));
                        objArrCopyOf = (Object[]) objNewInstance;
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        objArrCopyOf[i10] = it.next();
                        int length2 = objArrCopyOf.length;
                        String strA00 = A00(10, 11, 103);
                        if (i11 >= length2) {
                            if (!it.hasNext()) {
                                return objArrCopyOf;
                            }
                            int i12 = ((i11 * 3) + 1) >>> 1;
                            if (i12 <= i11) {
                                if (i11 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                                i12 = 2147483645;
                            }
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                            C3220p6.A08(objArrCopyOf, strA00);
                            i10 = i11;
                        } else {
                            if (!it.hasNext()) {
                                if (objArrCopyOf == objArr) {
                                    objArr[i11] = null;
                                } else {
                                    objArr = Arrays.copyOf(objArrCopyOf, i11);
                                    String[] strArr3 = A01;
                                    if (strArr3[7].charAt(1) != strArr3[0].charAt(1)) {
                                        A01[5] = "MOwQC4VnYrG9FSwrwyUZAgsxR7nFQ96o";
                                        C3220p6.A08(objArr, strA00);
                                    }
                                }
                                return objArr;
                            }
                            i10 = i11;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
