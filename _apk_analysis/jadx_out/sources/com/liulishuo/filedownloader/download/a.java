package com.liulishuo.filedownloader.download;

import android.text.TextUtils;
import com.liulishuo.filedownloader.download.b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import ia.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ConnectTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileDownloadHeader f34612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.liulishuo.filedownloader.download.b f34613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, List<String>> f34615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f34616g;

    /* JADX INFO: compiled from: ConnectTask.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f34617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FileDownloadHeader f34620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.liulishuo.filedownloader.download.b f34621e;

        public a a() {
            com.liulishuo.filedownloader.download.b bVar;
            Integer num = this.f34617a;
            if (num == null || (bVar = this.f34621e) == null || this.f34618b == null) {
                throw new IllegalArgumentException();
            }
            return new a(bVar, num.intValue(), this.f34618b, this.f34619c, this.f34620d);
        }

        public b b(com.liulishuo.filedownloader.download.b bVar) {
            this.f34621e = bVar;
            return this;
        }

        public b c(int i10) {
            this.f34617a = Integer.valueOf(i10);
            return this;
        }

        public b d(String str) {
            this.f34619c = str;
            return this;
        }

        public b e(FileDownloadHeader fileDownloadHeader) {
            this.f34620d = fileDownloadHeader;
            return this;
        }

        public b f(String str) {
            this.f34618b = str;
            return this;
        }
    }

    public a(com.liulishuo.filedownloader.download.b bVar, int i10, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.f34610a = i10;
        this.f34611b = str;
        this.f34614e = str2;
        this.f34612c = fileDownloadHeader;
        this.f34613d = bVar;
    }

    public final void a(z9.b bVar) throws ProtocolException {
        if (bVar.f(this.f34614e, this.f34613d.f34622a)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f34614e)) {
            bVar.a("If-Match", this.f34614e);
        }
        this.f34613d.a(bVar);
    }

    public final void b(z9.b bVar) {
        HashMap<String, List<String>> mapC;
        FileDownloadHeader fileDownloadHeader = this.f34612c;
        if (fileDownloadHeader == null || (mapC = fileDownloadHeader.c()) == null) {
            return;
        }
        if (ia.d.f64033a) {
            ia.d.h(this, "%d add outside header: %s", Integer.valueOf(this.f34610a), mapC);
        }
        for (Map.Entry<String, List<String>> entry : mapC.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    bVar.a(key, it.next());
                }
            }
        }
    }

    public z9.b c() throws IllegalAccessException, IOException {
        z9.b bVarA = ba.a.j().a(this.f34611b);
        b(bVarA);
        a(bVarA);
        d(bVarA);
        this.f34615f = bVarA.d();
        if (ia.d.f64033a) {
            ia.d.a(this, "<---- %s request header %s", Integer.valueOf(this.f34610a), this.f34615f);
        }
        bVarA.execute();
        ArrayList arrayList = new ArrayList();
        this.f34616g = arrayList;
        z9.b bVarC = z9.d.c(this.f34615f, bVarA, arrayList);
        if (ia.d.f64033a) {
            ia.d.a(this, "----> %s response header %s", Integer.valueOf(this.f34610a), bVarC.e());
        }
        return bVarC;
    }

    public final void d(z9.b bVar) {
        FileDownloadHeader fileDownloadHeader = this.f34612c;
        if (fileDownloadHeader == null || fileDownloadHeader.c().get("User-Agent") == null) {
            bVar.a("User-Agent", f.d());
        }
    }

    public String e() {
        List<String> list = this.f34616g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f34616g.get(r0.size() - 1);
    }

    public com.liulishuo.filedownloader.download.b f() {
        return this.f34613d;
    }

    public Map<String, List<String>> g() {
        return this.f34615f;
    }

    public boolean h() {
        return this.f34613d.f34623b > 0;
    }

    public void i(long j10) {
        com.liulishuo.filedownloader.download.b bVar = this.f34613d;
        long j11 = bVar.f34623b;
        if (j10 == j11) {
            ia.d.i(this, "no data download, no need to update", new Object[0]);
            return;
        }
        com.liulishuo.filedownloader.download.b bVarB = b.C0411b.b(bVar.f34622a, j10, bVar.f34624c, bVar.f34625d - (j10 - j11));
        this.f34613d = bVarB;
        if (ia.d.f64033a) {
            ia.d.e(this, "after update profile:%s", bVarB);
        }
    }
}
