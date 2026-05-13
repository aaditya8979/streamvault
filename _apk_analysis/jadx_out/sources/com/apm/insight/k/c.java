package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashUploadHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f7320a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7321a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f7321a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7321a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7321a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f7322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f7323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f7324c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f7324c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f7322a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f7322a = jSONObject;
            }
            this.f7323b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public final String a() {
            return this.f7322a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f7322a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i10 = AnonymousClass1.f7321a[this.f7324c.ordinal()];
            if (i10 == 1) {
                return this.f7322a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f7322a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f7322a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f7320a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f7320a.isEmpty()) {
            f7320a.poll();
        }
        f7320a = null;
    }
}
