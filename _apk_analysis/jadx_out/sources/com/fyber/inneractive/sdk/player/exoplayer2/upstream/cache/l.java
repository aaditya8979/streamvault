package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f18660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f18662d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f18664f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18661c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f18663e = new HashMap();

    public l(File file, j jVar) {
        this.f18659a = file;
        this.f18660b = jVar;
        this.f18662d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l):void");
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f18662d.f18648a.get(str);
        return hVar == null ? -1L : hVar.f18647d;
    }

    public final synchronized m a(String str, long j10) {
        m mVarA;
        m mVar;
        a aVar = this.f18664f;
        if (aVar != null) {
            throw aVar;
        }
        h hVar = (h) this.f18662d.f18648a.get(str);
        if (hVar == null) {
            mVar = new m(str, j10, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                mVarA = hVar.a(j10);
                if (!mVarA.f18641d || mVarA.f18642e.length() == mVarA.f18640c) {
                    break;
                }
                a();
            }
            mVar = mVarA;
        }
        if (!mVar.f18641d) {
            if (this.f18661c.containsKey(str)) {
                return null;
            }
            this.f18661c.put(str, mVar);
            return mVar;
        }
        h hVar2 = (h) this.f18662d.f18648a.get(str);
        if (!hVar2.f18646c.remove(mVar)) {
            throw new IllegalStateException();
        }
        int i10 = hVar2.f18644a;
        if (!mVar.f18641d) {
            throw new IllegalStateException();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File parentFile = mVar.f18642e.getParentFile();
        long j11 = mVar.f18639b;
        Pattern pattern = m.f18665g;
        File file = new File(parentFile, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
        m mVar2 = new m(mVar.f18638a, mVar.f18639b, mVar.f18640c, jCurrentTimeMillis, file);
        if (!mVar.f18642e.renameTo(file)) {
            throw new a("Renaming of " + mVar.f18642e + " to " + file + " failed.");
        }
        hVar2.f18646c.add(mVar2);
        ArrayList arrayList = (ArrayList) this.f18663e.get(mVar.f18638a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f18655a.remove(mVar);
                jVar.f18656b -= mVar.f18640c;
                jVar.f18655a.add(mVar2);
                jVar.f18656b += mVar2.f18640c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f18660b;
        jVar2.f18655a.remove(mVar);
        jVar2.f18656b -= mVar.f18640c;
        jVar2.f18655a.add(mVar2);
        jVar2.f18656b += mVar2.f18640c;
        jVar2.a(this, 0L);
        return mVar2;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f18662d.f18648a.values().iterator();
        while (it.hasNext()) {
            for (g gVar : ((h) it.next()).f18646c) {
                if (gVar.f18642e.length() != gVar.f18640c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f18662d.a();
        this.f18662d.b();
    }

    public final void a(g gVar, boolean z10) throws Throwable {
        h hVar = (h) this.f18662d.f18648a.get(gVar.f18638a);
        if (hVar == null || !hVar.f18646c.remove(gVar)) {
            return;
        }
        gVar.f18642e.delete();
        if (z10 && hVar.f18646c.isEmpty()) {
            i iVar = this.f18662d;
            h hVar2 = (h) iVar.f18648a.remove(hVar.f18645b);
            if (hVar2 != null) {
                if (!hVar2.f18646c.isEmpty()) {
                    throw new IllegalStateException();
                }
                iVar.f18649b.remove(hVar2.f18644a);
                iVar.f18653f = true;
            }
            this.f18662d.b();
        }
        ArrayList arrayList = (ArrayList) this.f18663e.get(gVar.f18638a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f18655a.remove(gVar);
                jVar.f18656b -= gVar.f18640c;
            }
        }
        j jVar2 = this.f18660b;
        jVar2.f18655a.remove(gVar);
        jVar2.f18656b -= gVar.f18640c;
    }

    public final void a(m mVar) {
        i iVar = this.f18662d;
        String str = mVar.f18638a;
        h hVarA = (h) iVar.f18648a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f18646c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f18663e.get(mVar.f18638a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f18655a.add(mVar);
                jVar.f18656b += mVar.f18640c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f18660b;
        jVar2.f18655a.add(mVar);
        jVar2.f18656b += mVar.f18640c;
        jVar2.a(this, 0L);
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f18661c.remove(mVar.f18638a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }
}
