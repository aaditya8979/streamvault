package com.safedk.android.a;

import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes9.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51513a = "ConfigDownload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51514b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f51515c = {60000, 300000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f51516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f51517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f51518f;

    public b(d dVar, String str, String str2) {
        this.f51516d = new d();
        this.f51516d = dVar;
        this.f51517e = str;
        this.f51518f = str2;
    }

    private int a(int i10) {
        return f51515c[i10];
    }

    private int a(e eVar) throws IOException {
        InputStream inputStreamE = null;
        int iB = eVar.b();
        Logger.d(f51513a, "response code = " + iB);
        try {
            if (iB < 300) {
                try {
                    inputStreamE = eVar.e();
                    String strA = a(inputStreamE);
                    Logger.d(f51513a, "response = " + strA);
                    this.f51516d.a(strA, b(eVar));
                    if (inputStreamE != null) {
                        inputStreamE.close();
                    }
                } catch (IOException e10) {
                    Logger.e(f51513a, "Failed to get response from server", e10);
                    this.f51516d.a("Failed to read data from connection");
                    if (inputStreamE != null) {
                        inputStreamE.close();
                    }
                } catch (Throwable th2) {
                    Logger.e(f51513a, "Caught exception", th2);
                    new CrashReporter().caughtException(th2);
                    if (inputStreamE != null) {
                        inputStreamE.close();
                    }
                }
            } else {
                if (iB != 304) {
                    InputStream inputStreamG = eVar.g();
                    String strA2 = a(inputStreamG);
                    this.f51516d.a(strA2);
                    if (inputStreamG != null) {
                        inputStreamG.close();
                    }
                    throw new HttpRetryException(strA2, iB);
                }
                this.f51516d.a(null, b(eVar));
            }
            return iB;
        } catch (Throwable th3) {
            if (inputStreamE != null) {
                inputStreamE.close();
            }
            throw th3;
        }
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    break;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            Logger.e(f51513a, "Failed to read configuration from input stream", e10);
        }
        return sb2.toString();
    }

    private boolean a(Exception exc) {
        return (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) ? false : true;
    }

    private String b(e eVar) {
        return eVar.b(Command.HTTP_HEADER_ETAG);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.a.b.run():void");
    }
}
