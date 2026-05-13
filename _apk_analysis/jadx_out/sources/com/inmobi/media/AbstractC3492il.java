package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3492il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p000do.l0 f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f27363c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f27361a = kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor).plus(p000do.j2.b(null, 1, null)));
        f27362b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        tn.p.j(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        f27363c = cn.f0.l1(arrayList);
    }

    public static final String a(String str, String str2) {
        tn.p.k("AppExitEvent", "name");
        tn.p.k(str, "message");
        tn.p.k(str2, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", str);
            jSONObject.put("stack", str2);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static final String a(Thread thread, Throwable th2) {
        String string;
        tn.p.k(th2, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            tn.p.h(stackTrace);
            boolean zB = b(stackTrace);
            if (!zB) {
                string = "";
            } else if (stackTrace.length >= P9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                string = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = th2.getStackTrace();
                tn.p.j(stackTrace2, "getStackTrace(...)");
                tn.p.k(stackTrace2, "<this>");
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
                string = sb2.toString();
                tn.p.j(string, "toString(...)");
            }
            jSONObject.put("name", th2.getClass().getSimpleName());
            jSONObject.put("message", th2.getMessage());
            jSONObject.put("stack", string);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            P9.a(jSONObject, zB, jCurrentTimeMillis);
            CrashConfig crashConfig = AbstractC3462hf.f27303a;
            AbstractC3462hf.a(jSONObject, th2 instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string2 = jSONObject.toString();
            tn.p.j(string2, "toString(...)");
            return string2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        tn.p.k("Blocked", "name");
        tn.p.k("MainThreadBlocked", "message");
        tn.p.k(stackTraceElementArr, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            tn.p.k(stackTraceElementArr, "<this>");
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb2.append(stackTraceElement.toString());
                sb2.append('\n');
            }
            String string = sb2.toString();
            tn.p.j(string, "toString(...)");
            jSONObject.put("stack", string);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string2 = jSONObject.toString();
        tn.p.j(string2, "toString(...)");
        return string2;
    }

    public static final void a(sn.l lVar) {
        tn.p.k(lVar, "runnable");
        p000do.i.d(f27361a, null, null, new C3391el(lVar, null), 3, null);
    }

    public static final boolean a(Q9 q92) {
        tn.p.k(q92, "<this>");
        if (q92 instanceof T4) {
            StackTraceElement[] stackTraceElementArr = ((T4) q92).f26347g;
            if (stackTraceElementArr == null) {
                tn.p.C("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (!(q92 instanceof C3896z1)) {
            if (q92 instanceof Wn) {
                return b(((Wn) q92).f26567g);
            }
            return false;
        }
        C3896z1 c3896z1 = (C3896z1) q92;
        if (c3896z1.f28616g != 6) {
            return false;
        }
        return f27362b.containsMatchIn(c3896z1.f28617h);
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        tn.p.k(stackTraceElement, "<this>");
        return cls != null && tn.p.f(stackTraceElement.getClassName(), cls.getName()) && f27363c.contains(stackTraceElement.getMethodName());
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        tn.p.k(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i10], Hc.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class.getSuperclass()) && (!tn.p.f(stackTraceElementArr[i10].getClassName(), InMobiSdk.class.getName()) || !tn.p.f(stackTraceElementArr[i10].getMethodName(), "fireListener")); i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            tn.p.j(className, "getClassName(...)");
            String name = S4.class.getName();
            tn.p.j(name, "getName(...)");
            if (bo.d0.c0(className, name, false, 2, null)) {
                break;
            }
            String className2 = stackTraceElementArr[i10].getClassName();
            tn.p.j(className2, "getClassName(...)");
            if (f27362b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }
}
