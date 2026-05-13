package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4086j5 implements C7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f32038e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C4086j5 f32039f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerC4069i5 f32040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f32041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f32042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32043d;

    private C4086j5(String str, V7 v72, JSONObject jSONObject) {
        this.f32043d = str;
        this.f32040a = new HandlerC4069i5(v72.a());
        this.f32041b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C4086j5 a(String str, V7 v72, JSONObject jSONObject) {
        if (f32039f == null) {
            f32039f = new C4086j5(str, v72, jSONObject);
        }
        return f32039f;
    }

    private Thread a(C4033g5 c4033g5, Handler handler) {
        return new Thread(new RunnableC4239rf(c4033g5, handler));
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f32043d, "temp");
    }

    private Thread b(C8 c82, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f32041b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f32041b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f32041b.optBoolean(C4014f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C4033g5(c82, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), zOptBoolean, b()), handler);
    }

    public String a() {
        return this.f32043d;
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str) {
        int iOptInt = this.f32041b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f32041b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f32041b.optBoolean(C4014f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C4033g5(c82, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f32040a);
        this.f32042c = threadA;
        threadA.start();
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str, int i10, int i11) {
        b(c82, str, i10, i11, this.f32040a).start();
    }

    @Override // com.ironsource.C7
    public void a(C8 c82, String str, int i10, int i11, Handler handler) {
        b(c82, str, i10, i11, handler).start();
    }

    @Override // com.ironsource.C7
    public void a(Oc oc2) {
        this.f32040a.a(oc2);
    }

    public boolean c() {
        Thread thread = this.f32042c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f32039f = null;
        HandlerC4069i5 handlerC4069i5 = this.f32040a;
        if (handlerC4069i5 != null) {
            handlerC4069i5.a();
            this.f32040a = null;
        }
    }
}
