package com.google.android.exoplayer.upstream.cache;

import a6.k0;
import a6.m;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer.database.DatabaseIOException;
import com.google.android.exoplayer.upstream.cache.Cache;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import z5.g;
import z5.h;
import z5.i;
import z5.j;

/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f implements Cache {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet<File> f21112l = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f21115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final z5.c f21116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.a>> f21117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f21118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Cache.CacheException f21123k;

    /* JADX INFO: compiled from: SimpleCache.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f21124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f21124b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (f.this) {
                this.f21124b.open();
                f.this.j();
                f.this.f21114b.onCacheInitialized();
            }
        }
    }

    public f(File file, c cVar, h4.a aVar) {
        this(file, cVar, aVar, null, false, false);
    }

    public f(File file, c cVar, @Nullable h4.a aVar, @Nullable byte[] bArr, boolean z10, boolean z11) {
        this(file, cVar, new h(aVar, file, bArr, z10, z11), (aVar == null || z11) ? null : new z5.c(aVar));
    }

    public f(File file, c cVar, h hVar, @Nullable z5.c cVar2) {
        if (!m(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f21113a = file;
        this.f21114b = cVar;
        this.f21115c = hVar;
        this.f21116d = cVar2;
        this.f21117e = new HashMap<>();
        this.f21118f = new Random();
        this.f21119g = cVar.requiresCacheSpanTouches();
        this.f21120h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    @WorkerThread
    public static void delete(File file, @Nullable h4.a aVar) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (aVar != null) {
                long jL = l(fileArrListFiles);
                if (jL != -1) {
                    try {
                        z5.c.delete(aVar, jL);
                    } catch (DatabaseIOException unused) {
                        m.h("SimpleCache", "Failed to delete file metadata: " + jL);
                    }
                    try {
                        h.delete(aVar, jL);
                    } catch (DatabaseIOException unused2) {
                        m.h("SimpleCache", "Failed to delete file metadata: " + jL);
                    }
                }
            }
            k0.v0(file);
        }
    }

    public static long h(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long l(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return q(name);
                } catch (NumberFormatException unused) {
                    m.c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean m(File file) {
        return f21112l.add(file.getAbsoluteFile());
    }

    public static long q(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized void a(z5.e eVar) {
        a6.a.f(!this.f21122j);
        g gVarG = this.f21115c.g(eVar.f98205b);
        a6.a.e(gVarG);
        a6.a.f(gVarG.g());
        gVarG.j(false);
        this.f21115c.p(gVarG.f98212b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized void b(z5.e eVar) {
        a6.a.f(!this.f21122j);
        r(eVar);
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized void c(String str, j jVar) throws Cache.CacheException {
        a6.a.f(!this.f21122j);
        g();
        this.f21115c.e(str, jVar);
        try {
            this.f21115c.s();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized void commitFile(File file, long j10) throws Cache.CacheException {
        boolean z10 = true;
        a6.a.f(!this.f21122j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            z5.m mVar = (z5.m) a6.a.e(z5.m.f(file, j10, this.f21115c));
            g gVar = (g) a6.a.e(this.f21115c.g(mVar.f98205b));
            a6.a.f(gVar.g());
            long jA = i.a(gVar.c());
            if (jA != -1) {
                if (mVar.f98206c + mVar.f98207d > jA) {
                    z10 = false;
                }
                a6.a.f(z10);
            }
            if (this.f21116d == null) {
                f(mVar);
                this.f21115c.s();
                notifyAll();
                return;
            }
            try {
                this.f21116d.h(file.getName(), mVar.f98207d, mVar.f98210g);
                f(mVar);
                try {
                    this.f21115c.s();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new Cache.CacheException(e10);
                }
            } catch (IOException e11) {
                throw new Cache.CacheException(e11);
            }
        }
    }

    public final void f(z5.m mVar) {
        this.f21115c.m(mVar.f98205b).a(mVar);
        this.f21121i += mVar.f98207d;
        n(mVar);
    }

    public synchronized void g() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f21123k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        a6.a.f(!this.f21122j);
        return this.f21121i;
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized i getContentMetadata(String str) {
        a6.a.f(!this.f21122j);
        return this.f21115c.j(str);
    }

    public final z5.m i(String str, long j10) {
        z5.m mVarD;
        g gVarG = this.f21115c.g(str);
        if (gVarG == null) {
            return z5.m.j(str, j10);
        }
        while (true) {
            mVarD = gVarG.d(j10);
            if (!mVarD.f98208e || mVarD.f98209f.length() == mVarD.f98207d) {
                break;
            }
            s();
        }
        return mVarD;
    }

    public final void j() {
        if (!this.f21113a.exists() && !this.f21113a.mkdirs()) {
            String str = "Failed to create cache directory: " + this.f21113a;
            m.c("SimpleCache", str);
            this.f21123k = new Cache.CacheException(str);
            return;
        }
        File[] fileArrListFiles = this.f21113a.listFiles();
        if (fileArrListFiles == null) {
            String str2 = "Failed to list cache directory files: " + this.f21113a;
            m.c("SimpleCache", str2);
            this.f21123k = new Cache.CacheException(str2);
            return;
        }
        long jL = l(fileArrListFiles);
        this.f21120h = jL;
        if (jL == -1) {
            try {
                this.f21120h = h(this.f21113a);
            } catch (IOException e10) {
                String str3 = "Failed to create cache UID: " + this.f21113a;
                m.d("SimpleCache", str3, e10);
                this.f21123k = new Cache.CacheException(str3, e10);
                return;
            }
        }
        try {
            this.f21115c.n(this.f21120h);
            z5.c cVar = this.f21116d;
            if (cVar != null) {
                cVar.e(this.f21120h);
                Map<String, z5.b> mapB = this.f21116d.b();
                k(this.f21113a, true, fileArrListFiles, mapB);
                this.f21116d.g(mapB.keySet());
            } else {
                k(this.f21113a, true, fileArrListFiles, null);
            }
            this.f21115c.r();
            try {
                this.f21115c.s();
            } catch (IOException e11) {
                m.d("SimpleCache", "Storing index file failed", e11);
            }
        } catch (IOException e12) {
            String str4 = "Failed to initialize cache indices: " + this.f21113a;
            m.d("SimpleCache", str4, e12);
            this.f21123k = new Cache.CacheException(str4, e12);
        }
    }

    public final void k(File file, boolean z10, @Nullable File[] fileArr, @Nullable Map<String, z5.b> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!h.o(name) && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                z5.b bVarRemove = map != null ? map.remove(name) : null;
                if (bVarRemove != null) {
                    j10 = bVarRemove.f98200a;
                    j11 = bVarRemove.f98201b;
                }
                z5.m mVarE = z5.m.e(file2, j10, j11, this.f21115c);
                if (mVarE != null) {
                    f(mVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void n(z5.m mVar) {
        ArrayList<Cache.a> arrayList = this.f21117e.get(mVar.f98205b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, mVar);
            }
        }
        this.f21114b.b(this, mVar);
    }

    public final void o(z5.e eVar) {
        ArrayList<Cache.a> arrayList = this.f21117e.get(eVar.f98205b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, eVar);
            }
        }
        this.f21114b.d(this, eVar);
    }

    public final void p(z5.m mVar, z5.e eVar) {
        ArrayList<Cache.a> arrayList = this.f21117e.get(mVar.f98205b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, mVar, eVar);
            }
        }
        this.f21114b.c(this, mVar, eVar);
    }

    public final void r(z5.e eVar) {
        g gVarG = this.f21115c.g(eVar.f98205b);
        if (gVarG == null || !gVarG.h(eVar)) {
            return;
        }
        this.f21121i -= eVar.f98207d;
        if (this.f21116d != null) {
            String name = eVar.f98209f.getName();
            try {
                this.f21116d.f(name);
            } catch (IOException unused) {
                m.h("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f21115c.p(gVarG.f98212b);
        o(eVar);
    }

    public final void s() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f21115c.h().iterator();
        while (it.hasNext()) {
            for (z5.m mVar : it.next().e()) {
                if (mVar.f98209f.length() != mVar.f98207d) {
                    arrayList.add(mVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r((z5.e) arrayList.get(i10));
        }
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized File startFile(String str, long j10, long j11) throws Cache.CacheException {
        g gVarG;
        File file;
        a6.a.f(!this.f21122j);
        g();
        gVarG = this.f21115c.g(str);
        a6.a.e(gVarG);
        a6.a.f(gVarG.g());
        if (!this.f21113a.exists()) {
            this.f21113a.mkdirs();
            s();
        }
        this.f21114b.a(this, str, j10, j11);
        file = new File(this.f21113a, Integer.toString(this.f21118f.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return z5.m.k(file, gVarG.f98211a, j10, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    public synchronized z5.e startReadWrite(String str, long j10) throws InterruptedException, Cache.CacheException {
        z5.e eVarStartReadWriteNonBlocking;
        a6.a.f(!this.f21122j);
        g();
        while (true) {
            eVarStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j10);
            if (eVarStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return eVarStartReadWriteNonBlocking;
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache
    @Nullable
    public synchronized z5.e startReadWriteNonBlocking(String str, long j10) throws Cache.CacheException {
        a6.a.f(!this.f21122j);
        g();
        z5.m mVarI = i(str, j10);
        if (mVarI.f98208e) {
            return t(str, mVarI);
        }
        g gVarM = this.f21115c.m(str);
        if (gVarM.g()) {
            return null;
        }
        gVarM.j(true);
        return mVarI;
    }

    public final z5.m t(String str, z5.m mVar) {
        if (!this.f21119g) {
            return mVar;
        }
        String name = ((File) a6.a.e(mVar.f98209f)).getName();
        long j10 = mVar.f98207d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        z5.c cVar = this.f21116d;
        if (cVar != null) {
            try {
                cVar.h(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                m.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z10 = true;
        }
        z5.m mVarI = this.f21115c.g(str).i(mVar, jCurrentTimeMillis, z10);
        p(mVar, mVarI);
        return mVarI;
    }
}
