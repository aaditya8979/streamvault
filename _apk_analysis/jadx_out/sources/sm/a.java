package sm;

import io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import sm.a;

/* JADX INFO: compiled from: BaseTestConsumer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, U extends a<T, U>> implements bm.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f84427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f84428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84431i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<T> f84425c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Throwable> f84426d = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f84424b = new CountDownLatch(1);
}
