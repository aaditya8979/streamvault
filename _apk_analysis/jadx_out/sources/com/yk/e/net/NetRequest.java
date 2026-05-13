package com.yk.e.net;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.G5;
import com.ironsource.Y1;
import com.yk.e.util.AES256;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class NetRequest {
    public static final String TYPE_UNKNOWN_HOST = "HostException";
    private static String tag = "NetRequest";
    public NetCallBack netCallBack;
    public JSONObject object;
    public String url;
    public String requestMethod = "POST";
    public Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.yk.e.net.NetRequest.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            NetCallBack netCallBack = NetRequest.this.netCallBack;
            if (netCallBack == null) {
                return false;
            }
            netCallBack.execute(message.obj + "");
            return false;
        }
    });

    public interface NetCallBack {
        void execute(String str);
    }

    public NetRequest(String str) {
        this.url = "";
        this.url = str;
    }

    public NetRequest(String str, JSONObject jSONObject, NetCallBack netCallBack) {
        this.url = "";
        this.url = str;
        this.object = jSONObject;
        this.netCallBack = netCallBack;
    }

    public static String getDataString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return new String(jSONObject.toString().getBytes("UTF-8"));
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return "";
        }
    }

    private String is2String(InputStream inputStream) {
        String strDecode = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, G5.N));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    strDecode = AES256.decode(Constant.AesKey, sb2.toString().trim(), Constant.AesIv.getBytes(G5.N));
                    bufferedReader.close();
                    return strDecode;
                }
                sb2.append(line);
            }
        } catch (Exception | OutOfMemoryError unused) {
            return strDecode;
        }
    }

    private static boolean isWifiProxy() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = Y1.f30690f;
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    private void showLog(String str) {
        AdLog.i(tag, str);
    }

    public void execute() {
        new Thread(new Runnable() { // from class: com.yk.e.net.NetRequest.2
            @Override // java.lang.Runnable
            public void run() {
                String strPostData = NetRequest.this.requestMethod.equals("POST") ? NetRequest.this.postData(0) : NetRequest.this.getData();
                Message messageObtainMessage = NetRequest.this.handler.obtainMessage();
                messageObtainMessage.obj = strPostData;
                messageObtainMessage.sendToTarget();
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getData() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            org.json.JSONObject r2 = r5.object     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            getDataString(r2)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r3 = r5.url     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r1 = "GET"
            r2.setRequestMethod(r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r1 = 5000(0x1388, float:7.006E-42)
            r2.setReadTimeout(r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r2.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            java.lang.String r1 = "User-Agent"
            java.lang.String r3 = com.yk.e.util.Constant.userAgent     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r2.setRequestProperty(r1, r3)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r2.connect()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            int r1 = r2.getResponseCode()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L3f
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            java.lang.String r0 = r5.is2String(r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
            r1.close()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L66
        L3f:
            r2.disconnect()
            goto L51
        L43:
            r1 = move-exception
            goto L4b
        L45:
            r0 = move-exception
            goto L68
        L47:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L4b:
            com.yk.e.util.LogUtil.printException(r1)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L51
            goto L3f
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "result = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r5.showLog(r1)
            return r0
        L66:
            r0 = move-exception
            r1 = r2
        L68:
            if (r1 == 0) goto L6d
            r1.disconnect()
        L6d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yk.e.net.NetRequest.getData():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #13 {all -> 0x00bd, blocks: (B:3:0x0010, B:4:0x0016, B:41:0x00c4, B:43:0x00de, B:53:0x00f5, B:55:0x0111), top: B:68:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #13 {all -> 0x00bd, blocks: (B:3:0x0010, B:4:0x0016, B:41:0x00c4, B:43:0x00de, B:53:0x00f5, B:55:0x0111), top: B:68:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String postData(int r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yk.e.net.NetRequest.postData(int):java.lang.String");
    }
}
