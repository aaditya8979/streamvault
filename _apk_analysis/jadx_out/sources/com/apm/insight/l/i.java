package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: compiled from: JellyBeanV16Compat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f7395a = new b(0);

    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    public static class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    @TargetApi(16)
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        public /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.apm.insight.l.i.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f7395a.a(memoryInfo);
    }
}
