package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.pno;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements com.bytedance.sdk.component.vt.ouw.vt {
    private static List<Object> yu;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private AtomicBoolean f12813lh = new AtomicBoolean(false);
    public ryl ouw;
    public com.bytedance.sdk.component.vt.ouw.yu vt;

    static {
        try {
            yu = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                yu.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                yu.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            ko.fkw("get protocol error", th2.getMessage());
        }
    }

    public vt(ryl rylVar, com.bytedance.sdk.component.vt.ouw.yu yuVar) {
        this.ouw = rylVar;
        this.vt = yuVar;
    }

    private jg ouw(ryl rylVar, boolean z10) throws IOException {
        String strOuw;
        jg jgVarOuw;
        HttpURLConnection httpURLConnection;
        ryl rylVar2;
        ryl rylVar3;
        byte[] bArr;
        int iHttpUrlConnectionGetResponseCode = pno.ouw;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(rylVar.vt().ouw().toString()).openConnection();
                if (z10) {
                    try {
                        if (!"setting".equals(rylVar.le()) && !"gecko".equals(rylVar.le()) && !"load_ug_t".equals(rylVar.le())) {
                            try {
                                Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
                                declaredField.setAccessible(true);
                                Object obj = declaredField.get(httpURLConnection);
                                Field declaredField2 = obj.getClass().getDeclaredField("client");
                                declaredField2.setAccessible(true);
                                Object obj2 = declaredField2.get(obj);
                                if (yu.size() == 2) {
                                    obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, yu);
                                }
                            } catch (Throwable th2) {
                                ko.fkw("openHttp2 error", th2.getMessage());
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        httpURLConnection2 = httpURLConnection;
                        if (iHttpUrlConnectionGetResponseCode != -1 || !z10) {
                            strOuw = ouw(httpURLConnection2, e);
                            return new pno(iHttpUrlConnectionGetResponseCode, strOuw, rylVar);
                        }
                        jgVarOuw = ouw(rylVar, false);
                    } catch (Exception e11) {
                        e = e11;
                        httpURLConnection2 = httpURLConnection;
                        strOuw = ouw(httpURLConnection2, e);
                    }
                }
                if (rylVar.yu() != null && rylVar.yu().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : rylVar.yu().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                try {
                                    Field declaredField3 = httpURLConnection.getClass().getDeclaredField("delegate");
                                    declaredField3.setAccessible(true);
                                    Object obj3 = declaredField3.get(httpURLConnection);
                                    Field declaredField4 = obj3.getClass().getDeclaredField("client");
                                    declaredField4.setAccessible(true);
                                    Object obj4 = declaredField4.get(obj3);
                                    obj4.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj4, Boolean.FALSE);
                                } catch (Exception unused) {
                                }
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                cf cfVar = rylVar.ouw;
                if (cfVar != null) {
                    TimeUnit timeUnit = cfVar.f12801lh;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(cfVar.vt));
                    }
                    cf cfVar2 = rylVar.ouw;
                    if (cfVar2.f12801lh != null) {
                        httpURLConnection.setReadTimeout((int) cfVar2.fkw.toMillis(cfVar2.yu));
                    }
                }
                if (rylVar.pno() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!(this.ouw.yu() == null ? false : this.ouw.yu().containsKey("Content-Type")) && rylVar.pno().f12807lh != null) {
                        httpURLConnection.addRequestProperty("Content-Type", rylVar.pno().f12807lh.ouw);
                    }
                    httpURLConnection.setRequestMethod(rylVar.lh());
                    if ("POST".equalsIgnoreCase(rylVar.lh())) {
                        OutputStream outputStreamUrlConnectionGetOutputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                        mwh mwhVarPno = rylVar.pno();
                        if (mwhVarPno != null && (rylVar3 = this.ouw) != null && "POST".equalsIgnoreCase(rylVar3.lh()) && mwhVarPno.f12806le == mwh.ouw.BYTE_ARRAY_TYPE && (bArr = mwhVarPno.fkw) != null && bArr.length > 0) {
                            outputStreamUrlConnectionGetOutputStream.write(rylVar.pno().fkw);
                        } else {
                            mwh mwhVarPno2 = rylVar.pno();
                            if ((mwhVarPno2 == null || (rylVar2 = this.ouw) == null || !"POST".equalsIgnoreCase(rylVar2.lh()) || mwhVarPno2.f12806le != mwh.ouw.STRING_TYPE || TextUtils.isEmpty(mwhVarPno2.yu)) ? false : true) {
                                outputStreamUrlConnectionGetOutputStream.write(rylVar.pno().yu.getBytes());
                            }
                        }
                        outputStreamUrlConnectionGetOutputStream.flush();
                        outputStreamUrlConnectionGetOutputStream.close();
                    }
                }
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar = rylVar.vt;
                if (ouwVar != null) {
                    ouwVar.yu = SystemClock.elapsedRealtime();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar2 = rylVar.vt;
                if (ouwVar2 != null) {
                    ouwVar2.fkw = SystemClock.elapsedRealtime();
                }
                iHttpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar3 = rylVar.vt;
                if (ouwVar3 != null) {
                    ouwVar3.f12727le = SystemClock.elapsedRealtime();
                }
            } finally {
                this.vt.fkw().remove(this);
            }
        } catch (IOException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
        if (!this.f12813lh.get()) {
            jgVarOuw = new pno(httpURLConnection, rylVar);
            return jgVarOuw;
        }
        PangleNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        this.vt.fkw().remove(this);
        strOuw = "internal error";
        return new pno(iHttpUrlConnectionGetResponseCode, strOuw, rylVar);
    }

    private static String ouw(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new vt(this.ouw, this.vt);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void lh() {
        this.f12813lh.set(true);
    }

    public final jg ouw(ryl rylVar) throws IOException {
        return ouw(rylVar, com.bytedance.sdk.component.ra.ouw.yu());
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final ryl ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void ouw(final com.bytedance.sdk.component.vt.ouw.lh lhVar) {
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            ouwVar.vt = SystemClock.elapsedRealtime();
        }
        this.vt.lh().submit(new com.bytedance.sdk.component.pno.lh.vt(this.ouw.ra(), this.ouw.le()) { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    jg jgVarVt = vt.this.vt();
                    if (jgVarVt == null) {
                        lhVar.ouw(new IOException("response is null"));
                    } else {
                        lhVar.ouw(jgVarVt);
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    lhVar.ouw(e10);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final jg vt() throws IOException {
        List<com.bytedance.sdk.component.vt.ouw.pno> list;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            if (ouwVar.vt == 0) {
                ouwVar.vt = SystemClock.elapsedRealtime();
            }
            this.ouw.vt.f12728lh = SystemClock.elapsedRealtime();
        }
        this.vt.yu().remove(this);
        this.vt.fkw().add(this);
        com.bytedance.sdk.component.vt.ouw.yu yuVar = this.vt;
        if ((yuVar instanceof le) && (yuVar.yu().size() + this.vt.fkw().size() > this.vt.vt() || this.f12813lh.get())) {
            this.vt.fkw().remove(this);
            return new pno(pno.ouw, "Maximum number of requests exceeded", this.ouw);
        }
        try {
            cf cfVar = this.ouw.ouw;
            if (cfVar == null || (list = cfVar.ouw) == null || list.size() <= 0) {
                return ouw(this.ouw);
            }
            ArrayList arrayList = new ArrayList(this.ouw.ouw.ouw);
            arrayList.add(new com.bytedance.sdk.component.vt.ouw.pno() { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.1
                @Override // com.bytedance.sdk.component.vt.ouw.pno
                public final jg ouw(pno.ouw ouwVar2) throws IOException {
                    return vt.this.ouw(ouwVar2.ouw());
                }
            });
            return ((com.bytedance.sdk.component.vt.ouw.pno) arrayList.get(0)).ouw(new lh(arrayList, this.ouw));
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }
}
