package yads;

import android.net.Uri;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.offline.DashDownloader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes12.dex */
public final class sc0 implements sj0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f94775c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr f94776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f94777b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f94775c = sparseArray;
    }

    public sc0(qr qrVar, ExecutorService executorService) {
        this.f94776a = (qr) ni.a(qrVar);
        this.f94777b = (Executor) ni.a(executorService);
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(rj0.class).getConstructor(fm1.class, qr.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    public final rj0 a(pj0 pj0Var) {
        am1 am1Var;
        am1 am1Var2;
        int iA = ib3.a(pj0Var.f93604c, pj0Var.f93605d);
        if (iA != 0 && iA != 1 && iA != 2) {
            if (iA != 4) {
                throw new IllegalArgumentException(mg2.a("Unsupported type: ", iA));
            }
            sl1 sl1Var = new sl1();
            vl1 vl1Var = new vl1();
            List listEmptyList = Collections.emptyList();
            sm2 sm2Var = sm2.f94878f;
            cm1 cm1Var = cm1.f88503d;
            Uri uri = pj0Var.f93604c;
            String str = pj0Var.f93608g;
            if (vl1Var.f96127b != null && vl1Var.f96126a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                am1Var2 = new am1(uri, null, vl1Var.f96126a != null ? new wl1(vl1Var) : null, listEmptyList, str, sm2Var, null);
            } else {
                am1Var2 = null;
            }
            return new xj2(new fm1("", new ul1(sl1Var), am1Var2, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var), this.f94776a, this.f94777b);
        }
        Constructor constructor = (Constructor) f94775c.get(iA);
        if (constructor == null) {
            throw new IllegalStateException(mg2.a("Module missing for content type ", iA));
        }
        sl1 sl1Var2 = new sl1();
        vl1 vl1Var2 = new vl1();
        Collections.emptyList();
        sm2 sm2Var2 = sm2.f94878f;
        cm1 cm1Var2 = cm1.f88503d;
        Uri uri2 = pj0Var.f93604c;
        List list = pj0Var.f93606e;
        List listEmptyList2 = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        String str2 = pj0Var.f93608g;
        if (vl1Var2.f96127b != null && vl1Var2.f96126a == null) {
            throw new IllegalStateException();
        }
        if (uri2 != null) {
            am1Var = new am1(uri2, null, vl1Var2.f96126a != null ? new wl1(vl1Var2) : null, listEmptyList2, str2, sm2Var2, null);
        } else {
            am1Var = null;
        }
        try {
            return (rj0) constructor.newInstance(new fm1("", new ul1(sl1Var2), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var2), this.f94776a, this.f94777b);
        } catch (Exception unused) {
            throw new IllegalStateException(mg2.a("Failed to instantiate downloader for content type ", iA));
        }
    }
}
