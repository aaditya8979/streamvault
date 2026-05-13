package yads;

import android.os.SystemClock;
import com.ironsource.C3978d4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f96833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr f96834b;

    public xo(a21 a21Var, gr grVar) {
        this.f96833a = a21Var;
        this.f96834b = grVar;
    }

    public final e82 a(po2 po2Var) throws im3 {
        byte[] bArr;
        p82 p82Var;
        p82 p82Var2;
        int i10;
        Map mapEmptyMap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            y11 y11Var = null;
            try {
                lr lrVar = po2Var.f93683p;
                if (lrVar == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = lrVar.f92065b;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j10 = lrVar.f92067d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    mapEmptyMap = map;
                }
                y11 y11VarA = this.f96833a.a(po2Var, mapEmptyMap);
                try {
                    int i11 = y11VarA.f96966a;
                    List listUnmodifiableList = Collections.unmodifiableList(y11VarA.f96967b);
                    if (i11 == 304) {
                        return q82.a(po2Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listUnmodifiableList);
                    }
                    InputStream byteArrayInputStream = y11VarA.f96969d;
                    if (byteArrayInputStream == null) {
                        byteArrayInputStream = y11VarA.f96970e != null ? new ByteArrayInputStream(y11VarA.f96970e) : null;
                    }
                    byte[] bArrA = byteArrayInputStream != null ? q82.a(byteArrayInputStream, y11VarA.f96968c, this.f96834b) : new byte[0];
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (lm3.f92036a || jElapsedRealtime2 > 3000) {
                        int i12 = po2Var.f93682o.f94018b;
                        boolean z10 = ad1.f87661a;
                    }
                    if (i11 < 200 || i11 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new e82(i11, bArrA, e82.a(listUnmodifiableList), listUnmodifiableList, false);
                } catch (IOException e10) {
                    bArr = null;
                    y11Var = y11VarA;
                    e = e10;
                    if (e instanceof SocketTimeoutException) {
                        p82Var = new p82("socket", new v63());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + po2Var.g(), e);
                        }
                        if (y11Var != null) {
                            int i13 = y11Var.f96966a;
                            po2Var.g();
                            boolean z11 = lm3.f92036a;
                            boolean z12 = ad1.f87661a;
                            if (bArr != null) {
                                List listUnmodifiableList2 = Collections.unmodifiableList(y11Var.f96967b);
                                SystemClock.elapsedRealtime();
                                e82 e82Var = new e82(i13, bArr, e82.a(listUnmodifiableList2), listUnmodifiableList2, false);
                                if (i13 == 401 || i13 == 403) {
                                    p82Var2 = new p82("auth", new pl(e82Var));
                                } else {
                                    if (i13 >= 400 && i13 <= 499) {
                                        throw new ov(e82Var);
                                    }
                                    if (i13 < 500 || i13 > 599 || !po2Var.f93680m) {
                                        throw new sx2(e82Var);
                                    }
                                    p82Var2 = new p82("server", new sx2(e82Var));
                                }
                                p82Var = p82Var2;
                            } else {
                                p82Var = new p82("network", new b82());
                            }
                        } else {
                            if (!po2Var.f93681n) {
                                throw new b92(e);
                            }
                            p82Var = new p82("connection", new b92());
                        }
                    }
                    qe0 qe0Var = po2Var.f93682o;
                    i10 = qe0Var.f94017a;
                    try {
                        im3 im3Var = p82Var.f93489b;
                        int i14 = qe0Var.f94018b + 1;
                        qe0Var.f94018b = i14;
                        qe0Var.f94017a = ((int) (i10 * qe0Var.f94020d)) + i10;
                        if (i14 > qe0Var.f94019c) {
                            throw im3Var;
                        }
                        po2Var.a(p82Var.f93488a + "-retry [timeout=" + i10 + C3978d4.j.f31385e);
                    } catch (im3 e11) {
                        po2Var.a(p82Var.f93488a + "-timeout-giveup [timeout=" + i10 + C3978d4.j.f31385e);
                        throw e11;
                    }
                }
            } catch (IOException e12) {
                e = e12;
                bArr = null;
            }
            po2Var.a(p82Var.f93488a + "-retry [timeout=" + i10 + C3978d4.j.f31385e);
        }
    }
}
