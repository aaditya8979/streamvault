package k4;

import java.lang.reflect.Constructor;
import t4.g0;
import t4.y;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Constructor<? extends g> f72886j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f72887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f72894h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f72895i;

    static {
        Constructor<? extends g> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer.ext.flac.FlacExtractor").asSubclass(g.class).getConstructor(new Class[0]);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f72886j = constructor;
    }

    public synchronized e a(int i10) {
        this.f72891e = i10;
        return this;
    }

    @Override // k4.k
    public synchronized g[] createExtractors() {
        g[] gVarArr;
        gVarArr = new g[14];
        gVarArr[0] = new o4.e(this.f72890d);
        int i10 = 1;
        gVarArr[1] = new q4.f(this.f72892f);
        gVarArr[2] = new q4.i(this.f72891e);
        gVarArr[3] = new p4.e(this.f72893g | (this.f72887a ? 1 : 0));
        gVarArr[4] = new t4.h(this.f72888b | (this.f72887a ? 1 : 0));
        gVarArr[5] = new t4.b();
        gVarArr[6] = new g0(this.f72894h, this.f72895i);
        gVarArr[7] = new n4.b();
        gVarArr[8] = new r4.d();
        gVarArr[9] = new y();
        gVarArr[10] = new u4.b();
        int i11 = this.f72889c;
        if (!this.f72887a) {
            i10 = 0;
        }
        gVarArr[11] = new l4.b(i10 | i11);
        gVarArr[12] = new t4.e();
        Constructor<? extends g> constructor = f72886j;
        if (constructor != null) {
            try {
                gVarArr[13] = constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        } else {
            gVarArr[13] = new m4.d();
        }
        return gVarArr;
    }
}
