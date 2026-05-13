package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.d2;
import com.applovin.impl.d4;
import com.applovin.impl.d6;
import com.applovin.impl.g2;
import com.applovin.impl.h2;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f10175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f10176c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10179f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10174a = "FileManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10177d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f10178e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g2 f10180g = a();

    public m(k kVar) {
        this.f10175b = kVar;
        this.f10176c = kVar.O();
        this.f10179f = ((Boolean) kVar.a(x4.U0)).booleanValue();
    }

    private long a(long j10) {
        return j10 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z10 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f10175b.c(x4.G0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f10176c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private g2 a() {
        if (com.applovin.impl.o0.d() && ((Boolean) this.f10175b.a(x4.f10833s3)).booleanValue()) {
            try {
                return new d4(this.f10175b);
            } catch (Throwable th2) {
                if (o.a()) {
                    this.f10176c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th2);
                }
                this.f10175b.D().a("FileManager", "instantiateOkHttpLoader", th2);
            }
        }
        return new h2(this.f10175b);
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            this.f10176c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (z10) {
            try {
                fileD.mkdirs();
            } catch (Throwable th2) {
                if (o.a()) {
                    this.f10176c.a("FileManager", "Unable to make cache directory at " + fileD, th2);
                }
                this.f10175b.D().a("FileManager", "createCacheDir", th2);
                return null;
            }
        }
        return file;
    }

    private Map a(File file, String str, long j10, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j10), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(long j10, Context context) {
        long jIntValue = ((Integer) this.f10175b.a(x4.C0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else if (a(j10) <= jIntValue) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        } else {
            if (o.a()) {
                this.f10176c.a("FileManager", "Cache has exceeded maximum size; dropping...");
            }
            Iterator it = c(context).iterator();
            while (it.hasNext()) {
                g((File) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriL0 = bVar.l0();
        if (uriL0 != null) {
            g(a(uriL0.getLastPathSegment(), context));
        }
    }

    private void a(boolean z10, String str, int i10, long j10, Map map) {
        d2 d2Var = z10 ? d2.N : d2.O;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i10));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f10175b.g().d(d2Var, map2);
    }

    private boolean a(File file, String str, List list, boolean z10, int i10, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        this.f10175b.g().d(d2.L, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 1; i11 <= i10; i11++) {
            if (a(file, str, list, z10, str2, map)) {
                a(true, str, i11, jElapsedRealtime, map);
                return true;
            }
        }
        a(false, str, i10, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f10175b.a(x4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                this.f10176c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f10175b.g().d(d2.M, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (o.a()) {
                    this.f10176c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f10176c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = n7.d(jElapsedRealtime2);
                    double dC = n7.c(file.length());
                    long j10 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j10), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f10175b.g().d(d2.R, mapA);
                    this.f10175b.d0().b(j10, str, str2);
                } else {
                    if (o.a()) {
                        this.f10176c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f10175b.g().d(d2.S, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f10176c.a("FileManager", th2);
                this.f10175b.D().a("FileManager", "loadAndCacheResource", th2);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02bc A[EDGE_INSN: B:279:0x02bc->B:169:0x02bc BREAK  A[LOOP:1: B:143:0x0262->B:280:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d A[Catch: all -> 0x019a, TryCatch #16 {all -> 0x019a, blocks: (B:77:0x0147, B:79:0x014d, B:80:0x0152), top: B:262:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r19, java.io.File r20, boolean r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    private long b() {
        long jLongValue = ((Long) this.f10175b.a(x4.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z10 = true;
            boolean z11 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z12 = parentFile != null && parentFile.exists();
            if (!z12 || !parentFile.canWrite()) {
                z10 = false;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z11 + "\nparentDirectoryExists: " + z12 + "\nisParentDirectoryWritable: " + z10;
        } catch (Throwable th2) {
            return "Error retrieving file deletion failure reason: " + th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.l0() == null) {
            return;
        }
        g(a(bVar.l0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        return (!fileD.isDirectory() || (fileArrListFiles = fileD.listFiles()) == null) ? Collections.emptyList() : Arrays.asList(fileArrListFiles);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f10177d) {
            zContains = this.f10178e.contains(absolutePath);
        }
        return zContains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f10177d) {
            boolean zAdd = this.f10178e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f10177d.wait();
                    zAdd = this.f10178e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (o.a()) {
                        this.f10176c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f10177d) {
            if (this.f10178e.contains(absolutePath)) {
                return false;
            }
            d(file);
            return true;
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.f10176c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f10175b.D().a(d2.Q0, "removeFile", mapHashMap);
            }
            return zDelete;
        } catch (Throwable th2) {
            try {
                if (o.a()) {
                    this.f10176c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th2);
                }
                this.f10175b.D().a("FileManager", "removeFile", th2);
                h(file);
                return false;
            } finally {
                h(file);
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f10177d) {
            if (!this.f10178e.remove(absolutePath)) {
                this.f10175b.D().a(d2.Q0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.f10177d.notifyAll();
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listT = bVar.T();
        if (bVar.M0() || listT.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        if (z10 && !n7.a(str, list)) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f10176c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f10175b.g().d(d2.P, mapHashMap);
        try {
            return this.f10180g.a(httpsString, map);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Error loading " + httpsString, th2);
            }
            this.f10175b.D().a("FileManager", "loadResource", th2, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i10, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i10, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f10175b.D().a(d2.Q0, "cacheResource");
            return null;
        }
        String strA = n7.a(Uri.parse(str), str2, this.f10175b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i10, str3, map)) {
            return null;
        }
        if (o.a()) {
            this.f10176c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    public String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th2) {
            this.f10176c.a("FileManager", th2);
            this.f10175b.D().a("FileManager", "readInputStreamAsString", th2);
            return null;
        }
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 < 0) {
                String string = byteArrayOutputStream.toString("UTF-8");
                byteArrayOutputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
            this.f10176c.a("FileManager", th2);
            this.f10175b.D().a("FileManager", "readInputStreamAsString", th2);
            return null;
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f10176c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f10175b.D().a(d2.Q0, str, mapHashMap);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th2);
            }
            this.f10175b.D().a("FileManager", str, th2);
        }
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }

    public boolean a(File file, String str, List list, int i10, String str2, Map map) {
        return a(file, str, list, true, i10, str2, map);
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    public void b(Context context) {
        if (this.f10175b.E0()) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f10175b.q0().a((i5) new r6(this.f10175b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10000b.a(bVar, context);
            }
        }), d6.b.CACHING);
    }

    public boolean c(String str, Context context) {
        if (this.f10179f) {
            return b(str, context);
        }
        boolean z10 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z10 = true;
        }
        h(fileA);
        return z10;
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f10175b.q0().a((i5) new r6(this.f10175b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10011b.b(bVar, context);
            }
        }), d6.b.CACHING);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.f10176c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f10176c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f10175b.D().a(d2.Q0, "createNoMediaFile");
        } catch (IOException e10) {
            if (o.a()) {
                this.f10176c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f10176c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String strA = a(fileInputStream);
                            boolean z11 = strA == null;
                            fileInputStream.close();
                            if (z11 && ((Boolean) this.f10175b.a(x4.M0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return strA;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = false;
                        if (z10 && ((Boolean) this.f10175b.a(x4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        throw th;
                    }
                } catch (Throwable th5) {
                    if (o.a()) {
                        this.f10176c.a("FileManager", "Unknown failure to read file.", th5);
                    }
                    this.f10176c.a("FileManager", th5);
                    this.f10175b.D().a("FileManager", "readFile", th5);
                    if (((Boolean) this.f10175b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (FileNotFoundException e10) {
                if (o.a()) {
                    this.f10176c.d("FileManager", "File not found. " + e10);
                }
                this.f10176c.a("FileManager", e10);
                this.f10175b.D().a("FileManager", "readFileNotFound", e10);
                if (0 != 0 && ((Boolean) this.f10175b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            } catch (IOException e11) {
                if (o.a()) {
                    this.f10176c.a("FileManager", "Failed to read file: " + file.getName() + e11);
                }
                this.f10176c.a("FileManager", e11);
                this.f10175b.D().a("FileManager", "readFileIO", e11);
                if (((Boolean) this.f10175b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
