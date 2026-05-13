package com.yk.e.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class SignatureUtils {
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    private static final String TAG = "SignatureUtils";

    private static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = i10 + 1;
            char[] cArr2 = HEX_ARRAY;
            cArr[i10] = cArr2[i12 >>> 4];
            i10 = i13 + 1;
            cArr[i13] = cArr2[i12 & 15];
            if (i11 < bArr.length - 1) {
                cArr[i10] = ':';
                i10++;
            }
        }
        return new String(cArr);
    }

    public static boolean checkSignature(Context context, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            List<String> signaturesSHA1 = getSignaturesSHA1(context);
            if (signaturesSHA1.isEmpty()) {
                return false;
            }
            for (String str : signaturesSHA1) {
                for (String str2 : strArr) {
                    if (str.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String getAppSHA1(Context context) {
        List<String> signaturesSHA1 = getSignaturesSHA1(context);
        return !signaturesSHA1.isEmpty() ? signaturesSHA1.get(0) : "";
    }

    private static String getSHA1(byte[] bArr) {
        try {
            return bytesToHex(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr));
        } catch (NoSuchAlgorithmException e10) {
            Log.e(TAG, "SHA-1 not supported", e10);
            return "";
        }
    }

    public static List<String> getSignaturesSHA1(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo != null) {
                    Signature[] signingCertificateHistory = signingInfo.hasPastSigningCertificates() ? signingInfo.getSigningCertificateHistory() : signingInfo.getApkContentsSigners();
                    if (signingCertificateHistory != null) {
                        int length = signingCertificateHistory.length;
                        while (i10 < length) {
                            arrayList.add(getSHA1(signingCertificateHistory[i10].toByteArray()));
                            i10++;
                        }
                    }
                }
            } else {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                    int length2 = signatureArr.length;
                    while (i10 < length2) {
                        arrayList.add(getSHA1(signatureArr[i10].toByteArray()));
                        i10++;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(TAG, "Package not found", e10);
        }
        return arrayList;
    }
}
