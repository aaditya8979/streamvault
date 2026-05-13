package com.safedk.android.utils;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53070a = "GzipUtil";

    public static int a(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        int[] iArrC = c(bArr2);
        int i11 = 0;
        while (true) {
            int i12 = i10;
            if (i11 >= bArr.length) {
                return -1;
            }
            i10 = i12;
            while (i10 > 0 && bArr2[i10] != bArr[i11]) {
                i10 = iArrC[i10 - 1];
            }
            if (bArr2[i10] == bArr[i11]) {
                i10++;
            }
            if (i10 == bArr2.length) {
                return (i11 - bArr2.length) + 1;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: IOException -> 0x0092, TryCatch #6 {IOException -> 0x0092, blocks: (B:24:0x007f, B:26:0x0084, B:28:0x0089, B:30:0x008e), top: B:55:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: IOException -> 0x0092, TryCatch #6 {IOException -> 0x0092, blocks: (B:24:0x007f, B:26:0x0084, B:28:0x0089, B:30:0x008e), top: B:55:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #6 {IOException -> 0x0092, blocks: (B:24:0x007f, B:26:0x0084, B:28:0x0089, B:30:0x008e), top: B:55:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(byte[] r9) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.c.a(byte[]):java.lang.String");
    }

    public static boolean b(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i10 = 0;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            while (i10 > 0 && bArr[i10] != bArr[i11]) {
                i10 = iArr[i10 - 1];
            }
            if (bArr[i10] == bArr[i11]) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }
}
