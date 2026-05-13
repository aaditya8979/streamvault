package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class vt {
    private static ArrayMap<File, vt> mwh;
    public static ouw ouw;

    @GuardedBy("TTPropHelper.class")
    private static ArrayMap<String, File> ryl;
    private static boolean vt;

    @GuardedBy("mWriteLock")
    private long bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final File f12793cf;

    @GuardedBy("mLoadLock")
    private Properties fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private volatile boolean f12794le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Object f12795lh;

    @GuardedBy("this")
    private long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    @GuardedBy("mLoadLock")
    private int f12796ra;
    private final File tlj;
    private final Object yu;

    public class lh implements SharedPreferences.Editor {
        private final Object vt = new Object();

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        @GuardedBy("mEditorLock")
        private final Map<String, Object> f12798lh = new HashMap();

        @GuardedBy("mEditorLock")
        private boolean yu = false;

        public lh() {
        }

        private lh ouw(String str, Set<String> set) {
            synchronized (this.vt) {
                this.f12798lh.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        private C0208vt vt() {
            Properties properties;
            byte b10;
            boolean z10;
            long j10;
            Object obj;
            synchronized (vt.this.f12795lh) {
                if (vt.this.f12796ra > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(vt.this.fkw);
                    vt.this.fkw = properties2;
                }
                properties = vt.this.fkw;
                vt.fkw(vt.this);
                synchronized (this.vt) {
                    b10 = 0;
                    if (this.yu) {
                        if (properties.isEmpty()) {
                            z10 = false;
                        } else {
                            properties.clear();
                            z10 = true;
                        }
                        this.yu = false;
                    } else {
                        z10 = false;
                    }
                    for (Map.Entry<String, Object> entry : this.f12798lh.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z10 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        }
                    }
                    this.f12798lh.clear();
                    if (z10) {
                        vt.le(vt.this);
                    }
                    j10 = vt.this.pno;
                }
            }
            return new C0208vt(j10, properties, b10);
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            vt.ouw(vt.this, vt(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            long jCurrentTimeMillis = vt.vt ? System.currentTimeMillis() : 0L;
            C0208vt c0208vtVt = vt();
            vt.ouw(vt.this, c0208vtVt, true);
            try {
                c0208vtVt.f12799lh.await();
                if (vt.vt) {
                    Log.d("TTPropHelper", vt.this.tlj.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + c0208vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return c0208vtVt.yu;
            } catch (InterruptedException unused) {
                if (!vt.vt) {
                    return false;
                }
                Log.d("TTPropHelper", vt.this.tlj.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + c0208vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th2) {
                if (vt.vt) {
                    Log.d("TTPropHelper", vt.this.tlj.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + c0208vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th2;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh clear() {
            synchronized (this.vt) {
                this.yu = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh remove(String str) {
            synchronized (this.vt) {
                this.f12798lh.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putFloat(String str, float f10) {
            synchronized (this.vt) {
                this.f12798lh.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putInt(String str, int i10) {
            synchronized (this.vt) {
                this.f12798lh.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putLong(String str, long j10) {
            synchronized (this.vt) {
                this.f12798lh.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putString(String str, String str2) {
            synchronized (this.vt) {
                this.f12798lh.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putBoolean(String str, boolean z10) {
            synchronized (this.vt) {
                this.f12798lh.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return ouw(str, (Set<String>) set);
        }
    }

    public interface ouw {
        HandlerThread ouw(String str);

        ExecutorService ouw();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.vt$vt, reason: collision with other inner class name */
    public static class C0208vt {
        public boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final CountDownLatch f12799lh;
        public final long ouw;
        public final Properties vt;

        @GuardedBy("mWritingToDiskLock")
        public volatile boolean yu;

        private C0208vt(long j10, Properties properties) {
            this.f12799lh = new CountDownLatch(1);
            this.yu = false;
            this.fkw = false;
            this.ouw = j10;
            this.vt = properties;
        }

        public /* synthetic */ C0208vt(long j10, Properties properties, byte b10) {
            this(j10, properties);
        }

        public final void ouw(boolean z10, boolean z11) {
            this.fkw = z10;
            this.yu = z11;
            this.f12799lh.countDown();
        }
    }

    private vt(File file) {
        Object obj = new Object();
        this.f12795lh = obj;
        this.yu = new Object();
        this.fkw = new Properties();
        this.f12794le = false;
        this.f12796ra = 0;
        this.tlj = file;
        this.f12793cf = new File(file.getPath() + ".bak");
        synchronized (obj) {
            this.f12794le = false;
        }
        ouw ouwVar = ouw;
        if (ouwVar == null || ouwVar.ouw() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.vt.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            }.start();
        } else {
            ouw.ouw().execute(new Runnable() { // from class: com.bytedance.sdk.component.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            });
        }
    }

    public static /* synthetic */ int bly(vt vtVar) {
        int i10 = vtVar.f12796ra;
        vtVar.f12796ra = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int fkw(vt vtVar) {
        int i10 = vtVar.f12796ra;
        vtVar.f12796ra = i10 + 1;
        return i10;
    }

    public static /* synthetic */ long le(vt vtVar) {
        long j10 = vtVar.pno;
        vtVar.pno = 1 + j10;
        return j10;
    }

    @RequiresApi(api = 19)
    public static vt ouw(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (vt.class) {
            if (ryl == null) {
                ryl = new ArrayMap<>();
            }
            File file = ryl.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                ryl.put(str, file);
            }
            if (mwh == null) {
                mwh = new ArrayMap<>();
            }
            vt vtVar = mwh.get(file);
            if (vtVar != null) {
                return vtVar;
            }
            vt vtVar2 = new vt(file);
            mwh.put(file, vtVar2);
            return vtVar2;
        }
    }

    public static void ouw(@NotNull ouw ouwVar) {
        ouw = ouwVar;
    }

    public static /* synthetic */ void ouw(vt vtVar, final C0208vt c0208vt, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (vt.this.yu) {
                    try {
                        vt.vt(vt.this, c0208vt, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (vt.this.f12795lh) {
                    vt.bly(vt.this);
                }
            }
        };
        if (z10) {
            synchronized (vtVar.f12795lh) {
                z11 = vtVar.f12796ra == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.lh.ouw(runnable, !z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123 A[Catch: all -> 0x0197, TryCatch #6 {all -> 0x0197, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0195, B:97:0x0196, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0193, B:93:0x018a, B:70:0x0111, B:51:0x00e2, B:89:0x0184), top: B:116:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133 A[Catch: all -> 0x0197, TryCatch #6 {all -> 0x0197, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0195, B:97:0x0196, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0193, B:93:0x018a, B:70:0x0111, B:51:0x00e2, B:89:0x0184), top: B:116:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147 A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #6 {all -> 0x0197, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0195, B:97:0x0196, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0193, B:93:0x018a, B:70:0x0111, B:51:0x00e2, B:89:0x0184), top: B:116:0x0090, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void vt(com.bytedance.sdk.component.vt r17, com.bytedance.sdk.component.vt.C0208vt r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.vt(com.bytedance.sdk.component.vt, com.bytedance.sdk.component.vt$vt, boolean):void");
    }

    private void yu() {
        while (!this.f12794le) {
            try {
                this.f12795lh.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final float ouw(String str) {
        float f10;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        synchronized (this.f12795lh) {
            try {
                try {
                    yu();
                    f10 = Float.parseFloat(this.fkw.getProperty(str, "0.0"));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return 0.0f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10;
    }

    public final int ouw(String str, int i10) {
        int i11;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        synchronized (this.f12795lh) {
            try {
                try {
                    yu();
                    i11 = Integer.parseInt(this.fkw.getProperty(str, String.valueOf(i10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public final long ouw(String str, long j10) {
        long j11;
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        synchronized (this.f12795lh) {
            try {
                try {
                    yu();
                    j11 = Long.parseLong(this.fkw.getProperty(str, String.valueOf(j10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    public final String ouw(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f12795lh) {
            yu();
            property = this.fkw.getProperty(str, str2);
        }
        return property;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ad -> B:69:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw():void");
    }

    public final boolean ouw(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        synchronized (this.f12795lh) {
            try {
                try {
                    yu();
                    z11 = Boolean.parseBoolean(this.fkw.getProperty(str, String.valueOf(z10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public final lh vt() {
        return new lh();
    }

    public final boolean vt(String str) {
        boolean zContainsKey;
        synchronized (this.f12795lh) {
            try {
                try {
                    yu();
                    zContainsKey = this.fkw.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }
}
