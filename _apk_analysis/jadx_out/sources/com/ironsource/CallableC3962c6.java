package com.ironsource;

import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
class CallableC3962c6 implements Callable<C4051h5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31121d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31122e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31123f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4033g5 f31124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31126c;

    public CallableC3962c6(C4033g5 c4033g5, String str, long j10) {
        this.f31124a = c4033g5;
        this.f31125b = str;
        this.f31126c = j10;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4051h5 call() throws Throwable {
        if (this.f31126c == 0) {
            this.f31126c = 1L;
        }
        C4051h5 c4051h5A = null;
        for (int i10 = 0; i10 < this.f31126c; i10++) {
            c4051h5A = a(this.f31124a.e(), i10, this.f31124a.a(), this.f31124a.c(), this.f31124a.f());
            int iB = c4051h5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
        }
        if (c4051h5A != null && c4051h5A.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31125b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(this.f31124a.b().getName());
            String string = sb2.toString();
            String str2 = this.f31124a.d() + str + C4014f4.E + this.f31124a.b().getName();
            try {
                if (a(c4051h5A.a(), str2) == 0) {
                    c4051h5A.a(1006);
                } else if (!a(str2, string)) {
                    c4051h5A.a(1014);
                }
            } catch (FileNotFoundException e10) {
                C4228r4.d().a(e10);
                c4051h5A.a(1018);
            } catch (Error e11) {
                C4228r4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f31121d, e11.getMessage());
                }
                c4051h5A.a(1019);
            } catch (Exception e12) {
                C4228r4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f31121d, e12.getMessage());
                }
                c4051h5A.a(1009);
            }
        }
        return c4051h5A;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0188 A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:108:0x0180, B:112:0x0188), top: B:117:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ironsource.C4051h5 a(java.lang.String r7, int r8, int r9, int r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC3962c6.a(java.lang.String, int, int, int, boolean):com.ironsource.h5");
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
