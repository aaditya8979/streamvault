package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: SocketSpider.java */
/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f35652d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f35653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35655c = 9377;

    public n() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f35653a = gVarD;
        if (gVarD == null) {
            this.f35653a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i10;
        boolean z10;
        Object[] objArr;
        byte[] bArr;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.f35654b, this.f35655c);
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            socket.setSoTimeout(15000);
            outputStream2 = socket.getOutputStream();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.put((byte) 2);
            byteBufferWrap.put((byte) 3);
            byteBufferWrap.putShort((short) f35652d.getAndIncrement());
            if (TextUtils.isEmpty(str2)) {
                byteBufferWrap.putInt(0);
                outputStream2.write(byteBufferWrap.array());
                length = 0;
            } else {
                byte[] bArrA = a(str2);
                length = bArrA.length;
                byteBufferWrap.putInt(length);
                outputStream2.write(byteBufferWrap.array());
                outputStream2.write(bArrA);
            }
            outputStream2.flush();
            q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
            inputStream = socket.getInputStream();
            byte[] bArr2 = new byte[8];
            inputStream.read(bArr2, 0, 8);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
            byteBufferWrap2.order(byteOrder);
            i10 = byteBufferWrap2.getInt(4);
            byte b10 = bArr2[1];
            z10 = b10 == 3;
            objArr = b10 == 2;
            q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i10 + " isGzip : " + z10);
            bArr = new byte[i10];
            new DataInputStream(socket.getInputStream()).readFully(bArr);
            if (!z10 && i10 > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                z10 = true;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = outputStream2;
            socket2 = socket;
            try {
                q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                aVar.f35615h = th.getMessage();
                if (socket2 != null) {
                    try {
                        socket2.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Exception e10) {
                        q0.b("SocketSpider", e10.getMessage());
                    }
                }
                return aVar;
            } finally {
            }
        }
        if (objArr == true && i10 == 0) {
            aVar.f35613f = 200;
            aVar.f35614g = str;
            aVar.f35612e = 0;
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e11) {
                q0.b("SocketSpider", e11.getMessage());
            }
            return aVar;
        }
        if (i10 < 1) {
            aVar.f35613f = 200;
            aVar.f35614g = str;
            aVar.f35612e = 0;
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e12) {
                q0.b("SocketSpider", e12.getMessage());
            }
            return aVar;
        }
        try {
            String strA = z10 ? a(bArr) : new String(bArr);
            if (!TextUtils.isEmpty(strA)) {
                aVar.f35613f = 200;
                aVar.f35614g = str;
                aVar.f35612e = 0;
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("location");
                        if (!TextUtils.isEmpty(strOptString)) {
                            aVar.f35613f = 302;
                            aVar.f35608a = strOptString;
                        }
                    }
                } catch (Throwable th4) {
                    q0.b("SocketSpider", th4.getMessage());
                }
                try {
                    socket.close();
                    outputStream2.close();
                } catch (Exception e13) {
                    q0.b("SocketSpider", e13.getMessage());
                }
                return aVar;
            }
        } catch (Throwable th5) {
            q0.b("SocketSpider", th5.getMessage());
            aVar.f35615h = th5.getMessage();
        }
        inputStream.close();
        try {
            socket.close();
            outputStream2.close();
        } catch (Exception e14) {
            q0.b("SocketSpider", e14.getMessage());
        }
        return aVar;
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f35654b = host;
                jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put("User-Agent", m0.i());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
            } else {
                jSONObject2.put("User-Agent", m0.i());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f35653a.J0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th3) {
            q0.b("SocketSpider", th3.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f35614g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f35615h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(Z7.f30794r, "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z10, z11);
        if (jSONObjectB.length() == 0) {
            aVar.f35615h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI))) {
            aVar.f35615h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f35655c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f35654b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f35615h = "request url parse error.";
        return aVar;
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 <= 0) {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
        }
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
