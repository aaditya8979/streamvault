package com.ironsource;

import android.text.TextUtils;
import com.ironsource.InterfaceC4106k7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C4071i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f31935a = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31936b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31937c = "POST";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31938d = "UTF-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f31939e = "ERROR:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31940f = "Bad Request - 400";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ExecutorService f31941g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.ironsource.i7$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4088j7 f31944c;

        public a(String str, String str2, InterfaceC4088j7 interfaceC4088j7) {
            this.f31942a = str;
            this.f31943b = str2;
            this.f31944c = interfaceC4088j7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionB;
            OutputStream outputStreamUrlConnectionGetOutputStream;
            try {
                httpURLConnectionB = C4071i7.b(this.f31942a);
                try {
                    outputStreamUrlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnectionB);
                    try {
                        try {
                            C4071i7.a(this.f31943b, outputStreamUrlConnectionGetOutputStream);
                            int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionB);
                            boolean z10 = iHttpUrlConnectionGetResponseCode == 200;
                            if (!z10) {
                                IronLog.INTERNAL.error("invalid response code " + iHttpUrlConnectionGetResponseCode + " sending request");
                            }
                            this.f31944c.a(z10);
                        } catch (Exception e10) {
                            e = e10;
                            C4228r4.d().a(e);
                            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            this.f31944c.a(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C4071i7.a(outputStreamUrlConnectionGetOutputStream, httpURLConnectionB, (BufferedReader) null);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    outputStreamUrlConnectionGetOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamUrlConnectionGetOutputStream = null;
                    C4071i7.a(outputStreamUrlConnectionGetOutputStream, httpURLConnectionB, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                httpURLConnectionB = null;
                outputStreamUrlConnectionGetOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionB = null;
                outputStreamUrlConnectionGetOutputStream = null;
            }
            C4071i7.a(outputStreamUrlConnectionGetOutputStream, httpURLConnectionB, (BufferedReader) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC4106k7 a(String str, String str2) throws Throwable {
        OutputStream outputStreamUrlConnectionGetOutputStream;
        Exception e10;
        Exception e11;
        BufferedReader bufferedReader;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStreamUrlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(str);
                    try {
                        a(str2, outputStreamUrlConnectionGetOutputStream);
                        int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(str);
                        if (iHttpUrlConnectionGetResponseCode != 200) {
                            InterfaceC4106k7.a.b bVar = new InterfaceC4106k7.a.b(iHttpUrlConnectionGetResponseCode, str.getResponseMessage());
                            a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, (BufferedReader) null);
                            return bVar;
                        }
                        bufferedReader = new BufferedReader(new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(str)));
                        try {
                            String strA = a(bufferedReader);
                            if (strA != null) {
                                InterfaceC4106k7.b bVar2 = new InterfaceC4106k7.b(strA);
                                a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, bufferedReader);
                                return bVar2;
                            }
                            InterfaceC4106k7.a.c cVar = new InterfaceC4106k7.a.c();
                            a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, bufferedReader);
                            return cVar;
                        } catch (Exception e12) {
                            e11 = e12;
                            C4228r4.d().a(e11);
                            IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                            InterfaceC4106k7.a.C0392a c0392a = new InterfaceC4106k7.a.C0392a(e11);
                            a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, bufferedReader);
                            return c0392a;
                        }
                    } catch (Exception e13) {
                        e10 = e13;
                        e11 = e10;
                        bufferedReader = null;
                        C4228r4.d().a(e11);
                        IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                        InterfaceC4106k7.a.C0392a c0392a2 = new InterfaceC4106k7.a.C0392a(e11);
                        a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, bufferedReader);
                        return c0392a2;
                    } catch (Throwable th2) {
                        th = th2;
                        a(outputStreamUrlConnectionGetOutputStream, (HttpURLConnection) str, (BufferedReader) r02);
                        throw th;
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    outputStreamUrlConnectionGetOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamUrlConnectionGetOutputStream = null;
                }
            } catch (Throwable th4) {
                r02 = str2;
                th = th4;
            }
        } catch (Exception e15) {
            e10 = e15;
            str = 0;
            outputStreamUrlConnectionGetOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
            outputStreamUrlConnectionGetOutputStream = null;
        }
    }

    @Nullable
    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public static String a(String str) throws Exception {
        return a(str, (r.b) null);
    }

    public static String a(String str, r.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e10;
        BufferedReader bufferedReader2;
        Throwable th2;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection) == 400) {
                    if (bVar != null) {
                        bVar.a("Bad Request - 400");
                    }
                    a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                try {
                    String strA = a(bufferedReader2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return strA;
                } catch (Exception e11) {
                    e10 = e11;
                    try {
                        C4228r4.d().a(e10);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th = th3;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th2 = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th2;
                }
            } catch (Exception e12) {
                e = e12;
                e10 = e;
                bufferedReader2 = null;
                C4228r4.d().a(e10);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th2 = th;
                bufferedReader2 = bufferedReader32;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th2;
            }
        } catch (Exception e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    @Nullable
    public static String a(String str, String str2, r.b bVar) {
        InterfaceC4106k7 interfaceC4106k7A = a(str, str2);
        if (!(interfaceC4106k7A instanceof InterfaceC4106k7.a)) {
            return ((InterfaceC4106k7.b) interfaceC4106k7A).d();
        }
        InterfaceC4106k7.a aVar = (InterfaceC4106k7.a) interfaceC4106k7A;
        if (aVar.b()) {
            return null;
        }
        bVar.a(aVar.a());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error("exception while closing output stream " + e10.getMessage());
            }
        }
        if (httpURLConnection != null) {
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e11) {
                C4228r4.d().a(e11);
                IronLog.INTERNAL.error("exception while closing reader " + e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void a(String str, String str2, InterfaceC4088j7 interfaceC4088j7) {
        f31941g.submit(new a(str, str2, interfaceC4088j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }
}
