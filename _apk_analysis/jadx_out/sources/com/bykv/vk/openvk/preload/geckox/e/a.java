package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ChannelVerLoader.java */
/* JADX INFO: loaded from: classes12.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f11479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f11480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f11481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f11482f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f11477a = str;
        this.f11478b = str2;
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f11481e != null) {
            return this.f11481e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f11481e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f11481e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f11481e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f11479c != null) {
            return this.f11479c;
        }
        if (this.f11480d != null && this.f11480d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11477a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f11480d == null) {
                this.f11480d = g.a(new File(this.f11477a, str));
            }
            if (this.f11480d == null) {
                this.f11480d = -1L;
                return null;
            }
            File file = new File(this.f11477a, str2 + str + str2 + this.f11480d + str2 + "using.lock");
            this.f11479c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            return this.f11479c;
        } finally {
            bVarA.a();
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f11478b).a(a(this.f11478b, str));
    }

    public final Long a() {
        return this.f11480d;
    }

    public final String b() {
        return this.f11478b;
    }

    public final boolean b(String str) throws Exception {
        return d(this.f11478b).b(a(this.f11478b, str));
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final void c() throws Exception {
        if (this.f11482f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11477a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f11478b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f11479c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f11479c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f11477a + str + this.f11478b);
        } finally {
            bVarA.a();
        }
    }
}
