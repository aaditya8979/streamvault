package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.I2;
import com.inmobi.media.Jh;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Jh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Jb f25739b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ab f25738a = Ab.f25153c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f25740c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ih f25741d = new Ih();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f25742e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sn.l f25743f = new sn.l() { // from class: n9.z1
        @Override // sn.l
        public final Object invoke(Object obj) {
            return Jh.a((I2) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReferenceQueue f25744g = new ReferenceQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f25745h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f25746i = new AtomicBoolean(false);

    public static final bn.r a(I2 i22) throws JSONException {
        tn.p.k(i22, "it");
        int i10 = i22.f25635a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = i22.f25637c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = i22.f25637c.get("data");
                        tn.p.i(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((Q9) obj);
                    }
                    break;
            }
        } else {
            a(i10);
            f25740c.set(false);
            ((C3857xc) Ji.f25751e.getValue()).a(f25743f);
            f25739b = null;
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ab a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    return tn.p.f(str2, "AB") ? Bb.a(loggingConfig.getBanner().getAb().getLogLevel()) : Bb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    return tn.p.f(str2, "AB") ? Bb.a(loggingConfig.getNative().getAb().getLogLevel()) : Bb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    return tn.p.f(str2, "AB") ? Bb.a(loggingConfig.getInt_native().getAb().getLogLevel()) : Bb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Bb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    return tn.p.f(str2, "AB") ? Bb.a(loggingConfig.getInt_html().getAb().getLogLevel()) : Bb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Bb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f25738a;
    }

    public static C3605n9 a(String str, String str2) {
        tn.p.k(str, "logType");
        tn.p.k(str2, "placementType");
        Context context = Ji.f25747a;
        if (context != null) {
            try {
                b();
                C3476i4 c3476i4 = Y3.f26611a;
                tn.p.k(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLoggingConfig();
                double dB = b(str, str2, loggingConfig);
                Ab abA = a(str, str2, loggingConfig);
                boolean z10 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k(abA, "logLevel");
                return new C3605n9(context, dB, abA, z10, maxNoOfEntries, expiry);
            } catch (Exception e10) {
                bn.g gVar = P9.f26117a;
                AbstractC3481i9.a(e10);
            }
        }
        return null;
    }

    public static void a() throws InterruptedException {
        WeakReference weakReference;
        InterfaceC3580m9 interfaceC3580m9;
        Reference referenceRemove = f25744g.remove();
        ConcurrentHashMap concurrentHashMap = f25745h;
        if (cn.f0.i0(concurrentHashMap.keySet(), referenceRemove)) {
            Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (interfaceC3580m9 = (InterfaceC3580m9) weakReference.get()) != null) {
                ((C3605n9) interfaceC3580m9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            tn.y.d(concurrentHashMap).remove(referenceRemove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                f25745h.remove(entry.getKey());
            }
        }
    }

    public static void a(int i10) throws JSONException {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3680q9.f27953a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f25950a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei2 : arrayList) {
            Ab ab2 = Ab.f25153c;
            String str = "SYSTEM SHUTDOWN RECEIVED - " + i10;
            ei2.getClass();
            tn.p.k(ab2, "logLevel");
            tn.p.k("LOGGER CRASH", "tag");
            tn.p.k(str, "message");
            ei2.f25396a.a(ab2, "LOGGER CRASH", str);
            ei2.f25396a.b();
        }
        f25740c.set(false);
        ((C3857xc) Ji.f25751e.getValue()).a(f25743f);
        f25739b = null;
    }

    public static void a(Q9 q92) throws JSONException {
        tn.p.k(q92, "incident");
        if (!(q92 instanceof T4) && !(q92 instanceof Wn)) {
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(CrashConfig.class, "clazz");
            C3476i4 c3476i42 = Y3.f26611a;
            if (((CrashConfig) c3476i42.a(CrashConfig.class)).getANRConfig().getAppExitReason().getReportToLogs() && (q92 instanceof C3896z1)) {
                tn.p.k(CrashConfig.class, "clazz");
                Y9 y92 = new Y9(((CrashConfig) c3476i42.a(CrashConfig.class)).getANRConfig().getAppExitReason().getIncompleteLogThresholdTime());
                String str = q92.f27324a;
                String str2 = q92.f27325b;
                String str3 = str2 == null ? "" : str2;
                int i10 = ((C3896z1) q92).f28616g;
                long j10 = q92.f27326c;
                tn.p.k(str, "message");
                tn.p.k(str3, "exitData");
                p000do.l0 l0Var = Sb.f26292a;
                Rb.a(new X9(y92, j10, str, i10, str3, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3680q9.f27953a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f25950a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei2 : arrayList) {
            Ab ab2 = Ab.f25153c;
            String str4 = q92.f27324a;
            long j11 = q92.f27326c;
            String str5 = q92.f27325b;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = "TYPE - " + str4 + ", TIMESTAMP - " + j11 + ", PAYLOAD - " + str5;
            ei2.getClass();
            tn.p.k(ab2, "logLevel");
            tn.p.k("LOGGER CRASH", "tag");
            tn.p.k(str6, "message");
            ei2.f25396a.a(ab2, "LOGGER CRASH", str6);
            if (q92 instanceof T4) {
                ei2.f25396a.b();
            }
        }
    }

    public static void a(Object obj, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(obj, IconCompat.EXTRA_OBJ);
        try {
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3580m9 != null) {
                    f25745h.put(new PhantomReference(obj, f25744g), new Pair(obj.toString(), new WeakReference(interfaceC3580m9)));
                    if (f25746i.getAndSet(true)) {
                        return;
                    }
                    p000do.l0 l0Var = Sb.f26292a;
                    Runnable runnable = new Runnable() { // from class: n9.a2
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException {
                            Jh.c();
                        }
                    };
                    tn.p.k("RemoteLoggerComponent", "tag");
                    tn.p.k(runnable, "runnable");
                    try {
                        p000do.i.d(Sb.f26292a, null, null, new Ob(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    return tn.p.f(str2, "AB") ? loggingConfig.getBanner().getAb().getSamplePercent() : loggingConfig.getBanner().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -1052618729:
                if (str.equals("native")) {
                    return tn.p.f(str2, "AB") ? loggingConfig.getNative().getAb().getSamplePercent() : loggingConfig.getNative().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -171121434:
                if (str.equals("intNative")) {
                    return tn.p.f(str2, "AB") ? loggingConfig.getInt_native().getAb().getSamplePercent() : loggingConfig.getInt_native().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (str.equals("intHtml")) {
                    return tn.p.f(str2, "AB") ? loggingConfig.getInt_html().getAb().getSamplePercent() : loggingConfig.getInt_html().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static void b() {
        if (f25739b != null) {
            return;
        }
        ReentrantLock reentrantLock = f25742e;
        if (reentrantLock.tryLock()) {
            try {
                if (f25739b == null && f25740c.get()) {
                    Context context = Ji.f25747a;
                    if (context != null) {
                        C3476i4 c3476i4 = Y3.f26611a;
                        tn.p.k(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLoggingConfig();
                        f25739b = new Jb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Jb jb2 = f25739b;
                    if (jb2 != null) {
                        AbstractC3680q9.a(jb2);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                f25742e.unlock();
                throw th2;
            }
        }
    }

    public static final void c() throws InterruptedException {
        while (f25740c.get()) {
            a();
        }
    }
}
